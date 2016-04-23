package org.mrmx.kata.gildedrose.traits;

import com.gildedrose.Item;

/**
 * Conjured items quality trait
 * 
 * @author mrmx
 */
public class ConjuredQualityTrait extends DefaultQualityTrait {

	@Override
	protected int getQualityChangeRate(Item item) {
		return -2;
	}

	
}
