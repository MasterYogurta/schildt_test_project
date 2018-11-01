// DDR socket class

package ddr_socket;

public class DdrSocket{
    private String supportedFamilyTypes[];
    private int supportedFrequency[];
    private String currentFamilyType;
    private int currentFrequency;

    /**
     *  Function configures supported DDR family types
     *  @param  familyTypePull: Pull of family types in text format
     *  @return Number of configred family types or error code (less than 0)
     */
    public int ConfigureFamilyTypes(String ... familyTypePull){
        return 0;
    }

    /**
     *  Functin configures support DDR frequency
     *  @param  frequencyPull: Pull of frequencies in decimal format
     *  @return Number of configred frequencies or error code (less than 0)
     */
    public int ConfigureFrequency(int ... frequencyPull){
        return 0;
    }

    /**
     *  Function checks if input family type sopported
     *  @param  familyType: DDR family type
     *  @return 1 if family type supported, else error code (less than 0)
     */
    public int IfFamilyTypesSupported(String familyType){
        return 0;
    }

    /**
     *  Function checks if input frequency supported
     *  @param  frequency: DDR frequency value
     *  @return 1 if frequency supported, else error code (less than 0)
     */
    public int IfFrequencySupported(int frequency){
        return 0;
    }

    /**
     *  Function checks if DDR socket configured
     *  @param  none
     *  @return 1 if DDR socket configured, else error code (less than 0)
     */
    public int IsReady(){
        return 0;
    }
}
