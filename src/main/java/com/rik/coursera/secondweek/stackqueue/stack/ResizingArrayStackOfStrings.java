package com.rik.coursera.secondweek.stackqueue.stack;

public class ResizingArrayStackOfStrings {

    private String[] s;
    private int n;

    public ResizingArrayStackOfStrings(){
        s = new String[1];
    }

    public void push(String item){
        if(n == s.length){
            resize(2 * s.length);
        }
        s[n++] = item;
    }

    public String pop(){
        String item = s[--n];
        s[n] = null;
        if(n == s.length / 4){
            resize(s.length / 2);
        }
        return item;
    }

    private void resize(int capacity){
        String[] copy = new String[capacity];
        for (int i = 0; i < s.length; i++){
            copy[i] = s[i];
        }
        s = copy;
    }
}
