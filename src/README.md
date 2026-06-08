Time Complexity:
How long does it take?Time complexity doesn't measure seconds (because your computer's speed changes). It measures how many operations the computer has to perform relative to the input size, which we call $N$.$O(1)$ - Constant Time: The "Golden Standard." It takes the same amount of time regardless of whether you have 10 items or 10 million. (Example: Accessing an array element by index).$O(N)$ - Linear Time: If you double the data, the time doubles. You have to look at every item once. (Example: Searching for a specific number in an unsorted list).$O(N^2)$ - Quadratic Time: If you double the data, the time quadruples. This usually happens with nested loops (a loop inside a loop). This is generally where algorithms start to get "too slow."$O(\log N)$ - Logarithmic Time: This is incredibly fast. Even if you double the data, you only add one extra step. (Example: Binary search—like finding a word in a dictionary by cutting the pages in half repeatedly).

Space Complexity: How much memory does it need?Space complexity measures how much "extra" memory your algorithm requires to run.$O(1)$ - Constant Space: You are using a fixed amount of memory (like a few variables) regardless of how large the input is. This is usually what you want.$O(N)$ - Linear Space: You need to create a copy of the data or a new data structure that grows in size directly proportional to your input.



Quick Cheat Sheet for your CourseNested Loops? Usually $O(N^2)$.Single Loop? Usually $O(N)$.Cutting the problem in half each step? Usually $O(\log N)$.Simple math/access? Usually $O(1)$.


Time Complexity : the rate at which time increases with respest to the input size

when computing time complexity :

-> always take worst case
-> avoid constant they dont add any significance 
-> avoid lower values 

for eg O(3xN^15 + 2 x N^3 + 9)
we only say O(3 x N^15)

three types :

Big Oh (O) - worst-case -> upper bound

Theta (O and - inside) - average

Omega (anchor type sign) - best case - lower bound



Space Complexity 

is auxilary space - the space that you takes to solve the problem

+ 

the space that you take to store the input

a and b  var are input space 

but c = a + b is auxillary space 




























