public class HDTV implements Comparable<HDTV> {
	// defoning the properties
	private String Brandname;

	private int size;

	// constructor defining
	public HDTV(String Brandname, int size) {
		super();
		this.Brandname = Brandname;

		this.size = size;
		System.out.println(" " + Brandname + "\t " + size + "inch");

	}

	// get method to take the value of brand
	public String getBrandname() {
		return Brandname;
	}

	// set method to set the value of TVnames
	public void setBrandname(String Brandname) {
		this.Brandname = Brandname;

	}

	// get the size
	public int getsize() {
		return size;
	}

	// set the size
	public void setsize(int size) {

		this.size = size;

	}

	// override compareTo method
	public int compareTo(HDTV o) {
		// comparing the size
		int compare = Integer.compare(size, o.size);
		if (compare == 0) {
			// compare the brandname
			compare = Brandname.compareTo(o.Brandname);

			// TODO Auto-generated method stub
		}
		return compare;
	}

	// method to return the string as output
	public String toString() {
		return "Brandname : " + Brandname + " size : " + size + "\n";

	}

}
