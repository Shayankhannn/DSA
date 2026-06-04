UNION-FIND

dynamic connectivity    

its a data strucuture 
basically its used when we need to know if something is connected to something or we want to connect to something 


----------
Union-Find is an algorithm for tracking which items belong to which groups, allowing you to instantly merge two groups or check if two items are in the same group.
The "Universal" Mental Model
To never forget it, think of it as The "Stitched Fabric" Analogy:

The Fabric (The Set): Imagine you have a bunch of separate pieces of cloth.

Union (The Stitch): Every time you perform a union, you are literally sewing two pieces of cloth together. Once you sew them, they become one single, larger piece.

Find (The Tug): When you want to know if two specific pieces are part of the same garment, you give both a "tug." If they are connected by stitches, they will both pull on the same base fabric. If they aren't connected, they will move independently.

------------

Modeling the connection 

We assume "is connected to" is an equivalence relation:
・Reflexive: p is connected to p.
・Symmetric: if p is connected to q, then q is connected to p.
・Transitive: if p is connected to q and q is connected to r,
then p is connected to r.
Connected components. Maximal set of objects that are mutually
connected.

----

Quick find [eager approach]

---

Quick-find defect.
・Union too expensive (N array accesses).
・Trees are flat, but too expensive to keep them flat.


Quick-union defect.
・Trees can get tall.
・Find too expensive (could be N array accesses).


----

Quick union iprovement [weighted]


