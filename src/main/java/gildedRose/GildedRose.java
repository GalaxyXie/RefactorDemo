package gildedRose;
public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        Roses roses=new Roses();
        for (int i = 0; i < items.length; i++) {
          items[i].executeStrategy(items[i]);
        }
    }
}