package sampleTest;

public class RootApplet {
	public static void main(String[] arguments) {
		 String title = "The Piano";
	        int year = 1993;
	        String director = "Jane Campion";
	        String role1 = "Ada";
	        String actor1 = "Holly Hunter";
	        String role2 = "Baines";
	        String actor2 = "Harvey Keitel";
	        String role3 = "Stewart";
	        String actor3 = "Sam Neill";
	        String role4 = "Flora";
	        String actor4 = "Anna Paquin";
	        // display information
	        System.out.println(title + " (" + year + ")\n" +
	            "A " + director.toUpperCase() + " film.\n\n" +
	            role1 + "\t" + actor1.toUpperCase() + "\n" +
	            role2 + "\t" + actor2.toUpperCase() + "\n" +
	            role3 + "\t" + actor3.toUpperCase() + "\n" +
	            role4 + "\t" + actor4.toUpperCase());
	    }
}
