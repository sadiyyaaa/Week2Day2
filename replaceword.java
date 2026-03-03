public class replaceword {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Java Developer");
        sb.replace(0,4,"Python");
        System.out.println(sb);
    }
    
}
