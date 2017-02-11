public class Item {
    public static final String CONJURED = "Conjured";


    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    public void updateQuality() {
            decreseQuality();
    }

    public void markAsExpired() {
        decreseQuality();
    }

    public boolean hasExpired() {
        return sellIn < 0;
    }

    public void decreseSellIn() {
            sellIn = sellIn - 1;
    }

     void decreseQuality() {
        if (quality > 0) {
           quality = quality - 1;
        }
    }

     void incrementQuality() {
        if (quality < 50) {
                quality = quality + 1;
            }
    }

}
