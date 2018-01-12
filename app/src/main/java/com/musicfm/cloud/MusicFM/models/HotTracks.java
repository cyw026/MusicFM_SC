package com.musicfm.cloud.MusicFM.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yewen on 2018/1/10.
 */

public class HotTracks {

    private List<Track> tracks;
    private String playlistName;
    private String artwork_url;

    public HotTracks() {
        tracks = new ArrayList<Track>();
    }

    public HotTracks(List<Track> songList) {
        this.tracks = songList;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }


    public String getPlaylistName() {
        return playlistName;
    }

    public void setPlaylistName(String playlistName) {
        this.playlistName = playlistName;
    }
    public String getArtwork_url() {
        return artwork_url;
    }

    public void setArtwork_url(String artwork_url) {
        this.artwork_url = artwork_url;
    }

    public void addSong(Track track) {
        tracks.add(track);
    }
}
