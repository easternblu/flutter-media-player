package com.easternblu.kstream.common;


import com.easternblu.kstream.common.util.Dates;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class CommonTest {
    public final String TAG = this.getClass().getSimpleName();

    public CommonTest() {
    }

    protected void log(Object object) {
        String time = Dates.toString(Dates.PATTERN_HH_MM_SS_SSS, Dates.getNow());
        System.out.println(TAG + " [" + time + "] " + (object == null ? "null" : object.toString()));
    }
}
