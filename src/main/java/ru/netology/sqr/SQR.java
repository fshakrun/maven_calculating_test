package ru.netology.sqr;

public class SQR {

    public int CalculatingsIntegers(int MinValue, int MaxValue) {

        int TotalNumbers =0;

        for (int i = 10; i <=99; i++){
            int square = i*i;

            if (square >= MinValue && square <= MaxValue){

                TotalNumbers++;
            }
        }

        return (TotalNumbers);
    }
}

