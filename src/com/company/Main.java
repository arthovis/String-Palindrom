package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        scanner.nextLine();
        for (int i=0;i<=n;i++){
            String  s=scanner.nextLine();
            int count = 0;
            String s1=s;
            while(!s.isEmpty()){
                int length = s.length();
                s = s.replaceAll(s.charAt(0)+"","");
                if ((length-s.length())%2==1)
                    count++;
            }
            if ((s1.length()%2==0 && count>0)|| (s1.length()%2==1 && count>1)){
                System.out.println(0);
            } else {
                System.out.println(1);
            }
        }


    }
}

