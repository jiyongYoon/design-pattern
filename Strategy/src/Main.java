public class Main {

    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        Cat cat = new Cat();
        DoorMan doorMan = new DoorMan();
        doorMan.getOut(mouse); // 쥐를 쫓아내다
        // 기본 클래스로는 불가능
        // doorMan.getOut(cat);

        // Cow와 Bird는 Animal을 상속받고, DoorMan은 getOut(Animal animal)을 구현함.
        Cow cow = new Cow();
        Bird bird = new Bird();

        doorMan.getOut(cow); // 소를 쫓아내다
        doorMan.getOut(bird); // 새를 쫓아내다
    }
}
