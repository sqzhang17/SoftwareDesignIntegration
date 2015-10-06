// Overview: A "Customer" object keeps track of a customer's basic
// information such as name, and location, and maintains a record of
// all books purchased along with the prices paid

public class Customer {

    public Customer(String my_firstName, String my_lastName, String my_loc, String my_zip) {
	//Overview: This constructor initializes a customer object
	//with the name and location information but without any book
	//information

	//Requires: my_firstName <> null && my_lastName <> null &&
	//my_loc <> null && my_zip <> null
	//Modifiers: nil
	//Effects: object initialization with name and location only
    }

    public void addBook(Book my_book, float my_pay) {
	//Overview: This method appends a book object to the array of
	//purchased books along with its purchasing price

	//Requires: my_book <> null && my_py >0
	//Modifiers: nil

	//Effects: append a new element to the booksPurchased array;
	//append the corrsponding price paid to the payments array;
	//and update the counter
    }

    public float calc_lifetime_pay() {
	//Overview: This method calculates the total payment for all
	//the books purchased

	//Requires: nil
	//Modifiers: nil
	//Effects: returns a float that is the total payment
    }
}
