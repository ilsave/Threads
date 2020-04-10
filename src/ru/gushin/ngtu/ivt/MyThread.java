package ru.gushin.ngtu.ivt;

import java.util.Scanner;

public class MyThread extends  Thread{
    @Override
    public void run() {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        while(true){
            String line = scan.nextLine();
            if("123456".equals(line)) break;
            System.out.println("info from my thread: "+line.length());
        }

    }
}
