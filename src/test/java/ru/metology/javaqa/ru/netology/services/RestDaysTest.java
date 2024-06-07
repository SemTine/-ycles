package ru.metology.javaqa.ru.netology.services;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RestDaysTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/bonus.csv")
    public void testLimit(int income, int expenses, int threshold) {
        RestDays service = new RestDays();
        int result = service.calculate(income, expenses, threshold);
        System.out.println("Месецев отдыха " + result);
    }

}

