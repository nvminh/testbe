package com.nvminh.testbe;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {
    LinkedList list;

    @Before
    public void before() {
        list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
    }

    @Test
    public void append() {
        int[] arr = list.getValues();
        Assert.assertArrayEquals(new int[]{1,2,3,4}, arr);
    }

    @Test
    public void removeTail() {
        list.removeTail();
        Assert.assertArrayEquals(new int[]{1,2,3}, list.getValues());
        list.removeTail();
        Assert.assertArrayEquals(new int[]{1,2}, list.getValues());
    }

    @Test
    public void removeAll() {
        list.removeAll(2);
        Assert.assertArrayEquals(new int[]{1,2}, list.getValues());
        list = new LinkedList();
        list.append(4);
        list.append(2);
        list.append(3);
        list.append(1);
        list.removeAll(2);
        Assert.assertArrayEquals(new int[]{2,1}, list.getValues());
    }

}