package peaksoft;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Main {
    public static final GsonBuilder GSON_BUILDER = new GsonBuilder();
    public static final Gson GSON = GSON_BUILDER.setPrettyPrinting().create();
    public static final Path WRITE_PATH = Paths.get("./truck.json");

    public static void main(String[] args) {
        System.out.println("This is the group.");

        Truck[] trucks = {
                new Truck(1,"Renault Maguum",new Driver("driver-1","Jaulanbek"),State.ON_BASE),
                new Truck(2,"Volvo",new Driver("driver-2","Nurmuhammad"),State.ON_BASE),
                new Truck(3,"Dav XT",new Driver("driver-3","Dastan"),State.ON_BASE)
        };

        String json = GSON.toJson(trucks);
        writeMethod(json);
        readerMethod(json);




    }
    private static void writeMethod(String word){
        Path wr = Paths.get(String.valueOf(WRITE_PATH));
        try{
            Files.writeString( wr,word, StandardOpenOption.CREATE,StandardOpenOption.WRITE);
        }catch (IOException e){
            e.getMessage();
        }
    }

    private static void readerMethod(String word){
        try (FileReader reader = new FileReader("./truck.json")){
            Scanner scanner = new Scanner(reader);
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }catch (IOException e){
            e.getMessage();
        }
    }
}