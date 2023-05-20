package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> chosenNumbers = sixNumbersRandomizer(), lottoNumbers = sixNumbersRandomizer();
        long counter = 0, numbersMatched;
        while (counter < 6) {
            counter++;
            numbersMatched = numbersMatched(chosenNumbers, lottoNumbers);
            System.out.println("Try no." + counter + ". Numbers matched this time: " + numbersMatched);
        }
        System.out.println("Your numbers were: " + chosenNumbers + "\nLotto numbers were: " + lottoNumbers
                + "\nYou won in " + counter + " tries!");
    }

    private static List<Integer> sixNumbersRandomizer() {
        List<Integer> numbers = new ArrayList<>();
        while (numbers.size() < 6) {
            int random = (int) (1 + Math.random() * 59);
            boolean isInArray = false;
            for (int number : numbers)
                if (number == random)
                    isInArray = true;
            if (!isInArray)
                numbers.add(random);
        }
        return numbers;
    }

    private static int numbersMatched(List<Integer> aList, List<Integer> bList) {
        int numbersMatched = 0;
        for (int i = 0; i < 6; i++)
            for (int k = 0; k < 6; k++)
                if (aList.get(i).equals(bList.get(k)))
                    numbersMatched++;
        return numbersMatched;
    }
}