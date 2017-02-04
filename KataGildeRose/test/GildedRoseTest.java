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
    public void Sellin_updateQuality_decrease() throws Exception {
        GildedRose app = createGildedRose(new Item("any", 3, 1));

        app.updateQuality();

        assertThat(2,is(app.items[0].sellIn));
    }

    @Test
    public void Quality_updateQuality_decrease() throws Exception {
        GildedRose app = createGildedRose(new Item("any", 1, 3));

        app.updateQuality();

        assertThat(2,is(app.items[0].quality));
    }



    @Test
    public void Sellin_is_zero_updateQuality_Quality_decrese_twice_as_fast() throws Exception {
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

}
