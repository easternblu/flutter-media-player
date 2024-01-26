package com.easternblu.kstream.common.api;

import com.easternblu.kstream.common.easternbluConfig;
import com.easternblu.kstream.common.Common;

import static com.easternblu.kstream.common.Common.AND;
import static com.easternblu.kstream.common.Common.EQUALS;
import static com.easternblu.kstream.common.Common.QUESTION_MARK;
import static com.easternblu.kstream.common.Common.SLASH;
import static com.easternblu.kstream.common.api.easternbluPathConstant.APP_VERSION;
import static com.easternblu.kstream.common.api.easternbluPathConstant.ARTISTS;
import static com.easternblu.kstream.common.api.easternbluPathConstant.ARTIST_ID_SUB;
import static com.easternblu.kstream.common.api.easternbluPathConstant.AUTH;
import static com.easternblu.kstream.common.api.easternbluPathConstant.AUTHORIZE;
import static com.easternblu.kstream.common.api.easternbluPathConstant.CURRENT;
import static com.easternblu.kstream.common.api.easternbluPathConstant.DELETE_ALL;
import static com.easternblu.kstream.common.api.easternbluPathConstant.DEVICES;
import static com.easternblu.kstream.common.api.easternbluPathConstant.GENRES;
import static com.easternblu.kstream.common.api.easternbluPathConstant.JSON;
import static com.easternblu.kstream.common.api.easternbluPathConstant.LANGUAGES;
import static com.easternblu.kstream.common.api.easternbluPathConstant.LISTS;
import static com.easternblu.kstream.common.api.easternbluPathConstant.ME;
import static com.easternblu.kstream.common.api.easternbluPathConstant.OAUTH;
import static com.easternblu.kstream.common.api.easternbluPathConstant.PLAYLISTS;
import static com.easternblu.kstream.common.api.easternbluPathConstant.PLAYLIST_ID_SUB;
import static com.easternblu.kstream.common.api.easternbluPathConstant.PLAYQUEUE;
import static com.easternblu.kstream.common.api.easternbluPathConstant.POPULAR;
import static com.easternblu.kstream.common.api.easternbluPathConstant.PROFILES;
import static com.easternblu.kstream.common.api.easternbluPathConstant.PROFILE_ID_SUB;
import static com.easternblu.kstream.common.api.easternbluPathConstant.REQUEST;
import static com.easternblu.kstream.common.api.easternbluPathConstant.SESSIONS;
import static com.easternblu.kstream.common.api.easternbluPathConstant.TOKEN;
import static com.easternblu.kstream.common.api.easternbluPathConstant.TOP_LANGUAGES;
import static com.easternblu.kstream.common.api.easternbluPathConstant.TRACKS;
import static com.easternblu.kstream.common.api.easternbluPathConstant.TRACK_ID_SUB;
import static com.easternblu.kstream.common.api.easternbluPathConstant.USERS;
import static com.easternblu.kstream.common.api.easternbluPathConstant.VERSION;
import static com.easternblu.kstream.common.api.easternbluPathConstant._FORCE_ADD;
import static com.easternblu.kstream.common.api.easternbluPathConstant._INCLUDES;
import static com.easternblu.kstream.common.api.easternbluPathConstant._PAGE;
import static com.easternblu.kstream.common.api.easternbluPathConstant._PER_PAGE;
import static com.easternblu.kstream.common.api.easternbluPathConstant._TRACKS;

/**
 * kstream API end-points
 * Deprecated, copy this entire class to your own app
 *
 *
 * use {@link kstreamApi} instead
 * Created by leechunhoe on 4/7/16.
 */
@Deprecated
public class easternbluApi {
    private static final String easternblu_API_DOMAIN_LIVE = "https://app.kstream.tv";
    private static final String easternblu_API_DOMAIN_STAGING = "https://app-staging.kstream.tv";

