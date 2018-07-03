// Java example : for each

class ExampleForEach{
    public static void main(String[] args) {
        // Display input parameters using for each
        System.out.println("Display input parameters using for each");
        int counter = 1;
        BananaCheck: for (String str : args){
            System.out.println("input parameter #" + (counter++) + " : " + str);
            if (isStringContainsSubstringIgnoreCase(str, "banana")){
                System.out.println("Banana alert! Abandon cicle!");
                break BananaCheck;
            }
        }
        System.out.println("-------------------------------------------------------------------------------");
        char[][] matrix;
        matrix = convertStringArrayToCharMatrix(args);
        System.out.println("Display input parameters as Character matrix");
        displayInputCharMatrix(matrix);
    }

    /**
      * @brief  Convert string array to character matrix
      * @param  inputArray: Input string array
      * @return outputMatrix: Output character matrix
      */
    private static char[][] convertStringArrayToCharMatrix(String[] inputArray){
        char[][] outputMatrix = new char[inputArray.length][];
        int indexRow = 0;
        for (String row : inputArray){
            outputMatrix[indexRow++] = row.toCharArray();
        }
        return outputMatrix;
    }

    /**
      * @brief  Display character matrix
      * @param  inputMatrix: Input character matrix
      * @return none
      */
    private static void displayInputCharMatrix(char[][] inputMatrix){
        for (char[] row : inputMatrix){
            for (char column : row){
                System.out.print("[ " + column + " ] ");
            }
            System.out.println();
        }
    }

    /**
      * @brief  Check if given string contains specify substring
      * @param  sourceString: Main source string
      * @param  subString: Substring for serch
      * @return result: Boolean search endcode: true or false
      */
    private static boolean isStringContainsSubstringIgnoreCase(String sourceString, String subString){
        boolean result = false;
        char[] sourceArray, subArray;
        int subIndex = 0;
        sourceString = sourceString.toLowerCase();
        subString = subString.toLowerCase();
        sourceArray = sourceString.toCharArray();
        subArray = subString.toCharArray();
        Search: for (char sourceSymbol : sourceArray){
            if (sourceSymbol == subArray[subIndex]){
                subIndex++;
            } else {
                subIndex = 0;
            }
            if (subIndex == subArray.length){
                result = true;
                break Search;
            }
        }
        return result;
    }
}
