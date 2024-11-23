public class stringbuilder学习 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        sb.append("hello");
        sb.append("world");
        sb.append("java");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        String result=sb.toString();
        System.out.println(result);
    }
}
