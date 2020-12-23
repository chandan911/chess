package service.impl;

import models.BoardPosition;
import service.Mover;
import service.PositionsFinder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static models.MoveDirection.Forward;

public class PawnsPositionFinder implements PositionsFinder {
  @Override
  public List<BoardPosition> getPossibleBoardPositionsFrom(BoardPosition startingPosition) {
    BoardPosition afterForwardMove = Mover.move(startingPosition, Forward, 1);
    return new ArrayList<>(Collections.singletonList(afterForwardMove));
  }
}
