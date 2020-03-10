package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {

        Node head;

        private class Node {



            private int element;
            private Node next;

            // Constructor
            public Node(int element) {
                this.element = element;
                next = null;
            }
            public int getElement() {
                return element;
            }

            public void setElement(int element) {
                this.element = element;
            }

            public Node getNext() {
                return next;
            }

            public void setNext(Node next) {
                this.next = next;
            }




        }
    }


//    You may not use the LinkedList or ArrayList class or any other predefined Java collections
//    Your linked list must have a node inner class to represent each element
//    Your linked list must have add, remove, contains, find, size, get, copy and sort methods
//
//    Method definitions:
//    add -- add an element to the list
//    remove -- remove an element (specified by numeric index) from the list
//    contains -- returns true if the element is in the list, false otherwise
//    find -- returns the element's index if it is in the list, -1 otherwise
//    size -- returns the current size of the list
//    get -- returns the element at the specified index
//    copy -- returns a new linked list containing the same values (look up deep versus shallow copy)
//    sort -- sorts the list using your algorithm of choice. You must perform the sorting yourself (no fair using someone else's library)

