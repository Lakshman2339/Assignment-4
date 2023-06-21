public class MaxCharOccur {
    public static void main(String[] args) {
        String str = "Hello World!";
        char maxChar = findMaxChar(str);
        System.out.println("The maximum occurring character in " + str + " is " + maxChar);
    }

    public static char findMaxChar(String str) {
        int[] charCounts = new int[128];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            charCounts[c]++;
        }
        int maxCount = 0;
        char maxChar = ' ';
        for (int i = 0; i < charCounts.length; i++) {
            if (charCounts[i] > maxCount) {
                maxCount = charCounts[i];
                maxChar = (char) i;
            }
        }
        return maxChar;
    }
}