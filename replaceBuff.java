public class replaceBuff {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Java");
        sb.replace(0, 4, "Python");
        System.out.println(sb);
    }
    
}
