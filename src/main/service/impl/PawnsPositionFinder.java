package service.impl;

import models.BoardPosition;
import service.PositionsFinder;

import java.util.ArrayList;
import java.util.List;

public class PawnsPositionFinder implements PositionsFinder {
  @Override
  public List<BoardPosition> getPossibleBoardPositionsFrom(BoardPosition startingPosition) {
    return new ArrayList<>();
  }
}
