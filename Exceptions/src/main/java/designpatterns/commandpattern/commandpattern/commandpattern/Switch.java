package designpatterns.commandpattern.commandpattern.commandpattern;

//invoker
public class Switch {

    public void storeAndExecute(Command command){
        command.execute();
    }
}
