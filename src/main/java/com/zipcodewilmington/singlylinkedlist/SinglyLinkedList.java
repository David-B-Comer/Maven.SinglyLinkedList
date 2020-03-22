package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> {

    private Node<T> head;
    private int listSize = 0;
    private int index;

    private class Node<T> {

        private T element;
        private Node<T> next;

        // Constructor
        public Node(T element) {
            this.element = element;
            next = null;
        }

        // Constructor
        public Node(T element, Node<T> next) {
            this.element = element;
            this.next = next;
        }

        public T getElement() {
            return element;
        }

        public void setElement(T element) {
            this.element = element;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }

    private void incrementListSize() {
        listSize++;
    }

    private void decrementListSize() {
        listSize--;
    }

//   add -- add an element to the list
    public void addElement(T element) {

        Node<T> newNode = new Node<T>(element);

        if(this.head == null) {
            this.head = newNode;
        }
        else {
            Node<T> last = head;
            while (last.getNext() != null) {
                last = last.getNext();
            }
            last.setNext(newNode);
        }
        incrementListSize();
    }

//   remove -- remove an element (specified by numeric index) from the list
    public boolean removeElementByIndex(int index) {

        if (index < 0 || index > getListSize() || head == null)
            return false;
        if (index == 0) {
            head = head.getNext();
            return true;
        }
        Node<T> previous = null;
        Node<T> current = head;
        for (int listIndex = 1; listIndex < index; listIndex++) {
            previous = current.getNext();
            current = current.getNext();
        }
        previous.setNext(current.getNext());

        decrementListSize();
        return true;
    }
//    contains -- returns true if the element is in the list, false otherwise
    public boolean containsElement(T element) {
        if (head == null) {
            return false;
        }
        Node<T> selectedElement = head;
        if (selectedElement.getElement().equals(element)) {
            return true;
        }
        for (int i = 0; i < getListSize(); i++) {
            selectedElement = selectedElement.getNext();
            if (selectedElement.getElement().equals(element)) {
            return true;
            }
        }
        return false;
    }
//    find -- returns the element's index if it is in the list, -1 otherwise
        public int findIndexByElement(T element) {
            if (head == null) {
                return -1;
            }
           Node<T> selectedNode = head;
            for (int i = 0; i < getListSize(); i++); {

                if (selectedNode.getElement().equals(element)) {
                    return index;
                }
                selectedNode = selectedNode.getNext();
            }
            return -1;
        }

//    size -- returns the current size of the list
        public int getListSize() {
            return listSize;
}

//    get -- returns the element at the specified index
    public T getElementByIndex(int index) {
        if (index < 0 || index > getListSize())
            return null;
        Node<T> selectedElement = head;
        for (int i = 0; i < index; i++) {
            selectedElement = selectedElement.getNext();
        }
        return selectedElement.getElement();
    }

//    copy -- returns a new linked list containing the same values (look up deep versus shallow copy)
    public SinglyLinkedList<T> copySameValues(SinglyLinkedList list) {
        SinglyLinkedList<T> copyList = new SinglyLinkedList<T>();
        for (int i = 0; i <list.getListSize(); i++) {
            copyList.addElement(getElementByIndex(i));
        }
        return copyList;
    }

//    sort -- sorts the list using your algorithm of choice. You must perform the sorting yourself (no fair using someone else's library)
    public void sortList() {
        if (listSize > 1)
        for (int i = 0; i < listSize -1; i++) {
            Node<T> currentNode = head;
            Node<T> nextNode = head.next;

            for (int j = 0; j < listSize -i -1; j++) {
//                if ((currentNode.element).compareTo(nextNode.element) > 0) {
                    T temp = currentNode.element;
                    currentNode.setElement(nextNode.element);
                    nextNode.setElement(temp);
                }
                currentNode = nextNode;
                nextNode = nextNode.next;
            }
        }
    }
