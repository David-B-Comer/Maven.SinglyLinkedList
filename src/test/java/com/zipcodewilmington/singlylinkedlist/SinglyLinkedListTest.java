package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {


    private static String ELEMENT1 = "Element1";
    private static String ELEMENT2 = "Element2";
    private static String ELEMENT3 = "Element3";

    private SinglyLinkedList<String> list;

    @Before
    public void setup() {
        list = new SinglyLinkedList<String>();
        Assert.assertTrue(list.getListSize() == 0);
    }

    @Test
    public void addElement() {
        list.addElement(ELEMENT1);
        Assert.assertTrue(list.getListSize() == 1);
        String element = list.getElementByIndex(0);
        Assert.assertEquals(ELEMENT1, element);
        list.addElement(ELEMENT2);
        Assert.assertTrue(list.getListSize() == 2);

    }

    @Test
    public void removeElementByIndex() {
        Assert.assertTrue(list.getListSize() == 0);
        boolean removeSuccess = list.removeElementByIndex(-1);
        Assert.assertFalse(removeSuccess);
        removeSuccess = list.removeElementByIndex(1000);
        Assert.assertFalse(removeSuccess);
        removeSuccess = list.removeElementByIndex(0);
        Assert.assertFalse(removeSuccess);

        list.addElement(ELEMENT1);

    }

}