    @Deprecated
    public static final String easternblu_API_DOMAIN = easternbluConfig.IS_PRODUCTION ? easternblu_API_DOMAIN_LIVE : easternblu_API_DOMAIN_STAGING;
//    public static final String easternblu_API_DOMAIN = "http://digimon-worker-staging.ap-southeast-1.elasticbeanstalk.com";

    // Authentication and authorization
    public static final String AUTHORIZE_API = easternbluApi.easternblu_API_DOMAIN + OAUTH +
            AUTHORIZE;

    public static final int STATUS_CODE_UNAUTHORIZED = 401;

    public static final String APP_VERSION_API = easternblu_API_DOMAIN + VERSION + APP_VERSION + JSON;

    public static final String AUTHORIZE_RESULT_API = easternblu_API_DOMAIN + OAUTH +
            AUTHORIZE + "/%s";
    public static final String TOKEN_API = easternblu_API_DOMAIN + OAUTH +
            TOKEN;
    public static final String REFRESH_ACCESS_TOKEN_API = easternblu_API_DOMAIN + OAUTH +
            TOKEN;
    public static final String TV_SHORT_CODE_API = easternblu_API_DOMAIN + VERSION + AUTH +
            TOKEN + JSON;

    public static final String REGISTER_DEVICE_API = easternblu_API_DOMAIN + VERSION
            + ME + DEVICES + JSON;

    //Profiles
    public static final String PROFILE_ME_API = easternblu_API_DOMAIN + VERSION +
            ME + JSON;
    public static final String PROFILE_GET_API = easternblu_API_DOMAIN + VERSION +
            PROFILES + PROFILE_ID_SUB + JSON;
    public static final String PROFILES_LIST_API = easternblu_API_DOMAIN + VERSION +
            PROFILES + JSON;
    public static final String PROFILE_PLAYLISTS_API = easternblu_API_DOMAIN + VERSION +
            ":profile" + PLAYLISTS + JSON;

    public static final String PROFILE_PLAYLIST_TRACKS_API = easternblu_API_DOMAIN +
            VERSION + PROFILES + SLASH +
            PROFILE_ID_SUB + PLAYLISTS + SLASH +
            PLAYLIST_ID_SUB + TRACKS + JSON;

    // Play lists
    public static final String PLAYLISTS_LIST_API = easternblu_API_DOMAIN + VERSION +
            PLAYLISTS + JSON;
    public static final String PLAYLIST_GET_API = easternblu_API_DOMAIN + VERSION +
            PLAYLISTS + SLASH + PLAYLIST_ID_SUB + JSON;

    public static final String PLAYLIST_TRACKS_API = easternblu_API_DOMAIN + VERSION +
            PLAYLIST_ID_SUB + TRACKS + JSON;

    // Play-queues
    public static final String PLAYQUEUE_API = easternblu_API_DOMAIN + VERSION
            + ME + PLAYQUEUE + JSON;
    public static final String PLAYQUEUE_TRACK_API = easternblu_API_DOMAIN + VERSION
            + ME + PLAYQUEUE + TRACKS +
            JSON;
    public static final String PLAYQUEUE_TRACK_FORCE_ADD_API = easternblu_API_DOMAIN + VERSION
            + ME + PLAYQUEUE + TRACKS +
            JSON + QUESTION_MARK + _FORCE_ADD + EQUALS + Common.TRUE;
    public static final String PLAY_QUEUE_TRACKS_DELETE_ALL_API = easternblu_API_DOMAIN + VERSION
            + ME + PLAYQUEUE + DELETE_ALL +
            JSON;

    public static final String PLAYQUEUE_TOKEN_API = easternblu_API_DOMAIN + VERSION
            + PLAYQUEUE + TOKEN +
            JSON;
    public static final String PLAYQUEUE_AUTHORIZE_API = easternblu_API_DOMAIN + VERSION
            + PLAYQUEUE + AUTHORIZE +
            JSON;
    public static final String PLAY_QUEUE_DEVICES_API = easternblu_API_DOMAIN + VERSION +
            PLAYQUEUE + DEVICES + JSON;

