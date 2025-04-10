package commandpattern;

import java.util.ArrayList;
import java.util.List;

// invoker
public class Switcher {
    private final List<Command> commands;

    public Switcher() {
        this.commands = new ArrayList<>();
    }

    public void addCommand(Command command) {
        this.commands.add(command);
    }

    public void executeCommands() {
        for(Command command: commands) {
            command.execute();
        }
    }
}
