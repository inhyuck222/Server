
public class Main {

	public static void main(String[] args) {
		Animal animal = AnimalFactory.createAnimal("cat");
		animal.description();
	}

}