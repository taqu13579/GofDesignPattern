package iterator;

public class Main {
    public static void main(String[] args) {
        ClassRoom classRoom = new ClassRoom(4);
        classRoom.appendStudent(new Student("田中"));
        classRoom.appendStudent(new Student("山田"));
        classRoom.appendStudent(new Student("鈴木"));
        classRoom.appendStudent(new Student("佐藤"));

        Iterator iterator = classRoom.iterator();

        while(iterator.hasNext()) {
            Student student = (Student) iterator.next();
            System.out.println(student.getName());
        }
    }
}
