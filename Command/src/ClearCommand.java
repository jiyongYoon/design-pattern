public class ClearCommand implements Command {
    @Override
    public void run() {
        System.out.print("\033[H\033[2J"); // 콘솔 화면을 지우는 코드값
        System.out.flush();
    }
}
