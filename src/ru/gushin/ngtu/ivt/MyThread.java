package ru.gushin.ngtu.ivt;

import java.util.Scanner;

public class MyThread extends  Thread{
    @Override
    public void run() {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        while(true){
            String line = scan.nextLine();
            if("stop".equals(line)) break;
            i = i + line.length();
            System.out.println("число символов: "+ i );
        }

    }
}
