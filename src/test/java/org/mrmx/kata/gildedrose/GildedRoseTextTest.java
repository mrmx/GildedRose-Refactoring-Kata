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
		assertEquals("after 5 days", "+5 Dexterity Vest, 5, 15", describeItem(factory.newItem("+5 Dexterity Vest", 10, 20), DAYS));
	}

	@Test
	public void testAgedBrie() {
		assertEquals("after 5 days", "Aged Brie, -3, 8", describeItem(factory.newAgedBrie(2, 0), DAYS));
	}

	@Test
	public void testElixirOfTheMongoose() {
		assertEquals("after 5 days", "Elixir of the Mongoose, 0, 2", describeItem(factory.newItem("Elixir of the Mongoose", 5, 7), DAYS));
	}

	@Test
	public void testSulfurasHandOfRagnaros() {
		assertEquals("after 5 days", "Sulfuras, Hand of Ragnaros, 0, 80", describeItem(factory.newSulfurasHandOfRagnaros(0), DAYS));
		assertEquals("after 5 days", "Sulfuras, Hand of Ragnaros, -1, 80", describeItem(factory.newSulfurasHandOfRagnaros(-1), DAYS));
	}

	String describeItem(UpdatableItem item, int days) {
		app.add(item);
		for (int i = 0; i < days; i++) {
			app.updateQuality();
		}
		return item.toString();
	}

}
