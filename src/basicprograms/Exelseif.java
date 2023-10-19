package basicprograms;

public class Exelseif {
public static void main(String[] args) {
	String lunch="Chicken biryani";
	if(lunch.equals("Veg biryani")) {
		System.out.println("Today my lunch is veg biryani");
	}
	else if(lunch.equals("Chicken biryani")) {
		System.out.println("Today my lunch is chicken biryani");
	}
	else if(lunch.equals("mutton biryani")){
		System.out.println("Today lunch is mutton biryani");
	}
	else if (lunch.equals("fish biryani")) {
		System.out.println("Today lunch is fish biryani");
	}
	else {
		System.out.println("Today no biryani");
	}
}
}
