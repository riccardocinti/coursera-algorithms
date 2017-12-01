package com.coursera.rik.firstweek.test;

import com.rik.coursera.firstweek.unionfind.QuickUnionUF;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuickUnionUFTest {

    QuickUnionUF quickUnion;

    @Before
    public void init(){
        quickUnion = new QuickUnionUF(3);
    }

    @Test
    public void assertThatUnionActuallyLinksTwoElementsInTheObjectsArray(){
        quickUnion.objects = new int[]{0, 1, 2, 3, 2};
        int p = 4;
        int q = 1;
        quickUnion.union(p, q);
        Assert.assertEquals(1,  quickUnion.objects[1]);
        Assert.assertEquals(1, quickUnion.objects[2]);
        Assert.assertEquals(2, quickUnion.objects[4]);
    }
}
