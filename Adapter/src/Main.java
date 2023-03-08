import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Animal> myPets = new ArrayList<>();
        myPets.add(new Dog("댕댕이"));
        myPets.add(new Cat("냐옹"));
        myPets.add(new Dog("뭉뭉이"));
//        myPets.add(new Tiger("호랭이")); <- 우리가 하고 싶은 것
        myPets.add(new TigerAdapter("호랭이"));

        myPets.forEach(Animal::sound);
    }
}
