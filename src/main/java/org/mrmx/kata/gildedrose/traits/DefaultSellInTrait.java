package org.mrmx.kata.gildedrose.traits;

import com.gildedrose.Item;
import org.mrmx.kata.gildedrose.UpdatableTrait;

/**
 * Default sell in trait
 *
 * @author mrmx
 */
public class DefaultSellInTrait implements UpdatableTrait {
	
	@Override
	public void update(Item item) {
		item.setSellIn(item.getSellIn() - 1);
	}
	
}
