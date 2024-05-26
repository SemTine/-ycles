package ru.metology.javaqa.ru.netology.services;

public class Main {
    public static void main(String[] args) {
        RestDays server = new RestDays();
        int income = 10_000;
        int expenses = 3000;
        int threshold = 20_000;

         int days = server.calculate(income,expenses,threshold);

    }
}