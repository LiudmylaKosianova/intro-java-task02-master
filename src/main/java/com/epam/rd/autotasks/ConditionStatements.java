package com.epam.rd.autotasks;

import java.rmi.UnexpectedException;

class ConditionStatements {

    public static int task2(int n) {
        int sameDigits = n;
        //separate three digits from number n
        int firstD, secondD, thirdD;
        thirdD = n%10;
        n = (n - n%10) / 10;
        secondD = n %10;
        n = (n - n%10) / 10;
        firstD = n%10;

        if(thirdD == secondD && secondD == firstD){
             return sameDigits;
        }

        //find the greatest and the smallest of the tree digits
        int newFirst = Math.max((Math.max(firstD, secondD)), thirdD);
        int newThird = Math.min((Math.min(firstD, secondD)), thirdD);

        //find the second digit that will represent tens
        int newSecond = 0;
        int[]array = {firstD,secondD,thirdD};
        for(int number : array){
            if(number < newFirst && number > newThird){
                newSecond = number;
            }
        }

        return newFirst*100 + newSecond*10 + newThird;
    }
}
