package session9;
import java.util.*;

// define pack class
public class Pack {

	// main method
	public static void main(String[] args) {
		// initializing the object of class HDTV

		HDTV o = new HDTV("samsung", 55);
		HDTV o1 = new HDTV("lg", 45);
		HDTV o2 = new HDTV("sony", 48);
		// cresting arrayList to store the objects

		List<HDTV> tv = new ArrayList<HDTV>();
		// adding the objects
		tv.add(o);
		tv.add(o2);
		tv.add(o1);
		// inbuild method of the collection class to sort
		Collections.sort(tv);
		// printing the object
		System.out.println(tv);

	}

}
