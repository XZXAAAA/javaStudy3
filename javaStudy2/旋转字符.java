public class 旋转字符 {
    public static void main(String[] args) {
        String strA = "abcde";
        String strB = "cdeab";
        boolean canTurnTo = false;
        for (int i = 1; i <= strA.length(); i++){
            if (strA.substring(i).concat(strA.substring(0,i)).equals(strB)){
                canTurnTo = true;
                break;
            }
        }
        if (canTurnTo) System.out.println("可以");
        else System.out.println("不可以");

    }
}
