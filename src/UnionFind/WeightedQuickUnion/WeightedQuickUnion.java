package UnionFind.WeightedQuickUnion;
// id[i] = parent of node i
// root(i) = follow parent links until a node points to itself
// sz[i] = size of the tree whose root is i
// union() always attaches the smaller tree to the larger tree
// this keeps trees short and root() fast
public class WeightedQuickUnion {
    private int[] id;
    private int[] sz;
    public void weightedQuickUnion(int N){
        id = new int[N];
        sz = new int[N];
        for (int i=0;i<N;i++) {
            id[i] = i;
            sz[i] = i;
        }
    }
    public int root(int current){
        while (current != id[current])
            current = id[current];
    return current;
    }


    public boolean connected(int p,int q){
        return root(p) == root(q);
    }

    public void union(int p,int q){

        int i = root(p);
       int j = root(q);
        if(i == j) return;
        if(sz[i]<sz[j]){
            id[i] = j;
            sz[j] += sz[i];
        }else {
            id[j] = i;
            sz[i] += sz[j];
        }
    }
    public void printArray(){
            System.out.println(  "id : ");
        for (int x : id)
            System.out.println(x + " ");

        System.out.println();

            System.out.println(  "sz : ");
        for (int x : sz)
            System.out.println(x + " ");

        System.out.println();



    }
}
