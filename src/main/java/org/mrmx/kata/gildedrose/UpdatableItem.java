package org.mrmx.kata.gildedrose;

import com.gildedrose.Item;
import java.util.LinkedList;
import java.util.List;

/**
 * An updatable trait based item
 * 
 * @author mrmx
 */
public class UpdatableItem extends Item {
	private List<UpdatableTrait> traits;
	
	public UpdatableItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
		traits = new LinkedList<UpdatableTrait>();
	}
	
	UpdatableItem withTrait(UpdatableTrait trait) {
		traits.add(trait);
		return this;
	}
	
	public void update() {
		for(UpdatableTrait trait : traits) {			
			trait.update(this);
		}
	}
}
