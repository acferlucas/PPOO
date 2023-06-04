package command;

public class LightsOnCommand implements Command {

    Light light;
    LightsOnCommand(Light ligh) {
        this.light = ligh;
    }
    @Override
    public void execute() {
        System.out.println(this.light.on());
    }
}
