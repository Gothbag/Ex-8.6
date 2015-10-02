import java.util.Iterator;
import java.util.LinkedHashSet;

/*
 * created by Gothbag <josemariacagigalso@gmail.com>
 * this represents a list of cars in which no element can be repeated and whose elements will be
 * properly sorted
 *  
 */

public class CarLinkedHashSet {
	
	public static void main(String[] args) {
		//1
		//declarations
		LinkedHashSet<Car> cars = new LinkedHashSet<Car>(5);
		
		//2
		//we add the cars
		cars.add(new Car("Alfa Romeo", "Giulia", 2900, 6));
		Car dacii = new Car("Dacia", "Sandero", 1200, 4);
		cars.add(dacii);
		cars.add(new Car("Ford", "Focus", 2000, 4));
		cars.add(new Car("Opel", "Insignia", 2200, 4));
		Car ibizi = new Car("Seat", "Ibiza", 1600, 4);
		cars.add(ibizi);
		
		//3
		//the Hyundai is added to the list
		Car hyundi = new Car("Hyundai", "Atos", 1500, 3);
		cars.add(hyundi);
		Car focci = new Car("Ford", "Focus", 2000, 4);
		//the Ford Focus is appended to the list
		cars.add(focci);
		
		//4
		//we obtain the details of each car using an iterator
		Iterator<Car> carIt = cars.iterator();
		while (carIt.hasNext()) {
			Car c = carIt.next();
			System.out.println(c.toString());
		}
		//5
		//yes, they're appear to be sorted on a FIFO basis 
		
	}

}
