package by.sem3.laba9;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            StringsEditor.editStrings();
        } catch (IOException e) {
            System.out.println("Input/Output exception!");
        }
    }
}
