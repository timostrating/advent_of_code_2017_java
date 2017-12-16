package day06;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Sneeuwpopsneeuw on 13-Dec-17.
 */
public class Day06a {
    public static void main(String[] args) {
//        int[] input = {0,2,7,0};
//        System.out.println(Arrays.toString(input));
//        System.out.println("");
        int[] input = {5,1,10,0,1,7,13,14,3,12,8,10,7,12,0,6};
        new Day06a(input);
    }

    public Day06a(int[] input) {
        ArrayList<int[]> history = new ArrayList<>();

        while (contains(history, input) == false) {
            history.add(input.clone());
            int highest = -1;
            int indexHighest = -1;

            for (int i=0; i<input.length; i++) {
                if (highest < input[i]) {
                    highest = input[i];
                    indexHighest = i;
                }
            }

            int shared = input[indexHighest];
            int i = indexHighest + 1;
            input[indexHighest] = 0;
            while (shared > 0){
                input[(i) % (input.length)]++;
                i++;
                shared--;
            }

            System.out.println(Arrays.toString(input));
        }

        System.err.println(history.size());
    }

    private boolean contains(ArrayList<int[]> list, int[] input) {
        for (int[] array : list)
            if(Arrays.equals(array, input))
                return true;

        return false;
    }
}
