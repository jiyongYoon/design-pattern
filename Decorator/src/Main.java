public class Main {
    public static void main(String[] args) {
        Strings strings = new Strings();

        strings.add("Hello");
        strings.add("My name is jyyoon");
        strings.add("This time, I'm learning decorator patterns.");
        strings.add("Actually, I don't know where to use it...");

        strings.print();
        System.out.println();

        Item decorator = new SideDecorator(strings, '\"');
        decorator.print();
        System.out.println();

        decorator = new LineNumberDecorator(decorator);
        decorator.print();
        System.out.println();

        decorator = new BoxDecorator(decorator);
        decorator.print();
        System.out.println();
    }
}
