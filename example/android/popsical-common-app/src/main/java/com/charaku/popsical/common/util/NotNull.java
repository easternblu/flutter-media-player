package com.easternblu.kstream.common.util;

import androidx.annotation.NonNull;

/**
 * Interface that accept a non-null object and return another
 *
 * @param <A>
 * @param <R>
 */
public interface NotNull<A, R> extends Lambda<A, R> {
    @Override
    public R invoke(@NonNull A a);
}


