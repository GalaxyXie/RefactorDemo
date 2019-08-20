package gildedRose;

public class Roses {

  private static final String AGEBRIE = "Aged Brie";
  private static final String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";
  private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";

  public void getItem(Item item) {
    Item newitem = new Item(new AgedBrie());
    switch (item.name) {
      case AGEBRIE:
        newitem.executeStrategy(item);
      case BACKSTAGE:
        newitem = new Item(new Backstage());
        newitem.executeStrategy(item);
      case SULFURAS:
        newitem = new Item(new Sulfuras());
        newitem.executeStrategy(item);
      default:
        newitem = new Item(new Other());
        newitem.executeStrategy(item);
    }

  }
}
