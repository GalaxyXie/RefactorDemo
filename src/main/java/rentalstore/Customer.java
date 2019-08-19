package rentalstore;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public String getName() {
        return name;
    }

    public String statement() {

        Statement statement=new textStatement();
        String result =statement.getHeader(getName());
        double totalAmount =statement.getTotalAmount(rentals);

        double frequentRenterPoints=statement.getFrequentRenterPoints(rentals);
        result+=statement.renderStatementBody(rentals);
        result+=statement.getRenterFooter(totalAmount, frequentRenterPoints);
        return result;
    }




}
