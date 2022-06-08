package proxy2;

public class Fujiwara implements Teacher {
    private Teacher yamada = new Yamada();

    @Override
    public void question1() {
        System.out.println("それは「~~解答1~~」です。");
    }

    @Override
    public void question2() {
        System.out.println("それは「~~解答2~~」です。");
    }

    @Override
    public void question3() {
        System.out.println("それは");
        yamada.question3();
        System.out.println("です。");
    }
}
