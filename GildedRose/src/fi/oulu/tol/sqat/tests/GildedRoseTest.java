package fi.oulu.tol.sqat.tests;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import fi.oulu.tol.sqat.GildedRose;
import fi.oulu.tol.sqat.Item;

public class GildedRoseTest {

	@Test
	public void testTheTruth() {
		assertTrue(true);
	}
	@Test
	public void exampleTest() {
		//create an inn, add an item, and simulate one day
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("+5 Dexterity Vest", 10, 20));
		inn.oneDay();
		
		//access a list of items, get the quality of the one set
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		
		//assert quality has decreased by one
		assertEquals("Failed quality for Dexterity Vest", 19, quality);
	}
	
	@Test
	public void brieTest() {
		
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Aged Brie", 2, 0));
		inn.oneDay();
		
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		
		assertEquals("Failed quality for Aged Brie", 1, quality);
	}
	
	@Test
	public void brieTest2() {
		
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Aged Brie", 2, 0));
		
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		
		assertEquals("Failed quality for Aged Brie", 4, quality);
	}
	
	@Test
	public void ticketTest1() {
		
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
		inn.oneDay();
		
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		
		assertEquals("Failed quality for Ticket", 21, quality);

	}
	
	@Test
	public void ticketTest2() {
		
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
		
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		
		assertEquals("Failed quality for Ticket", 27, quality);

	}
	
	@Test
	public void ticketTest3() {
		
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
		
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		
		assertEquals("Failed quality for Ticket", 38, quality);
	}
	
	@Test
	public void ticketTest4() {
		
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
		
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		
		assertEquals("Failed quality for Ticket", 0, quality);
	}
	
	@Test
	public void spoilTest() {
		
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Elixir of the Mongoose", 5, 7));
		
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		
		
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		
		assertEquals("Failed quality for Elixir of the Mongoose", 0, quality);
	}
	
	@Test
	public void conjureTest() {
		//create an inn, add an item, and simulate one day
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Conjured Mana Cake", 3, 6));
		inn.oneDay();
		
		//access a list of items, get the quality of the one set
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		
		//assert quality has decreased by one
		assertEquals("Failed quality for Conjured Mana Cake", 4, quality);
	}
	
	@Test
	public void sulfurasTest() {
		//create an inn, add an item, and simulate one day
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
		inn.oneDay();
		
		//access a list of items, get the quality of the one set
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		
		//assert quality has decreased by one
		assertEquals("Failed quality for Sulfuras", 80, quality);
	}
}
