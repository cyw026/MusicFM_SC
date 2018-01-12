package com.musicfm.cloud.MusicFM.fragments.HotTracksFragment;

import android.content.res.ColorStateList;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import android.widget.TextView;

import com.musicfm.cloud.MusicFM.activities.SplashActivity;
import com.musicfm.cloud.MusicFM.clickitemtouchlistener.ClickItemTouchListener;
import com.musicfm.cloud.MusicFM.custombottomsheets.CustomGeneralBottomSheetDialog;
import com.musicfm.cloud.MusicFM.activities.HomeActivity;
import com.musicfm.cloud.MusicFM.imageLoader.ImageLoader;
import com.musicfm.cloud.MusicFM.models.Track;
import com.musicfm.cloud.MusicFM.models.UnifiedTrack;
import com.musicfm.cloud.MusicFM.MusicDNAApplication;
import com.musicfm.cloud.MusicFM.R;
import com.musicfm.cloud.MusicFM.utilities.CommonUtils;
import com.squareup.leakcanary.RefWatcher;
import com.squareup.picasso.Picasso;

/**
 * Created by yewen on 2018/1/11.
 */

public class HotTracksFragment extends Fragment {
    public static HotTracksAdapter adapter;
    HotTracksFragment.OnTrackSelectedListener mCallback;
    Context ctx;

    RecyclerView lv;
    FloatingActionButton playAllfab;
    LinearLayoutManager llManager;

    View bottomMarginLayout;
    ImageLoader imgLoader;

    ImageView backBtn, backdrop, addToQueueIcon;
    TextView fragTitle, artistTitle, artistTrackText;

    public HotTracksFragment() {
        // Required empty public constructor
    }

    public interface OnTrackSelectedListener {
        void onTrackSelected(int position);

//        void onStreamTrackSelected(int position);
//
        void onStreamPlaylistPlayAll();
//
//        void addStreamPlalylistAddToQueue();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            imgLoader = new ImageLoader(context);
            mCallback = (HotTracksFragment.OnTrackSelectedListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString()
                    + " must implement OnHeadlineSelectedListener");
        }
        ctx = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_top_tracks, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        backBtn = (ImageView) view.findViewById(R.id.playlist_back_btn);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().onBackPressed();
            }
        });

        backdrop = (ImageView) view.findViewById(R.id.playlist_backdrop);
        Picasso.with(ctx)
                .load(HomeActivity.hotTrackPlaylist.getArtwork_url())
                .error(R.drawable.ic_default)
                .placeholder(R.drawable.ic_default)
                .into(backdrop);
//        imgLoader.DisplayImage(HomeActivity.tempArtist.getArtistSongs().get(0).getPath(), backdrop);

        fragTitle = (TextView) view.findViewById(R.id.playlist_fragment_title);
        if (SplashActivity.tf4 != null)
            fragTitle.setTypeface(SplashActivity.tf4);

        artistTitle = (TextView) view.findViewById(R.id.playlist_title);
        artistTitle.setText(HomeActivity.hotTrackPlaylist.getPlaylistName());

        artistTrackText = (TextView) view.findViewById(R.id.playlist_tracks_text);
        int tmp = HomeActivity.hotTrackPlaylist.getTracks().size();
        String details1;
        if (tmp == 1) {
            details1 = "1 Song ";
        } else {
            details1 = tmp + " Songs ";
        }
        artistTrackText.setText(details1);

//        addToQueueIcon = (ImageView) view.findViewById(R.id.add_playlist_to_queue_icon);
//        addToQueueIcon.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mCallback.addArtistToQueue();
//            }
//        });

        bottomMarginLayout = view.findViewById(R.id.bottom_margin_layout);
        if (HomeActivity.isReloaded)
            bottomMarginLayout.getLayoutParams().height = 0;
        else
            bottomMarginLayout.getLayoutParams().height = CommonUtils.dpTopx(65, getContext());

        lv = (RecyclerView) view.findViewById(R.id.playlist_tracks_recycler);

        adapter = new HotTracksAdapter(getContext(), HomeActivity.hotTrackPlaylist.getTracks());
        llManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        lv.setLayoutManager(llManager);
        lv.setItemAnimator(new DefaultItemAnimator());
        lv.setAdapter(adapter);

        lv.addOnItemTouchListener(new ClickItemTouchListener(lv) {
            @Override
            public boolean onClick(RecyclerView parent, View view, int position, long id) {
                Track track = HomeActivity.hotTrackPlaylist.getTracks().get(position);
                if (HomeActivity.queue.getQueue().size() == 0) {
                    HomeActivity.queueCurrentIndex = 0;
                    HomeActivity.queue.getQueue().add(new UnifiedTrack(false, null, track));
                } else if (HomeActivity.queueCurrentIndex == HomeActivity.queue.getQueue().size() - 1) {
                    HomeActivity.queueCurrentIndex++;
                    HomeActivity.queue.getQueue().add(new UnifiedTrack(false, null, track));
                } else if (HomeActivity.isReloaded) {
                    HomeActivity.isReloaded = false;
                    HomeActivity.queueCurrentIndex = HomeActivity.queue.getQueue().size();
                    HomeActivity.queue.getQueue().add(new UnifiedTrack(false, null, track));
                } else {
                    HomeActivity.queue.getQueue().add(++HomeActivity.queueCurrentIndex, new UnifiedTrack(false, null, track));
                }
                HomeActivity.selectedTrack = track;
                HomeActivity.streamSelected = true;
                HomeActivity.localSelected = false;
                HomeActivity.queueCall = false;
                HomeActivity.isReloaded = false;
                mCallback.onTrackSelected(position);
                return true;
            }

            @Override
            public boolean onLongClick(RecyclerView parent, View view, final int position, long id) {
                final UnifiedTrack ut = new UnifiedTrack(false, null, HomeActivity.hotTrackPlaylist.getTracks().get(position));
                CustomGeneralBottomSheetDialog generalBottomSheetDialog = new CustomGeneralBottomSheetDialog();
                generalBottomSheetDialog.setPosition(position);
                generalBottomSheetDialog.setTrack(ut);
                generalBottomSheetDialog.setFragment("hotTracks");
                generalBottomSheetDialog.show(getActivity().getSupportFragmentManager(), "general_bottom_sheet_dialog");
                return true;
            }

            @Override
            public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

            }
        });

        playAllfab = (FloatingActionButton) view.findViewById(R.id.play_all_fab_playlist);
        playAllfab.setBackgroundTintList(ColorStateList.valueOf(HomeActivity.themeColor));
        playAllfab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HomeActivity.queue.getQueue().clear();
                for (int i = 0; i < HomeActivity.hotTrackPlaylist.getTracks().size(); i++) {
                    UnifiedTrack ut = new UnifiedTrack(false, null, HomeActivity.hotTrackPlaylist.getTracks().get(i));
                    HomeActivity.queue.getQueue().add(ut);
                }
                mCallback.onStreamPlaylistPlayAll();
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                playAllfab.animate().scaleX(1.0f).scaleY(1.0f).setDuration(300).setInterpolator(new OvershootInterpolator());
            }
        }, 500);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        RefWatcher refWatcher = MusicDNAApplication.getRefWatcher(getContext());
        refWatcher.watch(this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        RefWatcher refWatcher = MusicDNAApplication.getRefWatcher(getContext());
        refWatcher.watch(this);
    }

    public void dataChanged() {
        if (adapter != null)
            adapter.notifyDataSetChanged();
    }
}
