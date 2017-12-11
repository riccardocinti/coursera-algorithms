package com.rik.coursera.secondweek.sort;

public interface Sort {

    default boolean less(Comparable v, Comparable w){
        //if v < w
        return v.compareTo(w) < 0;
    }

    default void exchange(Comparable[] a, int oldIndex, int newIndex){
        Comparable swap = a[oldIndex];
        a[oldIndex] = a[newIndex];
        a[newIndex] = swap;
    }
}
