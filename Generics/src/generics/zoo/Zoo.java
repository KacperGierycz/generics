package generics.zoo;

public class Zoo {

	public static void main(String[] args) {
		
	//	Cage<Monkey> cage = new Cage<Monkey>(new Monkey(), new Lion());
		Cage<Monkey> cage = new Cage<Monkey>(new Monkey(), new Monkey());
	//	Cage<Monkey> cage = new Cage<Monkey>();
//		  Cage<Monkey> cage = new Cage(); 
//		  cage.setAnimal1(new Monkey());
//		  cage.setAnimal2(new Monkey());
			
			Cage<Lion> lionCage= new Cage();
			lionCage.setAnimal1(new Lion());
			lionCage.setAnimal2(new Lion());
	
			Monkey monkey1 =new Monkey ();
			Monkey monkey2 =new Monkey ();
			Cage.isCompatible(monkey1,monkey2);
			
	}
	
}
