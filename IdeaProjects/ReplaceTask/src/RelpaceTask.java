public class RelpaceTask {
    public static void main(String[] args) {
        ReplaceTaskInterface replaceTaskInstance = ReplaceTaskFactory.getInstance();
        replaceTaskInstance.replaceSring(null);
        replaceTaskInstance.replaceSring("");
        replaceTaskInstance.replaceSring("aabb");
        replaceTaskInstance.replaceSring("aa1b");
        replaceTaskInstance.replaceSring("11ab");
        replaceTaskInstance.replaceSring("~!@#$&^&*(_)&_)1234560_-(gdfkjhskl");
    }
}
