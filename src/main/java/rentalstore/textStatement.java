package rentalstore;

public class textStatement extends Statement{
  public String getRenterFooter(double totalAmount, double frequentRenterPoints) {
    String result ="" ;
    result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
    result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
    return result;
  }

  @Override
  protected String renderItem(Rental each, double thisAmount) {
    return "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
  }
}
