package gildedRose;
public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        Roses roses=new Roses();
        for (int i = 0; i < items.length; i++) {
          Item temp=roses.getItem(items[i]);
          temp.updateQualityAndSellin();
          items[i].setQuality(temp.quality);
          items[i].setSellIn(temp.sellIn);
        }
    }
}