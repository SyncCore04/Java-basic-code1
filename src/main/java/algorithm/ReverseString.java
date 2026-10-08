package algorithm;

//双指针
public class ReverseString {
    //反转字符串
    public void reverseString(char[] s){
        int i = 0,j = s.length-1;
        while(i<j){
            char t = s[i];
            s[i] = s[j];
            s[j]= t;
            i++;j--;
        }
        // 打印反转后的字符串
    }
    public void printString(char[] s){
        for(char c : s){
            System.out.print(c);
        }
        System.out.println();
    }

    //2.判断回文
    public boolean isPalindrome(String s){
        int i = 0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;j--;
        }
        return true;
    }

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        char[] s = {'h','e','l','l','o'};
        reverseString.reverseString(s);
        reverseString.printString(s);
    }


}
