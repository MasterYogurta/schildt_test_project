// 1st java Example project
import java.lang.instrument.Instrumentation;


class Example_2 {
    public static void main (String args[]){
        // Test variables
        int variable = 22;
        String string = "0xFEEDCAFE";

        // Display variable value
        System.out.println("Variable value : " + variable);
        // Display number of input parameters
        System.out.println("Number of input parameters : " + args.length);
        // Display all input parameters
        for (int i = 0; i < args.length; i++){
            System.out.print("Input parameter #");
            System.out.print(i+1);
            System.out.print(" : ");
            System.out.println(args[i]);
        }
    }
}
