package StackQueue;

public class FixedCapacityStackOfString {
    private String[] s;
    private int n;
    public FixedCapacityStackOfString(int n){
        s = new String[n];
    }
    public boolean isEmpty(){
        return n == 0;
    }
    public void push(String item){
        s[n++] = item;

    }
    public String pop(){
     return   s[--n];
    }

}
