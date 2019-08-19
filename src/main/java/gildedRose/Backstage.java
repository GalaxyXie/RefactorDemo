package gildedRose;

public class Backstage extends Item {
  public Backstage(String name, int sellIn, int quality) {
    super(name, sellIn, quality);
  }
  @Override
  public void updateQualityAndSellin() {
    qualitySmallerThan50thenAdd1();
    sellInSmallThan11AndQualitySmallerThan50();
    sellInSmallThan6AndQualityBiggerThan50();
    this.sellIn = this.sellIn - 1;
    if (this.sellIn < 0) {
      this.quality = 0;
    }
  }
}