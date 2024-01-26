package com.easternblu.kstream.common.model.v2;

import com.easternblu.kstream.common.api.easternbluPathConstant;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * This object is fetched separately
 * Created by yatpanng on 3/8/17.
 */
public class VideoAudios implements Serializable {

    @Expose
    @SerializedName(easternbluPathConstant._VIDEO_ID)
    protected int videoId;


    @Expose
    @SerializedName(easternbluPathConstant._VOCAL_URL)
    protected String vocalUrl;

    @Expose
    @SerializedName(easternbluPathConstant._NON_VOCAL_URL)
    protected String nonVocalUrl;

    public int getVideoId() {
        return videoId;
    }

    public String getVocalUrl() {
        return vocalUrl;
    }

    public String getNonVocalUrl() {
        return nonVocalUrl;
    }
}
