public class Main {
    public static void countCharacters(String str) {
        int vowels = 0, consonants = 0, special = 0;
        str = str.toLowerCase(); 
        
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if(ch >= 'a' && ch <= 'z') {
                consonants++;
            } else {
                special++;
            }
        }
        
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Special Characters: " + special);
    }
    
    public static void main(String[] args) {
        String str = "Hello World! 123";
        countCharacters(str);
    }
}