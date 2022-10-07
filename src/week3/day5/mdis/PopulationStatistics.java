package week3.day5.mdis;

import javax.xml.crypto.Data;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

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

    public List<PopulationMove> readByLine(String filename) throws Exception {
        BufferedReader reader = new BufferedReader(
                new FileReader(filename)
        );

        String str;
        List<PopulationMove> pml = new ArrayList<>();
        while ((str = reader.readLine()) != null) {
            PopulationMove pm = parse(str);
            pml.add(pm);
        }

        return pml;
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
        String[] intData = data.split(",");
        int fromSido = Integer.parseInt(intData[6]);
        int toSido = Integer.parseInt(intData[0]);
        return new PopulationMove(fromSido, toSido);
    }

    public void createAFile(String filename){
        File file = new File(filename);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
    // List를 받아서 "filename"으로 파일 생성
    public void write(List<String> strs, String filename){
        File file = new File(filename);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for (String str : strs) {
                writer.write(str);
            }
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }


    public String fromToString(PopulationMove populationMove){
        return populationMove.getFromSido() + "," + populationMove.getToSido() +"\n";
    }
    
    public static void main(String[] args) throws Exception {
        String fileAddress = "P:\\TechIt\\교재\\week3\\2021_인구관련연간자료_20220927_66125.csv";
        PopulationStatistics populationStatistics = new PopulationStatistics();
        String data = populationStatistics.readByOneLine(fileAddress);
        List<PopulationMove> pml = populationStatistics.readByLine(fileAddress);

        List<String> strings = new ArrayList<>();
        for(PopulationMove pm : pml){
//            System.out.printf("전입:%s, 전출:%s\n", pm.getFromSido(), pm.getToSido());
            String fromTo = populationStatistics.fromToString(pm);
            strings.add(fromTo);
        }
        populationStatistics.write(strings, "./from_to.txt");
    }
}
