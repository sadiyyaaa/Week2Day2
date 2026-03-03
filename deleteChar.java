public class deleteChar {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Full Stack Developer");
        sb.delete(5, 10);
        System.out.println(sb);
    }
    
}
