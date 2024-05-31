package com.easternblu.khub.common.model;

import com.easternblu.khub.common.api.EasternbluPathConstant;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by pan on 27/9/17.
 */
public class Genre implements Serializable {

    @Expose
    @SerializedName(EasternbluPathConstant._KEY)
    protected String key;

    @Expose
    @SerializedName(EasternbluPathConstant._NAME)
    protected String name;

    @Expose
    @SerializedName(EasternbluPathConstant._POSTER_URL)
    protected String posterUrl;

    @Expose
    @SerializedName(EasternbluPathConstant._ICON_URL)
    protected String iconUrl;


    public String getKey() {
        return key;
    }

    public String getName() {
        return name;
    }

    public String getPosterUrl() {
        return posterUrl;
    }

    public String getIconUrl() {
        return iconUrl;
    }
}
