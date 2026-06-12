package StackQueue;

public class ResizingArrayStack {

    private String[] array;
    private int size ;
    public ResizingArrayStack(){
        array = new String[1];
        size = 0;
    }
    public boolean isEmpty(){
        return size== 0;
    }
    public void push(String item){
        if (size == array.length){
            resize(2 * array.length);
        }
            array[size++] = item;
    }

    public void resize(int capacity){
        String[] copy = new String[capacity];
        for (int i = 0 ; i<size;i++)
            copy[i] = array[i];
        array = copy;
    }
    public String pop(){
        String item = array[--size];

        array[size] = null;
        if(size>0 && size == array.length/4){
            resize(array.length/2);
        }
        return item;
    }

}
