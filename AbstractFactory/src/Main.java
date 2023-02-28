public class Main {

    public static void main(String[] args) {
//        ComponentFactory factory = new WindowsFactory();
        ComponentFactory factory = new LinuxFactory();

        Button button = factory.createButton("확인");
        CheckBox checkBox = factory.createCheckBox(true);
        TextEdit textEdit = factory.createTextEdit("디자인패턴");

        button.render();
        checkBox.render();
        textEdit.render();

        int a = 48;
        String b = Integer.toString(a);
        System.out.println(a);
        System.out.println(b);
    }
}
