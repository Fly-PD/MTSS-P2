////////////////////////////////////////////////////////////////////
// [Filippo]  [Panighello] [2111016]
// [Riccardo] [Manisi]     [9111948]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.util.Dictionary;
import java.util.Hashtable;

public class RomanPrinter {
    private RomanPrinter() {}     // Altrimenti JaCoCo si aspetta test sull'istanziazione

    public static String print(int num) { 
        return printAsciiArt(IntegerToRoman.convert(num)); 
    } 
    
    private static String printAsciiArt(String romanNumber) {
        if (!romanNumber.matches("[IVXLCDM]+")) {
            throw new IllegalArgumentException();
        }
        Dictionary<Character, String[]> asciiArtDict = new Hashtable<Character, String[]>();
        asciiArtDict.put('I', new String[] {
            " _____ ",
            "|_   _|",
            "  | |  ",
            "  | |  ",
            " _| |_ ",
            "|_____|"
        });
        asciiArtDict.put('V', new String[] {
            "__      __",
            "\\ \\    / /",
            " \\ \\  / / ",
            "  \\ \\/ /  ",
            "   \\  /   ",
            "    \\/    "
        });
        asciiArtDict.put('X', new String[] {
            "__   __",
            "\\ \\ / /",
            " \\ V / ",
            "  > <  ",
            " / . \\ ",
            "/_/ \\_\\"
        });
        asciiArtDict.put('L', new String[]{
            " _      ",
            "| |     ",
            "| |     ",
            "| |     ",
            "| |____ ",
            "|______|"
        });
        asciiArtDict.put('C', new String[]{
            "  _____ ",
            " / ____|",
            "| |     ",
            "| |     ",
            "| |____ ",
            " \\_____|"
        });
        asciiArtDict.put('D', new String[]{
            " _____  ",
            "|  __ \\ ",
            "| |  | |",
            "| |  | |",
            "| |__| |",
            "|_____/ "
        });
        asciiArtDict.put('M', new String[]{
            " __  __ ",
            "|  \\/  |",
            "| \\  / |",
            "| |\\/| |",
            "| |  | |",
            "|_|  |_|"
        });
        String asciiArt = "";
        String[] lines = {"", "", "", "", "", ""};
    
        for (int j = 0; j < romanNumber.length(); j++) {
            String[] symbolArt = asciiArtDict.get(romanNumber.charAt(j));
    
            for (int i = 0; i < 6; i++) {
                lines[i] += symbolArt[i];
                if (j < romanNumber.length() - 1) {
                    lines[i] += " ";
                }
            }
        }
    
        for (String line : lines) {
            asciiArt += line += "\n";
        }
        return asciiArt;
    }
}