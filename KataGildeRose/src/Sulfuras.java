
public class Sulfuras extends Item{
    public Sulfuras(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void decreseSellIn() {
        //nullyfies decreseSellIn
    }

    @Override
    void decreseQuality() {
        //nullyfies decreseQuality
    }
}
