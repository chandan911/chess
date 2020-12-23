package main;

import models.BoardPosition;
import models.Input;
import service.InputProcessor;

import java.util.List;
import java.util.Scanner;

public class Application {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter piece type and cell position - ");
    String inputString = scanner.nextLine();
    Input input = new Input(inputString);
    List<BoardPosition> possiblePositions = new InputProcessor(input).getPossibleBoardPositionsFrom(input.getBoardPosition());
    System.out.println("Possible  positions for this piece at this position are - ");
    possiblePositions.forEach(x -> System.out.print(x + " "));
  }

}
