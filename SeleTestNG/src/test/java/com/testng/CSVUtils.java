package com.testng;

import java.io.BufferedReader;
import java.io.FileReader;

public class CSVUtils 
{

    public static Object[][] getCSVData(String path) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader(path));

        String line;
        int rowCount = 0;
        int colCount = 0;
        while ((line = br.readLine()) != null) {
            if (rowCount == 0) {
                colCount = line.split(",").length;
            }
            rowCount++;
        }
        br.close();
        Object[][] data = new Object[rowCount - 1][colCount];
        br = new BufferedReader(new FileReader(path));
        br.readLine();
        int i = 0;
        while ((line = br.readLine()) != null) {
            String[] values = line.split(",");
            for (int j = 0; j < colCount; j++) {
                data[i][j] = values[j];
            }
            i++;
        }
        br.close();
        return data;
    }
}
