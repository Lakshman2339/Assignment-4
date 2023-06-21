import java.util.HashSet;

public class Main {
    public static String removeDuplicates(String str) {
        String result = "";
        boolean[] seen = new boolean[256]; 
        
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            
            if(!seen[ch]) { 
                seen[ch] = true;
                result += ch; 
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        String str = "hello world";
        System.out.println("Original String: " + str);
        System.out.println("String after removing duplicates: " + removeDuplicates(str));
    }
}
