package com.rik.coursera.secondweek.stackqueue.queue;

import com.rik.coursera.secondweek.stackqueue.Node;

public class LinkedQueueOfStrings {

    private Node first;
    private Node last;

    public boolean isEmpty(){
        return first == null;
    }

    public void enqueue(String item){
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if(isEmpty()){
            first = last;
        }else{
            oldLast.next = last;
        }
    }

    public String dequeue(){
        String item = first.item;
        first = first.next;
        if(isEmpty()){
            last = null;
        }
        return item;
    }
}
