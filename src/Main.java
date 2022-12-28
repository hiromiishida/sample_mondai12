public class Main {
    public static void main(String[] args) {

        System.out.println(simRatio(new char[]{'a', 'p', 'p', 'l', 'e'}, new char[]{'a', 'p', 'r', 'i', 'l'}));

    }

    private static double simRatio(char[] s1, char[] s2){
        int i, cnt = 0;
        if(s1.length != s2.length){
            return -1;
        }
        for(i = 0 ; i <= s1.length - 1 ; i++){
            if(s1[i] == s2[i]){
                cnt = cnt + 1;
            }
        }
        return (double) cnt / s1.length; /* 実数として計算する */
    }
}