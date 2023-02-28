public class Main {
    public static void main(String[] args) {
        CommandGroup commandGroup = new CommandGroup();

        Command clearCmd = new ClearCommand();
        commandGroup.add(clearCmd);

        Command yellowColorCmd = new ColorCommand(ColorCommand.Color.YELLOW);
        commandGroup.add(yellowColorCmd);

        Command moveCmd = new MoveCommand(10, 1);
        commandGroup.add(moveCmd);

        Command printCmd = new PrintCommand("이것은 커멘드 패턴입니다.");
        commandGroup.add(printCmd);

        Command greenCmd = new ColorCommand(ColorCommand.Color.GREEN);
        commandGroup.add(greenCmd);

        printCmd = new PrintCommand("나는 왜 위치가 안바뀌는 것인가?");
        commandGroup.add(printCmd);

        commandGroup.add(clearCmd);

        commandGroup.run();

    }
}
