package com.easternblu.kstream.common.model;

import com.easternblu.kstream.common.api.easternbluPathConstant;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by pan on 27/9/17.
 */
public class Genre implements Serializable {

    @Expose
    @SerializedName(easternbluPathConstant._KEY)
    protected String key;

    @Expose
    @SerializedName(easternbluPathConstant._NAME)
    protected String name;

    @Expose
    @SerializedName(easternbluPathConstant._POSTER_URL)
    protected String posterUrl;

    @Expose
    @SerializedName(easternbluPathConstant._ICON_URL)
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
