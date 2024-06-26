package com.easternblu.khub.media.model;

/**
 * Error type or analytic event that should be sent to server generated by exoplayer
 */
public enum PlaybackErrorType {
    EXOPLAYER_ERROR_WITH_TRACK_INFO,
    EXOPLAYER_ERROR,
    EXOPLAYER_GENERIC_ERROR,
    EXOPLAYER_RENDERER_ERROR,
    EXOPLAYER_RENDERER_SUPPORT_UNSUPPORTED_AUDIO_TRACKS,
    EXOPLAYER_RENDERER_SUPPORT_UNSUPPORTED_VIDEO_TRACKS,
    EXOPLAYER_SOURCE_ERROR,
    EXOPLAYER_SOURCE_WITH_CONNECTION_ERROR,
    EXOPLAYER_SOURCE_WITH_INVALID_CODE_ERROR,
    EXOPLAYER_UNEXPECTED_ERROR,
    INVALD_AUDIO_SAMPLE_RATE,
}

