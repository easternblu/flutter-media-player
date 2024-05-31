package com.easternblu.khub.common.model;

import java.util.Map;

/**
 * A builder object generated using {@link EasternbluVideo} constructor
 */
public class EasternbluVideoBuilder {
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
    private EasternbluImages mImages;
    private Map<String, Object> mDash;
    private Map<String, Object> mHls;
    private Track mTrack;

    public EasternbluVideoBuilder setId(int id) {
        mId = id;
        return this;
    }

    public EasternbluVideoBuilder setArtistId(int artistId) {
        mArtistId = artistId;
        return this;
    }

    public EasternbluVideoBuilder setTitle(String title) {
        mTitle = title;
        return this;
    }

    public EasternbluVideoBuilder setHasStream(boolean hasStream) {
        mHasStream = hasStream;
        return this;
    }

    public EasternbluVideoBuilder setRuntime(long runtime) {
        mRuntime = runtime;
        return this;
    }

    public EasternbluVideoBuilder setType(String type) {
        mType = type;
        return this;
    }

    public EasternbluVideoBuilder setNumber(int number) {
        mNumber = number;
        return this;
    }

    public EasternbluVideoBuilder setDescription(String description) {
        mDescription = description;
        return this;
    }

    public EasternbluVideoBuilder setReleaseDate(String releaseDate) {
        mReleaseDate = releaseDate;
        return this;
    }

    public EasternbluVideoBuilder setOldVideoUrl(String oldVideoUrl) {
        mOldVideoUrl = oldVideoUrl;
        return this;
    }

    public EasternbluVideoBuilder setVideoUrl(String videoUrl) {
        mVideoUrl = videoUrl;
        return this;
    }

    public EasternbluVideoBuilder setPosterUrl(String posterUrl) {
        mPosterUrl = posterUrl;
        return this;
    }

    public EasternbluVideoBuilder setImages(EasternbluImages images) {
        mImages = images;
        return this;
    }

    public EasternbluVideoBuilder setDash(Map<String, Object> dash) {
        mDash = dash;
        return this;
    }

    public EasternbluVideoBuilder setHls(Map<String, Object> hls) {
        mHls = hls;
        return this;
    }

    public EasternbluVideoBuilder setTrack(Track track) {
        mTrack = track;
        return this;
    }

    public EasternbluVideo createEasternbluVideo() {
        return new EasternbluVideo(mId, mArtistId, mTitle, mHasStream, mRuntime, mType, mNumber, mDescription, mReleaseDate, mOldVideoUrl, mVideoUrl, mPosterUrl, mImages, mDash, mHls, mTrack);
    }
}