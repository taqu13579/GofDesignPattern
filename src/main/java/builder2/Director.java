package builder2;

import java.util.Optional;

public class Director {
    private Builder builder;
    public Director (Builder builder) {
        this.builder = builder;
    }

    public void constract() {
        builder.addSolvent(100);
        builder.addSoult(40);
        builder.abandonSolution(70);
        builder.addSolvent(100);
        builder.addSoult(15);
    }
}
