public abstract class Decorator extends Item {
    protected Item item; // 사용할 객체. 즉, 장식할 객체를 필드로 갖는다. 여기서는 자기 자신도 장식을 또 할 수 있다.
    public Decorator(Item item) {
        this.item = item;
    }
}
