package gildedRose;
public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            //not Aged Brie,Backstage passes to a TAFKAL80ETC concert,not Sulfuras, Hand of Ragnaros

            if (!items[i].name.equals("Aged Brie")
                    && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                //is other
                notSulfurasAndqualitiyBiggerThan0(items[i]);
            } else {
                //is Aged Brie or Backstage passes
                qualitySmallerThan50thenAdd1(items[i]);
            }
            //is Aged Brie or Backstage passes，other
            whenNameIsNotSulfuras(items[i]);

            if (items[i].sellIn < 0) {
                if (!items[i].name.equals("Aged Brie"))
                    if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        items[i].quality = 0;
                    } else {
                        notSulfurasAndqualitiyBiggerThan0(items[i]);
                    }
                else if (items[i].quality < 50)
                    items[i].quality = items[i].quality + 1;
            }
        }
    }

    public void whenNameIsNotSulfuras(Item item) {
        if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
            item.sellIn = item.sellIn - 1;
        }
    }

    public void qualitySmallerThan50thenAdd1(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
            sellRoseNamedBackstagepasses(item);
        }
    }

    public void sellRoseNamedBackstagepasses(Item item) {
        if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            sellInSmallThan11AndQualitySmallerThan50(item);
            sellInSmallThan6AndQualityBiggerThan50(item);
        }
    }

    public void sellInSmallThan11AndQualitySmallerThan50(Item item) {
        if (item.sellIn < 11 && 50 > item.quality)
            item.quality = item.quality + 1;
    }

    public void sellInSmallThan6AndQualityBiggerThan50(Item item) {
        if (item.sellIn < 6 && item.quality < 50)
            item.quality = item.quality + 1;
    }

    public void notSulfurasAndqualitiyBiggerThan0(Item item) {
        if (item.quality > 0 && !item.name.equals("Sulfuras, Hand of Ragnaros")) {
            item.quality = item.quality - 1;
        }
    }
}