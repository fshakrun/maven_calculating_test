package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRTest {

    @ParameterizedTest
    @CsvSource (value = {"range 200 - 300, 200, 300, 3"})  //Диапазон 200 - 300, итоговое число совпадений 3


    void shouldComparisonOfSquaresOfTwoDigitNumbers(String SQRTest,int MinValue, int MaxValue, int expected) {
        SQR service = new SQR();
         int actual = service.CalculatingsIntegers(MinValue, MaxValue);          //Вызов метода подсчета
        assertEquals(expected, actual);                                                     //Тест
    }
}