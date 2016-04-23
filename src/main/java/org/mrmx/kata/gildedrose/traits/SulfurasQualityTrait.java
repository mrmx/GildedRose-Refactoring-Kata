package org.mrmx.kata.gildedrose.traits;

import com.gildedrose.Item;
import org.mrmx.kata.gildedrose.UpdatableTrait;

/**
 * Sulfuras, Hand of Ragnaros quality trait
 * 
 * @author mrmx
 */
public class SulfurasQualityTrait implements UpdatableTrait {

	@Override
	public void update(Item item) {
		//Sulfuras never changes its quality
		item.setQuality(80);
	}
	
}
