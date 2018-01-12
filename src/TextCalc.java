public class TextCalc {

    public static long lenghtWithoutSpaces(String t){
        String text = t.replaceAll(" ","");
        return text.length();

    }

    public static long wordsNumber(String t){
        String[] split = t.split(" ");
        return split.length;
    }

    public static boolean isPalindormic(String t){
        String reversed = "";
        boolean result = false;
        long lenght = t.length()-1;

        for (long i = lenght ; i>= 0 ; i--){
            reversed+=""+t.charAt((int)i);
        }
        if (t.equals(reversed)){
            result = true;
        }
        return result;

    }
}
