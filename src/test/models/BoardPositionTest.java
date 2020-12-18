package models;

import org.junit.Assert;
import org.junit.Test;

public class BoardPositionTest {

  @Test
  public void testToString() throws Exception {
    BoardPosition boardPosition = new BoardPosition("D5");
    Assert.assertEquals("D5", boardPosition.toString());
  }
}
