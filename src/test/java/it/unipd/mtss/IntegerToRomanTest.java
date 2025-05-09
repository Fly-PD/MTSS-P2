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

    /// Primi 6
    @Test
    public void conversione_4() {
        int input = 4;
        String result = IntegerToRoman.convert(input);
        assertEquals("IV", result);
    }

    @Test
    public void conversione_5() {
        int input = 5;
        String result = IntegerToRoman.convert(input);
        assertEquals("V", result);
    }

    @Test
    public void conversione_6() {
        int input = 6;
        String result = IntegerToRoman.convert(input);
        assertEquals("VI", result);
    }

    /// Primi 10
    @Test
    public void conversione_7() {
        int input = 7;
        String result = IntegerToRoman.convert(input);
        assertEquals("VII", result);
    }

    @Test
    public void conversione_9() {
        int input = 9;
        String result = IntegerToRoman.convert(input);
        assertEquals("IX", result);
    }

    @Test
    public void conversione_10() {
        int input = 10;
        String result = IntegerToRoman.convert(input);
        assertEquals("X", result);
    }

    /// Primi 20
    @Test
    public void conversione_14() {
        int input = 14;
        String result = IntegerToRoman.convert(input);
        assertEquals("XIV", result);
    }

    @Test
    public void conversione_15() {
        int input = 15;
        String result = IntegerToRoman.convert(input);
        assertEquals("XV", result);
    }

    @Test
    public void conversione_19() {
        int input = 19;
        String result = IntegerToRoman.convert(input);
        assertEquals("XIX", result);
    }

    @Test
    public void conversione_20() {
        int input = 20;
        String result = IntegerToRoman.convert(input);
        assertEquals("XX", result);
    }

    /// Primi 50
    @Test
    public void conversione_24() {
        int input = 24;
        String result = IntegerToRoman.convert(input);
        assertEquals("XXIV", result);
    }

    @Test
    public void conversione_29() {
        int input = 29;
        String result = IntegerToRoman.convert(input);
        assertEquals("XXIX", result);
    }

    @Test
    public void conversione_30() {
        int input = 30;
        String result = IntegerToRoman.convert(input);
        assertEquals("XXX", result);
    }

    @Test
    public void conversione_34() {
        int input = 34;
        String result = IntegerToRoman.convert(input);
        assertEquals("XXXIV", result);
    }

    @Test
    public void conversione_39() {
        int input = 39;
        String result = IntegerToRoman.convert(input);
        assertEquals("XXXIX", result);
    }

    @Test
    public void conversione_40() {
        int input = 40;
        String result = IntegerToRoman.convert(input);
        assertEquals("XL", result);
    }

    @Test
    public void conversione_44() {
        int input = 44;
        String result = IntegerToRoman.convert(input);
        assertEquals("XLIV", result);
    }

    @Test
    public void conversione_49() {
        int input = 49;
        String result = IntegerToRoman.convert(input);
        assertEquals("XLIX", result);
    }

    @Test
    public void conversione_50() {
        int input = 50;
        String result = IntegerToRoman.convert(input);
        assertEquals("L", result);
    }

    /// Primi 100
    @Test
    public void conversione_51() {
        int input = 51;
        String result = IntegerToRoman.convert(input);
        assertEquals("LI", result);
    }

    @Test
    public void conversione_55() {
        int input = 55;
        String result = IntegerToRoman.convert(input);
        assertEquals("LV", result);
    }

    @Test
    public void conversione_59() {
        int input = 59;
        String result = IntegerToRoman.convert(input);
        assertEquals("LIX", result);
    }

    @Test
    public void conversione_60() {
        int input = 60;
        String result = IntegerToRoman.convert(input);
        assertEquals("LX", result);
    }

    @Test
    public void conversione_70() {
        int input = 70;
        String result = IntegerToRoman.convert(input);
        assertEquals("LXX", result);
    }

    @Test
    public void conversione_80() {
        int input = 80;
        String result = IntegerToRoman.convert(input);
        assertEquals("LXXX", result);
    }

    @Test
    public void conversione_90() {
        int input = 90;
        String result = IntegerToRoman.convert(input);
        assertEquals("XC", result);
    }

    @Test
    public void conversione_99() {
        int input = 99;
        String result = IntegerToRoman.convert(input);
        assertEquals("XCIX", result);
    }

    @Test
    public void conversione_100() {
        int input = 100;
        String result = IntegerToRoman.convert(input);
        assertEquals("C", result);
    }

    /// Primi 500
    @Test
    public void conversione_101() {
        int input = 101;
        String result = IntegerToRoman.convert(input);
        assertEquals("CI", result);
    }

    @Test
    public void conversione_150() {
        int input = 150;
        String result = IntegerToRoman.convert(input);
        assertEquals("CL", result);
    }

    @Test
    public void conversione_199() {
        int input = 199;
        String result = IntegerToRoman.convert(input);
        assertEquals("CXCIX", result);
    }

    @Test
    public void conversione_200() {
        int input = 200;
        String result = IntegerToRoman.convert(input);
        assertEquals("CC", result);
    }

    @Test
    public void conversione_250() {
        int input = 250;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCL", result);
    }

    @Test
    public void conversione_300() {
        int input = 300;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCC", result);
    }

    @Test
    public void conversione_399() {
        int input = 399;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCXCIX", result);
    }

    @Test
    public void conversione_400() {
        int input = 400;
        String result = IntegerToRoman.convert(input);
        assertEquals("CD", result);
    }

    @Test
    public void conversione_450() {
        int input = 450;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDL", result);
    }

    @Test
    public void conversione_500() {
        int input = 500;
        String result = IntegerToRoman.convert(input);
        assertEquals("D", result);
    }

    /// Primi 1000
    @Test
    public void conversione_501() {
        int input = 501;
        String result = IntegerToRoman.convert(input);
        assertEquals("DI", result);
    }

    @Test
    public void conversione_550() {
        int input = 550;
        String result = IntegerToRoman.convert(input);
        assertEquals("DL", result);
    }

    @Test
    public void conversione_599() {
        int input = 599;
        String result = IntegerToRoman.convert(input);
        assertEquals("DXCIX", result);
    }

    @Test
    public void conversione_600() {
        int input = 600;
        String result = IntegerToRoman.convert(input);
        assertEquals("DC", result);
    }

    @Test
    public void conversione_700() {
        int input = 700;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCC", result);
    }

    @Test
    public void conversione_800() {
        int input = 800;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCC", result);
    }

    @Test
    public void conversione_900() {
        int input = 900;
        String result = IntegerToRoman.convert(input);
        assertEquals("CM", result);
    }

    @Test
    public void conversione_950() {
        int input = 950;
        String result = IntegerToRoman.convert(input);
        assertEquals("CML", result);
    }

    @Test
    public void conversione_999() {
        int input = 999;
        String result = IntegerToRoman.convert(input);
        assertEquals("CMXCIX", result);
    }

    @Test
    public void conversione_1k() {
        int input = 1000;
        String result = IntegerToRoman.convert(input);
        assertEquals("M", result);
    }

    @Test
    public void conversione_750() {
        int input = 750;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCL", result);
    }

    @Test
    public void conversione_850() {
        int input = 850;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCL", result);
    }
}