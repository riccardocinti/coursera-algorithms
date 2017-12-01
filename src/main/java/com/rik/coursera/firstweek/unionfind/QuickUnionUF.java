package com.rik.coursera.firstweek.unionfind;

public class QuickUnionUF extends UnionFind {

    public QuickUnionUF(int N){
        super(N);
    }

    private int findRoot(int i){
        while (i != objects[i])
            i = objects[i];
        return i;
    }

    public boolean connected(int p, int q) {
        return findRoot(p) == findRoot(q);
    }

    public void union(int p, int q) {
        int pRoot = findRoot(p);
        int qRoot = findRoot(q);

        objects[pRoot] = qRoot;
    }
}
