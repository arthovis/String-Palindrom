package com.company;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        scanner.nextLine();
        String[] tests = new String[n];
        for (int i=0;i<n;i++) {
            tests[i] = scanner.nextLine();
        }
        for (String s:tests){
            int count = 0;
            String s1=s;
            while(!s1.isEmpty()){
                int length = s1.length();
                s1 = s1.replaceAll(s1.charAt(0)+"","");
                if ((length-s1.length())%2==1)
                    count++;
            }
            if (((s.length()%2==0) && count>0) || ((s.length()%2==1) && count>1)){
                System.out.println(0);
            } else {
                System.out.println(1);
            }
        }
    }
}
