package service.impl;

import models.BoardPosition;
import service.Mover;
import service.PositionsFinder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static models.MoveDirection.*;

public class KingsPositionFinder implements PositionsFinder {
  @Override
  public List<BoardPosition> getPossibleBoardPositionsFrom(BoardPosition startingPosition) {
    BoardPosition afterForwardMove = Mover.move(startingPosition, Forward, 1);
    BoardPosition afterBackwardMove = Mover.move(startingPosition, Backward, 1);
    BoardPosition afterRightMove = Mover.move(startingPosition, SideRight, 1);
    BoardPosition afterLeftMove = Mover.move(startingPosition, SideLeft, 1);
    BoardPosition afterDiagonalRightForwardMove = Mover.move(afterRightMove, Forward, 1);
    BoardPosition afterDiagonalRightBackwardMove = Mover.move(afterRightMove, Backward, 1);
    BoardPosition afterDiagonalLeftForwardMove = Mover.move(afterLeftMove, Forward, 1);
    BoardPosition afterDiagonalLeftBackwardMove = Mover.move(afterLeftMove, Backward, 1);

    ArrayList<BoardPosition> positions = new ArrayList<>(Arrays.asList(
        afterForwardMove,
        afterBackwardMove,
        afterRightMove,
        afterLeftMove,
        afterDiagonalRightForwardMove,
        afterDiagonalRightBackwardMove,
        afterDiagonalLeftForwardMove,
        afterDiagonalLeftBackwardMove));

    return positions.stream().distinct().collect(Collectors.toList());
  }
}
