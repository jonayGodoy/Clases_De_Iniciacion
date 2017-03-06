
public class Transaction_ {

    private String date;
    private int amount;

    public Transaction_(String date, int amount) {

        this.date = date;
        this.amount = amount;

    }

    public String date() {
        return date;
    }

    public int amount() {
        return amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Transaction_ that = (Transaction_) o;

        if (amount != that.amount) return false;
        return date != null ? date.equals(that.date) : that.date == null;

    }

    @Override
    public int hashCode() {
        int result = date != null ? date.hashCode() : 0;
        result = 31 * result + amount;
        return result;
    }
}
