package models;

public enum Row {
  A("A"),
  B("B"),
  C("C"),
  D("D"),
  E("E"),
  F("F"),
  G("G"),
  H("H");

  private String row;

  Row(String row) {
    this.row = row;
  }

  @Override
  public String toString() {
    return row;
  }
}
