// Java example project : Classes
import java.io.File;

class TestContent{
    private String fileName;
    private String folderName;
    private String[] internalData;
    private File file;
    private Debug debug = new Debug();

    TestContent(String folderName){
        // Create folder object
        file = new File(folderName);
        // Check if folder already exists
        if (!file.exists()){
            // Create fodler
            if (file.mkdir()){
                debug.MessageHandler("Folder successfully created");
            } else {
                debug.ErrorHandler("Failed to create folder");
            }
        } else {
            debug.ErrorHandler("Folder already exists");
        }
    }
}

class Debug{
    public void ErrorHandler(String errorString){
        System.out.println("\t[ERROR] : " + errorString);
    }

    public void MessageHandler(String messageString){
        System.out.println("[LOG] : " + messageString);
    }
}

class ExampleClasses{
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------------------------------");
        // Create new folder with given name
        TestContent temp1 = new TestContent(args[0]);
        System.out.println("-------------------------------------------------------------------------------");
    }
}
