package peaksoft;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static final GsonBuilder GSON_BUILDER = new GsonBuilder();
    public static final Gson GSON = GSON_BUILDER.setPrettyPrinting().create();
    public static final Path WRITE_PATH = Paths.get("./truck.json");

    public static void main(String[] args) {
        System.out.println("This is the group.");
        System.out.println("Hi");
        Driver [] drivers = {
                new Driver("driver-1","Petr") ,
                new Driver("driver-2","Askar"),
                new Driver("driver-3","Uson")
        };

        String json1  = GSON.toJson(bus);
        String json2  = GSON.toJson(drivers);
        String path;
        try (PrintWriter out = new PrintWriter(new FileWriter(json1))) {
            Gson gson = new Gson();
            String jsonString = gson.toJson(json2);
            out.write(jsonString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



    }

}