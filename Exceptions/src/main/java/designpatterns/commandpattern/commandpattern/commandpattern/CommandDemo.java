package designpatterns.commandpattern.commandpattern.commandpattern;

//client
public class CommandDemo {

    public static void main(String[] args) {
        Light light = new Light();
        Switch lightSwitch = new Switch();

        Command toggleCommand = new ToggleCommand(light);

        lightSwitch.storeAndExecute(toggleCommand);
    }
}
