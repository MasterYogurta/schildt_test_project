// SATA socket class

package sata_socket;

public class SataSocket{
    private String supportedInterfaces[];
    private String currentInterface;

    /**
     *  Function configures supported interface types
     *  @param  interfaceTypePull: Pull if interface types in text format
     *  @return Number of configured interfaces or error code (less than 0)
     */
    public int ConfigureInterface(String ... interfaceTypePull){
        return 0;
    }

    /**
     *  Function checks if input SATA interface type supported
     *  @param  interfaceType: SATA interface type
     *  @return 1 if interface supported, else error code (less than 0)
     */
    public int IfInterfaceSupported(String interfaceType){
        return 0;
    }


    /**
     *  Function checks if CPU socket configured
     *  @param  none
     *  @return 1 if CPU socket configured, else error code (less than 0)
     */
    public int IsReady(){
        return 0;
    }
}
