// 1st java Example project

class Example_2 {
    public static void main (String args[]){
        // Test variables
        int variable = 22;
        // Display variable value
        System.out.println("Variable value : " + variable);
        // Display number of input parameters
        System.out.println("Number of input parameters : " + args.length);
        // Display all input parameters
        for (int i = 0; i < args.length; i++){
            System.out.println("Input parameter #" + (i+1) + " : " + args[i]);
        }
    }
}
