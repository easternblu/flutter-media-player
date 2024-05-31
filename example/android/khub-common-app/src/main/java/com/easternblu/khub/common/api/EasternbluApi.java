package com.easternblu.khub.common.api;

import com.easternblu.khub.common.EasternbluConfig;
import com.easternblu.khub.common.Common;

import static com.easternblu.khub.common.Common.AND;
import static com.easternblu.khub.common.Common.EQUALS;
import static com.easternblu.khub.common.Common.QUESTION_MARK;
import static com.easternblu.khub.common.Common.SLASH;
import static com.easternblu.khub.common.api.EasternbluPathConstant.APP_VERSION;
import static com.easternblu.khub.common.api.EasternbluPathConstant.ARTISTS;
import static com.easternblu.khub.common.api.EasternbluPathConstant.ARTIST_ID_SUB;
import static com.easternblu.khub.common.api.EasternbluPathConstant.AUTH;
import static com.easternblu.khub.common.api.EasternbluPathConstant.AUTHORIZE;
import static com.easternblu.khub.common.api.EasternbluPathConstant.CURRENT;
import static com.easternblu.khub.common.api.EasternbluPathConstant.DELETE_ALL;
import static com.easternblu.khub.common.api.EasternbluPathConstant.DEVICES;
import static com.easternblu.khub.common.api.EasternbluPathConstant.GENRES;
import static com.easternblu.khub.common.api.EasternbluPathConstant.JSON;
import static com.easternblu.khub.common.api.EasternbluPathConstant.LANGUAGES;
import static com.easternblu.khub.common.api.EasternbluPathConstant.LISTS;
import static com.easternblu.khub.common.api.EasternbluPathConstant.ME;
import static com.easternblu.khub.common.api.EasternbluPathConstant.OAUTH;
import static com.easternblu.khub.common.api.EasternbluPathConstant.PLAYLISTS;
import static com.easternblu.khub.common.api.EasternbluPathConstant.PLAYLIST_ID_SUB;
import static com.easternblu.khub.common.api.EasternbluPathConstant.PLAYQUEUE;
import static com.easternblu.khub.common.api.EasternbluPathConstant.POPULAR;
import static com.easternblu.khub.common.api.EasternbluPathConstant.PROFILES;
import static com.easternblu.khub.common.api.EasternbluPathConstant.PROFILE_ID_SUB;
import static com.easternblu.khub.common.api.EasternbluPathConstant.REQUEST;
import static com.easternblu.khub.common.api.EasternbluPathConstant.SESSIONS;
import static com.easternblu.khub.common.api.EasternbluPathConstant.TOKEN;
import static com.easternblu.khub.common.api.EasternbluPathConstant.TOP_LANGUAGES;
import static com.easternblu.khub.common.api.EasternbluPathConstant.TRACKS;
import static com.easternblu.khub.common.api.EasternbluPathConstant.TRACK_ID_SUB;
import static com.easternblu.khub.common.api.EasternbluPathConstant.USERS;
import static com.easternblu.khub.common.api.EasternbluPathConstant.VERSION;
import static com.easternblu.khub.common.api.EasternbluPathConstant._FORCE_ADD;
import static com.easternblu.khub.common.api.EasternbluPathConstant._INCLUDES;
import static com.easternblu.khub.common.api.EasternbluPathConstant._PAGE;
import static com.easternblu.khub.common.api.EasternbluPathConstant._PER_PAGE;
import static com.easternblu.khub.common.api.EasternbluPathConstant._TRACKS;

/**
 * Khub API end-points
 * Deprecated, copy this entire class to your own app
 *
 *
 * use {@link KhubApi} instead
 * Created by leechunhoe on 4/7/16.
 */
@Deprecated
public class EasternbluApi {
    private static final String EASTERNBLU_API_DOMAIN_LIVE = "https://app.khub.tv";
    private static final String EASTERNBLU_API_DOMAIN_STAGING = "https://app-staging.khub.tv";

    @Deprecated
    public static final String EASTERNBLU_API_DOMAIN = EasternbluConfig.IS_PRODUCTION ? EASTERNBLU_API_DOMAIN_LIVE : EASTERNBLU_API_DOMAIN_STAGING;
//    public static final String EASTERNBLU_API_DOMAIN = "http://digimon-worker-staging.ap-southeast-1.elasticbeanstalk.com";

