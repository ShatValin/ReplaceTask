public class ReplaceTaskFactory {
    private static ReplaceTaskInterface instance = new ReplaceTaskImplementation();
    private ReplaceTaskFactory(){

    }
    public static ReplaceTaskInterface getInstance(){
        return instance;
    }
}
