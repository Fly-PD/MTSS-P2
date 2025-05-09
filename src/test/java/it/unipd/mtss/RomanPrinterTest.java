////////////////////////////////////////////////////////////////////
// [Filippo]  [Panighello] [2111016]
// [Riccardo] [Manisi]     [9111948]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RomanPrinterTest {
    @Test
    /// Primi 3
    public void testPrint1() {
        int input = 1;
        String expectedAsciiArt = " _____ \n" 
                                + "|_   _|\n"
                                + "  | |  \n"
                                + "  | |  \n"
                                + " _| |_ \n"
                                + "|_____|\n";

        String actualAsciiArt = RomanPrinter.print(input);

        assertEquals(expectedAsciiArt, actualAsciiArt);
    }

    @Test
    public void testPrint2() {
        int input = 2;
        String expectedAsciiArt = " _____   _____ \n" 
                                + "|_   _| |_   _|\n"
                                + "  | |     | |  \n"
                                + "  | |     | |  \n"
                                + " _| |_   _| |_ \n"
                                + "|_____| |_____|\n";
        String actualAsciiArt = RomanPrinter.print(input);

        assertEquals(expectedAsciiArt, actualAsciiArt);
    }

    @Test
    public void testPrint3() {
        int input = 3;
        String expectedAsciiArt = " _____   _____   _____ \n" 
                                + "|_   _| |_   _| |_   _|\n"
                                + "  | |     | |     | |  \n"
                                + "  | |     | |     | |  \n"
                                + " _| |_   _| |_   _| |_ \n"
                                + "|_____| |_____| |_____|\n";

        String actualAsciiArt = RomanPrinter.print(input);

        assertEquals(expectedAsciiArt, actualAsciiArt);
    }

}