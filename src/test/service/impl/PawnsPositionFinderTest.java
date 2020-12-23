package service.impl;

import models.BoardPosition;
import org.junit.Test;
import service.PositionsFinder;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PawnsPositionFinderTest {

  private PositionsFinder pawnsPositionsFinder = new PawnsPositionFinder();

  @Test
  public void getPossibleBoardPositionsFrom() {
    BoardPosition startingPosition = new BoardPosition("D5");
    List<BoardPosition> expectedPositions = Collections.singletonList(new BoardPosition("D6"));
    List<BoardPosition> possiblePositionsForPawn = pawnsPositionsFinder.getPossibleBoardPositionsFrom(startingPosition);
    assertEquals(possiblePositionsForPawn, expectedPositions);
  }
}
