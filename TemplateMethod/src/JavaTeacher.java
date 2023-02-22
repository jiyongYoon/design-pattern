public class JavaTeacher extends Teacher {

    @Override // 재정의함 -> 오버라이드 할 메서드 (오버라이드 : 부모의 메서드를 무효화하다)
    public void lecture() { // 동적 바인딩이라고 함
        System.out.println("자바 수업을 시작하지");
    }
}
