package com.charaku.kstream.common.util;

import android.graphics.Point;

public class Size extends Point {
    public Size(int width, int height) {
        super(width, height);
    }

    public int getWidth() {
        return x;
    }

    public int getHeight() {
        return y;
    }
}
