package rentalstore;

import static org.junit.Assert.*;
import org.junit.Test;
import rentalstore.Customer;
import rentalstore.Movie;
import rentalstore.Rental;

public class CustomerTest {
  @Test
  public void should_return_statementInfo_when_customer_rent_REGULAR_2days(){
    Customer customer=new Customer("Laura");
    Rental rental=new Rental(new Movie("hunger game",Movie.REGULAR),2);

    customer.addRental(rental);
    String result=customer.statement();
    String statement="Rental Record for Laura\n"
        + "\thunger game\t2.0\n"
        + "Amount owed is 2.0\n"
        + "You earned 1.0 frequent renter points";

    assertEquals(statement,result);
  }
  @Test
  public void should_return_statementInfo_when_customer_rent_REGULAR_3days(){
    Customer customer=new Customer("Laura");
    Rental rental=new Rental(new Movie("hunger game",Movie.REGULAR),3);

    customer.addRental(rental);
    String result=customer.statement();
    String statement="Rental Record for Laura\n"
        + "\thunger game\t3.5\n"
        + "Amount owed is 3.5\n"
        + "You earned 1.0 frequent renter points";

    assertEquals(statement,result);
  }

  @Test
  public void should_return_statementInfo_when_customer_rent_Movie_NEW_RELEASE(){
    Customer customer=new Customer("Laura");
    Rental rental=new Rental(new Movie("hunger game2",Movie.NEW_RELEASE),2);

    customer.addRental(rental);
    String result=customer.statement();
    String statement="Rental Record for Laura\n"
        + "\thunger game2\t6.0\n"
        + "Amount owed is 6.0\n"
        + "You earned 2.0 frequent renter points";
    assertEquals(statement,result);
  }

  @Test
  public void should_return_statementInfo_when_customer_rent_Movie_CHILDRENS_3days(){
    Customer customer=new Customer("Laura");
    Rental rental=new Rental(new Movie("Prince",Movie.CHILDRENS),3);

    customer.addRental(rental);
    String result=customer.statement();
    String statement="Rental Record for Laura\n"
        + "\tPrince\t1.5\n"
        + "Amount owed is 1.5\n"
        + "You earned 1.0 frequent renter points";
    assertEquals(statement,result);
  }

  @Test
  public void should_return_statementInfo_when_customer_rent_Movie_CHILDRENS_4days(){
    Customer customer=new Customer("Laura");
    Rental rental=new Rental(new Movie("Prince",Movie.CHILDRENS),4);

    customer.addRental(rental);
    String result=customer.statement();
    String statement="Rental Record for Laura\n"
        + "\tPrince\t3.0\n"
        + "Amount owed is 3.0\n"
        + "You earned 1.0 frequent renter points";
    assertEquals(statement,result);
  }

  @Test
  public void should_return_statementInfo_when_customer_rent_all_new_RELEASE_and_day_equals_1(){
    Customer customer=new Customer("Laura");
    Rental rental1=new Rental(new Movie("Prince1",Movie.NEW_RELEASE),1);

    customer.addRental(rental1);
    String result=customer.statement();
    String statement="Rental Record for Laura\n"
        + "\tPrince1\t3.0\n"
        + "Amount owed is 3.0\n"
        + "You earned 1.0 frequent renter points";
    assertEquals(statement,result);
  }

  @Test
  public void should_return_statementInfo_when_customer_rent_3_typeMovie(){
    Customer customer=new Customer("Laura");
    Rental rental1=new Rental(new Movie("Prince1",Movie.REGULAR),5);
    Rental rental2=new Rental(new Movie("Prince2",Movie.NEW_RELEASE),5);
    Rental rental3=new Rental(new Movie("Prince3",Movie.CHILDRENS),5);
    customer.addRental(rental1);
    customer.addRental(rental2);
    customer.addRental(rental3);
    String result=customer.statement();
    String statement="Rental Record for Laura\n"
        + "\tPrince1\t6.5\n"
        + "\tPrince2\t15.0\n"
        + "\tPrince3\t4.5\n"
        + "Amount owed is 26.0\n"
        + "You earned 4.0 frequent renter points";
    assertEquals(statement,result);
  }
}