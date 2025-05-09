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
        //TODO 
        return null; 
    }
}