package gildedRose;

public class Other extends Item {

  public Other(String name, int sellIn, int quality) {
    super(name, sellIn, quality);
  }

  @Override
  public void updateQualityAndSellin() {
    qualitiyBiggerThan0ThenSub1();
    this.sellIn = this.sellIn - 1;
    qualitiyBiggerThan0ThenSub1();
  }
}
