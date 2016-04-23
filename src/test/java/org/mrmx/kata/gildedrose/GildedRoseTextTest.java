package org.mrmx.kata.gildedrose;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 * GildedRose kata initial text unit testing
 *
 * @author mrmx
 */
public class GildedRoseTextTest {

	static final int DAYS = 5;
	GildedRose app;
	ItemFactory factory;

	@Before
	public void prepare() {
		app = new GildedRose();
		factory = new ItemFactory();
	}

	@Test
	public void testDexteryVest() {
		assertEquals("after 5 days", "+5 Dexterity Vest, 5, 15",
				describeItem(factory.newItem("+5 Dexterity Vest", 10, 20), DAYS));
	}

	@Test
	public void testAgedBrie() {
		assertEquals("after 5 days", "Aged Brie, -3, 8",
				describeItem(factory.newAgedBrie(2, 0), DAYS));
	}

	@Test
	public void testElixirOfTheMongoose() {
		assertEquals("after 5 days", "Elixir of the Mongoose, 0, 2",
				describeItem(factory.newItem("Elixir of the Mongoose", 5, 7), DAYS));
	}

	@Test
	public void testSulfurasHandOfRagnaros() {
		assertEquals("after 5 days", "Sulfuras, Hand of Ragnaros, 0, 80",
				describeItem(factory.newSulfurasHandOfRagnaros(0), DAYS));
		assertEquals("after 5 days", "Sulfuras, Hand of Ragnaros, -1, 80",
				describeItem(factory.newSulfurasHandOfRagnaros(-1), DAYS));
	}

	@Test
	public void testBackstagePasses() {
		assertEquals("after 5 days", "Backstage passes to a TAFKAL80ETC concert, 10, 25",
				describeItem(factory.newBackstagePassItem("Backstage passes to a TAFKAL80ETC concert", 15, 20), DAYS));
		assertEquals("after 5 days", "Backstage passes to a TAFKAL80ETC concert, 5, 50",
				describeItem(factory.newBackstagePassItem("Backstage passes to a TAFKAL80ETC concert", 10, 49), DAYS));
		assertEquals("after 5 days", "Backstage passes to a TAFKAL80ETC concert, 0, 50",
				describeItem(factory.newBackstagePassItem("Backstage passes to a TAFKAL80ETC concert", 5, 49), DAYS));
	}
	
	@Test
	public void testConjure() {
		assertEquals("after 5 days", "Conjured Mana Cake, -2, 0",
				describeItem(factory.newConjuredItem("Conjured Mana Cake", 3, 6), DAYS));
		assertEquals("after 5 days", "Conjured Rain Cake, -2, 40",
				describeItem(factory.newConjuredItem("Conjured Rain Cake", 3, 50), DAYS));
	}

	String describeItem(UpdatableItem item, int days) {
		app.add(item);
		for (int i = 0; i < days; i++) {
			app.updateQuality();
		}
		return item.toString();
	}

}
