package service;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import service.impl.*;

import static models.PieceType.*;

public class PositionsFinderTest {

  @Test
  public void createPositionsFinderTest() {
    PositionsFinder positionsFinder = PositionsFinder.createPositionsFinder(King);
    Assert.assertThat(positionsFinder, CoreMatchers.instanceOf(KingsPositionFinder.class));
    positionsFinder = PositionsFinder.createPositionsFinder(Queen);
    Assert.assertThat(positionsFinder, CoreMatchers.instanceOf(QueensPositionsFinder.class));
    positionsFinder = PositionsFinder.createPositionsFinder(Bishop);
    Assert.assertThat(positionsFinder, CoreMatchers.instanceOf(BishopsPositionsFinder.class));
    positionsFinder = PositionsFinder.createPositionsFinder(Horse);
    Assert.assertThat(positionsFinder, CoreMatchers.instanceOf(HorsesPositionsFinder.class));
    positionsFinder = PositionsFinder.createPositionsFinder(Rook);
    Assert.assertThat(positionsFinder, CoreMatchers.instanceOf(RooksPositionsFinder.class));
    positionsFinder = PositionsFinder.createPositionsFinder(Pawn);
    Assert.assertThat(positionsFinder, CoreMatchers.instanceOf(PawnsPositionFinder.class));
  }
}
