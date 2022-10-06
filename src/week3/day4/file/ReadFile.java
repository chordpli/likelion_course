package week3.day4.file;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFile {

    private String filename;

    public ReadFile(String filename) {
        this.filename = filename;
    }

    public char readAByte() throws Exception {
        try (BufferedReader br = Files.newBufferedReader(
                Paths.get(filename), StandardCharsets.UTF_8)) {
            return br.readLine().charAt(0);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) throws Exception {
        ReadFile readFile = new ReadFile("./a_file.txt");
        char c = (char)readFile.readAByte();
        System.out.println(c);
    }
}
