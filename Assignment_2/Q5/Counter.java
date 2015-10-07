//Overview: Counter object

public class Counter{
	public int value;
	//AF:
	//"value" variable refers to the value of this Counter object

	//RI:
	//"value" variable cannot be smaller or equals to 0
	public Counter () {
		//Overview: constructor of Counter to create a Counter object
		//Modifier: nil
		//requires: nil
		//EFFECTS: make this contain 0

	}
	public int get () {
		//Overview: return an integer which is the value of this Counter Object
		//Modifier: nil
		//requires: nil
		// EFFECTS: returns the value of this
	}
	public void incr (){
	  //Overview: increase the value of this Counter object.
	  // MODIFIES: this
	  //requires: nil
	  // EFFECTS: increments the value of this
	}
}
