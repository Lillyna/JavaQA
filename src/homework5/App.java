package homework5;

import java.io.*;

public class App {
    public static void main(String[] args) {
        String[] header = new String[3];
        int[][] data = new int[3][10];
        AppData appData = new AppData();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("hw.csv"))) {
            writer.write("id;score;count;\n");
            for (int i = 0; i < 10; i++) {
                writer.write(i + ";" + (i + 1)*2 + ";" + (i + 2)*3 + ";\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedReader reader = new BufferedReader(new FileReader("hw.csv"))) {
            int ch;
            int i = 0;
            int j = 0;
            int k = 0;
            StringBuilder stringBuilder = new StringBuilder();
            while ((ch = reader.read()) != '\n') {
                if (ch != ';') {

                    header[i] = stringBuilder.append((char) ch).toString();
                } else {
                    i++;
                    stringBuilder.delete(0, stringBuilder.length());
                }

            }

            while ((ch = reader.read()) != -1) {
                if (ch != '\n') {
                    if (ch != ';') {
                        stringBuilder.append((char) ch);
                    } else {
                        data[j][k] = Integer.parseInt(stringBuilder.toString());
                        j++;
                        stringBuilder.delete(0, stringBuilder.length());
                    }

                } else {
                    k++;
                    j = 0;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        appData.save(header, data);
    }
}
