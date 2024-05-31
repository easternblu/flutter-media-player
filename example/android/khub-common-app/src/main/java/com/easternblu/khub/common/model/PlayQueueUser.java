package com.easternblu.khub.common.model;

import com.easternblu.khub.common.api.EasternbluPathConstant;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Play queue user
 * Created by leechunhoe on 7/2/17.
 */

public class PlayQueueUser implements Serializable {

    @Expose
    @SerializedName(EasternbluPathConstant._USER_ID)
    private int userId;

    @Expose
    @SerializedName(EasternbluPathConstant._NAME)
    private String name;

    @Expose
    @SerializedName(EasternbluPathConstant._PROFILE_PIC)
    private String profilePic;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getDisplayName() {
        return name;
    }

    public void setDisplayName(String name) {
        this.name = name;
    }

    public String getProfilePhotoUrl() {
        return profilePic;
    }

    public void setProfilePhotoUrl(String profilePic) {
        this.profilePic = profilePic;
    }
}