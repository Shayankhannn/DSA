package FirstAssAndKnuthsAlgo;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
public class RandomWord {
    public static void main(String[] args){
// This program selects ONE random word from input stream
// WITHOUT storing all words (important constraint)

// Uses Knuth's Reservoir Sampling (k = 1):
// Each word has equal probability 1/n to be chosen
    int i = 0;
    String winner = null;
    while(!StdIn.isEmpty()){
        String word = StdIn.readString();
        i++;
        if (StdRandom.bernoulli(1.0/i))
            winner = word;

    }
    StdOut.println(winner);
    }
}
