package models;

public enum PieceType {
  King("King"),
  Queen("Queen"),
  Bishop("Bishop"),
  Horse("Horse"),
  Rook("Rook"),
  Pawn("Pawn");

  private String type;

  PieceType(String type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return type;
  }
}
