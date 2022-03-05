package com.example.build_calculator;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField textField;

    private String firstNumber = "";

    private String currentNumber = "";
    private String calculationType;

    @FXML
    private void addAction() {
        calculationSetup("+");
    }

    @FXML
    private void minusAction() {
        calculationSetup("-");
    }

    @FXML
    private void divideAction() {
        calculationSetup("/");
    }

    @FXML
    private void multiplicationAction() {
        calculationSetup("*");
    }

    private void calculationSetup(String calculationType) {
        this.calculationType = calculationType;
        firstNumber = currentNumber;
        currentNumber = "";
    }

    @FXML
    private void calculate() {
        int firstNumberInt = Integer.parseInt(firstNumber);
        int secondNumberInt = Integer.parseInt(currentNumber);

        switch (calculationType) {
            case "+" -> {
                int calculatedNumber = firstNumberInt + secondNumberInt;
                textField.setText(String.valueOf(calculatedNumber));
            }
            case "-" -> {
                int calculatedNumber = firstNumberInt - secondNumberInt;
                textField.setText(String.valueOf(calculatedNumber));
            }
            case "/" -> {
                double calculatedNumber = firstNumberInt / (double) secondNumberInt;
                textField.setText(String.valueOf(calculatedNumber));
            }
            case "*" -> {
                int calculatedNumber = firstNumberInt * secondNumberInt;
                textField.setText(String.valueOf(calculatedNumber));
            }
        }
    }

    @FXML
    private void clearTextField() {
        currentNumber = "";
        textField.setText("");
    }

    @FXML
    private void button0Clicked() {
        if(!currentNumber.equals("")) {
            addNumber("0");
        }
    }

    @FXML
    private void button1Clicked() {
        addNumber("1");
    }

    @FXML
    private void button2Clicked() {
        addNumber("2");
    }

    @FXML
    private void button3Clicked() {
        addNumber("3");
    }

    @FXML
    private void button4Clicked() {
        addNumber("4");
    }

    @FXML
    private void button5Clicked() {
        addNumber("5");
    }

    @FXML
    private void button6Clicked() {
        addNumber("6");
    }

    @FXML
    private void button7Clicked() {
        addNumber("7");
    }

    @FXML
    private void button8Clicked() {
        addNumber("8");
    }

    @FXML
    private void button9Clicked() {
        addNumber("9");
    }

    private void updateTextField() {
        textField.setText(currentNumber);
    }

    private void addNumber(String number) {
        currentNumber += number;
        updateTextField();
    }
}