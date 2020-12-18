package main;

import main.models.BoardPosition;
import main.models.Input;

import java.util.Arrays;
import java.util.Scanner;

public class Application {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter piece type and cell position - ");
    String inputString = scanner.nextLine();
    Input input = new Input(inputString);
    BoardPosition[] possiblePositions = {};
    System.out.println("Possible  positions for this piece at this position are - ");
    Arrays.stream(possiblePositions).forEach(x -> System.out.print(x + " "));
  }

}
