public class RelpaceTask {
    public static boolean isNumber(char c){
        switch (c){
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                return true;
            default:
                return false;
        }
    }
    public static void swap(char [] c, int index1, int index2){
        char temp = c[index1];
        c[index1]=c[index2];
        c[index2]=temp;
    }
    public static void replaceTask(String s){
        if(s!=null && s.length()!=0) {
            char[] ch = s.toCharArray();
            for (int i = 0; i < ch.length / 2; i++) {
                if (!isNumber(ch[i]) && !isNumber(ch[ch.length - i - 1]))
                    swap(ch, i, ch.length - i - 1);
            }
            System.out.println(new String(ch));
        }
        else
            System.out.println("wrong string input");

    }
    public static void main(String[] args) {
        replaceTask(null);
        replaceTask("");
        replaceTask("aabb");
        replaceTask("aa1b");
        replaceTask("11ab");
        replaceTask("~!@#$&^&*(_)&_)1234560_-(gdfkjhskl");
    }
}
