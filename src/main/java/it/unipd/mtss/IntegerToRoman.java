////////////////////////////////////////////////////////////////////
// [Filippo]  [Panighello] [2111016]
// [Riccardo] [Manisi]     [9111948]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {
        if (number <= 0) { throw new IllegalArgumentException("Il numero deve essere maggiore di 0"); }
        
        int[] valori = {100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] simboli_romani = {"C", "XC", "L", "XL", "X","IX","V","IV","I"};
        String result = "";
        
        for (int i = 0; i < valori.length && number > 0; i++) {
            while (number >= valori[i]) {
                number -= valori[i];
                result += simboli_romani[i];
            }
        }
        return result.toString();
    }
}