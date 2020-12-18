package models;

import org.junit.Assert;
import org.junit.Test;

public class InputTest {

  @Test
  public void testToString() throws Exception {
    Input input = new Input("King D5");
    Assert.assertEquals("King D5", input.toString());
  }
}
