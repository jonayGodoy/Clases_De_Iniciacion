/**
 * Created by Usuario on 11/02/2017.
 */
public class Conjured extends Item{
    public Conjured(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    void decreseQuality() {
        if (quality > 0) {
            if (name.equals(CONJURED)) {
                quality = quality - 2;
            }
        }
    }
}
