package com.stachura.mojelotto.model;

import java.util.ArrayList;
import java.util.List;

public class Model {
    public int checkMatching(List<Integer> chosenNumbers, List<Integer> lottoNumbers) {
        int numbersMatchedCounter = 0;
        for (int i = 0; i < 6; i++)
            for (int k = 0; k < 6; k++)
                if (chosenNumbers.get(i).equals(lottoNumbers.get(k)))
                    numbersMatchedCounter++;
        return numbersMatchedCounter;
    }

    public List<Integer> generateRandomNumbers() {
        List<Integer> numbers = new ArrayList<>();
        while (numbers.size() < 6) {
            int random = (int) (1 + Math.random() * 59);
            boolean isInArray = false;
            for (int number : numbers)
                if (number == random) {
                    isInArray = true;
                    break;
                }
            if (!isInArray)
                numbers.add(random);
        }
        return numbers;
    }
}
