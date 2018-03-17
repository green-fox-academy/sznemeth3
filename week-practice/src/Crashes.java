import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Crashes {


    public static void main(String[] args) {
        Path filePath = Paths.get("crash-incidents.csv");
        weatherCondition(filePath);
    }

    private static void weatherCondition(Path filePath) {
        int goodWeatherCrashes = 0;
        int badWeatherCrashes = 0;
        try {
            List<String> lines = Files.readAllLines(filePath);
            try {
                for (String line: lines) {
                    String[] parts = line.split(";");
                    if (parts[5].equals("CLOUDY") || parts[5].equals("CLEAR")) {
                        goodWeatherCrashes ++;
                    } else {
                        badWeatherCrashes ++;
                    }
                }
            }
            catch (ArrayIndexOutOfBoundsException a) {
                
            }
            System.out.println("Good: " + goodWeatherCrashes + " Bad: " + badWeatherCrashes);
        }
        catch (IOException e) {
            System.out.println("error in reading file");
        }

    }

}
