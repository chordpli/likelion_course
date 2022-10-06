package week3.day4.file;

import java.io.File;
import java.io.FileNotFoundException;

public class FileExercise {
    public static void main(String[] args) throws FileNotFoundException {
        //FileReader fileReader = new FileReader("./a_file.txt");
        File dir = new File("."); // 디렉토리로 접근
        File files[] = dir.listFiles(); // 파일들이 담김

        for(File f : files){
            System.out.println(f);
        }
        //System.out.println(files[0]);
    }
}
