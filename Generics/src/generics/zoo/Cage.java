package generics.zoo;

public class Cage<E> {

	private E animal1;
	private E animal2;
	
	public E getAnimal1() {
		return animal1;
	}
	public void setAnimal1(E animal1) {
		this.animal1 = animal1;
	}
	public Object getAnimal2() {
		return animal2;
	}
	public void setAnimal2(E animal2) {
		this.animal2 = animal2;
	}
	
	
}
