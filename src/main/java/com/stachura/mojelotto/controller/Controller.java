package com.stachura.mojelotto.controller;

import com.stachura.mojelotto.model.Model;
import com.stachura.mojelotto.view.View;

import java.util.List;

public class Controller {
    private final View view = new View();
    private final Model model = new Model();

    public void control() {
        List<Integer> chosenNumbers = model.generateRandomNumbers(),
                lottoNumbers = model.generateRandomNumbers();
        long counter = 0, numbersMatched;
        while (counter < 6) {
            counter++;
            numbersMatched = model.checkMatching(chosenNumbers, lottoNumbers);
            view.printString("Try no." + counter + ". Numbers matched this time: " + numbersMatched);
        }
        view.printString("Your numbers were: " + chosenNumbers + "\nLotto numbers were: " + lottoNumbers
                + "\nYou won in " + counter + " tries!");
    }
}
