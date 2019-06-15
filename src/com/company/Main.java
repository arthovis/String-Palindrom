package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag=true;

        System.out.println("Introduceti numarul de incercari: ");
        int n=scanner.nextInt();
        for (int i=0;i<=n;i++){
            String  s=scanner.nextLine();
            for(int j=0;j<s.length()/2;j++) {
                if (s.charAt(j) != s.charAt(s.length() - j - 1)) {
                    flag = false;
                    break;
                }
            } System.out.println(flag ? "1" : "0");
        }

    }
}

