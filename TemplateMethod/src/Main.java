public class Main {
    public static void main(String[] args) {
        Teacher jt = new JavaTeacher();
        Teacher pt = new PythonTeacher();

        System.out.println("[1월 1일]");
        System.out.println("===1교시===");
        jt.수업하기();
        System.out.println("===2교시===");
        pt.수업하기();
        System.out.println("===끝===");
        System.out.println();

        System.out.println("[1월 2일]");
        System.out.println("===1교시===");
        start(pt);
        System.out.println("===2교시===");
        start(jt);
        System.out.println("===끝===");
    }

    public static void start(Teacher t) {
        t.수업하기();
    }
}
