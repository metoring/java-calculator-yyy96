import domain.Calculator;
import domain.Converter;
import domain.NumberSentence;
import domain.Number;
import errors.InvalidInputException;
import view.InputView;
import view.OutputView;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        NumberSentence numberSentence = createNumberSentence();

        Calculator calculator = new Calculator();
        Number result = calculator.calculateNumberSentence(numberSentence);

        OutputView outputView = new OutputView();
        outputView.showCalculateResult(result.toString());
    }

    private static NumberSentence createNumberSentence() {
        try {
            InputView inputView = new InputView(new Scanner(System.in));
            String sentence = inputView.receiveInput();

            Converter converter = new Converter();
            return converter.getNumberSentence(sentence);
        } catch (NumberFormatException e) {
            System.out.println("There is something not number in number place");
            return createNumberSentence();
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
            return createNumberSentence();
        }
    }
}
