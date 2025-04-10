package behavioraldesignpatterns.commandpattern;

public class CommandPatternExample {
    public static void main(String[] args) {
        Switcher switcher = new Switcher();

        Light light = new Light();
        TurnOnCommand turnOnCommand = new TurnOnCommand(light);
        TurnOffCommand turnOffCommand = new TurnOffCommand(light);

        switcher.addCommand(turnOnCommand);
        switcher.addCommand(turnOffCommand);
    }
}
