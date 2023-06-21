public class Main {
    public static void printDuplicates(String str) {
        int[] count = new int[256]; // to keep track of character counts
        
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            count[ch]++;
        }
        
        for(int i=0; i<256; i++) {
            if(count[i] > 1) { // if character count is greater than 1, it is a duplicate
                System.out.println((char)i + " appears " + count[i] + " times");
            }
        }
    }
    
    public static void main(String[] args) {
        String str = "hello world";
        printDuplicates(str);
    }
}