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
//     return   s[--n];

     // loitering -- we are not using that value but java is pointing to it so to avoid loitering
        // we can set it to null so we can avoid loitering
    String item = s[--n];
    s[n]=null;
    return item;
    }

}

