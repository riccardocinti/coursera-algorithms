package com.coursera.rik.firstweek.test;

import com.rik.coursera.firstweek.unionfind.QuickFindUF;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuickFindUFTest {

    private QuickFindUF quickFind;

    @Before
    public void init(){
        quickFind = new QuickFindUF(3);
    }

    @Test
    public void testQFConstructorCreatesA_N_EntriesArray(){
        quickFind = new QuickFindUF(3);
        Assert.assertEquals(3, quickFind.objects.length);
    }

    @Test
    public void assertThatTwoGivenIntsAreConnected(){
        quickFind.objects = new int[]{0, 2, 2};
        int p = 1;
        int q = 2;
        Assert.assertTrue(quickFind.connected(p, q));
    }

    @Test
    public void assertThatUnionActuallyLinksTwoElementsInTheObjectsArray(){
        quickFind.objects = new int[]{0, 1, 2};
        int p = 2;
        int q = 1;
        quickFind.union(p, q);
        Assert.assertEquals(quickFind.objects[1], 1);
        Assert.assertEquals(quickFind.objects[2], 1);
    }
}
