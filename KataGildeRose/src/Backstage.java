
public class Backstage extends Item{
    public Backstage(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
      incrementQuality();
    }

    @Override
    public void markAsExpired() {
        quality = 0;
    }

    @Override
    void incrementQuality() {
        if (sellIn < 11) {
            if (sellIn < 11 && sellIn > 6) {
                quality = quality + 2;
            }

            if (sellIn < 6) {
                quality = quality + 3;
            }
        }else{
            quality = quality + 1;
        }
    }
}
