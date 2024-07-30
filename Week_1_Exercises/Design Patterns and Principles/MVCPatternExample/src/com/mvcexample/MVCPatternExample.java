package com.mvcexample;

public class MVCPatternExample {
    public static void main(String[] args) {

        Student model = retrieveStudentFromDatabase();


        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

 
        controller.setStudentName("John Doe");
        controller.setStudentGrade("A");

        controller.updateView();
    }

    private static Student retrieveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Robert");
        student.setId("10");
        student.setGrade("B");
        return student;
    }
}
