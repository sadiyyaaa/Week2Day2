public class palindrome {
    public static void main(String[] args) {
        String s1="madam";
        String result="";
        for(int i=s1.length()-1;i>=0;i--){
            result=result+s1.charAt(i);
        }
        if(s1.equals(result)){
            System.out.println("yes it is palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
    
}
