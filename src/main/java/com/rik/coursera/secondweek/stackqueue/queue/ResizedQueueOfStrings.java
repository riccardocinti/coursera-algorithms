package com.rik.coursera.secondweek.stackqueue.queue;

public class ResizedQueueOfStrings {

    private String[] q;
    private int n = 0;
    private int first = 0;
    private int last = 0;

    public ResizedQueueOfStrings(){
        q = new String[1];
    }

    public void enqueue(String item){
        if(n == q.length){
            resize(q.length * 2);
        }
        q[last++] = item;
        if(last == q.length){
            last = 0;
        }
        n++;
    }

    public String dequeue(){
        String result = q[first];
        q[first] = null;
        n--;
        first++;
        if(first == q.length){
            first = 0;
        }
        if (n > 0 && n == q.length/4) {
            resize(q.length/2);
        }
        return result;
    }

    public boolean isEmpty(){
        return q.length == 0;
    }

    private void resize(int capacity){
        String[] copy = new String[capacity];
        for (int i = 0; i < n; i++) {
            copy[i] = q[(first + i) % q.length];
        }
        q = copy;
        first = 0;
        last  = n;
    }

    public static void main(String[] args){
        ResizedQueueOfStrings r = new ResizedQueueOfStrings();
        r.enqueue("orco");
        r.enqueue("dio");
        r.enqueue("can");
        r.enqueue("bastonato");
        r.enqueue("ma");
        r.enqueue("che");
        r.enqueue("oooo");
        for(int i = 0; i < 10; i++){
            System.out.println(r.dequeue());
        }
    }
}
