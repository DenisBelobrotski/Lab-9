package by.sem3.laba9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class StringsEditor {
    public static void editStrings() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("resources/input.txt"));
        FileWriter writer = new FileWriter("out/output.txt");
        StringBuffer line = new StringBuffer();
        while (reader.ready()) {
            line.append(reader.readLine());
            Regex.deleteSymbolsInBrackets(line);
            Regex.deleteDigits(line);
            Regex.deleteZeros(line);
            System.out.println(line);
            writer.write(line.toString() + "\n");
            line.delete(0, line.length());
        }
        writer.flush();
        writer.close();
    }
}
