package com.musicfm.cloud.MusicFM.models;

/**
 * Created by Harjot on 30-Apr-16.
 */
//public class Track {
//    @SerializedName("title")
//    private String mTitle;
//
//    @SerializedName("id")
//    private int mID;
//
//    @SerializedName("duration")
//    private int mDuration;
//
//    @SerializedName("stream_url")
//    private String mStreamURL;
//
//    @SerializedName("artwork_url")
//    private String mArtworkURL;
//
//    public String getTitle() {
//        return mTitle;
//    }
//
//    public int getID() {
//        return mID;
//    }
//
//    public int getDuration() {
//        return mDuration;
//    }
//
//    public String getStreamURL() {
//        return mStreamURL;
//    }
//
//    public String getArtworkURL() {
//        return mArtworkURL;
//    }
//
//}

public class Track {
    /**
     * kind : track
     * id : 6621631
     * created_at : 2010/11/02 09:08:43 +0000
     * user_id : 3207
     * duration : 27099
     * commentable : true
     * state : finished
     * original_content_size : 2382624
     * sharing : public
     * tag_list : Fieldrecording geo:lat=52.527544 geo:lon=13.402905
     * permalink : coffee-machine
     * streamable : true
     * downloadable : false
     * genre :
     * title : coffee machine
     * description :
     * label_name :
     * release :
     * track_type :
     * key_signature :
     * isrc :
     * video_url : null
     * bpm : null
     * original_format : wav
     * license : cc-by
     * uri : http://api.soundcloud.com/tracks/6621631
     * permalink_url : http://soundcloud.com/jwagener/coffee-machine
     * artwork_url : http://i1.sndcdn.com/artworks-000002863219-4zpxc0-large.jpg?5e64f12
     * waveform_url : http://w1.sndcdn.com/Yva1Qimi7TVd_m.png
     * stream_url : http://api.soundcloud.com/tracks/6621631/stream
     * playback_count : 1249
     * download_count : 114
     * favoritings_count : 14
     * comment_count : 11
     * attachments_uri : http://api.soundcloud.com/tracks/6621631/attachments
     */

    private String kind;
    private int id;
    private int duration;
    private String state;
    private int original_content_size;
    private String sharing;
    private String tag_list;
    private String permalink;
    private boolean streamable;
    private boolean downloadable;
    private String genre;
    private String title;
    private String description;
    private String release;
    private String track_type;
    private String key_signature;
    private String isrc;
    private Object video_url;
    private Object bpm;
    private String original_format;
    private String license;
    private String uri;
    private String permalink_url;
    private String artwork_url;
    private String waveform_url;
    private String stream_url;
    private int playback_count;
    private int download_count;
    private int favoritings_count;
    private int comment_count;
    private String attachments_uri;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getOriginal_content_size() {
        return original_content_size;
    }

    public void setOriginal_content_size(int original_content_size) {
        this.original_content_size = original_content_size;
    }

    public String getSharing() {
        return sharing;
    }

    public void setSharing(String sharing) {
        this.sharing = sharing;
    }

    public String getTag_list() {
        return tag_list;
    }

    public void setTag_list(String tag_list) {
        this.tag_list = tag_list;
    }

    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public String getTrack_type() {
        return track_type;
    }

    public void setTrack_type(String track_type) {
        this.track_type = track_type;
    }

    public String getKey_signature() {
        return key_signature;
    }

    public void setKey_signature(String key_signature) {
        this.key_signature = key_signature;
    }

    public String getIsrc() {
        return isrc;
    }

    public void setIsrc(String isrc) {
        this.isrc = isrc;
    }

    public Object getVideo_url() {
        return video_url;
    }

    public void setVideo_url(Object video_url) {
        this.video_url = video_url;
    }

    public Object getBpm() {
        return bpm;
    }

    public void setBpm(Object bpm) {
        this.bpm = bpm;
    }

    public String getOriginal_format() {
        return original_format;
    }

    public void setOriginal_format(String original_format) {
        this.original_format = original_format;
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

    public String getArtworkURL() {
        return artwork_url;
    }

    public void setArtwork_url(String artwork_url) {
        this.artwork_url = artwork_url;
    }

    public String getWaveform_url() {
        return waveform_url;
    }

    public void setWaveform_url(String waveform_url) {
        this.waveform_url = waveform_url;
    }

    public String getStreamURL() {
        return stream_url;
    }

    public void setStream_url(String stream_url) {
        this.stream_url = stream_url;
    }

    public int getPlayback_count() {
        return playback_count;
    }

    public void setPlayback_count(int playback_count) {
        this.playback_count = playback_count;
    }

    public int getDownload_count() {
        return download_count;
    }

    public void setDownload_count(int download_count) {
        this.download_count = download_count;
    }

    public int getFavoritings_count() {
        return favoritings_count;
    }

    public void setFavoritings_count(int favoritings_count) {
        this.favoritings_count = favoritings_count;
    }

    public int getComment_count() {
        return comment_count;
    }

    public void setComment_count(int comment_count) {
        this.comment_count = comment_count;
    }

    public String getAttachments_uri() {
        return attachments_uri;
    }

    public void setAttachments_uri(String attachments_uri) {
        this.attachments_uri = attachments_uri;
    }
}
