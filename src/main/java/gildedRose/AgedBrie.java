package gildedRose;

public class AgedBrie implements Strategy{

  public AgedBrie() {
  }

  @Override
  public void updateQualityAndSellin(Item item) {
    item.qualitySmallerThan50thenAdd1();
    item.sellIn = item.sellIn - 1;
    if (item.sellIn < 0){
      item.qualitySmallerThan50thenAdd1();
    }
  }
}
