package com.rik.coursera.thirdweek.mergesort;

public class MergeTD extends Merge {

    public static void sort(Comparable[] a){
        aux = new Comparable[a.length];
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int low, int high){
        if(high <= low){
            return;
        }
        int mid = low + (high - low) / 2;
        sort(a, low, mid); //sort left half
        sort(a, mid + 1, high); //sort right half
        merge(a, low, mid, high);
    }

}
