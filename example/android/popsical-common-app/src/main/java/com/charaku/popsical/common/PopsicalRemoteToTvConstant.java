package com.charaku.kstream.common;

/**
 * Constants for kstream
 * Created by leechunhoe on 3/8/16.
 */
@SuppressWarnings({Common.UNUSED})
public interface kstreamRemoteToTvConstant {


    /**
     * See {@link kstreamConstant#kstream_BROADCAST_PARAM_CODE_SIMPLIFIED}
     */
    @Deprecated
    String kstream_REMOTE_TO_TV_BROADCAST_PARAM_CODE = "kstream_REMOTE_TO_TV_BROADCAST_PARAM_CODE";

    /**
     * See {@link kstreamConstant#kstream_BROADCAST_PARAM_VALUE_SIMPLIFIED}
     */
    @Deprecated
    String kstream_REMOTE_TO_TV_BROADCAST_PARAM_VALUE = "kstream_REMOTE_TO_TV_BROADCAST_PARAM_VALUE";

    /**
     * See {@link kstreamConstant#kstream_BROADCAST_PARAM_VALUE_STRING_SIMPLIFIED}
     */
    @Deprecated
    String kstream_REMOTE_TO_TV_BROADCAST_PARAM_VALUE_STRING = "kstream_REMOTE_TO_TV_BROADCAST_PARAM_VALUE_STRING";


    //region int value constants that remote sends to TV (These values should be verbs)
    //================================================================================
    // VALUES
    //================================================================================
    int kstream_REMOTE_VALUE_DOWN = -1;
    int kstream_REMOTE_VALUE_UP = 1;
    int kstream_REMOTE_VALUE_LEFT = -2;
    int kstream_REMOTE_VALUE_RIGHT = 2;
    int kstream_REMOTE_VALUE_OK = 0;
    int kstream_REMOTE_VALUE_CLOSE = 3;
    int kstream_REMOTE_VALUE_SET = 4;
    int kstream_REMOTE_VALUE_NEXT = 5; // go next essentially
    int kstream_REMOTE_VALUE_PREVIOUS = 6; // go previous essentially
    int kstream_REMOTE_VALUE_CLICK = 7;
    int kstream_REMOTE_VALUE_CONFIRM = 8;
    int kstream_REMOTE_VALUE_VIEW = 9;
    int kstream_REMOTE_VALUE_BACK = 100;
    int kstream_REMOTE_VALUE_RESET = 101;
    int kstream_REMOTE_VALUE_MENU = 102;
    int kstream_REMOTE_VALUE_ON = 103;
    int kstream_REMOTE_VALUE_OFF = 104;

    int kstream_REMOTE_VALUE_PLAY_AUDIO_IMAGE_EFFECT = 200;
    int kstream_REMOTE_VALUE_PLAY_AUDIO_GIF_EFFECT = 201;
    int kstream_REMOTE_VALUE_PLAY_AUDIO_GIF_QUERY_EFFECT = 202;
    int kstream_REMOTE_VALUE_PLAY_AUDIO_CONFETTI_EFFECT = 203;


    /**
     * Corresponding to {@link kstreamRemoteToTvConstant#kstream_REMOTE_TO_TV_REQUEST}
     */
    @Deprecated
    int kstream_REMOTE_VALUE_PLAYQUEUE_ID = 1; // old kstream_REMOTE_VALUE_PLAYQUEUE_ID, use kstream_REMOTE_VALUE_TRUE_PLAYQUEUE_ID instead
    @Deprecated
    int kstream_REMOTE_VALUE_PARTYCODE = 2;
    int kstream_REMOTE_VALUE_TRUE_PLAYQUEUE_ID = 3; // new one hendrik added on 23 May
    int kstream_REMOTE_VALUE_TV_SPEC = 4; // return spec related information about TV
    int kstream_REMOTE_VALUE_DSP_SETTINGS = 5; // return current setting of a mic

    @Deprecated // use kstream_REMOTE_VALUE_DSP_SETTINGS
    int kstream_REMOTE_VALUE_DSP_SETTING = kstream_REMOTE_VALUE_DSP_SETTINGS; // return current setting of a mic

    int kstream_REMOTE_VALUE_DSP_SHORTCUTS = 6; // return current summary of dsp shortcuts
    int kstream_REMOTE_VALUE_ECHO = 801;
    //endregion

