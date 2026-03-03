public class vowels {
    public static void main(String[] args) {
        String s1="Java Full Stack";
        int count=0;
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                count++;
            }
        }
        System.out.println("Number of vowels in the string: "+count);
        
    }
    
}
