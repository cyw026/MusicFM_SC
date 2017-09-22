package com.musicfm.cloud.MusicFM.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yewen on 2017/9/23.
 */

public class SoundCloudPlaylists {
    private List<SoundCloudPlaylist> playlists;

    public SoundCloudPlaylists() {
        playlists = new ArrayList<>();
    }

    public List<SoundCloudPlaylist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(List<SoundCloudPlaylist> playlists) {
        this.playlists = playlists;
    }

    public void addPlaylist(Playlist pl){
        playlists.add(pl);
    }

}