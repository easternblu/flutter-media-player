package com.easternblu.kstream.common.model;

import java.util.Map;

/**
 * A builder object generated using {@link easternbluVideo} constructor
 */
public class easternbluVideoBuilder {
    private int mId;
    private int mArtistId;
    private String mTitle;
    private boolean mHasStream;
    private long mRuntime;
    private String mType;
    private int mNumber;
    private String mDescription;
    private String mReleaseDate;
    private String mOldVideoUrl;
    private String mVideoUrl;
    private String mPosterUrl;
    private easternbluImages mImages;
    private Map<String, Object> mDash;
    private Map<String, Object> mHls;
    private Track mTrack;

    public easternbluVideoBuilder setId(int id) {
        mId = id;
        return this;
    }

    public easternbluVideoBuilder setArtistId(int artistId) {
        mArtistId = artistId;
        return this;
    }

    public easternbluVideoBuilder setTitle(String title) {
        mTitle = title;
        return this;
    }

    public easternbluVideoBuilder setHasStream(boolean hasStream) {
        mHasStream = hasStream;
        return this;
    }

    public easternbluVideoBuilder setRuntime(long runtime) {
        mRuntime = runtime;
        return this;
    }

    public easternbluVideoBuilder setType(String type) {
        mType = type;
        return this;
    }

    public easternbluVideoBuilder setNumber(int number) {
        mNumber = number;
        return this;
    }

    public easternbluVideoBuilder setDescription(String description) {
        mDescription = description;
        return this;
    }

    public easternbluVideoBuilder setReleaseDate(String releaseDate) {
        mReleaseDate = releaseDate;
        return this;
    }

    public easternbluVideoBuilder setOldVideoUrl(String oldVideoUrl) {
        mOldVideoUrl = oldVideoUrl;
        return this;
    }

    public easternbluVideoBuilder setVideoUrl(String videoUrl) {
        mVideoUrl = videoUrl;
        return this;
    }

    public easternbluVideoBuilder setPosterUrl(String posterUrl) {
        mPosterUrl = posterUrl;
        return this;
    }

    public easternbluVideoBuilder setImages(easternbluImages images) {
        mImages = images;
        return this;
    }

    public easternbluVideoBuilder setDash(Map<String, Object> dash) {
        mDash = dash;
        return this;
    }

    public easternbluVideoBuilder setHls(Map<String, Object> hls) {
        mHls = hls;
        return this;
    }

    public easternbluVideoBuilder setTrack(Track track) {
        mTrack = track;
        return this;
    }

    public easternbluVideo createeasternbluVideo() {
        return new easternbluVideo(mId, mArtistId, mTitle, mHasStream, mRuntime, mType, mNumber, mDescription, mReleaseDate, mOldVideoUrl, mVideoUrl, mPosterUrl, mImages, mDash, mHls, mTrack);
    }
}