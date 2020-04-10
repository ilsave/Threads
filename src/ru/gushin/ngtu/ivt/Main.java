package ru.gushin.ngtu.ivt;

public class Main {

    public static void main(String[] args) {
        System.out.println("Условие остновки - набор 123456");
	    MyThread th1 = new MyThread();
        th1.start();
        System.out.println("Поток запущен, начинайте вводить строки");
    }
}
