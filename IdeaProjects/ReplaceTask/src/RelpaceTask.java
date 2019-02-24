public class RelpaceTask {

    public static void swap(char[] charArray, int index1, int index2) {
        char temp = charArray[index1];
        charArray[index1] = charArray[index2];
        charArray[index2] = temp;
    }

    public static void replaceSring(String inputString) {
        if (inputString != null && inputString.length() != 0) {
            char[] charArray = inputString.toCharArray();
            for (int i = 0; i < charArray.length / 2; i++) {
                if (Character.isLetter(charArray[i]) && Character.isLetter(charArray[charArray.length - i - 1]))
                    swap(charArray, i, charArray.length - i - 1);
            }
            System.out.println(new String(charArray));
        } else
            System.out.println("wrong string input");
    }

    public static void main(String[] args) {
        replaceSring(null);
        replaceSring("");
        replaceSring("aabb");
        replaceSring("aa1b");
        replaceSring("11ab");
        replaceSring("~!@#$&^&*(_)&_)1234560_-(gdfkjhskl");
    }
}
