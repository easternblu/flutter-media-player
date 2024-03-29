package com.easternblu.kstream.common.model;

import android.text.TextUtils;

import com.easternblu.kstream.common.Common;
import com.easternblu.kstream.common.api.easternbluPathConstant;
import com.easternblu.kstream.common.model.v2.VideoStreams;
import com.easternblu.kstream.common.util.Dates;
import com.easternblu.kstream.common.util.Range;
import com.easternblu.kstream.common.util.Strings;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Where to find the spec for this object:
 * http://developers.kstream.com/#!/Track/get_tracks_json
 */
//    "video": {
//        "id": 0,
//                "artistId": 0,
//                "title": "string",
//                "hasStream": true,
//                "images": {
//            "poster": {
//                "url": "string"
//            }
//        },
//        "dash": {
//            "p720": "string"
//        },
//        "hls": {
//            "p720": "string"
//        }
//    },
public class easternbluVideo implements Serializable {

    /**
     * An object that describe a range in the video that can be skipped
     */
    public static class SkippableRange {
        @Expose
        @SerializedName(easternbluPathConstant._FROM)
        String fromRaw;
        Long from = null;

        @Expose
        @SerializedName(easternbluPathConstant._TO)
        String toRaw;
        Long to = null;

        public long getFrom() {
            return from == null ? (from = Dates.toTimestamp(fromRaw, 0)) : from.longValue();
        }

        public long getTo() {
            return to == null ? (to = Dates.toTimestamp(toRaw, 0)) : to.longValue();
        }

        public boolean isValid() {
            return getTo() > getFrom();
        }

        public Range<Long> toRange() {
            return new Range(getFrom(), getTo());
        }

        public boolean isInProgress(long progress) {
            return getFrom() <= progress && progress <= getTo();
        }
    }

    private static final String LEFT = "1";
    private static final String RIGHT = "2";
    private static final String STEREO = "3";
    private static final String NONE = "4";
    private static final String DUAL_TRACK = "5";

    @Expose
    @SerializedName(easternbluPathConstant._ID)
    int id;

    @Expose
    @SerializedName(easternbluPathConstant._ARTIST_ID)
    int artistId;

    @Expose
    @SerializedName(easternbluPathConstant._TITLE)
    String title;

    @Expose
    @SerializedName(easternbluPathConstant._HAS_STREAM)
    boolean hasStream;


    @Expose
    @SerializedName(easternbluPathConstant._VOCAL_CHANNEL)
    String vocalChannel;


    long runtime;

    String type;

    int number;

    String description;

    String releaseDate;


    @Expose
    @SerializedName(easternbluPathConstant._VIDEO_URL)
    @Deprecated
    String oldVideoUrl;

    String videoUrl;

    String posterUrl;


    /**
     * Not part of the JSON but it should be set if you are planning to play the video of this track object
     */
    protected VideoStreams videoStreams;


    @Expose
    @SerializedName(easternbluPathConstant._IMAGES)
    protected easternbluImages images;

    @Expose
    @SerializedName(easternbluPathConstant._SKIPPABLE_RANGES)
    protected List<SkippableRange> skippableRanges;

    /**
     * @See {@link VideoStreams} it is now replacing the URL here
     */
    @Deprecated
    @Expose
    @SerializedName(easternbluPathConstant._DASH)
    protected Map<String, Object> dash;

    /**
     * @See {@link VideoStreams} it is now replacing the URL here
     */
    @Deprecated
    @Expose
    @SerializedName(easternbluPathConstant._HLS)
    protected Map<String, Object> hls;


    //MUST NOT BE EXPOSED AS JSON ELEMENT NO MATTER WHAT
    //CIRCULAR REFERENCE WILL HAPPEN
    protected transient Track track;


    /**
     * Used by GSON
     */
    public easternbluVideo() {
    }


    /**
     * Used by {@link easternbluVideoBuilder}
     */
    easternbluVideo(int id, int artistId, String title, boolean hasStream, long runtime, String type, int number, String description, String releaseDate, String oldVideoUrl, String videoUrl, String posterUrl, easternbluImages images, Map<String, Object> dash, Map<String, Object> hls, Track track) {
        this.id = id;
        this.artistId = artistId;
        this.title = title;
        this.hasStream = hasStream;
        this.runtime = runtime;
        this.type = type;
        this.number = number;
        this.description = description;
        this.releaseDate = releaseDate;
        this.oldVideoUrl = oldVideoUrl;
        this.videoUrl = videoUrl;
        this.posterUrl = posterUrl;
        this.images = images;
        this.dash = dash;
        this.hls = hls;
        this.track = track;
    }


