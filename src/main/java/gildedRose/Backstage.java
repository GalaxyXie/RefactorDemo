package gildedRose;

public class Backstage implements Strategy {
  @Override
  public void updateQualityAndSellin(Item item) {
    item.qualitySmallerThan50thenAdd1();
    item.sellInSmallThan11AndQualitySmallerThan50();
    item.sellInSmallThan6AndQualityBiggerThan50();
    item.sellIn = item.sellIn - 1;
    if (item.sellIn < 0) {
      item.quality = 0;
    }
  }
}