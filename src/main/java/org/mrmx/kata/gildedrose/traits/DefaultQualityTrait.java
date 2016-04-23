package org.mrmx.kata.gildedrose.traits;

import com.gildedrose.Item;
import org.mrmx.kata.gildedrose.UpdatableTrait;

/**
 * Default quality trait
 *
 * @author mrmx
 */
public class DefaultQualityTrait implements UpdatableTrait {

	protected static final int MAX_QUALITY = 50;

	@Override
	public void update(Item item) {
		updateQuality(item, item.getQuality() + getQualityChangeRate(item));
	}

	protected void updateQuality(Item item, int quality) {
		if (quality >= 0 && quality <= MAX_QUALITY) {
			item.setQuality(quality);
		}
	}

	protected int getQualityChangeRate(Item item) {
		return item.getSellIn() < 0 ? -2 : -1;
	}

}
