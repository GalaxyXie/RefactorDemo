package gildedRose;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class GildedRoseTest {

  @Test
  public void when_Item_name_isOther_and_quality_is_BIggerThan0_test() {
    Item items[] ={new Item("aaa",1,1)};

    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();
    assertEquals("aaa, 0, 0",gildedRose.items[0].toString());
  }
  @Test
  public void when_Item_name_isSulfuras() {
    Item items[] ={new Item("Sulfuras, Hand of Ragnaros",1,1)};

    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();
    assertEquals("Sulfuras, Hand of Ragnaros, 1, 1",gildedRose.items[0].toString());
  }

  @Test
  public void when_Item_name_is_Aged_Brie_and_quality_is_equal_0_and_sellin_equal_0_test() {
    Item items[] ={new Item("Aged Brie",1,0)};

    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();
    assertEquals("Aged Brie, 0, 1",gildedRose.items[0].toString());
  }
  @Test
  public void when_Item_name_is_Backstage_and_quality_is_equal_0_test_and_sellin_is_bigger_than_0_test() {
    Item items[] ={new Item("Backstage passes to a TAFKAL80ETC concert",1,0)};

    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();
    assertEquals("Backstage passes to a TAFKAL80ETC concert, 0, 3",gildedRose.items[0].toString());
  }
  @Test
  public void when_Item_name_is_Backstage_and_quality_is_equal_50_test_and_sellin_is_bigger_than_0_test() {
    Item items[] ={new Item("Backstage passes to a TAFKAL80ETC concert",10,50)};

    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();
    assertEquals("Backstage passes to a TAFKAL80ETC concert, 9, 50",gildedRose.items[0].toString());
  }
  @Test
  public void when_Item_name_is_Backstage_and_quality_is_bigger_than_50_test_and_sellin_is_bigger_than_0_test() {
    Item items[] ={new Item("Backstage passes to a TAFKAL80ETC concert",11,51)};

    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();
    assertEquals("Backstage passes to a TAFKAL80ETC concert, 10, 51",gildedRose.items[0].toString());
  }
  @Test
  public void when_Item_name_is_Backstage_and_quality_is_equal_50_test_and_sellin_is_equal_6_test() {
    Item items[] ={new Item("Backstage passes to a TAFKAL80ETC concert",6,50)};

    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();
    assertEquals("Backstage passes to a TAFKAL80ETC concert, 5, 50",gildedRose.items[0].toString());
  }
  @Test
  public void  when_Item_name_is_Backstage_and_quality_is_equal_50_test_and_sellin_is_samller_than_6_test(){
    Item items[] ={new Item("Backstage passes to a TAFKAL80ETC concert",5,50)};

    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();
    assertEquals("Backstage passes to a TAFKAL80ETC concert, 4, 50",gildedRose.items[0].toString());
  }
  @Test
  public void  when_Item_name_is_Backstage_and_quality_is_smaller_than_50_test_and_sellin_is_equal_6_test(){
    Item items[] ={new Item("Backstage passes to a TAFKAL80ETC concert",6,49)};

    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();
    assertEquals("Backstage passes to a TAFKAL80ETC concert, 5, 50",gildedRose.items[0].toString());
  }
  @Test
  public void when_Item_name_is_Backstage_and_quality_is_smaller_than_50_test_and_sellin_is_smaller_than_6_test(){
    Item items[] ={new Item("Backstage passes to a TAFKAL80ETC concert",5,49)};

    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();
    assertEquals("Backstage passes to a TAFKAL80ETC concert, 4, 50",gildedRose.items[0].toString());
  }
  @Test
  public void when_Item_name_is_Aged_Brie_and_quality_is_smaller_than_50_test_and_sellin_is_smaller_than_0_test() {
    Item items[] ={new Item("Aged Brie",-1,49)};

    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();
    assertEquals("Aged Brie, -2, 50",gildedRose.items[0].toString());
  }
  @Test
  public void when_Item_name_is_Backstage_and_quality_is_smaller_than_50_test_and_sellin_is_smaller_than_0_test(){
    Item items[] ={new Item("Backstage passes to a TAFKAL80ETC concert",-1,49)};

    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();
    assertEquals("Backstage passes to a TAFKAL80ETC concert, -2, 0",gildedRose.items[0].toString());
  }
  @Test
  public void when_Item_name_is_Sulfuras(){
    Item items[] ={new Item("Sulfuras, Hand of Ragnaros",-1,0)};

    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();
    assertEquals("Sulfuras, Hand of Ragnaros, -1, 0",gildedRose.items[0].toString());
  }

  @Test
  public void when_Item_name_is_Aged_Brie_and_quality_is_equal_48_test_and_sellin_is_smaller_than_0_test() {
    Item items[] ={new Item("Aged Brie",-1,48)};

    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();
    assertEquals("Aged Brie, -2, 50",gildedRose.items[0].toString());
  }

 @Test
  public void when_Item_name_is_Ohter_and_quality_is_smaller_than_50_test_and_sellin_is_smaller_than_0_test(){
    Item items[] ={new Item("aaa",-1,49)};

    GildedRose gildedRose = new GildedRose(items);
    gildedRose.updateQuality();
    assertEquals("aaa, -2, 47",gildedRose.items[0].toString());
  }
}
