import 'dart:io';
import 'package:flutter/foundation.dart';
import 'package:flutter/gestures.dart';
import 'package:flutter/material.dart';
import 'package:flutter/rendering.dart';
import 'package:flutter/services.dart';
import 'controller.dart';

class Video extends StatefulWidget {
  final Function? onViewCreated;
  final kstreamMediaController? controller;

  const Video({
    this.onViewCreated,
    @required this.controller,
  });

  @override
  _VideoState createState() => _VideoState();
}

class _VideoState extends State<Video> {
  kstreamMediaController? controller;
  Widget _playerWidget = Container();

  void applyController(BuildContext context) {
    if (controller == widget.controller) return;
    controller = widget.controller;
  }

  @override
  void initState() {
    super.initState();
    applyController(context);
    _setupPlayer();
  }

  @override
  Widget build(BuildContext context) {
    applyController(context);
    return _playerWidget;
  }

  void _setupPlayer() {
    if (Platform.isAndroid &&
        controller?.url != null &&
        controller?.url?.isNotEmpty == true) {
      _playerWidget = AndroidView(
        viewType: "tv.native.player.pops",
        creationParams: {
          "autoPlay": controller?.autoPlay ?? true,
          "loop": controller?.loop ?? false,
          "url": controller?.url ?? '',
          "title": controller?.title ?? "",
          "subtitle": controller?.subtitle ?? "",
          "position": controller?.position ?? 0.0,
          "speed": controller?.speed?.toString() ?? 0.0,
          "pitch": controller?.pitch?.toString() ?? 0.0,
          "code": controller?.preferredAudioLanguage,
          "userId": controller?.userId ?? "",
          "trackId": controller?.trackId ?? "",
          "videoId": controller?.videoId ?? "",
          "experimentName": controller?.muxName ?? "",
          "propertyKey": controller?.muxKey ?? "",
          "enableMuxStats": controller?.enableMux ?? false
        },
        creationParamsCodec: const StandardMessageCodec(),
        onPlatformViewCreated: (viewId) {
          controller?.onPlatformViewCreated(viewId);
          if (widget.onViewCreated == null) {
            return;
          }
          widget.onViewCreated!(viewId);
        },
        hitTestBehavior: PlatformViewHitTestBehavior.translucent,
        gestureRecognizers: const <Factory<OneSequenceGestureRecognizer>>{},
      );
    }
  }

  @override
  void dispose() {
    if (controller?.methodChannel != null) {
      controller?.methodChannel?.invokeMethod("dispose");
      controller?.methodChannel = null;
      controller?.dispose();
    }
    super.dispose();
  }
}