    // Authentication and authorization
    public static final String AUTHORIZE_API = EasternbluApi.EASTERNBLU_API_DOMAIN + OAUTH +
            AUTHORIZE;

    public static final int STATUS_CODE_UNAUTHORIZED = 401;

    public static final String APP_VERSION_API = EASTERNBLU_API_DOMAIN + VERSION + APP_VERSION + JSON;

    public static final String AUTHORIZE_RESULT_API = EASTERNBLU_API_DOMAIN + OAUTH +
            AUTHORIZE + "/%s";
    public static final String TOKEN_API = EASTERNBLU_API_DOMAIN + OAUTH +
            TOKEN;
    public static final String REFRESH_ACCESS_TOKEN_API = EASTERNBLU_API_DOMAIN + OAUTH +
            TOKEN;
    public static final String TV_SHORT_CODE_API = EASTERNBLU_API_DOMAIN + VERSION + AUTH +
            TOKEN + JSON;

    public static final String REGISTER_DEVICE_API = EASTERNBLU_API_DOMAIN + VERSION
            + ME + DEVICES + JSON;

    //Profiles
    public static final String PROFILE_ME_API = EASTERNBLU_API_DOMAIN + VERSION +
            ME + JSON;
    public static final String PROFILE_GET_API = EASTERNBLU_API_DOMAIN + VERSION +
            PROFILES + PROFILE_ID_SUB + JSON;
    public static final String PROFILES_LIST_API = EASTERNBLU_API_DOMAIN + VERSION +
            PROFILES + JSON;
    public static final String PROFILE_PLAYLISTS_API = EASTERNBLU_API_DOMAIN + VERSION +
            ":profile" + PLAYLISTS + JSON;

    public static final String PROFILE_PLAYLIST_TRACKS_API = EASTERNBLU_API_DOMAIN +
            VERSION + PROFILES + SLASH +
            PROFILE_ID_SUB + PLAYLISTS + SLASH +
            PLAYLIST_ID_SUB + TRACKS + JSON;

    // Play lists
    public static final String PLAYLISTS_LIST_API = EASTERNBLU_API_DOMAIN + VERSION +
            PLAYLISTS + JSON;
    public static final String PLAYLIST_GET_API = EASTERNBLU_API_DOMAIN + VERSION +
            PLAYLISTS + SLASH + PLAYLIST_ID_SUB + JSON;

    public static final String PLAYLIST_TRACKS_API = EASTERNBLU_API_DOMAIN + VERSION +
            PLAYLIST_ID_SUB + TRACKS + JSON;

    // Play-queues
    public static final String PLAYQUEUE_API = EASTERNBLU_API_DOMAIN + VERSION
            + ME + PLAYQUEUE + JSON;
    public static final String PLAYQUEUE_TRACK_API = EASTERNBLU_API_DOMAIN + VERSION
            + ME + PLAYQUEUE + TRACKS +
            JSON;
    public static final String PLAYQUEUE_TRACK_FORCE_ADD_API = EASTERNBLU_API_DOMAIN + VERSION
            + ME + PLAYQUEUE + TRACKS +
            JSON + QUESTION_MARK + _FORCE_ADD + EQUALS + Common.TRUE;
    public static final String PLAY_QUEUE_TRACKS_DELETE_ALL_API = EASTERNBLU_API_DOMAIN + VERSION
            + ME + PLAYQUEUE + DELETE_ALL +
            JSON;

    public static final String PLAYQUEUE_TOKEN_API = EASTERNBLU_API_DOMAIN + VERSION
            + PLAYQUEUE + TOKEN +
            JSON;
    public static final String PLAYQUEUE_AUTHORIZE_API = EASTERNBLU_API_DOMAIN + VERSION
            + PLAYQUEUE + AUTHORIZE +
            JSON;
    public static final String PLAY_QUEUE_DEVICES_API = EASTERNBLU_API_DOMAIN + VERSION +
            PLAYQUEUE + DEVICES + JSON;

