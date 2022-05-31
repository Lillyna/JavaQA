package homework5;

import java.util.Arrays;

public class AppData {
    private String[] header;
    private int[][] data;

    public void save(String[] header, int[][] data){
        this.header = header;
        this.data = data;
    }

}
