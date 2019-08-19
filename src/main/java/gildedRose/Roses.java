package gildedRose;

public class Roses {

  private static final String AGEBRIE = "Aged Brie";
  private static final String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";
  private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";

  public Item getItem(Item item) {
    switch (item.name) {
      case AGEBRIE:
        return new AgedBrie(item.name, item.sellIn, item.quality);
      case BACKSTAGE:
        return new Backstage(item.name, item.sellIn, item.quality);
      case SULFURAS:
        return new Sulfuras(item.name, item.sellIn, item.quality);
      default:
        return new Other(item.name, item.sellIn, item.quality);
    }

  }
}
