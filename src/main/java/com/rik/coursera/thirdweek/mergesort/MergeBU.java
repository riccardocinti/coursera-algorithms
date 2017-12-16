package com.rik.coursera.thirdweek.mergesort;

public class MergeBU extends Merge {

    public static void sort(Comparable[] a){
        int n = a.length;
        aux = new Comparable[n];
        for(int sz = 1; sz < n; sz = sz+sz){
            for(int lo = 0; lo < n-sz; lo += sz+sz){
                merge(a, lo, lo+sz, Math.min(lo+sz+sz-1, n-1));
            }
        }
    }
}
