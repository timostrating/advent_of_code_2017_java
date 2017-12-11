package day03;

/**
 * Created by Sneeuwpopsneeuw on 05-Dec-17.
 */
public class Day03a {

//    37  36  35  34  33  32  31
//    38  17  16  15  14  13  30
//    39  18   5   4   3  12  29
//    40  19   6   1   2  11  28
//    41  20   7   8   9  10  27
//    42  21  22  23  24  25  26
//    43  44  45  46  47  48  49  50



    // 1        2   3   4   5   6   7   8   9       10  11  12  13  14  15  16  17  18  19  20  21  22  23  24  25      26  27  28  29  30  31  32  33  34  35  36  37  38  39  40  41  42  43  44  45  46  47  48  49      50
    // 0        1   2   1   2   1   2   1   2       3   2   3   4   3   2   3   4   3   2   3   4   3   2   3   4       5   4   3   4   5   6   5   4   3   4   5   6   5   4   3   4   5   6   5   4   3   4   5   6       6


    public static void main(String[] args) {
        new Day03a(368078);
    }

    public Day03a(int input) {
        int number = 2;

        for (int r=1; r<=500; r++) {
            boolean first = true;
            for (int i=1; i<=4; i++) {

                for (int j=(r*2); j>=r; j--) {
                    if (first)
                        first = false;
                    else
                        check(number++, j, input);
                }
                for (int j=(r+1); j<=(r*2)-1; j++) {
                    check(number++, j, input);
                }
            }

            check(number++, (r*2), input);
        }
    }

    private void check(int number, int value, int input) {
        if (number == input) {
            System.out.println(value + " " + number);
            System.exit(0);
        }
    }
}
