public class Main {
    public static boolean isPangram(String str) {
        boolean[] letters = new boolean[26]; 
        
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            
            if(ch >= 'a' && ch <= 'z') { 
                letters[ch-'a'] = true;
            } else if(ch >= 'A' && ch <= 'Z') {
                letters[ch-'A'] = true;
            }
        }
        
        for(int i=0; i<26; i++) {
            if(!letters[i]) { 
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        
        if(isPangram(str)) {
            System.out.println(str + " is a pangram");
        } else {
            System.out.println(str + " is not a pangram");
        }
    }
}