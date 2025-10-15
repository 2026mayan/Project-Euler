package Problems;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class problem22 {
    public static void main(String[] args) {
      String[] names = readNamesFromFile("names.txt");
        Arrays.sort(names);
        long totalScore = calculateTotalScore(names);
        System.out.println(totalScore);
    }
    private static String[] readNamesFromFile(String filename) {
        StringBuilder namesBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                namesBuilder.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return namesBuilder.toString().replace("\"", "").split(",");
    }

    private static long calculateTotalScore(String[] names) {
        long totalScore = 0;
        for (int i = 0; i < names.length; i++) {
            totalScore += (i + 1) * getNameScore(names[i]);
        }
        return totalScore;
    }

    private static int getNameScore(String name) {
        int score = 0;
        for (char c : name.toCharArray()) {
            score += c - 'A' + 1;
        }
        return score;
    }
}