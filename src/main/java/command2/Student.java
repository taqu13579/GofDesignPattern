package command2;

public class Student {
    public static void main(String[] args) {
        Command addSalt = new AddSaltCommand();
        Command addWater = new AddWaterCommand();
        Command makeSaltWater = new MakeSaltWaterCommand();

        addSalt.setBeaker(new Beaker(100,0));
        addWater.setBeaker(new Beaker(0, 10));
        makeSaltWater.setBeaker(new Beaker(90, 10));

        addSalt.execute();
        addWater.execute();
        makeSaltWater.execute();
    }
}
