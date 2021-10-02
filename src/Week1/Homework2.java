package Week1;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the pattern string ex: 's*h*l'");
        String pattern=sc.nextLine();
        while(true){
            System.out.println("Enter a string");
            String str=sc.nextLine();
            if(str.equals("exit")) {
                System.out.println("Bye");
                return;
            }
            if( occursIn(pattern, str)) {
                System.out.println(pattern+" occurs in "+"'"+ str+"'");
            }else {
                System.out.println(pattern+" does not occur in "+"'"+ str+"'");
            }
        }
    }
    public static boolean occursIn(String pattern, String str) {
        String result="";
        for(int i=0;i<pattern.length();i++) {
            if(pattern.charAt(i)!=('*')) {
                result+=pattern.charAt(i);
            }
        }
        int count=0;
        for(int i=0;i<result.length();i++) {
            char chr=result.charAt(i);
            for(int j=0;j<str.length();j++) {
                if(str.charAt(j)==(chr)) {
                    count++;
                    str=str.substring(j+1);
                }
            }
        }
        if(count>=result.length()) {
            return true;
        }
        return false;
    }
}
