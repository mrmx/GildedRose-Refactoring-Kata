package org.mrmx.kata.gildedrose;

import org.mrmx.kata.gildedrose.traits.AgedBrieQualityTrait;
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
		return defaultSellInTraitItem(name, sellIn, quality)				
				.withTrait(new DefaultQualityTrait());
	}

	public UpdatableItem newAgedBrie(int sellIn, int quality) {
		return defaultSellInTraitItem("Aged Brie", sellIn, quality)
				.withTrait(new AgedBrieQualityTrait());
	}

	private UpdatableItem defaultSellInTraitItem(String name, int sellIn, int quality) {
		return new UpdatableItem(name, sellIn, quality)
				.withTrait(new DefaultSellInTrait());
	}

	public UpdatableItem newSulfurasHandOfRagnaros(int sellIn) {
		return new UpdatableItem("Sulfuras, Hand of Ragnaros", sellIn, 80)
				.withTrait(new SulfurasQualityTrait());
	}

}
