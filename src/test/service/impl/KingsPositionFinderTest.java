package service.impl;

import models.BoardPosition;
import org.junit.Test;
import service.PositionsFinder;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class KingsPositionFinderTest {

  private PositionsFinder kingsPositionsFinder = new KingsPositionFinder();

  @Test
  public void getPossibleBoardPositionsFrom() {
    BoardPosition startingPosition = new BoardPosition("D5");
    List<BoardPosition> expectedPositions = Arrays.asList(
        new BoardPosition("D6"),
        new BoardPosition("D4"),
        new BoardPosition("E5"),
        new BoardPosition("C5"),
        new BoardPosition("E6"),
        new BoardPosition("E4"),
        new BoardPosition("C6"),
        new BoardPosition("C4")
    );
    List<BoardPosition> possiblePositionsForKing = kingsPositionsFinder.getPossibleBoardPositionsFrom(startingPosition);
    assertEquals(possiblePositionsForKing, expectedPositions);
  }
}
