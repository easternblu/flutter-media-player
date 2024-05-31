package com.easternblu.khub.common.model.v2;

import com.easternblu.khub.common.api.EasternbluPathConstant;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * This object is fetched separately
 * Created by yatpanng on 3/8/17.
 */
public class VideoAudios implements Serializable {

    @Expose
    @SerializedName(EasternbluPathConstant._VIDEO_ID)
    protected int videoId;


    @Expose
    @SerializedName(EasternbluPathConstant._VOCAL_URL)
    protected String vocalUrl;

    @Expose
    @SerializedName(EasternbluPathConstant._NON_VOCAL_URL)
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
