package org.mrmx.kata.gildedrose.traits;

import com.gildedrose.Item;

/**
 *
 * @author mrmx
 */
public class AgedBrieQualityTrait extends DefaultQualityTrait {

	@Override
	protected int getQualityChangeRate(Item item) {
		return item.getSellIn() < 0 ? 2 : 1;
	}
	
}
