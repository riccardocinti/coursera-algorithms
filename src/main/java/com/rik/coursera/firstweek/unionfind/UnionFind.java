package com.rik.coursera.firstweek.unionfind;

public abstract class UnionFind {

    public int[] objects;

    public UnionFind(int N) {
        this.objects = new int[N];
        for (int i = 0; i < N; i++) {
            objects[i] = i;
        }
    }

    abstract boolean connected(int p, int q);
    abstract void union(int p, int q);
}
