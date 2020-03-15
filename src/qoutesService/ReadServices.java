package qoutesService;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadServices throws IOException{
    String nameOfFile;
    Scanner scanner = new Scanner(new FileReader(nameOfFile));
    private int id = 0;
    
    public ReadServices(String nameOfFile){
    this.nameOfFile = nameOfFile;
    }
    

    public List<Qoutes> readQoutes(){
        List<Qoutes> qoutesList = new ArrayList<>();
       while(scanner.hasNextLine()){
           String str[] = scanner.nextLine().split("~");
           qoutesList.add(new Qoutes(id, str[0], str[1]));
           id++;
       }
       return qoutesList;
    }
}
