
public class AgedBrie extends Item{
    public AgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        incrementQuality();
    }

    @Override
    void incrementQuality() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }

    @Override
    public void markAsExpired() {
        incrementQuality();
    }
}
