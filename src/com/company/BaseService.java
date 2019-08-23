package com.company;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BaseService {

    public void output(String fileName){
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(fileName.concat(".out")))) {
            writer.write("nr.Lines: ".concat(String.valueOf(getNumberOfLinesByFile(fileName))));
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private int getNumberOfLinesByFile(String fileName) throws IOException {
        File file = new File(fileName);
        if (file.exists()) {
            FileReader reader = new FileReader(file);
            LineNumberReader line = new LineNumberReader(reader);
            int count = 0;

            while (line.readLine() != null) {
                count++;
            }
            line.close();
            return count;
        } else {
            return 0;
        }
    }
}
