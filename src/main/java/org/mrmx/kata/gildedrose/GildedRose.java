package org.mrmx.kata.gildedrose;

import java.util.LinkedList;
import java.util.List;

/**
 * GildedRose kata result
 * 
 * @author mrmx
 */
public class GildedRose {
	private List<UpdatableItem> items;

	public GildedRose() {
		items = new LinkedList<UpdatableItem>();
	}
	
	public void add(UpdatableItem item) {
		items.add(item);
	}
	
	public void updateQuality() {
		for(UpdatableItem item : items) {
			item.update();
		}
	}
}
