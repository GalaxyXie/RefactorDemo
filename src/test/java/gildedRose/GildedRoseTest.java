package gildedRose;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class GildedRoseTest {

  @Test
  public void when_Item_name_not_Equal_Aged_Brie_and_Sulfuras_Hand_of_Ragnaros() {
    Item items[] ={new Item("aaa",1,1)};

    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();
    assertEquals("aaa, 0, 0",gildedRose.items[0].toString());
  }
  @Test
  public void should_return_something_when_da1() {
    Item items[] ={new Item("Sulfuras, Hand of Ragnaros",1,1)};

    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();
    assertEquals("Sulfuras, Hand of Ragnaros, 1, 1",gildedRose.items[0].toString());
  }
  @Test
  public void should_return_something_when_da2() {
    Item items[] ={new Item("Sulfuras, Hand of Ragnaros",1,0)};

    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();
    assertEquals("Sulfuras, Hand of Ragnaros, 1, 0",gildedRose.items[0].toString());
  }
  @Test
  public void should_return_something_when_da3() {
    Item items[] ={new Item("Aged Brie",1,0)};

    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();
    assertEquals("Aged Brie, 0, 1",gildedRose.items[0].toString());
  }
  @Test
  public void should_return_something_when_da4() {
    Item items[] ={new Item("Backstage passes to a TAFKAL80ETC concert",1,0)};

    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();
    assertEquals("Backstage passes to a TAFKAL80ETC concert, 0, 3",gildedRose.items[0].toString());
  }
  @Test
  public void should_return_something_when_da5() {
    Item items[] ={new Item("Backstage passes to a TAFKAL80ETC concert",10,50)};

    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();
    assertEquals("Backstage passes to a TAFKAL80ETC concert, 9, 50",gildedRose.items[0].toString());
  }
  @Test
  public void should_return_something_when_da6() {
    Item items[] ={new Item("Backstage passes to a TAFKAL80ETC concert",11,51)};

    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();
    assertEquals("Backstage passes to a TAFKAL80ETC concert, 10, 51",gildedRose.items[0].toString());
  }
  @Test
  public void should_return_something_when_da7() {
    Item items[] ={new Item("Backstage passes to a TAFKAL80ETC concert",6,50)};

    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();
    assertEquals("Backstage passes to a TAFKAL80ETC concert, 5, 50",gildedRose.items[0].toString());
  }
  @Test
  public void should_return_something_when_da8() {
    Item items[] ={new Item("Backstage passes to a TAFKAL80ETC concert",5,50)};

    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();
    assertEquals("Backstage passes to a TAFKAL80ETC concert, 4, 50",gildedRose.items[0].toString());
  }
  @Test
  public void should_return_something_when_da9() {
    Item items[] ={new Item("Backstage passes to a TAFKAL80ETC concert",6,49)};

    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();
    assertEquals("Backstage passes to a TAFKAL80ETC concert, 5, 50",gildedRose.items[0].toString());
  }
  @Test
  public void should_return_something_when_da10() {
    Item items[] ={new Item("Backstage passes to a TAFKAL80ETC concert",5,49)};

    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();
    assertEquals("Backstage passes to a TAFKAL80ETC concert, 4, 50",gildedRose.items[0].toString());
  }
  @Test
  public void should_return_something_when_da11() {
    Item items[] ={new Item("Aged Brie",-1,49)};

    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();
    assertEquals("Aged Brie, -2, 50",gildedRose.items[0].toString());
  }
  @Test
  public void should_return_something_when_da12() {
    Item items[] ={new Item("Backstage passes to a TAFKAL80ETC concert",-1,49)};

    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();
    assertEquals("Backstage passes to a TAFKAL80ETC concert, -2, 0",gildedRose.items[0].toString());
  }
  @Test
  public void should_return_something_when_da13() {
    Item items[] ={new Item("Sulfuras, Hand of Ragnaros",-1,0)};

    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();
    assertEquals("Sulfuras, Hand of Ragnaros, -1, 0",gildedRose.items[0].toString());
  }
  @Test
  public void should_return_something_when_da14() {
    Item items[] ={new Item("Sulfuras, Hand of Ragnaros",-1,-1)};

    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();
    assertEquals("Sulfuras, Hand of Ragnaros, -1, -1",gildedRose.items[0].toString());
  }
  @Test
  public void should_return_something_when_da15() {
    Item items[] ={new Item("Aged Brie",-1,48)};

    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();
    assertEquals("Aged Brie, -2, 50",gildedRose.items[0].toString());
  }
  @Test
  public void should_return_something_when_da16() {
    Item items[] ={new Item("aaa",-1,49)};

    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();
    assertEquals("aaa, -2, 47",gildedRose.items[0].toString());
  }
}