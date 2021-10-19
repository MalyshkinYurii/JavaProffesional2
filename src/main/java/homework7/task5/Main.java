package homework7.task5;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {
    public static void main(String[] args) {
        Adress adress = new Adress("Ukraine", "Kyiv", "Hreshatyk");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String s = gson.toJson(adress);
        try {
            Files.write(Paths.get("H:\\Malyshkin_Java_Professional2\\src\\main\\java\\homework7\\task5\\test.json"),
                    s.getBytes(), StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();
        }

        ObjectMapper objectMapper = new ObjectMapper();
        AdressJackson adressJackson = null;
        try {
            adressJackson = objectMapper.readValue(new File("H:\\Malyshkin_Java_Professional2\\src\\main\\java\\homework7\\task5\\test.json"), AdressJackson.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(adressJackson);

        //gson.toJson(adress, fileWriter);

    }
}
