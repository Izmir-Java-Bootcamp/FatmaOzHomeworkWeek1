package Week1;

import java.util.Scanner;

public class Homework1 {

    public static void main(String[] args) {
        System.out.print("Lütfen satir sayisi belirtiniz : ");
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();

        String strIlk = "";

        String strGovde = "";

        String strSon = "";

        for (int i = 0; i < r; i++) {

            if (r > 1) {
                strSon += "*";
            }

            strIlk += "*";

            if (i >= r - 2)
                continue;

            strGovde += "*";
            for (int j = 0; j < (r - 2); j++) {
                if (i % 2 != 0 && j % 2 == 0) {
                    strGovde += " ";
                } else if (i % 2 != 0 && j % 2 != 0) {
                    strGovde += "+";
                } else if (i % 2 == 0 && j % 2 != 0) {
                    strGovde += " ";
                } else {
                    strGovde += "+";
                }
            }
            strGovde += "*\n";
        }
        String str = strIlk + "\n" + strGovde + strSon;

        System.out.println(str);
    }
}
