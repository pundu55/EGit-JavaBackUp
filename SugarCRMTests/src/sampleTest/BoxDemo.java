package sampleTest;

class Box {
	 double width;
	 double height;
	 double depth;	 
	 
	 double volume () { 
		 return width * height * depth;
		 }
	 
	 //set dimensions of box 
	 Box(double w, double h, double d) { 
		 width = w;
		 height = h; 
		 depth = d;
	 }
}
 class BoxDemo {
	 public  static void main(String arg[]) { 
	Box mybox1 = new Box(30,20,14);
	double vol;
	
	vol = mybox1.volume();
	
	 System.out.println("Volume is " + vol);
	
	 }
 }

 