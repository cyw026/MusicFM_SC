package com.musicfm.cloud.MusicFM.interfaces;

import com.musicfm.cloud.MusicFM.Config;
import com.musicfm.cloud.MusicFM.models.Track;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Query;
import retrofit2.http.GET;

/**
 * Created by Harjot on 30-Apr-16.
 */
public interface StreamService {
    @GET("/tracks?client_id=" + Config.CLIENT_ID)
    Call<List<Track>> getTracks(@Query("q") String query, @Query("limit") int limit);
}
