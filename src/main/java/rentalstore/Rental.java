package rentalstore;

public class Rental {
    private Movie movie;
    private int dayRented;

    public Rental(Movie movie, int dayRented) {
        this.movie = movie;
        this.dayRented = dayRented;
    }
    public double getFrequentRenterPoint() {
        int priceCode = movie.getPriceCode();
        if (priceCode == Movie.NEW_RELEASE && dayRented > 1)
            return 2;
        if (priceCode == Movie.LITERARY)
            return 1.5;
        return 1;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDayRented() {
        return dayRented;
    }
}
