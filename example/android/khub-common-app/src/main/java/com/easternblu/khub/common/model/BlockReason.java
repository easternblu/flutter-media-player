package com.easternblu.khub.common.model;

import com.easternblu.khub.common.api.EasternbluPathConstant;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by pan on 26/4/17.
 */

public class BlockReason implements Serializable {
    @Expose
    @SerializedName(EasternbluPathConstant._PREMIUM_ACCESS_BLOCKED)
    protected boolean premiumAccessBlocked;

    @Expose
    @SerializedName(EasternbluPathConstant._COUNTRY_BLOCKED)
    protected boolean countryBlocked;

    @Expose
    @SerializedName(EasternbluPathConstant._PLATFORM_BLOCKED)
    protected boolean platformBlocked;

    @Expose
    @SerializedName(EasternbluPathConstant._TIME_LAPSED_BLOCKED)
    protected boolean timeLapsedBlocked;

    public boolean isPremiumAccessBlocked() {
        return premiumAccessBlocked;
    }

    public boolean isCountryBlocked() {
        return countryBlocked;
    }

    public boolean isPlatformBlocked() {
        return platformBlocked;
    }

    public boolean isTimeLapsedBlocked() {
        return timeLapsedBlocked;
    }

    public void setPremiumAccessBlocked(boolean premiumAccessBlocked) {
        this.premiumAccessBlocked = premiumAccessBlocked;
    }

    public void setCountryBlocked(boolean countryBlocked) {
        this.countryBlocked = countryBlocked;
    }

    public void setPlatformBlocked(boolean platformBlocked) {
        this.platformBlocked = platformBlocked;
    }

    public void setTimeLapsedBlocked(boolean timeLapsedBlocked) {
        this.timeLapsedBlocked = timeLapsedBlocked;
    }
}
