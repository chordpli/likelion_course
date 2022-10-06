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

    public char readOneByte() throws Exception {
        try (BufferedReader br = Files.newBufferedReader(
                Paths.get(filename), StandardCharsets.UTF_8)) {
            return br.readLine().charAt(0);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void readOptionByte(int Option) throws Exception {
        try (BufferedReader br = new BufferedReader(new FileReader(filename) , 16 * 1024)){
            String line = br.readLine();
            for(int i = 0; i < Option; i++){
                System.out.println(line.charAt(i));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void readLine() throws Exception {
        try (BufferedReader br = new BufferedReader(new FileReader(filename) , 16 * 1024)){
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) throws Exception {
        ReadFile readFile = new ReadFile("./a_file.txt");
        char c = (char)readFile.readOneByte();
        System.out.println(c);
        readFile.readLine();
        readFile.readOptionByte(3);
    }
}
