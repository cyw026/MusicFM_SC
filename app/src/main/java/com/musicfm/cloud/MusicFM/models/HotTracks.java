package com.musicfm.cloud.MusicFM.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yewen on 2018/1/10.
 */

public class HotTracks {

    private List<UnifiedTrack> songList;
    private String playlistName;

    public HotTracks(String name) {
        playlistName = name;
        songList = new ArrayList<UnifiedTrack>();
    }

    public HotTracks(List<UnifiedTrack> songList, String playlistName) {
        this.songList = songList;
        this.playlistName = playlistName;
    }

    public List<UnifiedTrack> getSongList() {
        return songList;
    }

    public void setSongList(List<UnifiedTrack> songList) {
        this.songList = songList;
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public void setPlaylistName(String playlistName) {
        this.playlistName = playlistName;
    }

    public void addSong(UnifiedTrack track) {
        songList.add(track);
    }
}
