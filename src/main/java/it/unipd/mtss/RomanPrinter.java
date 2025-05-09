////////////////////////////////////////////////////////////////////
// [Filippo]  [Panighello] [2111016]
// [Riccardo] [Manisi]     [9111948]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {
    private RomanPrinter() {}     // Altrimenti JaCoCo si aspetta test sull'istanziazione

    public static String print(int num) { 
        return printAsciiArt(IntegerToRoman.convert(num)); 
    } 
    
    private static String printAsciiArt(String romanNumber) {
        if(!romanNumber.matches("[IVXLCDM]+")) { throw new IllegalArgumentException(); }
        String[] I = {
                " _____ ",
                "|_   _|",
                "  | |  ",
                "  | |  ",
                " _| |_ ",
                "|_____|"
        };
        String[] lines = {"", "", "", "", "", ""};
    
        for (int j = 0; j < romanNumber.length(); j++) {
    
            for (int i = 0; i < 6; i++) {
                lines[i] += I[i];
                if (j < romanNumber.length() - 1) { lines[i] += " "; }
            }
        }
        return String.join("\n", lines) + "\n";
    }
}