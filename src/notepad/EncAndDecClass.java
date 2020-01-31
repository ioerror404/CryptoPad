package notepad;

public class EncAndDecClass {
    public String encryp(String text) {
        int length = text.length();
        int asciis[] = new int[length];
	char[] encString = new char[text.length()];
        int key = 3;
	char c;
	text = rev(text);
	for(int i = length-1, j = 0; i >= 0; j++, i--){
            c = text.charAt(j);
            asciis[j] = (int) c;
            asciis[j] = asciis[j]+key;
            encString[j] = (char) asciis[j];
        }
        return String.valueOf(encString);
    }
    
    public String decryp(String text){
        int length = text.length();
        int asciis[] = new int[length];
	char[] decString = new char[text.length()];
        int key = 3;
	char c;
        for(int i = length-1, j = 0; i >= 0; j++, i--){
            c = text.charAt(j);
            asciis[j] = (int) c;
            asciis[j] = asciis[j]-key;
            decString[j] = (char) asciis[j];
        }   
        return rev(String.valueOf(decString));
    }


    private static String rev(String text) {
        int length = text.length(); 
        char[] chars = text.toCharArray();
        char[] revChars = new char[length];
        
        for (int i = 0; i<length; i++) 
            revChars[i] = chars[length-i-1]; 
        
        return String.valueOf(revChars);
    }

}
