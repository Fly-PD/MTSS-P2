////////////////////////////////////////////////////////////////////
// [Filippo]  [Panighello] [2111016]
// [Riccardo] [Manisi]     [9111948]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

    /// Primi 6
    @Test
    public void testPrint4() {
        String asciiArt = " _____  __      __\n"
                + "|_   _| \\ \\    / /\n"
                + "  | |    \\ \\  / / \n"
                + "  | |     \\ \\/ /  \n"
                + " _| |_     \\  /   \n"
                + "|_____|     \\/    \n";

        assertEquals(asciiArt, RomanPrinter.print(4));
    }

    @Test
    public void testPrint5() {
        String asciiArt = "__      __\n"
                + "\\ \\    / /\n"
                + " \\ \\  / / \n"
                + "  \\ \\/ /  \n"
                + "   \\  /   \n"
                + "    \\/    \n";

        assertEquals(asciiArt, RomanPrinter.print(5));
    }

    @Test
    public void testPrint6() {
        String asciiArt = "__      __  _____ \n"
                + "\\ \\    / / |_   _|\n"
                + " \\ \\  / /    | |  \n"
                + "  \\ \\/ /     | |  \n"
                + "   \\  /     _| |_ \n"
                + "    \\/     |_____|\n";

        assertEquals(asciiArt, RomanPrinter.print(6));
    }

    /// Primi 10
    @Test
    public void testPrint7() {
        String expected = "__      __  _____   _____ \n" +
                "\\ \\    / / |_   _| |_   _|\n" +
                " \\ \\  / /    | |     | |  \n" +
                "  \\ \\/ /     | |     | |  \n" +
                "   \\  /     _| |_   _| |_ \n" +
                "    \\/     |_____| |_____|\n";
        assertEquals(expected, RomanPrinter.print(7));
    }

    @Test
    public void testPrint9() {
        String expected = " _____  __   __\n" +
                "|_   _| \\ \\ / /\n" +
                "  | |    \\ V / \n" +
                "  | |     > <  \n" +
                " _| |_   / . \\ \n" +
                "|_____| /_/ \\_\\\n";
        assertEquals(expected, RomanPrinter.print(9));
    }

    @Test
    public void testPrint10() {
        String expected = "__   __\n" +
                "\\ \\ / /\n" +
                " \\ V / \n" +
                "  > <  \n" +
                " / . \\ \n" +
                "/_/ \\_\\\n";
        assertEquals(expected, RomanPrinter.print(10));
    }

    /// Primi 20
    @Test
    public void testPrint11() {
        String expected = "__   __  _____ \n" +
                "\\ \\ / / |_   _|\n" +
                " \\ V /    | |  \n" +
                "  > <     | |  \n" +
                " / . \\   _| |_ \n" +
                "/_/ \\_\\ |_____|\n";
        assertEquals(expected, RomanPrinter.print(11));
    }

    @Test
    public void testPrint12() {
        String expected = "__   __  _____   _____ \n" +
                "\\ \\ / / |_   _| |_   _|\n" +
                " \\ V /    | |     | |  \n" +
                "  > <     | |     | |  \n" +
                " / . \\   _| |_   _| |_ \n" +
                "/_/ \\_\\ |_____| |_____|\n";
        assertEquals(expected, RomanPrinter.print(12));
    }

    @Test
    public void testPrint15() {
        String expected = "__   __ __      __\n" +
                "\\ \\ / / \\ \\    / /\n" +
                " \\ V /   \\ \\  / / \n" +
                "  > <     \\ \\/ /  \n" +
                " / . \\     \\  /   \n" +
                "/_/ \\_\\     \\/    \n";
        assertEquals(expected, RomanPrinter.print(15));
    }

    @Test
    public void testPrint18() {
        String expected = "__   __ __      __  _____   _____   _____ \n" +
                "\\ \\ / / \\ \\    / / |_   _| |_   _| |_   _|\n" +
                " \\ V /   \\ \\  / /    | |     | |     | |  \n" +
                "  > <     \\ \\/ /     | |     | |     | |  \n" +
                " / . \\     \\  /     _| |_   _| |_   _| |_ \n" +
                "/_/ \\_\\     \\/     |_____| |_____| |_____|\n";
        assertEquals(expected, RomanPrinter.print(18));
    }

    @Test
    public void testPrint19() {
        String expected = "__   __  _____  __   __\n" +
                "\\ \\ / / |_   _| \\ \\ / /\n" +
                " \\ V /    | |    \\ V / \n" +
                "  > <     | |     > <  \n" +
                " / . \\   _| |_   / . \\ \n" +
                "/_/ \\_\\ |_____| /_/ \\_\\\n";
        assertEquals(expected, RomanPrinter.print(19));
    }

    @Test
    public void testPrint20() {
        String expected = "__   __ __   __\n" +
                "\\ \\ / / \\ \\ / /\n" +
                " \\ V /   \\ V / \n" +
                "  > <     > <  \n" +
                " / . \\   / . \\ \n" +
                "/_/ \\_\\ /_/ \\_\\\n";
        assertEquals(expected, RomanPrinter.print(20));
    }

    /// primi 50
    @Test
    public void testPrint21() {
        String expected = "__   __ __   __  _____ \n" +
                "\\ \\ / / \\ \\ / / |_   _|\n" +
                " \\ V /   \\ V /    | |  \n" +
                "  > <     > <     | |  \n" +
                " / . \\   / . \\   _| |_ \n" +
                "/_/ \\_\\ /_/ \\_\\ |_____|\n";
        assertEquals(expected, RomanPrinter.print(21));
    }

    @Test
    public void testPrint25() {
        String expected = "__   __ __   __ __      __\n" +
                "\\ \\ / / \\ \\ / / \\ \\    / /\n" +
                " \\ V /   \\ V /   \\ \\  / / \n" +
                "  > <     > <     \\ \\/ /  \n" +
                " / . \\   / . \\     \\  /   \n" +
                "/_/ \\_\\ /_/ \\_\\     \\/    \n";
        assertEquals(expected, RomanPrinter.print(25));
    }

    @Test
    public void testPrint30() {
        String expected = "__   __ __   __ __   __\n" +
                "\\ \\ / / \\ \\ / / \\ \\ / /\n" +
                " \\ V /   \\ V /   \\ V / \n" +
                "  > <     > <     > <  \n" +
                " / . \\   / . \\   / . \\ \n" +
                "/_/ \\_\\ /_/ \\_\\ /_/ \\_\\\n";
        assertEquals(expected, RomanPrinter.print(30));
    }

    @Test
    public void testPrint40() {
        String expected = "__   __  _      \n" +
                "\\ \\ / / | |     \n" +
                " \\ V /  | |     \n" +
                "  > <   | |     \n" +
                " / . \\  | |____ \n" +
                "/_/ \\_\\ |______|\n";
        assertEquals(expected, RomanPrinter.print(40));
    }

    @Test
    public void testPrint50() {
        String expected = " _      \n" +
                "| |     \n" +
                "| |     \n" +
                "| |     \n" +
                "| |____ \n" +
                "|______|\n";
        assertEquals(expected, RomanPrinter.print(50));
    }

    /// primi 100
    @Test
    public void testPrint51() {
        String expected = 
            " _        _____ \n" +
            "| |      |_   _|\n" +
            "| |        | |  \n" +
            "| |        | |  \n" +
            "| |____   _| |_ \n" +
            "|______| |_____|\n";
        assertEquals(expected, RomanPrinter.print(51));
    }

    @Test
    public void testPrint60() {
        String expected = 
            " _       __   __\n" +
            "| |      \\ \\ / /\n" +
            "| |       \\ V / \n" +
            "| |        > <  \n" +
            "| |____   / . \\ \n" +
            "|______| /_/ \\_\\\n";
        assertEquals(expected, RomanPrinter.print(60));
    }

    @Test
    public void testPrint70() {
        String expected = 
            " _       __   __ __   __\n" +
            "| |      \\ \\ / / \\ \\ / /\n" +
            "| |       \\ V /   \\ V / \n" +
            "| |        > <     > <  \n" +
            "| |____   / . \\   / . \\ \n" +
            "|______| /_/ \\_\\ /_/ \\_\\\n";
        assertEquals(expected, RomanPrinter.print(70));
    }

    @Test
    public void testPrint75() {
        String expected = 
            " _       __   __ __   __ __      __\n" +
            "| |      \\ \\ / / \\ \\ / / \\ \\    / /\n" +
            "| |       \\ V /   \\ V /   \\ \\  / / \n" +
            "| |        > <     > <     \\ \\/ /  \n" +
            "| |____   / . \\   / . \\     \\  /   \n" +
            "|______| /_/ \\_\\ /_/ \\_\\     \\/    \n";
        assertEquals(expected, RomanPrinter.print(75));
    }

    @Test
    public void testPrint90() {
        String expected = 
        "__   __   _____ \n" +
        "\\ \\ / /  / ____|\n" +
        " \\ V /  | |     \n" +
        "  > <   | |     \n" +
        " / . \\  | |____ \n" +
        "/_/ \\_\\  \\_____|\n";
        assertEquals(expected, RomanPrinter.print(90));
    }

    @Test
    public void testPrint100() {
        String expected = 
        "  _____ \n" +
        " / ____|\n" +
        "| |     \n" +
        "| |     \n" +
        "| |____ \n" +
        " \\_____|\n";
        assertEquals(expected, RomanPrinter.print(100));
    }

    /// primi 500
    @Test
    public void testPrint149() {
        String expected =
            "  _____  __   __  _        _____  __   __\n" +
            " / ____| \\ \\ / / | |      |_   _| \\ \\ / /\n" +
            "| |       \\ V /  | |        | |    \\ V / \n" +
            "| |        > <   | |        | |     > <  \n" +
            "| |____   / . \\  | |____   _| |_   / . \\ \n" +
            " \\_____| /_/ \\_\\ |______| |_____| /_/ \\_\\\n";
        assertEquals(expected, RomanPrinter.print(149));
    }

    @Test
    public void testPrint212() {
        String expected =
            "  _____    _____  __   __  _____   _____ \n" +
            " / ____|  / ____| \\ \\ / / |_   _| |_   _|\n" +
            "| |      | |       \\ V /    | |     | |  \n" +
            "| |      | |        > <     | |     | |  \n" +
            "| |____  | |____   / . \\   _| |_   _| |_ \n" +
            " \\_____|  \\_____| /_/ \\_\\ |_____| |_____|\n";
        assertEquals(expected, RomanPrinter.print(212));
    }

    @Test
    public void testPrint300() {
        String expected =
        "  _____    _____    _____ \n" +
        " / ____|  / ____|  / ____|\n" +
        "| |      | |      | |     \n" +
        "| |      | |      | |     \n" +
        "| |____  | |____  | |____ \n" +
        " \\_____|  \\_____|  \\_____|\n";
        assertEquals(expected, RomanPrinter.print(300));
    }

    @Test
    public void testPrint470() {
        String expected =
            "  _____   _____    _       __   __ __   __\n" +
            " / ____| |  __ \\  | |      \\ \\ / / \\ \\ / /\n" +
            "| |      | |  | | | |       \\ V /   \\ V / \n" +
            "| |      | |  | | | |        > <     > <  \n" +
            "| |____  | |__| | | |____   / . \\   / . \\ \n" +
            " \\_____| |_____/  |______| /_/ \\_\\ /_/ \\_\\\n";
        assertEquals(expected, RomanPrinter.print(470));
    }

    @Test
    public void testPrint521() {
        String expected =
        " _____   __   __ __   __  _____ \n" +
        "|  __ \\  \\ \\ / / \\ \\ / / |_   _|\n" +
        "| |  | |  \\ V /   \\ V /    | |  \n" +
        "| |  | |   > <     > <     | |  \n" +
        "| |__| |  / . \\   / . \\   _| |_ \n" +
        "|_____/  /_/ \\_\\ /_/ \\_\\ |_____|\n";
        assertEquals(expected, RomanPrinter.print(521));
    }

    /// primi 1000
    @Test
    public void testPrint600() {
        String expected =
            " _____     _____ \n" +
            "|  __ \\   / ____|\n" +
            "| |  | | | |     \n" +
            "| |  | | | |     \n" +
            "| |__| | | |____ \n" +
            "|_____/   \\_____|\n";
        assertEquals(expected, RomanPrinter.print(600));
    }

    @Test
    public void testPrint749() {
        String expected =
            " _____     _____    _____  __   __  _        _____  __   __\n" +
            "|  __ \\   / ____|  / ____| \\ \\ / / | |      |_   _| \\ \\ / /\n" +
            "| |  | | | |      | |       \\ V /  | |        | |    \\ V / \n" +
            "| |  | | | |      | |        > <   | |        | |     > <  \n" +
            "| |__| | | |____  | |____   / . \\  | |____   _| |_   / . \\ \n" +
            "|_____/   \\_____|  \\_____| /_/ \\_\\ |______| |_____| /_/ \\_\\\n";
        assertEquals(expected, RomanPrinter.print(749));
    }

    @Test
    public void testPrint1000() {
        String expected =
            " __  __ \n" +
            "|  \\/  |\n" +
            "| \\  / |\n" +
            "| |\\/| |\n" +
            "| |  | |\n" +
            "|_|  |_|\n";
        assertEquals(expected, RomanPrinter.print(1000));
    }


}