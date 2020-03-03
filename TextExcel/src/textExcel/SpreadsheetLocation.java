package textExcel;

//Update this file with your own code.

import java.util.Arrays;

public class SpreadsheetLocation implements Location {
    private int col, row;

    public SpreadsheetLocation(String cellName) {
        cellName = cellName.toUpperCase();
        char firstChar = cellName.charAt(0);

        col = firstChar - 'A'; // Upper case character - 65 ('A' integer value)
        row = Integer.parseInt(cellName.substring(1)) - 1;

    }

    public static boolean isLocation(String cellName) {
        cellName = cellName.toUpperCase();
        // Check for false characters
        String[] characters = cellName.split("");
        for (String s : characters)
            if (!"012345678ABCDEFGHIJKL".contains(s))
                return false;
        int valueOfFirstChar = cellName.charAt(0) - 'A';
        if (valueOfFirstChar >= 0 && valueOfFirstChar <= 11)
            return Integer.parseInt(cellName.substring(1)) <= 21;
        return false;
    }

    @Override
    public int getRow() {
        return row;
    }

    @Override
    public int getCol() {
        return col;
    }
}
