package com.epam.rd.autotasks;

import java.rmi.UnexpectedException;

class ConditionStatements {

    public static int task2(int n) {
        int firstD, secondD, thirdD;
        thirdD = n%10;
        n = (n - n%10) / 10;
        secondD = n %10;
        n = (n - n%10) / 10;
        firstD = n%10;

        int newFirst = Math.max((Math.max(firstD, secondD)), thirdD);
        int newThird = Math.min((Math.min(firstD, secondD)), thirdD);



        int answer = newFirst*100 + newThird;

        return 0;
    }
}
