package pl.sda.zadania_05_25.Factory_Method;

public class AnimalFactory {
    public Animal create (String animalType){
        if(animalType.equals("Kot")){
            return new Cat();
        }
        if (animalType.equals("Pies")){
            return  new Dog();
        } else {
            return  null;
        }

    }
}
