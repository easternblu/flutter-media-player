package com.charaku.kstream.common;

/**
 * Constants for kstream
 * Created by leechunhoe on 3/8/16.
 */
@SuppressWarnings({Common.UNUSED})
public interface kstreamTvToRemoteConstant {


    /**
     * See {@link kstreamConstant#kstream_BROADCAST_PARAM_CODE_SIMPLIFIED}
     */
    @Deprecated
    String kstream_TV_TO_REMOTE_BROADCAST_PARAM_CODE = "kstream_TV_TO_REMOTE_BROADCAST_PARAM_CODE";


    /**
     * See {@link kstreamConstant#kstream_BROADCAST_PARAM_VALUE_SIMPLIFIED}
     */
    @Deprecated
    String kstream_TV_TO_REMOTE_BROADCAST_PARAM_VALUE = "kstream_TV_TO_REMOTE_BROADCAST_PARAM_VALUE";


    /**
     * See {@link kstreamConstant#kstream_BROADCAST_PARAM_VALUE_STRING_SIMPLIFIED}
     */
    @Deprecated
    String kstream_TV_TO_REMOTE_BROADCAST_PARAM_VALUE_STRING = "kstream_TV_TO_REMOTE_BROADCAST_PARAM_VALUE_STRING";

    //region int code constants that TV sends to remote (These values should be nouns)
    //================================================================================
    // CODES
    //================================================================================
    int kstream_TV_UPDATE_PLAY_QUEUE = 0;
    @Deprecated
    int kstream_TV_PLAYQUEUE_ID = kstreamRemoteToTvConstant.kstream_REMOTE_VALUE_PLAYQUEUE_ID; // use kstream_TV_TRUE_PLAYQUEUE_ID instead
    int kstream_TV_TRUE_PLAYQUEUE_ID = kstreamRemoteToTvConstant.kstream_REMOTE_VALUE_TRUE_PLAYQUEUE_ID;
    @Deprecated
    int kstream_TV_PARTYCODE = kstreamRemoteToTvConstant.kstream_REMOTE_VALUE_PARTYCODE;
    int kstream_TV_SPEC = 2;//kstreamRemoteToTvConstant.kstream_REMOTE_VALUE_TV_SPEC;


    int kstream_TV_DSP_SETTINGS = 5;
    @Deprecated // use kstream_TV_DSP_SETTINGS
    int kstream_TV_DSP_SETTING = kstream_TV_DSP_SETTINGS;
    int kstream_TV_DSP_SHORTCUTS = 6;


    int kstream_TV_LOGOUT = 100;
    int kstream_TV_PAYMENT_INPUT = 101;
    int kstream_TV_EDITTEXT = 102;
    int kstream_TV_LIST = 103;
    int kstream_TV_BUTTON = 104;
    int kstream_TV_DIALOG = 105;
    
    int kstream_TV_PLAYER_STATUS = 200;
    int kstream_TV_PLAYER_PROGRESS = 201;


    //endregion

    //region int value constants that tv sends to remote (These values should be verbs)
    //================================================================================
    // CODES
    //================================================================================
    int kstream_TV_VALUE_FOCUS = 7;
    int kstream_TV_VALUE_UNFOCUS = 8;
    int kstream_TV_VALUE_SHOW = 9;
    int kstream_TV_VALUE_HIDE = 10;
    int kstream_TV_VALUE_LOADING = 11;
    int kstream_TV_VALUE_READY = 12;
    //endregion

    //region value object names
    //================================================================================
    // value object names
    //================================================================================
    String kstream_TV_LABEL = "label";
    String kstream_TV_MAX_LENGTH = "max_length";
    String kstream_TV_COMPULSORY = "compulsory";
    String kstream_TV_HINT = "hint";
    String kstream_TV_ID = "id";
    String kstream_TV_TEXT = "text";
    String kstream_TV_SECURE_B64 = "secure_b64";
    String kstream_TV_SECURE = "secure";
    String kstream_TV_TYPE = "type";
    String kstream_TV_POSITION = "position";

    String kstream_TV_TITLE = "title";
    String kstream_TV_ARTISTS_STRING= "artists_string";
    String kstream_TV_PROGRESS = "progress";
    String kstream_TV_IN_SKIPPABLE_RANGE = "in_skippable_range";
    String kstream_TV_TOTAL_PROGRESS = "total_progress";
    String kstream_TV_REPEAT_MODE = "repeat_mode";
    String kstream_TV_VOCAL = "vocal";
    String kstream_TV_MUSIC_VOLUME = "music_volume";
    String kstream_TV_STATUS = "status";

    String kstream_TV_START = "start";
    String kstream_TV_STOP = "stop";
    String kstream_TV_PAUSE = "pause";
    String kstream_TV_RESUME = "resume";
    String kstream_TV_BUFFERING = "buffering";
    String kstream_TV_IDLE = "idle";


    //endregion

    /**
     * Possible values of kstream_TV_TYPE, i.e. type of text fields
     */
    enum RemoteInputType {
        number,
        phone,
        text,
        name,
        email,
        credit_card_number,
        credit_card_date
    }


    /**
     * Possible values for kstream_TV_ID
     */
    enum ValueObjectId {
        first_name,
        last_name,
        email,
        address_line1,
        address_city,
        address_state,
        address_zip,
        promo_code,
        phone,
        card_num,
        card_expiry,
        card_cvv,
        card_country,
        done,
        payment_confirm_dialog
    }
}