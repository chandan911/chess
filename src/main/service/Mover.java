package service;

import models.BoardPosition;
import models.MoveDirection;
import models.Row;

import java.util.Arrays;
import java.util.List;

import static models.MoveDirection.*;
import static models.Row.*;

public class Mover {

  private static final List<Row> ALL_ROWS = Arrays.asList(A, B, C, D, E, F, G, H);

  public static BoardPosition move(BoardPosition startingPosition, MoveDirection direction, int numberOfSteps) {
    BoardPosition newPosition = startingPosition;
    if (direction.equals(Forward)) {
      if (startingPosition.getCellNumber() + numberOfSteps <= 8) {
        newPosition = new BoardPosition(startingPosition.getRow(), startingPosition.getCellNumber() + numberOfSteps);
      }
    }
    if (direction.equals(Backward)) {
      if (startingPosition.getCellNumber() - numberOfSteps >= 1) {
        newPosition = new BoardPosition(startingPosition.getRow(), startingPosition.getCellNumber() - numberOfSteps);
      }
    }
    if (direction.equals(SideLeft)) {
      if (ALL_ROWS.indexOf(startingPosition.getRow()) - numberOfSteps >= 0) {
        newPosition = new BoardPosition(ALL_ROWS.get(ALL_ROWS.indexOf(startingPosition.getRow()) - numberOfSteps), startingPosition.getCellNumber());
      }
    }
    if (direction.equals(SideRight)) {
      if (ALL_ROWS.indexOf(startingPosition.getRow()) + numberOfSteps <= 7) {
        newPosition = new BoardPosition(ALL_ROWS.get(ALL_ROWS.indexOf(startingPosition.getRow()) + numberOfSteps), startingPosition.getCellNumber());
      }
    }
    return newPosition;
  }

}
