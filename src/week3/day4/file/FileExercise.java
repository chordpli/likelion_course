package week3.day4.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileExercise {

    public void printFiles(){
        File dir = new File("."); // 디렉토리로 접근
        File files[] = dir.listFiles(); // 파일들이 담김

        for (File f : files) {
            System.out.println(f);
        }
    }

    public char readAChar(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        return (char)fileReader.read();
    }

    public String read2Chars(String filename) throws IOException{
        FileReader fileReader = new FileReader(filename);
        String str = "";
        str += (char)fileReader.read();
        str += (char)fileReader.read();
        return str;
    }

    public static void main(String[] args) throws Exception {
        FileExercise fileExercise = new FileExercise();
        char c = fileExercise.readAChar("./a_file.txt");
        String str = fileExercise.read2Chars("./a_file.txt");
        System.out.println(c);
        System.out.println(str);
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
