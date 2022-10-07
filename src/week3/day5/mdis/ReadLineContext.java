package week3.day5.mdis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadLineContext<T> {
    DoSomething<T> doSomething;

    public List<T> readByLine(String filename) throws Exception {
        List<T> result = new ArrayList<>();

        BufferedReader reader = new BufferedReader(
                new FileReader(filename)
        );
        String str;
        while ((str = reader.readLine()) != null) {
            System.out.println(str);
            result.add((T) str);
        }
        reader.close();
        return result;
    }
}
