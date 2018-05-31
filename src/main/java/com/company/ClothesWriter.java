package com.company;


import com.company.model.Clothes;

import java.io.*;
import java.util.List;

public class ClothesWriter {

    public void writeToFile(final List<Clothes> Clothes) {


        try {
            File file = new File("C:\\Users\\user\\eclipse-workspace\\Clothshoplab7\\Clothes.csv");
            if (!file.exists()) {
                file.createNewFile();
            }
            try (OutputStream stream = new FileOutputStream(file);
                 Writer writer = new PrintWriter(stream);) {
                for (Clothes clothes : Clothes) {
                    writer.write(clothes.getHeaders() + "\n");
                    writer.write(clothes.toCSV() + "\n");

                }
            } catch (IOException e) {
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

}
