package files;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Enumeration;
import java.util.List;
import java.util.ResourceBundle;

public class Reader {
    public static void main(String[] args) throws IOException {
        ResourceBundle properties = ResourceBundle.getBundle("myConfig");
        System.out.println(properties.getString("name"));
        Enumeration<String> keys = properties.getKeys();
        while (keys.hasMoreElements()){
            System.out.println(keys.nextElement());
        }


        List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\bhavi\\Desktop\\homework.txt"));
        for (String line : lines) {
            System.out.println(line);
        }


    }

}
