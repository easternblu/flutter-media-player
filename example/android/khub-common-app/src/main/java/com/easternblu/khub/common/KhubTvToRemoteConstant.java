package com.easternblu.khub.common;

/**
 * Constants for Khub
 * Created by leechunhoe on 3/8/16.
 */
@SuppressWarnings({Common.UNUSED})
public interface KhubTvToRemoteConstant {


    /**
     * See {@link KhubConstant#KHUB_BROADCAST_PARAM_CODE_SIMPLIFIED}
     */
    @Deprecated
    String KHUB_TV_TO_REMOTE_BROADCAST_PARAM_CODE = "KHUB_TV_TO_REMOTE_BROADCAST_PARAM_CODE";


    /**
     * See {@link KhubConstant#KHUB_BROADCAST_PARAM_VALUE_SIMPLIFIED}
     */
    @Deprecated
    String KHUB_TV_TO_REMOTE_BROADCAST_PARAM_VALUE = "KHUB_TV_TO_REMOTE_BROADCAST_PARAM_VALUE";


    /**
     * See {@link KhubConstant#KHUB_BROADCAST_PARAM_VALUE_STRING_SIMPLIFIED}
     */
    @Deprecated
    String KHUB_TV_TO_REMOTE_BROADCAST_PARAM_VALUE_STRING = "KHUB_TV_TO_REMOTE_BROADCAST_PARAM_VALUE_STRING";

    //region int code constants that TV sends to remote (These values should be nouns)
    //================================================================================
    // CODES
    //================================================================================
    int KHUB_TV_UPDATE_PLAY_QUEUE = 0;
    @Deprecated
    int KHUB_TV_PLAYQUEUE_ID = KhubRemoteToTvConstant.KHUB_REMOTE_VALUE_PLAYQUEUE_ID; // use KHUB_TV_TRUE_PLAYQUEUE_ID instead
    int KHUB_TV_TRUE_PLAYQUEUE_ID = KhubRemoteToTvConstant.KHUB_REMOTE_VALUE_TRUE_PLAYQUEUE_ID;
    @Deprecated
    int KHUB_TV_PARTYCODE = KhubRemoteToTvConstant.KHUB_REMOTE_VALUE_PARTYCODE;
    int KHUB_TV_SPEC = 2;//KhubRemoteToTvConstant.KHUB_REMOTE_VALUE_TV_SPEC;


    int KHUB_TV_DSP_SETTINGS = 5;
    @Deprecated // use KHUB_TV_DSP_SETTINGS
    int KHUB_TV_DSP_SETTING = KHUB_TV_DSP_SETTINGS;
    int KHUB_TV_DSP_SHORTCUTS = 6;


    int KHUB_TV_LOGOUT = 100;
    int KHUB_TV_PAYMENT_INPUT = 101;
    int KHUB_TV_EDITTEXT = 102;
    int KHUB_TV_LIST = 103;
    int KHUB_TV_BUTTON = 104;
    int KHUB_TV_DIALOG = 105;
    
    int KHUB_TV_PLAYER_STATUS = 200;
    int KHUB_TV_PLAYER_PROGRESS = 201;


    //endregion

    //region int value constants that tv sends to remote (These values should be verbs)
    //================================================================================
    // CODES
    //================================================================================
    int KHUB_TV_VALUE_FOCUS = 7;
    int KHUB_TV_VALUE_UNFOCUS = 8;
    int KHUB_TV_VALUE_SHOW = 9;
    int KHUB_TV_VALUE_HIDE = 10;
    int KHUB_TV_VALUE_LOADING = 11;
    int KHUB_TV_VALUE_READY = 12;
    //endregion

    //region value object names
    //================================================================================
    // value object names
    //================================================================================
    String KHUB_TV_LABEL = "label";
    String KHUB_TV_MAX_LENGTH = "max_length";
    String KHUB_TV_COMPULSORY = "compulsory";
    String KHUB_TV_HINT = "hint";
    String KHUB_TV_ID = "id";
    String KHUB_TV_TEXT = "text";
    String KHUB_TV_SECURE_B64 = "secure_b64";
    String KHUB_TV_SECURE = "secure";
    String KHUB_TV_TYPE = "type";
    String KHUB_TV_POSITION = "position";

    String KHUB_TV_TITLE = "title";
    String KHUB_TV_ARTISTS_STRING= "artists_string";
    String KHUB_TV_PROGRESS = "progress";
    String KHUB_TV_IN_SKIPPABLE_RANGE = "in_skippable_range";
    String KHUB_TV_TOTAL_PROGRESS = "total_progress";
    String KHUB_TV_REPEAT_MODE = "repeat_mode";
    String KHUB_TV_VOCAL = "vocal";
    String KHUB_TV_MUSIC_VOLUME = "music_volume";
    String KHUB_TV_STATUS = "status";

    String KHUB_TV_START = "start";
    String KHUB_TV_STOP = "stop";
    String KHUB_TV_PAUSE = "pause";
    String KHUB_TV_RESUME = "resume";
    String KHUB_TV_BUFFERING = "buffering";
    String KHUB_TV_IDLE = "idle";


    //endregion

    /**
     * Possible values of KHUB_TV_TYPE, i.e. type of text fields
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
     * Possible values for KHUB_TV_ID
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