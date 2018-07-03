// Example java project using while

class ExampleWhile{
    public static void main(String[] args){
        // Help message
        String monthName, inputString;
        int tryCounter = 5;
        int monthNumber = 0;

        System.out.println("Print number of month and program will display it name in terminal");        
        System.out.println("You have " + tryCounter + " tries");

        while (tryCounter-- > 0){
            inputString = System.console().readLine();
            monthNumber = Integer.parseInt(inputString);
            monthName = getMonthName(monthNumber);
            System.out.println("Input : " + monthNumber + " Output : " + monthName);
        }
    }

    /**
      * @brief  Function returns string with name of the month based on it number
      * @param  monthNumber: Number of month [12:0]
      * @return monthName: String with month name
      */
    public static String getMonthName(int monthNumber){
        String monthName;
        switch(monthNumber){
            case 1:{    monthName = "January";      break;}
            case 2:{    monthName = "February";     break;}
            case 3:{    monthName = "Marth";        break;}
            case 4:{    monthName = "April";        break;}
            case 5:{    monthName = "May";          break;}
            case 6:{    monthName = "June";         break;}
            case 7:{    monthName = "July";         break;}
            case 8:{    monthName = "August";       break;}
            case 9:{    monthName = "September";    break;}
            case 10:{   monthName = "October";      break;}
            case 11:{   monthName = "November";     break;}
            case 12:{   monthName = "December";     break;}
            default:{   monthName = "WRONG_NUMBER"; break;}
        }
        return monthName;
    }
}
