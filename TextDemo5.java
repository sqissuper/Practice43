package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * ClassName:TextDemo5
 * Package:test
 * Description:
 *
 * @Author:HP
 * @date:2021/5/24 0:07
 */
public class TextDemo5 {
    //因数分解
//    public static boolean isPrime(int n) {
//        for(int i = 2; i < Math.sqrt(n); i++){
//            if(n % i == 0){
//                return false;
//            }
//        }
//        return true;
//    }


    //91. 解码方法
//    public static int numDecodings(String s) {
//        int n = s.length();
//        int[] dp = new int[n + 1];
//        dp[0] = 1;
//        for(int i = 1; i <= n; i++) {
//            if(s.charAt(i - 1) != '0') dp[i] += dp[i - 1];
//            if(i > 1 && s.charAt(i - 2) != '0' && ((s.charAt(i - 2) - '0') * 10 + s.charAt(i - 1) - '0') <= 26) dp[i] += dp[i - 2];
//        }
//        return dp[n];
//    }

    //反转元音字母
//    public static String reverseVowels(String s) {
//        if(s == null && s.length() == 0) return null;
//        HashSet<Character> set = new HashSet<>();
//        set.add('a');
//        set.add('e');
//        set.add('i');
//        set.add('o');
//        set.add('u');
//        set.add('A');
//        set.add('E');
//        set.add('I');
//        set.add('O');
//        set.add('U');
//        char[] c = s.toCharArray();
//        for(int i = 0; i < c.length; i++) {
//            if(set.contains(c[i])) {
//                for(int j = i + 1; j < c.length; j++) {
//                    if(set.contains(c[j])) {
//                        char tmp = c[i];
//                        c[i] = c[j];
//                        c[j] = tmp;
//                        i = j - 1;
//                        break;
//                    }
//
//                }
//            }
//        }
//        s = new String(c);
//        return s;
//    }

    //520. 检测大写字母
//    public boolean detectCapitalUse(String word) {
//        if(word.length() == 0 && word == null) return true;
//        boolean f = true;
//        if(word.charAt(0) >= 'a' && word.charAt(0) <= 'z') {
//            for(int i = 1; i < word.length(); i++) {
//                if(word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') f = false;
//            }
//        } else {
//            if(word.length() > 1 && word.charAt(1) >= 'a' && word.charAt(1) <= 'z') {
//                for(int i = 1; i < word.length(); i++) {
//                    if(word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') f = false;
//                }
//            } else {
//                for(int i = 1; i < word.length(); i++) {
//                    if(word.charAt(i) >= 'a' && word.charAt(i) <= 'z') f = false;
//                }
//            }
//
//        }
//        return f;
//    }

    //面试题 08.10. 颜色填充
//    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
//        dfs(image,sr,sc,newColor,image[sr][sc]);
//        return image;
//    }
//    public void dfs(int[][] image,int i,int j,int newColor,int oldColor) {
//        if(i < 0 || i >= image.length || j < 0 || j >= image[0].length || image[i][j] != oldColor || image[i][j] == newColor) return;
//        image[i][j] = newColor;
//        dfs(image,i + 1,j,newColor,oldColor);
//        dfs(image,i,j + 1,newColor,oldColor);
//        dfs(image,i - 1,j,newColor,oldColor);
//        dfs(image,i,j - 1,newColor,oldColor);
//    }

    public static boolean isFlipedString(String s1, String s2) {
        if(s1.length() == 0 && s2.length() == 0) return true;
        if(s1 == null || s2 == null) return false;
        int idx = s1.indexOf(s2.charAt(0));
        s1 = s1.substring(idx,s1.length()) + s1.substring(0,idx);
        return s1.equals(s2);
    }
    public static void main(String[] args) {
        String s1 = "";
        String s2 = "";
        System.out.println(isFlipedString(s1, s2));
//        String s = "aA";
//        System.out.println(reverseVowels(s));
//        String s = "12";
//        System.out.println(numDecodings(s));
//        for(int i = 0; i <= 26; i++) {
//            map.put(i + 1,(char)(i + 'A'));
//        }
//        System.out.println(map.get(26));
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//            int n = sc.nextInt();
//            System.out.print(n + " = ");
//            for(int i = 2; i <= n && n != i; i++) {
//                if(isPrime(i) && n % i == 0) {
//                    System.out.print(i + " * ");
//                    n /=  i;
//                }
//            }
//            System.out.print(n);
//        }
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//            int n = sc.nextInt();
//            if(n < 3) {
//                System.out.println(n);
//            } else {
//                long f1 = 1;
//                long f2 = 2;
//                long f3 = 0;
//                for(int i = 2; i < n; i++) {
//                    f3 = (f1 + f2) % 1000000;
//                    f1 = f2;
//                    f2 = f3;
//                }
//                String tmp = Long.toString(f3);
//                if(tmp.length() < 6) {
//                    System.out.println(f3);
//                } else {
//                    tmp = tmp.substring(tmp.length() - 6,tmp.length());
//                    System.out.println(Long.parseLong(tmp));
//                }
//            }
//        }

//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//            int n = sc.nextInt();
//            int[] dp = new int[100001];
//            dp[0] = 0;
//            dp[1] = 1;
//            dp[2] = 2;
//            for(int i = 3; i <= n; i++) {
//                dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000;
//            }
//            System.out.println(dp[n]);
//        }
    }
}
