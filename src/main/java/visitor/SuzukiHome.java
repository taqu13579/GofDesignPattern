package visitor;

public class SuzukiHome extends Home implements TeacherAcceptor {
    @Override
    public Object praisedChild() {
        System.out.println("あら、、");
        return new Object();
    }

    @Override
    public Object reprovedChild() {
        System.out.println("うちのこは、、");
        return null;
    }

    public void accept(Teacher teacher) {
        teacher.visit(this);
    }
}
