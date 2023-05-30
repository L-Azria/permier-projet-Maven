package fr.digi.m0323;
import com.github.lalyos.jfiglet.FigletFont;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        String asciiArt = FigletFont.convertOneLine("App");
        System.out.println(asciiArt);
    }
}
