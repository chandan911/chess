package service;

import models.BoardPosition;
import models.Input;

import java.util.List;

public class InputProcessor {

  private PositionsFinder positionsFinder;

  public InputProcessor(Input input) {
    this.positionsFinder = PositionsFinder.createPositionsFinder(input.getPieceType());
  }

  public List<BoardPosition> getPossibleBoardPositionsFrom(BoardPosition startingPosition) {
    return positionsFinder.getPossibleBoardPositionsFrom(startingPosition);
  }

}
