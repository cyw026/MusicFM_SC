package com.musicfm.cloud.MusicFM.adapters.horizontalrecycleradapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.musicfm.cloud.MusicFM.R;
import com.musicfm.cloud.MusicFM.models.Track;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by yewen on 2018/1/10.
 */

public class HotTracksHorizontalAdapter extends RecyclerView.Adapter<HotTracksHorizontalAdapter.MyViewHolder> {
    List<Track> tracks;
    Context ctx;
    com.musicfm.cloud.MusicFM.imageLoader.ImageLoader imgLoader;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView art;
        TextView title, artist;
        RelativeLayout bottomHolder;

        public MyViewHolder(View view) {
            super(view);
            art = (ImageView) view.findViewById(R.id.backImage);
            title = (TextView) view.findViewById(R.id.card_title);
            artist = (TextView) view.findViewById(R.id.card_artist);
            bottomHolder = (RelativeLayout) view.findViewById(R.id.bottomHolder);
        }
    }

    public HotTracksHorizontalAdapter(List<Track> tracks, Context ctx) {
        this.tracks = tracks;
        this.ctx = ctx;
        imgLoader = new com.musicfm.cloud.MusicFM.imageLoader.ImageLoader(ctx);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_card_layout2, parent, false);

        return new HotTracksHorizontalAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(HotTracksHorizontalAdapter.MyViewHolder holder, int position) {

        Track track = tracks.get(position);
        try {
            if (track.getArtworkURL() != null) {
                Log.d("ARTWORK_URL", track.getArtworkURL());
                Picasso.with(ctx)
                        .load(track.getArtworkURL())
                        .error(R.drawable.ic_default)
                        .placeholder(R.drawable.ic_default)
                        .into(holder.art);
            } else {
                holder.art.setImageResource(R.drawable.ic_default);
            }

        } catch (Exception e) {
            Log.e("AdapterError", e.getMessage());
        }
        holder.title.setText(track.getTitle());
        holder.artist.setText("");
    }

    @Override
    public int getItemCount() {
        return tracks.size();
    }
}
