package com.rik.coursera.thirdweek.mergesort;

public abstract class Merge {

    protected static Comparable[] aux; //auxiliary array for merges

    protected static void merge(Comparable[] a, int low, int mid, int high){
        int i = low;
        int j = mid + 1;

        for(int k = low; k <= high; k++){
            aux[k] = a[k];
        }

        for(int k = i; k <= high; k++){
            if(i > mid)
                a[k] = aux[j++];
            else if(j > high)
                a[k] = aux[i++];
            else if(aux[j].compareTo(aux[i]) <= 0)
                a[k] = aux[j++];
            else
                a[k] = aux[i++]; //this maintains stability
        }
    }

}
