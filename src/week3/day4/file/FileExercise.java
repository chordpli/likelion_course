package week3.day4.file;

import java.io.*;

public class FileExercise {
    private String filename;

    public FileExercise(String filename) {
        this.filename = filename;
    }

    public void printFiles() {
        File dir = new File("."); // 디렉토리로 접근
        File files[] = dir.listFiles(); // 파일들이 담김

        for (File f : files) {
            System.out.println(f);
        }
    }

    public char readAChar() throws IOException {
        FileReader fileReader = new FileReader(filename);
        return (char) fileReader.read();
    }

    public String read2Chars() throws IOException {
        FileReader fileReader = new FileReader(filename);
        String str = "";
        str += (char) fileReader.read();
        str += (char) fileReader.read();
        return str;
    }

    public String readOptionByte(int Option) throws Exception {
        try (BufferedReader br = new BufferedReader(new FileReader(filename), 16 * 1024)) {
            String line = br.readLine();
            String str = "";
            for (int i = 0; i < Option; i++) {
                str += line.charAt(i);
            }
            return str;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String readOneLine() throws Exception {
        try (BufferedReader br = new BufferedReader(new FileReader(filename), 16 * 1024)) {
            String line = br.readLine();
            return line;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void readAllLine() throws Exception {
        try (BufferedReader br = new BufferedReader(new FileReader(filename), 16 * 1024)) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws Exception {
        FileExercise fileExercise = new FileExercise("./a_file.txt");
        char char1 = fileExercise.readAChar();
        String str2 = fileExercise.read2Chars();
        String str3 = fileExercise.readOptionByte(3);

        String line = fileExercise.readOneLine();
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(line);

        fileExercise.readAllLine();
    }
/*
    .\.git
    .\.gitignore
    .\.idea
    .\a_file.txt
    .\out
    .\README.md
    .\src
    .\techItCourse.iml
*/


}
