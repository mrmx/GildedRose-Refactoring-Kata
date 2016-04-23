package com.gildedrose;

public class Item {

	private String name;

	private int sellIn;

	private int quality;

	public Item(String name, int sellIn, int quality) {
		this.name = name;
		this.sellIn = sellIn;
		this.quality = quality;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the sellIn
	 */
	public int getSellIn() {
		return sellIn;
	}

	/**
	 * @param sellIn the sellIn to set
	 */
	public void setSellIn(int sellIn) {
		this.sellIn = sellIn;
	}

	/**
	 * @return the quality
	 */
	public int getQuality() {
		return quality;
	}

	/**
	 * @param quality the quality to set
	 */
	public void setQuality(int quality) {
		this.quality = quality;
	}

	@Override
	public String toString() {
		return this.getName() + ", " + this.getSellIn() + ", " + this.getQuality();
	}
}
