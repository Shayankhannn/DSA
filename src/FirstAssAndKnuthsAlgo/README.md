Knuth’s algorithm (reservoir sampling for one item) is a method to pick a single random element from a stream of unknown size without storing all elements. The idea is simple: as you read each word one by one, you keep only one “current answer” (called the winner). The first word automatically becomes the winner. When the second word arrives, you replace the current winner with probability 1/2. When the third word arrives, you replace the winner with probability 1/3, and so on—when the i-th word arrives, you replace the current winner with probability 1/i. If you do not replace it, the existing winner continues. Even though newer words have a smaller chance of replacing the current winner at their own step, earlier words have more opportunities to be challenged later, while later words have fewer chances to be challenged. These two effects balance perfectly, so after processing all n words, every word ends up with exactly equal probability 1/n of being chosen. This makes the algorithm both memory-efficient (it uses only one variable) and fair (uniform randomness), which is why it is widely used in streaming and large-scale systems where storing all data is not possible.


🧠 Key insight

Even though later words have smaller selection probability, they also have:

fewer future “opportunities to be replaced”

Early words:

have low selection chance later BUT
survive multiple stages

Late words:

have low selection window BUT
fewer future replacements

These effects balance out perfectly.





