package visitor;

import java.util.List;

public class RookieTeacher extends Teacher {
    List students;

    public RookieTeacher(List students) {
        this.students = students;
    }

    @Override
    public void visit(Home studentHome) {
        System.out.println("こんにちは");
    }

    @Override
    public void visit(TanakaHome studentHome) {
        studentHome.praisedChild();
    }

    @Override
    public void visit(SuzukiHome studentHome) {
        studentHome.reprovedChild();
    }
}