    //region int code constants that remote sends to TV (These values should be nouns)
    //================================================================================
    // CODES
    //================================================================================
    int kstream_REMOTE_MUSIC_VOLUME = 0;
    int kstream_REMOTE_VOCAL_VOLUME = 1;
    int kstream_REMOTE_PITCH = 2;
    int kstream_REMOTE_SPEED = 3;
    int kstream_REMOTE_SUBTITLE = 4;
    int kstream_REMOTE_VOCAL = 5;
    int kstream_REMOTE_SKIP_VIDEO = 6;
    int kstream_REMOTE_PLAY_PAUSE_VIDEO = 7;
    int kstream_REMOTE_CONTROL_PAD = 8;
    int kstream_REMOTE_DEVICE_NAME = 9;
    int kstream_REMOTE_UPDATE_PLAY_QUEUE = 10; // this action is already done by a client
    int kstream_REMOTE_REMOVE_PLAY_QUEUE_TRACK = 11; // this action is already done by a client
    int kstream_REMOTE_ADD_PLAY_QUEUE_TRACK = 12; // this action is already done by a client
    int kstream_REMOTE_PLAY_NOW = 13; // just an action that remote wants tv to do
    int kstream_REMOTE_UPDATE_NEXT_TRACK = 14; // this action is already done by a client
    int kstream_REMOTE_REPLAY_VIDEO = 15;
    int kstream_REMOTE_FORCE_QUIT_PLAYER = 16;
    int kstream_REMOTE_STEREO_BALANCE = 17;
    int kstream_REMOTE_MUTE_TOGGLE = 18;
    int kstream_REMOTE_NOTIFICATION = 19;
    int kstream_REMOTE_PAYMENT_INPUT = 30;
    int kstream_REMOTE_EDITTEXT = 31;
    int kstream_REMOTE_LIST = 32;
    int kstream_REMOTE_BUTTON = 33;
    int kstream_REMOTE_SUBSCRIPTION_SELECTION = 34;
    int kstream_REMOTE_REPEAT = 35;
    int kstream_REMOTE_CUSTOM_EFFECT = 36;
    int kstream_REMOTE_LOCAL_EFFECT = 37;
    int kstream_REMOTE_SKIP_CURRENT_VIDEO_RANGE = 38;
    int kstream_REMOTE_DSP_PARAM = 40;
    int kstream_REMOTE_DSP_SHORTCUT = 41;

    int kstream_REMOTE_TO_TV_REQUEST = 800; // code and value for request related actions (action that requires a response)
    //endregion


    //region value object names
    //================================================================================
    // value object names
    //================================================================================
    String kstream_TV_ID = "id";
    String kstream_TV_TEXT = "text";
    String kstream_TV_SECURE_B64 = "secure_b64";
    String kstream_TV_SECURE = "secure";
    //endregion


    //region use as substring index for kstream_BROADCAST_PARAM_VALUE_STRING for kstream_REMOTE_NOTIFICATION
    //================================================================================
    // int position/index for string
    //================================================================================
    int kstream_SUBSTRING_POSITION_USER_ID = 0;
    int kstream_SUBSTRING_POSITION_USERNAME = 1;
    int kstream_SUBSTRING_POSITION_TITLE = 1; // mutually exclusive with kstream_SUBSTRING_POSITION_USERNAME hence same pos
    int kstream_SUBSTRING_POSITION_DEVICE_NAME = 2;
    int kstream_SUBSTRING_POSITION_MESSAGE = 2; // mutually exclusive with kstream_SUBSTRING_POSITION_DEVICE_NAME hence same pos
    int kstream_SUBSTRING_POSITION_PROFILE_ID = 3;
    int kstream_SUBSTRING_POSITION_IMAGE_URL = 4;
    //endregion


    //region
    //================================================================================
    // TITLES OF VALUES
    //================================================================================
    String TITLE_kstream_REMOTE_VALUE_DOWN = "DOWN";
    String TITLE_kstream_REMOTE_VALUE_UP = "UP";
    String TITLE_kstream_REMOTE_VALUE_LEFT = "LEFT";
    String TITLE_kstream_REMOTE_VALUE_RIGHT = "RIGHT";
    String TITLE_kstream_REMOTE_VALUE_OK = "OK";
    String TITLE_kstream_REMOTE_VALUE_BACK = "BACK";
    String TITLE_kstream_REMOTE_VALUE_RESET = "RESET";
    //endregion

    //region
    //================================================================================
    // TITLES OF CODES
    //================================================================================
    String TITLE_kstream_REMOTE_MUSIC_VOLUME = "MUSIC_VOLUME";
    String TITLE_kstream_REMOTE_VOCAL_VOLUME = "VOCAL_VOLUME";
    String TITLE_kstream_REMOTE_PITCH = "PITCH";
    String TITLE_kstream_REMOTE_SPEED = "SPEED";
    String TITLE_kstream_REMOTE_SUBTITLE = "SUBTITLE";
    String TITLE_kstream_REMOTE_VOCAL = "VOCAL";
    String TITLE_kstream_REMOTE_SKIP_VIDEO = "SKIP_VIDEO";
    String TITLE_kstream_REMOTE_PLAY_PAUSE_VIDEO = "PLAY_PAUSE_VIDEO";
    String TITLE_kstream_REMOTE_CONTROL_PAD = "CONTROL_PAD";
    String TITLE_kstream_REMOTE_DEVICE_NAME = "DEVICE_NAME";
    String TITLE_kstream_REMOTE_UPDATE_PLAY_QUEUE = "UPDATE_PLAY_QUEUE";
    String TITLE_kstream_REMOTE_REMOVE_PLAY_QUEUE_TRACK = "REMOVE_PLAY_QUEUE_TRACK";
    String TITLE_kstream_REMOTE_ADD_PLAY_QUEUE_TRACK = "ADD_PLAY_QUEUE_TRACK";
    String TITLE_kstream_REMOTE_PLAY_NOW = "PLAY_NOW";
    String TITLE_kstream_REMOTE_UPDATE_NEXT_TRACK = "UPDATE_NEXT_TRACK";
    String TITLE_kstream_REMOTE_REPLAY_VIDEO = "REPLAY_VIDEO";
    //endregion
}