    /**
     * Consider using {@link easternbluVideoBuilder}
     *
     * @param id
     * @param artistId
     * @param title
     * @param runtime
     * @param type
     * @param number
     * @param description
     * @param releaseDate
     * @param hasStream
     * @param videoUrl
     * @param posterUrl
     */
    @Deprecated
    public easternbluVideo(int id, int artistId, String title, long runtime, String type,
                        int number, String description, String releaseDate, boolean hasStream,
                        String videoUrl, String posterUrl) {
        this.id = id;
        this.artistId = artistId;
        this.title = title;
        this.runtime = runtime;
        this.type = type;
        this.number = number;
        this.description = description;
        this.releaseDate = releaseDate;
        this.hasStream = hasStream;
        this.videoUrl = videoUrl;
        this.posterUrl = posterUrl;
    }

    void setTrack(Track track) {
        this.track = track;
    }

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getRuntime() {
        return runtime;
    }

    public void setRuntime(long runtime) {
        this.runtime = runtime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDescription() {
        return description == null ? "" : description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public boolean isHasStream() {
        return hasStream;
    }

    public void setHasStream(boolean hasStream) {
        this.hasStream = hasStream;
    }


    public String getVideoUrl() {
        if (videoUrl != null) {
            return videoUrl;
        }

        videoUrl = Common.EMPTY_STRING;

        Object p720;
        if (dash != null && (p720 = dash.get(easternbluPathConstant._P720)) != null && p720 instanceof String) {
            videoUrl = p720.toString();
        }

        if (videoStreams != null) {
            videoUrl = videoStreams.getVideoUrl();
        }

        if (TextUtils.isEmpty(videoUrl) && oldVideoUrl != null) { //  note: seems like TextUtils.isEmpty(videoUrl) is what you want
            videoUrl = oldVideoUrl;
        }

        return videoUrl;
    }

    public List<SkippableRange> getSkippableRanges() {
        return skippableRanges;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    /**
     * Based on the logic of the deprecated TrackHelper.buildeasternbluVideo and TrackHelper.buildTrack
     * <p>
     * Set images.poster.url as first priority if available
     *
     * @return
     */
//    public String getPosterUrl() {
//        return posterUrl;
//    }
    public String getPosterUrl() {
        if (posterUrl != null) {
            return posterUrl;
        }

        //        if (trackJson.has(easternbluPathConstant._IMAGES) && trackJson.get(easternbluPathConstant._IMAGES) instanceof JSONObject) {
        //            JSONObject images = trackJson.getJSONObject(easternbluPathConstant._IMAGES);
        //            JSONObject poster = images.getJSONObject(easternbluPathConstant._POSTER);
        //            String imagePosterUrl = poster.getString(easternbluPathConstant._URL);
        //            video.setPosterUrl(imagePosterUrl);
        //        }

        // posterUrl = Common.EMPTY_STRING;

        String trackPosterUrl = null, videoImagePosterUrl = null;
        // Set images.poster.url as first priority if available
        if (track != null) {
            trackPosterUrl = track.getImagePosterUrl();
        }
        //    JSONObject images = (JSONObject) videoJson.get(easternbluPathConstant._IMAGES);
        //    JSONObject poster = (JSONObject) images.get(easternbluPathConstant._POSTER);
        //
        //    String posterUrl = Common.PROTOCOL_HTTP + poster.getString(easternbluPathConstant._URL).replace(Common.DOUBLE_SLASH, Common.EMPTY_STRING);
        if (images != null && images.getPosterUrl() != null) {
            videoImagePosterUrl = images.getPosterUrl();
            videoImagePosterUrl = Common.PROTOCOL_HTTP + videoImagePosterUrl.replace(Common.DOUBLE_SLASH, Common.EMPTY_STRING);
        }

        return posterUrl = Strings.getFirstNotNullOrEmpty(trackPosterUrl, videoImagePosterUrl);
    }

    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public VideoStreams getVideoStreams() {
        return videoStreams;
    }

    public void setVideoStreams(VideoStreams videoStreams) {
        this.videoStreams = videoStreams;
    }


    public boolean isVocalLeft() {
        return Strings.isNotNullAndEquals(vocalChannel, LEFT);
    }

    public boolean isVocalRight() {
        return Strings.isNotNullAndEquals(vocalChannel, RIGHT);
    }

    public boolean isVocalOnAudioTrack() {
        return Strings.isNotNullAndEquals(vocalChannel, STEREO);
    }

    public boolean isVocalNone() {
        return Strings.isNotNullAndEquals(vocalChannel, NONE);
    }

    public boolean isVocalDualTrack() {
        return Strings.isNotNullAndEquals(vocalChannel, DUAL_TRACK);
    }

    public boolean isVocalChannelInfoAvailable() {
        return Strings.isNotEmpty(vocalChannel);
    }

}
