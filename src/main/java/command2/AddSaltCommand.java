package command2;

public class AddSaltCommand extends Command {
    @Override
    public void execute() {
        while (beaker.isMelted()) {
            beaker.addSalt(1);
            beaker.mix();
        }
        System.out.println("食塩を1gずつ加える実験");
        beaker.note();
    }
}
