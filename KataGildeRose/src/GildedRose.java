class GildedRose {

	Item[] items;

	public GildedRose(Item[] items) {
		this.items = items;
	}




	public void updateQuality() {
		for (Item item:items) {
			updateItem(item);
		}
	}

	private void updateItem(Item item) {
		item.decreseSellIn();

		item.updateQuality();

		if (item.hasExpired()) {
			item.markAsExpired();
		}

	}


}
