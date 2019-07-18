package com.nvminh.testbe;

public class LinkedList {
    class Node {
        Node previous;
        int value;

        public Node(Node previous, int value) {
            this.previous = previous;
            this.value = value;
        }
    }

    private Node last;
    int size = 0;

    /**
     * Append an element into the linkedlist
     * @param value
     */
    public void append(int value) {
        last = new Node(last, value);
        size++;
    }

    /**
     * Remove the tail element from a linkedlist
     */
    public void removeTail() {
        if(last != null) {
            last = last.previous;
            size--;
        }
    }

    /**
     * Remove all elements in the Linkedlist that is great than a target value
     * @param target
     */
    public void removeAll(int target) {
        if(last == null) {
            return;
        }

        Node temp = last;
        Node preTemp = temp.previous;
        while(preTemp != null) {
            if(preTemp.value > target) {
                temp.previous = preTemp.previous;
                preTemp = temp.previous;
                size--;
            } else {
                temp = temp.previous;
                preTemp = temp.previous;
            }
        }
        if(last.value > target) {
            last = last.previous;
            size--;
        }
    }

    /**
     * Get all the values as int[]
     * @return
     */
    public int[] getValues() {
        int[] arr = new int[size];
        int index = arr.length-1;
        Node temp = last;
        while(temp != null) {
            arr[index] = temp.value;
            index--;
            temp = temp.previous;
        }
        return arr;
    }
}
