package rentalstore;

import java.util.List;

public abstract class Statement {
  public String getHeader(String name) {
    return "Rental Record for " + name + "\n";
  }
  public double getFrequentRenterPoints(List<Rental>rentals) {
    return rentals.stream().mapToDouble(Rental::getFrequentRenterPoint).sum();
  }
  public double getTotalAmount(List<Rental>rentals) {
    return rentals.stream().mapToDouble(this::getThisAmount).sum();
  }
  public String renderStatementBody(List<Rental> rentals) {
    StringBuilder result = new StringBuilder();
    for (Rental rental : rentals) {
      double itemAmount =getThisAmount(rental);
      result.append(renderItem(rental, itemAmount));
    }
    return result.toString();
  }
  public double getThisAmount(Rental each) {
    double thisAmount = 0;
    switch (each.getMovie().getPriceCode()) {
      case Movie.REGULAR:
        thisAmount += 2;
        if (each.getDayRented() > 2) {
          thisAmount += (each.getDayRented() - 2) * 1.5;
        }
        break;
      case Movie.NEW_RELEASE:
        thisAmount += each.getDayRented() * 3;
        break;
      case Movie.CHILDRENS:
        thisAmount += 1.5;
        if (each.getDayRented() > 3) {
          thisAmount += (each.getDayRented() - 3) * 1.5;
        }
        break;
      case Movie.LITERARY:
        thisAmount += each.getDayRented()*6;
        break;
    }
    return thisAmount;
  }
  public abstract String getRenterFooter(double totalAmount, double frequentRenterPoints) ;
  protected abstract String renderItem(Rental each, double thisAmount);

}
