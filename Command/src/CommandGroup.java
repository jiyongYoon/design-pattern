import java.util.ArrayList;

public class CommandGroup implements Command {
    private ArrayList<Command> commands = new ArrayList<>();

    public void add(Command command) {
        this.commands.add(command);
    }

    @Override
    public void run() {
        for (Command command : commands) {
            command.run();
        }
    }
}
