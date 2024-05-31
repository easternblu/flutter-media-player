package com.easternblu.khub.common.model;

import android.text.TextUtils;

import com.easternblu.khub.common.Common;
import com.easternblu.khub.common.api.EasternbluPathConstant;
import com.easternblu.khub.common.util.Strings;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings({Common.UNUSED, Common.WEAKER_ACCESS})
public class ApiMe implements Serializable {
    @SerializedName(EasternbluPathConstant._ID)
    @Expose
    private int id;
    @SerializedName(EasternbluPathConstant._EMAIL)
    @Expose
    private String email;
    @SerializedName(EasternbluPathConstant._FIRST_NAME)
    @Expose
    private String firstName;
    @SerializedName(EasternbluPathConstant._LAST_NAME)
    @Expose
    private String lastName;
    @SerializedName(EasternbluPathConstant._PROFILE_PIC)
    @Expose
    private String profilePic;
    @SerializedName(EasternbluPathConstant._PREMIUM)
    @Expose
    private boolean premium;
    @SerializedName(EasternbluPathConstant._PROFILES)
    @Expose
    private List<Profile> profiles;
    @SerializedName(EasternbluPathConstant._DEVICES)
    @Expose
    private List<Device> devices = null;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        if (lastName == null) {
            setLastName(Common.EMPTY_STRING);
        }
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public boolean isPremium() {
        return premium;
    }


    public List<Profile> getProfiles() {
        return profiles;
    }

    public void setProfiles(List<Profile> profiles) {
        this.profiles = profiles;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }

    @Deprecated
    public String getFullName() {
        if (!TextUtils.isEmpty(getFirstName()) && !TextUtils.isEmpty(getLastName())) {
            if (Strings.getIdeographicRatio(getLastName()) >= 0.5) {
                return getLastName() + getFirstName();
            } else {
                return getFirstName() + " " + getLastName();
            }
        } else if (TextUtils.isEmpty(getLastName())) {
            return getFirstName();
        } else {
            return getLastName();
        }
    }

    public class Device {

        @SerializedName(EasternbluPathConstant._DEVICE_UID)
        @Expose
        private String deviceUid;
        @SerializedName(EasternbluPathConstant._IP_ADDRESS)
        @Expose
        private String ipAddress;
        @SerializedName(EasternbluPathConstant._MAC_ADDRESS)
        @Expose
        private String macAddress;
        @SerializedName(EasternbluPathConstant._PORT)
        @Expose
        private int port;
        @SerializedName(EasternbluPathConstant._OS)
        @Expose
        private String os;
        @SerializedName(EasternbluPathConstant._OS_VERSION)
        @Expose
        private String osVersion;
        @SerializedName(EasternbluPathConstant._TYPE)
        @Expose
        private String type;

        public String getDeviceUid() {
            return deviceUid;
        }

        public void setDeviceUid(String deviceUid) {
            this.deviceUid = deviceUid;
        }

        public String getIpAddress() {
            return ipAddress;
        }

        public void setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
        }

        public String getMacAddress() {
            return macAddress;
        }

        public void setMacAddress(String macAddress) {
            this.macAddress = macAddress;
        }

        public int getPort() {
            return port;
        }

        public void setPort(int port) {
            this.port = port;
        }

        public String getOs() {
            return os;
        }

        public void setOs(String os) {
            this.os = os;
        }

        public String getOsVersion() {
            return osVersion;
        }

        public void setOsVersion(String osVersion) {
            this.osVersion = osVersion;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

    public class Profile {

        @SerializedName(EasternbluPathConstant._ID)
        @Expose
        private int id;
        @SerializedName(EasternbluPathConstant._NAME)
        @Expose
        private String name;
        @SerializedName(EasternbluPathConstant._PLAYLIST_ID)
        @Expose
        private int playlistId;
        @SerializedName(EasternbluPathConstant._HISTORY_PLAYLIST_ID)
        @Expose
        public int historyPlaylistId;
        @SerializedName(EasternbluPathConstant._URLS)
        @Expose
        private Urls urls;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPlaylistId() {
            return playlistId;
        }

        public void setPlaylistId(int playlistId) {
            this.playlistId = playlistId;
        }

        public int getHistoryPlaylistId() {
            return historyPlaylistId;
        }

        public void setHistoryPlaylistId(int historyPlaylistId) {
            this.historyPlaylistId = historyPlaylistId;
        }

        public Urls getUrls() {
            return urls;
        }

        public void setUrls(Urls urls) {
            this.urls = urls;
        }

        public class Urls {
            @SerializedName(EasternbluPathConstant._PLAYLIST)
            @Expose
            private String playlist;

            public String getPlaylist() {
                return playlist;
            }

            public void setPlaylist(String playlist) {
                this.playlist = playlist;
            }
        }
    }


}