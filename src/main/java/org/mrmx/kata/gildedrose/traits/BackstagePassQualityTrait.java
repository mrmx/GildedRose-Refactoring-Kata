package org.mrmx.kata.gildedrose.traits;

import com.gildedrose.Item;

/**
 * Backstage passes quality trait
 *
 * @author mrmx
 */
public class BackstagePassQualityTrait extends DefaultQualityTrait {

	@Override
	protected int getQualityChangeRate(Item item) {
		int sellIn = item.getSellIn();
		if (sellIn <= 10) {
			return 2;
		} else if (sellIn <= 5) {
			return 3;
		}
		return 1;
	}

	@Override
	protected void updateQuality(Item item, int quality) {
		if (item.getSellIn() < 0) {
			quality = 0;
		}
		super.updateQuality(item, quality);
	}

}
