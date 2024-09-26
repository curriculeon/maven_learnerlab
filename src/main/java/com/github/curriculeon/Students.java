package com.github.curriculeon;
/* The class should be an _unextendable_ subclass of the `People` class.
        * The class should _statically instantiate_ a `final` field named `INSTANCE` of type `Students`.
        * The class should define a _private nullary constructor_ which populates the `INSTANCE` field with respective `Student` representations of your colleagues.
        * Each student should have a _relatively_ unique `id` field.
        * The class should define a `getInstance` method which returns the `INSTANCE` field.
*/
public final class Students extends People<Student> {
    private static Students INSTANCE;
    private Students(){
        String[] studentNames = new String[]{"Tanya", "Kevin", "Sana","Chris","Pranathi","James"};
        for (int i = 0; i < studentNames.length; i++) {
            String studentName = studentNames[i];
            Student student = new Student(i, studentName, 0.0);
            super.add(student);
        }
    }

    public static Students getInstance() {
        if(INSTANCE != null) {
            return INSTANCE;
        }
        INSTANCE = new Students();
        return INSTANCE;
    }

    @Override
    public Student[] toArray() {
        Student[] students=new Student[INSTANCE.count()];
        int i=0;
        for (Student st:INSTANCE) {
            students[i]=st;
            i++;
        }
        return students;
    }
}
