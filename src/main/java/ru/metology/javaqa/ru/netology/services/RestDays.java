package ru.metology.javaqa.ru.netology.services;

public class RestDays {

    public int calculate(int income, int expenses, int threshold) {

        int count = 0; // счётчик месяцев отдыха
        int money = 0; // Количесво денег на счету

        for (int month = 0; month < 12; month++) {

            if (money >= threshold) {
                count++;
                money = (money - expenses) / 3;


                System.out.println("Месяц  " + month + " Денег " + money + " Отдыхаю " + " траты - " + expenses + " Затем ещё - ");


            } else {
                money = money + income - expenses;


                System.out.println("Месяц  " + month + " Денег " + money + " Буду работать " + " Заработал + " + income + " Минус траты - " + expenses);

            }
        }

        return count;
    }

}