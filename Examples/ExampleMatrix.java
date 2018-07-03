// Example matrix

class ExampleMatrix{
    public static void main(String[] args) {
        // Initialize matrix that size based on number of input parameters and length of each parameter
        char[][] matrix = new char[args.length][];
        for (int i = 0; i < args.length; i++){
            matrix[i] = new char[args[i].length()];
            // Fill each matrix row with literals of input parameters
            matrix[i] = stringToCharArray(args[i]);
            // Display matrix in terminal
            printInputCharArray(matrix[i]);
        }
    }

    /**
      * @brief  Convert input string to char array
      * @param  inputString: Input string with text
      * @return resultString: Char array
      */
    private static char[] stringToCharArray(String inputString){
        char[] resultString = new char[inputString.length()];
        // Convert string to char array
        for (int i = 0; i < inputString.length(); i++){
            resultString[i] = inputString.charAt(i);
        }
        return resultString;
    }

    /**
      * @brief  Display input char array using print
      * @param  inputArray: Input char array
      * @return none
      */
    private static void printInputCharArray(char[] inputArray){
        for (int i = 0; i < inputArray.length; i++){
            System.out.print(inputArray[i] + "\t");
        }
        System.out.println();
    }
}
