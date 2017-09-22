package com.musicfm.cloud.MusicFM.models;

import java.util.List;

/**
 * Created by yewen on 2017/9/22.
 */

public class SoundCloudPlaylist {
    /**
     * id : 405726
     * created_at : 2010/11/02 09:24:50 +0000
     * user_id : 3207
     * duration : 154516
     * sharing : public
     * tag_list :
     * permalink : field-recordings
     * track_count : 5
     * streamable : true
     * downloadable : true
     * embeddable_by : me
     * type : other
     * playlist_type : other
     * ean :
     * description : a couple of field recordings to test http://soundiverse.com.

     recorded with the fire recorder: http://soundcloud.com/apps/fire
     * genre :
     * release :
     * label_name :
     * title : Field Recordings
     * license : all-rights-reserved
     * uri : http://api.soundcloud.com/playlists/405726
     * permalink_url : http://soundcloud.com/jwagener/sets/field-recordings
     * artwork_url : http://i1.sndcdn.com/artworks-000025801802-1msl1i-large.jpg?5e64f12
     * tracks : [{"kind":"track","id":6621631,"created_at":"2010/11/02 09:08:43 +0000","user_id":3207,"duration":27099,"commentable":true,"state":"finished","original_content_size":2382624,"sharing":"public","tag_list":"Fieldrecording geo:lat=52.527544 geo:lon=13.402905","permalink":"coffee-machine","streamable":true,"downloadable":false,"genre":"","title":"coffee machine","description":"","label_name":"","release":"","track_type":"","key_signature":"","isrc":"","video_url":null,"bpm":null,"original_format":"wav","license":"cc-by","uri":"http://api.soundcloud.com/tracks/6621631","permalink_url":"http://soundcloud.com/jwagener/coffee-machine","artwork_url":"http://i1.sndcdn.com/artworks-000002863219-4zpxc0-large.jpg?5e64f12","waveform_url":"http://w1.sndcdn.com/Yva1Qimi7TVd_m.png","stream_url":"http://api.soundcloud.com/tracks/6621631/stream","playback_count":1249,"download_count":114,"favoritings_count":14,"comment_count":11,"attachments_uri":"http://api.soundcloud.com/tracks/6621631/attachments"}]
     */

    private int id;
    private String created_at;
    private int user_id;
    private int duration;
    private String sharing;
    private String permalink;
    private int track_count;
    private boolean streamable;
    private boolean downloadable;
    private String type;
    private String playlist_type;
    private String description;
    private String genre;
    private String title;
    private String license;
    private String uri;
    private String permalink_url;
    private String artwork_url;
    private List<Track> tracks;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getSharing() {
        return sharing;
    }

    public void setSharing(String sharing) {
        this.sharing = sharing;
    }

    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public int getTrack_count() {
        return track_count;
    }

    public void setTrack_count(int track_count) {
        this.track_count = track_count;
    }

    public boolean isStreamable() {
        return streamable;
    }

    public void setStreamable(boolean streamable) {
        this.streamable = streamable;
    }

    public boolean isDownloadable() {
        return downloadable;
    }

    public void setDownloadable(boolean downloadable) {
        this.downloadable = downloadable;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPlaylist_type() {
        return playlist_type;
    }

    public void setPlaylist_type(String playlist_type) {
        this.playlist_type = playlist_type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getPermalink_url() {
        return permalink_url;
    }

    public void setPermalink_url(String permalink_url) {
        this.permalink_url = permalink_url;
    }

    public String getArtwork_url() {
        return artwork_url;
    }

    public void setArtwork_url(String artwork_url) {
        this.artwork_url = artwork_url;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }
}