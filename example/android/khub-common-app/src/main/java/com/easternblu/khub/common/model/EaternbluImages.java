package com.easternblu.khub.common.model;

import com.easternblu.khub.common.api.EasternbluPathConstant;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Where to find the spec for this object:
 * http://developers.khub.com/#!/Track/get_tracks_json
 * Created by yatpanng on 15/2/17.
 */
//    "images": {
//        "poster": {
//            "url": "string"
//        }
//    }
public class EaternbluImages implements Serializable {

    
    @Expose
    @SerializedName(EasternbluPathConstant._POSTER)
    protected Poster poster;

    public Poster getPoster() {
        return poster;
    }

    public String getPosterUrl() {
        return poster != null ? poster.getUrl() : null;
    }

    public static class Poster implements Serializable{

        @Expose
        @SerializedName(EasternbluPathConstant._URL)
        protected String url;

        public String getUrl() {
            return url;
        }
    }
}
