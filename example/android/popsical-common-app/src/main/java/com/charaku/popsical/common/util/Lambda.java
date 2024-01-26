package com.easternblu.kstream.common.util;

/**
 * A generic interface that accept 1 input object and return another output object
 *
 * @param <A>
 * @param <R>
 */
public interface Lambda<A, R> {
    public R invoke(A a);
}
