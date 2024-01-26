package com.easternblu.kstream.common.util;

/**
 * Created by yatpanng on 15/2/17.
 */

public interface Converter<F, T> {
    public T convert(F from);
}
