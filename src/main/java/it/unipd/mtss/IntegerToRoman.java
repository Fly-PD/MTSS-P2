////////////////////////////////////////////////////////////////////
// [Filippo]  [Panighello] [2111016]
// [Riccardo] [Manisi]     [9111948]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    private IntegerToRoman() {} // Altrimenti JaCoCo si aspetta test sull'istanziazione

    public static String convert(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Il numero deve essere maggiore di 0");
        }

        return "I".repeat(number);
    }
}