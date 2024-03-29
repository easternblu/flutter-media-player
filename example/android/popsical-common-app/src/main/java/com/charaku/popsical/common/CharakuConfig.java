package com.easternblu.kstream.common;

public class easternbluConfig {
    /**
     * Deprecated
     * Get R.string.which_server flag from kstream global properties file
     * 0 is production, 1 is staging
     */
    @Deprecated
    public static final boolean IS_PRODUCTION = false;

    // Moved to kstreamTVConstant.UPDATE_DOWNLOAD_TIMEOUT
    public static final long TIMEOUT_IN_MILLISECONDS = 50000; // 50 seconds

    public static final String REDIRECT_URI_VALUE = "urn:ietf:wg:oauth:2.0:oob";

    public static final String RESPONSE_TYPE_VALUE = "code";
    public static final String STATE_VALUE = Common.EMPTY_STRING;
    public static final String SCOPE_VALUE_REMOTE = "public remote_mode";

    public static final String SCOPE_VALUE_TV = "public manage"; // For TV (Not used in remote)

    public static final String REFRESH_TOKEN_GRANT_TYPE_VALUE = com.easternblu.kstream.common.Common.REFRESH_TOKEN;

    @Deprecated
    public static final String ALGOLIA_SEARCH_TRACK_INDEX_NAME = IS_PRODUCTION ? "Track_production" : "Track_staging";

    @Deprecated
    public static final String ALGOLIA_SEARCH_ARTIST_INDEX_NAME = IS_PRODUCTION ? "Artist_production" : "Artist_staging";

    public static final String FONT_PATH = "fonts/GothamRoundedMedium.ttf";

    // Moved to kstreamTVConstant.TV_DEFAULT_SERVER_PORT
    @Deprecated
    public static final int TV_DEFAULT_SERVER_PORT = 8080;

    // Moved to kstreamTVConstant.MAX_NUMBER_OF_REMOTE_CLIENTS
    @Deprecated
    public static final int MAX_NUMBER_OF_REMOTE_CLIENTS = 20;

    @Deprecated
    public static final int NUMBER_OF_PLAY_LISTS_PER_BATCH = 10;
}