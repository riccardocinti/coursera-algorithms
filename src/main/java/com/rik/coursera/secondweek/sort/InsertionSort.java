package com.rik.coursera.secondweek.sort;

public class InsertionSort implements Sort {
    public void sort(Comparable[] a){
        int n = a.length;
        for(int i = 0; i < n; i++){
            for(int j = i; j >=0; j--){
                if(less(a[j], a[j-1])){
                    exchange(a, j, j-1);
                }else{
                    break;
                }
            }
        }
    }
}
