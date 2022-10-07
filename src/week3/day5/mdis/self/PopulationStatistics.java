package week3.day5.mdis.self;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        int fromSido = Integer.parseInt(intData[0]);
        int toSido = Integer.parseInt(intData[1]);
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


    public Map<String, Integer> mappingSido(List<PopulationMove> pml){
        Map<String, Integer> populationMove = new HashMap<>();
        for(PopulationMove pm : pml){
            if(pm.getFromSidoKorean().equals("서울") && (pm.getFromSidoKorean() != null) && (pm.getToSidoKorean() != null)){
                String str = pm.getFromSidoKorean() +"-"+pm.getToSidoKorean();
                populationMove.put(str, populationMove.getOrDefault(str, 0) + 1);
            }
        }
        return  populationMove;
    }

    public static void main(String[] args) throws Exception {
        String fileAddress = "./from_to.txt";
        PopulationStatistics populationStatistics = new PopulationStatistics();
        String data = populationStatistics.readByOneLine(fileAddress);
        List<PopulationMove> pml = populationStatistics.readByLine(fileAddress);
        Map<String, Integer> populationMove = populationStatistics.mappingSido(pml);

        for (Map.Entry<String, Integer> stringIntegerEntry : populationMove.entrySet()) {
            System.out.println(stringIntegerEntry);
        }

    }
}
