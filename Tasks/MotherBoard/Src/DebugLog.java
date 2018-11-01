// Debug log

package debug_log;

public class DebugLog{
    public void UserLog(String ... userMessage){
        System.out.print("[MSG] : ");
        for (String message : userMessage){
            System.out.print(userMessage);
        }
        System.out.println();
    }

    /**
     *  Error log funciton
     *  @param  errorCode: Code of error
     *  @param  errorMessage: Custom message
     *  @return errorCode
     */
    public int ErrorLog(int errorCode, String ... errorMessage){
        System.out.println("[ERR] : {" + errorCode + "} - ");
        for (String message : errorMessage){
            System.out.print(errorMessage);
        }
        System.out.println();
        return errorCode;
    }
}
