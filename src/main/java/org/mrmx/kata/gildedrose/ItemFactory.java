package org.mrmx.kata.gildedrose;

import org.mrmx.kata.gildedrose.traits.ConjuredQualityTrait;
import org.mrmx.kata.gildedrose.traits.AgedBrieQualityTrait;
import org.mrmx.kata.gildedrose.traits.BackstagePassQualityTrait;
import org.mrmx.kata.gildedrose.traits.DefaultQualityTrait;
import org.mrmx.kata.gildedrose.traits.DefaultSellInTrait;
import org.mrmx.kata.gildedrose.traits.SulfurasQualityTrait;

/**
 * Item factory
 *
 * @author mrmx
 */
public class ItemFactory {

	public UpdatableItem newItem(String name, int sellIn, int quality) {
		return new UpdatableItem(name, sellIn, quality)
				.withTrait(new DefaultQualityTrait())
				.withTrait(new DefaultSellInTrait());
	}

	public UpdatableItem newAgedBrie(int sellIn, int quality) {
		return new UpdatableItem("Aged Brie", sellIn, quality)				
				.withTrait(new DefaultSellInTrait())
				.withTrait(new AgedBrieQualityTrait());
	}

	public UpdatableItem newSulfurasHandOfRagnaros(int sellIn) {
		return new UpdatableItem("Sulfuras, Hand of Ragnaros", sellIn, 80)
				.withTrait(new SulfurasQualityTrait());
	}
	
	public UpdatableItem newBackstagePassItem(String name,int sellIn, int quality) {
		return new UpdatableItem(name, sellIn, quality)
				.withTrait(new BackstagePassQualityTrait())
				.withTrait(new DefaultSellInTrait());
	}

	public UpdatableItem newConjuredItem(String name,int sellIn, int quality) {
		return new UpdatableItem(name, sellIn, quality)
				.withTrait(new ConjuredQualityTrait())
				.withTrait(new DefaultSellInTrait());
	}

}
