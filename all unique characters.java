public class Main {
    public static boolean hasUniqueChars(String str) {
        boolean[] seen = new boolean[256]; 
        
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            
            if(seen[ch]) {
                return false;
            } else {
                seen[ch] = true;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        String str1 = "hello world";
        String str2 = "abcdefg";
        
        if(hasUniqueChars(str1)) {
            System.out.println(str1 + " has all unique characters");
        } else {
            System.out.println(str1 + " does not have all unique characters");
        }
        
        if(hasUniqueChars(str2)) {
            System.out.println(str2 + " has all unique characters");
        } else {
            System.out.println(str2 + " does not have all unique characters");
        }
    }
}