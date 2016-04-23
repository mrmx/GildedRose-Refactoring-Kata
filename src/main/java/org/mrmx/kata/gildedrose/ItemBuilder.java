package org.mrmx.kata.gildedrose;


/**
 * Item builder
 * 
 * @author mrmx
 */
public class ItemBuilder {
	private String name;
	private int sellIn;
	private int quality;

	public ItemBuilder() {
	}
	
	public ItemBuilder withName(String name) {
		this.name = name;
		return this;
	}
	public ItemBuilder sellsIn(int days) {
		this.sellIn = days;
		return this;
	}
	public ItemBuilder withQuality(int quality) {
		this.quality = quality;
		return this;
	}
	
	public UpdatableItem build() {
		return new UpdatableItem(name,sellIn,quality);
	}
	
}
