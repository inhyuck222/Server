
public class AnimalFactory {
	public static Animal createAnimal(String type){
		Animal animal;
		switch(type){
		case "cat" :
			animal = new Cat();
			return animal;
		case "dog" :
			animal = new Dog();
			return animal;	
		default :
			System.out.println("enter the correct name");
			return null;		
		}		
	} 
}
