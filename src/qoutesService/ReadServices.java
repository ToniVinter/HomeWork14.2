package qoutesService;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadServices {
    Scanner scanner = new Scanner(new FileReader("qoutes.txt"));
    private int id = 0;

    public ReadServices() throws FileNotFoundException {
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
