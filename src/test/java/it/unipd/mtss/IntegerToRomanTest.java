////////////////////////////////////////////////////////////////////
// [Filippo]  [Panighello] [2111016]
// [Riccardo] [Manisi]     [9111948]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class IntegerToRomanTest {

    /// Primi 3
    @Test
    public void conversione_0() {
        int input = 0;
        assertThrows(IllegalArgumentException.class, () -> {
            IntegerToRoman.convert(input);
        });
    }

    @Test
    public void conversione_negativo() {
        int input = -10;
        assertThrows(IllegalArgumentException.class, () -> {
            IntegerToRoman.convert(input);
        });
    }

    @Test
    public void conversione_1() {
        int input = 1;
        String result = IntegerToRoman.convert(input);
        assertEquals("I", result);
    }

    @Test
    public void conversione_2() {
        int input = 2;
        String result = IntegerToRoman.convert(input);
        assertEquals("II", result);
    }

    @Test
    public void conversione_3() {
        int input = 3;
        String result = IntegerToRoman.convert(input);
        assertEquals("III", result);
    }
}