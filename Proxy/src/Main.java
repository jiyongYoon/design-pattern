public class Main {

    public static void main(String[] args) {
//        Display display = new ScreenDisplay();
        Display display = new BufferDisplay(5);

        display.print("안녕하세요");
        display.print("백엔드 개발자 윤지용입니다.");
        display.print("이 내용은 프록시 패턴 학습 클래스입니다.");
        display.print("Display에 있는 print 메서드는");
        display.print("작업을 위한 시간이 꽤 드는 작업입니다.");
        display.print("따라서 이 작업을 더 빠르게 진행하기 위해서는");
        display.print("이 print할 내용들을 한번에 모아서 print 메서드를 타게 하면 좋겠습니다.");
        display.print("이 작업을 위해 프록시 패턴을 적용해보겠습니다.");

        ((BufferDisplay)display).flush();


    }
}
