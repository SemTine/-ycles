package ru.metology.javaqa.ru.netology.services;

public class RestDays {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int wallet = 0; // Количесво денег на счету

        for (int month = 1; month <=12; month++) {
         count++;//Увеличивает счётчик месяцев отдыха
            if (wallet >= threshold) {

                wallet = wallet -expenses;

                System.out.println("Месяц  " +count+ " Денег "+wallet+ " Отдыхаю"+"траты - " +expenses+ " Затем ещё -");

            }


            else  {
                wallet = wallet + income -(expenses);


                System.out.println("Месяц  " +month+ " Денег "+wallet+ " Буду работать "+" Заработал + "+income+ " Минус траты -- " +expenses);

            }
        }

        return count;
    }

}