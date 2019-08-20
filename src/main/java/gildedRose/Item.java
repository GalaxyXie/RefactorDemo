package gildedRose;

public class Item  {

  public String name;

  public int sellIn;

  public int quality;
  public Strategy strategy;
  public void setSellIn(int sellIn) {

    this.sellIn = sellIn;
  }

  public Item(Strategy strategy) {
    this.strategy = strategy;
  }

  public void setQuality(int quality) {
    this.quality = quality;
  }

  public Item(String name, int sellIn, int quality) {
    this.name = name;
    this.sellIn = sellIn;
    this.quality = quality;
  }
  public void executeStrategy(Item item){
    strategy.updateQualityAndSellin(item);
  }
  @Override
  public String toString() {
    return this.name + ", " + this.sellIn + ", " + this.quality;
  }

  public void qualitySmallerThan50thenAdd1() {
    if (this.quality < 50) {
      this.quality = this.quality + 1;
    }
  }

  public void sellInSmallThan11AndQualitySmallerThan50() {
    if (this.sellIn < 11) {
      qualitySmallerThan50thenAdd1();
    }
  }

  public void sellInSmallThan6AndQualityBiggerThan50() {
    if (this.sellIn < 6 ) {
      qualitySmallerThan50thenAdd1();
    }
  }
  public void qualitiyBiggerThan0ThenSub1() {
    if (this.quality > 0 ) {
      this.quality = this.quality - 1;
    }
  }
}