    public static final String PLAY_QUEUE_TRACKS_API = easternblu_API_DOMAIN + VERSION +
            ME + PLAYQUEUE + TRACKS + JSON;

    public static final String PLAY_QUEUE_CURRENT_TRACK_API = easternblu_API_DOMAIN + VERSION +
            ME + PLAYQUEUE + CURRENT + JSON;

    // Tracks
    public static final String TRACKS_LIST_API = easternblu_API_DOMAIN + VERSION +
            TRACKS + JSON;
    public static final String TRACK_GET_API = easternblu_API_DOMAIN + VERSION +
            TRACKS + SLASH + TRACK_ID_SUB + JSON;

    // Artists
    public static final String ARTISTS_LIST_API = easternblu_API_DOMAIN + VERSION +
            ARTISTS + JSON;
    public static final String ARTIST_GET_API = easternblu_API_DOMAIN + VERSION +
            ARTISTS + SLASH + ARTIST_ID_SUB + JSON;

    // Devices
    public static final String DEVICES_API = easternblu_API_DOMAIN + VERSION +
            ME + DEVICES + JSON;

    // Facebook
    // POST /v1/auth/sessions.json
    public static final String FACEBOOK_LOGIN_API = easternblu_API_DOMAIN + VERSION +
            AUTH + SESSIONS + JSON;

    public static final String EMAIL_SIGN_UP_API = easternblu_API_DOMAIN + VERSION + USERS + JSON;

    public static final String EMAIL_LOGIN_API = easternblu_API_DOMAIN + VERSION +
            AUTH + SESSIONS + JSON;

    public static final String POPULAR_PLAYLISTS_API = easternblu_API_DOMAIN + VERSION
            + LISTS + POPULAR + JSON;

    public static final String POPULAR_PLAYLISTS_WITH_TRACKS_API = POPULAR_PLAYLISTS_API
            + QUESTION_MARK + _INCLUDES + EQUALS + _TRACKS;

    public static final String GENRES_API = easternblu_API_DOMAIN + VERSION + GENRES + JSON;

    public static final String LANGUAGES_API = easternblu_API_DOMAIN + VERSION + LANGUAGES + JSON;
    public static final String TOP_LANGUAGES_API = easternblu_API_DOMAIN + VERSION + TOP_LANGUAGES + JSON;

    public static final String GENRE_PLAY_LISTS_API = easternblu_API_DOMAIN + VERSION + GENRES;

    // Play queue
    public static final String PLAY_QUEUE_API = easternblu_API_DOMAIN + VERSION +
            ME + PLAYQUEUE + JSON;

    // Play queue current
    public static final String PLAY_QUEUE_CURRENT_API = easternblu_API_DOMAIN + VERSION +
            ME + PLAYQUEUE + CURRENT + JSON;

    // TODO: Update this
    public static final String SUGGEST_TRACK_API = easternblu_API_DOMAIN + VERSION + TRACKS + REQUEST + JSON;

    /**
     * GET /me/play_queue.json
     * http://developers.kstream.com/#!/PlayQueue/get_me_play_queue_json
     *
     * @param page    Page number
     * @param perPage Tracks per page
     * @return URL
     */
    public static String getPlayQueueApi(int page, int perPage) {
        return PLAY_QUEUE_API + QUESTION_MARK + _PAGE + EQUALS + page + AND + _PER_PAGE + EQUALS + perPage;
    }

    public static String getGenrePlayListWithTracksApi(String genre, String languageCodes, int currentPage, int playListsPerPage) {
        String query = easternbluPathConstant._INCLUDES + EQUALS + easternbluPathConstant._TRACKS
                + AND + easternbluPathConstant._LANG + EQUALS + languageCodes
                + AND + _PAGE + EQUALS + currentPage
                + Common.AND + _PER_PAGE + Common.EQUALS + playListsPerPage;
        return easternbluApi.GENRE_PLAY_LISTS_API + SLASH + genre + easternbluPathConstant.JSON + QUESTION_MARK + query;
    }
}
