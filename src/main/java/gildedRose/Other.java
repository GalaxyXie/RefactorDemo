package gildedRose;

public class Other implements Strategy {
  @Override
  public void updateQualityAndSellin(Item item) {
    item.qualitiyBiggerThan0ThenSub1();
    item.sellIn = item.sellIn - 1;
    item.qualitiyBiggerThan0ThenSub1();
  }
}