    public static final String PLAY_QUEUE_TRACKS_API = EASTERNBLU_API_DOMAIN + VERSION +
            ME + PLAYQUEUE + TRACKS + JSON;

    public static final String PLAY_QUEUE_CURRENT_TRACK_API = EASTERNBLU_API_DOMAIN + VERSION +
            ME + PLAYQUEUE + CURRENT + JSON;

    // Tracks
    public static final String TRACKS_LIST_API = EASTERNBLU_API_DOMAIN + VERSION +
            TRACKS + JSON;
    public static final String TRACK_GET_API = EASTERNBLU_API_DOMAIN + VERSION +
            TRACKS + SLASH + TRACK_ID_SUB + JSON;

    // Artists
    public static final String ARTISTS_LIST_API = EASTERNBLU_API_DOMAIN + VERSION +
            ARTISTS + JSON;
    public static final String ARTIST_GET_API = EASTERNBLU_API_DOMAIN + VERSION +
            ARTISTS + SLASH + ARTIST_ID_SUB + JSON;

    // Devices
    public static final String DEVICES_API = EASTERNBLU_API_DOMAIN + VERSION +
            ME + DEVICES + JSON;

    // Facebook
    // POST /v1/auth/sessions.json
    public static final String FACEBOOK_LOGIN_API = EASTERNBLU_API_DOMAIN + VERSION +
            AUTH + SESSIONS + JSON;

    public static final String EMAIL_SIGN_UP_API = EASTERNBLU_API_DOMAIN + VERSION + USERS + JSON;

    public static final String EMAIL_LOGIN_API = EASTERNBLU_API_DOMAIN + VERSION +
            AUTH + SESSIONS + JSON;

    public static final String POPULAR_PLAYLISTS_API = EASTERNBLU_API_DOMAIN + VERSION
            + LISTS + POPULAR + JSON;

    public static final String POPULAR_PLAYLISTS_WITH_TRACKS_API = POPULAR_PLAYLISTS_API
            + QUESTION_MARK + _INCLUDES + EQUALS + _TRACKS;

    public static final String GENRES_API = EASTERNBLU_API_DOMAIN + VERSION + GENRES + JSON;

    public static final String LANGUAGES_API = EASTERNBLU_API_DOMAIN + VERSION + LANGUAGES + JSON;
    public static final String TOP_LANGUAGES_API = EASTERNBLU_API_DOMAIN + VERSION + TOP_LANGUAGES + JSON;

    public static final String GENRE_PLAY_LISTS_API = EASTERNBLU_API_DOMAIN + VERSION + GENRES;

    // Play queue
    public static final String PLAY_QUEUE_API = EASTERNBLU_API_DOMAIN + VERSION +
            ME + PLAYQUEUE + JSON;

    // Play queue current
    public static final String PLAY_QUEUE_CURRENT_API = EASTERNBLU_API_DOMAIN + VERSION +
            ME + PLAYQUEUE + CURRENT + JSON;

    // TODO: Update this
    public static final String SUGGEST_TRACK_API = EASTERNBLU_API_DOMAIN + VERSION + TRACKS + REQUEST + JSON;

    /**
     * GET /me/play_queue.json
     * http://developers.khub.com/#!/PlayQueue/get_me_play_queue_json
     *
     * @param page    Page number
     * @param perPage Tracks per page
     * @return URL
     */
    public static String getPlayQueueApi(int page, int perPage) {
        return PLAY_QUEUE_API + QUESTION_MARK + _PAGE + EQUALS + page + AND + _PER_PAGE + EQUALS + perPage;
    }

    public static String getGenrePlayListWithTracksApi(String genre, String languageCodes, int currentPage, int playListsPerPage) {
        String query = EasternbluPathConstant._INCLUDES + EQUALS + EasternbluPathConstant._TRACKS
                + AND + EasternbluPathConstant._LANG + EQUALS + languageCodes
                + AND + _PAGE + EQUALS + currentPage
                + Common.AND + _PER_PAGE + Common.EQUALS + playListsPerPage;
        return EasternbluApi.GENRE_PLAY_LISTS_API + SLASH + genre + EasternbluPathConstant.JSON + QUESTION_MARK + query;
    }
}
