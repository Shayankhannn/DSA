package UnionFind.QuickFind;

public class Main {
    public static void main(String[] args){
        QuickFind arr = new QuickFind();
         arr.quickFind(10);
        arr.printArray();
        arr.union(2,4);
        arr.printArray();
        arr.connected(2,4);
        arr.printArray();
        arr.connected(3,4);
        arr.union(3,4);
        arr.printArray();

    }
}
