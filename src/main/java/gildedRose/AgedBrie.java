package gildedRose;

public class AgedBrie extends Item{

  public AgedBrie(String name, int sellIn, int quality) {
    super(name, sellIn, quality);
  }

  @Override
  public void updateQualityAndSellin() {
    qualitySmallerThan50thenAdd1();
    this.sellIn = this.sellIn - 1;
    if (this.sellIn < 0){
      qualitySmallerThan50thenAdd1();
    }
  }
}
