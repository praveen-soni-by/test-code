
public class Program {

    public static void main(String[] args) {

        System.out.println(haveForm("abababab"));
        System.out.println(haveForm("aa"));
        System.out.println(haveForm("abcabcaaa"));
        System.out.println(haveForm("aac"));

    }

    private static boolean haveForm(String st) {
        int firstChar = st.charAt(0);
        int charLength = 0;
        for (int i = 1; i < st.length(); i++) {
            charLength++;
            if (firstChar == st.charAt(i)) {
                break;
            }
        }
        String searchText = st.substring(0, charLength);
        //When string is not equally divided
        if(st.length() % charLength != 0 ){
            return false;
        }
        //When string is equally divided but char are not same
        for (int start = charLength; start < st.length(); start = start + charLength) {
            int end = start + charLength;
            if (end > st.length()) {
                end = st.length();
            }
            if (!searchText.equals(st.substring(start, end))) {
                return false;
            }
        }
        return true;
    }
}
