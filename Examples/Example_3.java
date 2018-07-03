// 3rd java Example project
// String class test

import my_enums.*;

class Example_3{
    public static void main(String[] args) {
        displayInputParameters(args);
        // Convert all input parameters to Lower Case
        displayInputParameters(convertToLowerCase(args));

        // Convert to lower case and then to upper case using function with option
        displayInputParameters(converToLowerUpperCase(args, "lower"));
        displayInputParameters(converToLowerUpperCase(args, "upper"));
    }

    private static void displayInputParameters(String[] args){
        // Display input parameters
        System.out.print(args.length + " input parameters : ");
        for (int i = 0; i < args.length; i++){
            if ((i+1) != args.length){
                System.out.print(args[i] + ' ');
            } else {
                System.out.println(args[i]);
            }
        }
    }

    private static String[] convertToLowerCase(String[] args){
        String[] tempString = args;
        for (int i = 0; i < args.length; i++){
            tempString[i] = args[i].toLowerCase();
        }
        return tempString;
    }

    /**
      * @brief  Conver all input strings to lower or upper case based on option
      * @param  option: Text option to what case need convert strings - lower / upper
      * @retval String[]: Array of strings converted to needed case
      */
    private  static String[] converToLowerUpperCase(String[] args, String option){
        String[]resultString = args;

        for (int i = 0; i < args.length; i++){
            switch (option){
                case "lower":   { resultString[i] = args[i].toLowerCase();          break; }
                case "upper":   { resultString[i] = args[i].toUpperCase();          break; }
                default:        { System.out.println("Wrong option parameter");     break;}
            }
        }

        return resultString;
    }
}
