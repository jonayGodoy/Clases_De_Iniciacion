import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {


    private GildedRose createGildedRose(Item item) {
        Item[] items = new Item[] {item};
        return new GildedRose(items);
    }


    @Test
    public void foo() {
        GildedRose app = createGildedRose(new Item("foo", 0, 0));

        app.updateQuality();

        assertEquals("foo", app.items[0].name);
    }


    @Test
    public void sellin_updateQuality_decrease() throws Exception {
        GildedRose app = createGildedRose(new Item("any", 3, 1));

        app.updateQuality();

        assertThat(2,is(app.items[0].sellIn));
    }

    @Test
    public void quality_updateQuality_decrease() throws Exception {
        GildedRose app = createGildedRose(new Item("any", 1, 3));

        app.updateQuality();

        assertThat(2,is(app.items[0].quality));
    }



    @Test
    public void sellin_is_zero_updateQuality_Quality_decrese_twice_as_fast() throws Exception {
        Item item = new Item("caducate", 0, 3);
        GildedRose app = createGildedRose(item);

        app.updateQuality();

        assertThat(1,is(app.items[0].quality));
    }

    @Test
    public void quality_never_is_negative() throws Exception {
        Item item = new Item("neverNegative", 0, 0);
        GildedRose app = createGildedRose(item);

        app.updateQuality();

        assertThat(0,is(app.items[0].quality));
    }

    @Test
    public void ageBried_quality_increment_the_older() throws Exception {
        Item item = new AgedBrie("Aged Brie", 0, 0);
        GildedRose app = createGildedRose(item);

        app.updateQuality();

        assertThat(2,is(app.items[0].quality));
    }

    @Test
    public void limit_maximo_quality_50() throws Exception {
        Item item = new AgedBrie("Aged Brie", 10, 50);
        GildedRose app = createGildedRose(item);

        app.updateQuality();

        assertThat(50,is(app.items[0].quality));
    }

    @Test
    public void sufures_updateQuality_never_decrese_quality() throws Exception {
        Item item = new Sulfuras("Sulfuras, Hand of Ragnaros", 10, 40);
        GildedRose app = createGildedRose(item);

        app.updateQuality();

        assertThat(40,is(app.items[0].quality));
    }

    @Test
    public void backstage_sellin_less_10_increment_twice_quick_quality() throws Exception {
        Item item = new Backstage("Backstage passes to a TAFKAL80ETC concert", 10, 40);
        GildedRose app = createGildedRose(item);

        app.updateQuality();

        assertThat(42,is(app.items[0].quality));
    }

    @Test
    public void backstage_sellin_less_5_increment_quality_by_3() throws Exception {
        Item item = new Backstage("Backstage passes to a TAFKAL80ETC concert", 5, 40);
        GildedRose app = createGildedRose(item);

        app.updateQuality();

        assertThat(43,is(app.items[0].quality));
    }

    @Test
    public void backstage_updateQuality_increment_quality() throws Exception {
        Item item = new Backstage("Backstage passes to a TAFKAL80ETC concert", 20, 40);
        GildedRose app = createGildedRose(item);

        app.updateQuality();

        assertThat(41,is(app.items[0].quality));
    }

    @Test
    public void backstage_sellin_is_0_quality_is_0() throws Exception {
        Item item = new Backstage("Backstage passes to a TAFKAL80ETC concert", 0, 40);
        GildedRose app = createGildedRose(item);

        app.updateQuality();

        assertThat(0,is(app.items[0].quality));
    }

    @Test
    public void Conjured_updateQuality_decrese_quality_by_3() throws Exception {
        Item item = new Conjured("Conjured", 5, 40);
        GildedRose app = createGildedRose(item);

        app.updateQuality();

        assertThat(38,is(app.items[0].quality));
    }
}
