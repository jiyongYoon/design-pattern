public abstract class Teacher {
    private void in() {
        System.out.println("교실 입장");
    }

    private void check() {
        System.out.println("출석 부르기");
    }

    // 오버라이드 될 메서드
    abstract void lecture();

    private void out() {
        System.out.println("교실 퇴장");
    }

    // 위 메서드들을 캡슐화한 메서드
    public void 수업하기() {
        in();
        check();
        lecture();
        out();
    }
}
