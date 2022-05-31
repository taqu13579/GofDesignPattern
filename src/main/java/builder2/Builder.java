package builder2;

public interface Builder {
    public void addSoult(double soultAmount);
    public void addSolvent(double solventAmount);
    public void abandonSolution(double solutionAmount);
    public Object getResult();
}
