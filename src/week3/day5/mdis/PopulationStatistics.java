package week3.day5.mdis;

import javax.xml.crypto.Data;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PopulationStatistics {

    public void readByChar(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);//new FileReader(File location);
        // === 아직까진 파일을 읽지 않음=== //

        String fileContents = "";
        while (fileContents.length() < 1000000) {
            char c = (char) fileReader.read();
            fileContents += c;
        }
        System.out.println(fileContents);
    }

    public String readByOneLine(String filename) throws Exception {
        BufferedReader reader = new BufferedReader(
                new FileReader(filename)
        );

        return reader.readLine();
    }

    public void readByLine2(String filename) {
        try (BufferedReader br = Files.newBufferedReader(Paths.get(filename), StandardCharsets.UTF_8)) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

    public PopulationMove parse(String data) {

        return new PopulationMove(11, 11);
    }

    public int splitFromSido(String data){
        String[] intData = data.split(",");
        return Integer.parseInt(intData[6]);
    }
    public int splitToSido(String data){
        String[] intData = data.split(",");
        return Integer.parseInt(intData[0]);
    }

    public static void main(String[] args) throws Exception {
        String fileAddress = "P:\\TechIt\\교재\\week3\\2021_인구관련연간자료_20220927_66125.csv";
        PopulationStatistics populationStatistics = new PopulationStatistics();
        String data = populationStatistics.readByOneLine(fileAddress);
        int fromSido = populationStatistics.splitFromSido(data);
        int toSido = populationStatistics.splitToSido(data);

        PopulationMove populationMove = new PopulationMove(fromSido, toSido);

    }
}
