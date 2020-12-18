package models;

public class BoardPosition {
  private Row row;
  private int cellNumber;

  public BoardPosition(String position) {
    this.row = Row.valueOf(Character.toString(position.charAt(0)));
    this.cellNumber = Character.getNumericValue(position.charAt(1));
  }

  public Row getRow() {
    return row;
  }

  public int getCellNumber() {
    return cellNumber;
  }

  @Override
  public String toString() {
    return row.toString() + cellNumber;
  }
}
