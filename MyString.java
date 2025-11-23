public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String str2 = "";
        for(int i=0; i<str.length(); i++){
            if (str.charAt(i)>64 && str.charAt(i)<91) {
                str2 += (char)(str.charAt(i) + 32);
            }
            else{
                str2 += str.charAt(i);
            }
        }
        return str2;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        if(str1.length()==0){
            return false;
        }
        if (str2.length()==0) {
            return true;
        }
        if(str1.length()<str2.length()){
            return false;
        }
        int count = 0;
        int gap = str1.length() - str2.length();
        for(int i=0; i<=gap; i++){
            count = 0;
            if (str2.charAt(0)==str1.charAt(i)) {
                for(int j=0; j<str2.length(); j++){
                    if(str2.charAt(j)!=str1.charAt(i+j)){
                        break;
                    }
                    count++;
                }
                if(count==str2.length()){
                    return true;
                }
            }
        }
        return false;
    }
}
