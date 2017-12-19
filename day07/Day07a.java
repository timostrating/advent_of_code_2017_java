package day07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Sneeuwpopsneeuw on 18-Dec-17.
 */
public class Day07a {
    public static void main(String[] args) throws IOException{
        ArrayList<String> strings = new ArrayList<>();

        URL path = Day07a.class.getResource("day07.txt");
        BufferedReader reader = new BufferedReader(new FileReader(path.getFile()));
        String line;
        while ((line = reader.readLine()) != null)
            strings.add( line.split(" ")[0] );


        System.out.println(Arrays.toString(strings.toArray()));

        reader = new BufferedReader(new FileReader(path.getFile()));
        while ((line = reader.readLine()) != null) {
            if (line.contains("->")) {
                line = line.replace('>', ',');
                for (String str : line.split(", "))
                    remove(strings, str);
            }
        }


        System.out.println(Arrays.toString(strings.toArray()));

        reader.close();
    }

    public static void remove(ArrayList<String> strings, String str) {
//        System.err.println(str);

        for (String string : strings) {
            if (string.equals(str)) {
                strings.remove(string);
                return;
            }
        }
    }
}
