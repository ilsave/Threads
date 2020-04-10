package ru.gushin.ngtu.ivt;

public class UnderCover {
    public static void launcher() {
        System.out.println("Условие остновки - stop");
        new MyThread().start();
        System.out.println("Поток запущен, начинайте вводить строки");
    }
}
