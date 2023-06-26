package com.matrix.design.templatemethod;

/**
 * author         : Jason Lee
 * date           : 2023-06-26
 * description    :
 */
public class App {

    public static void start(Teacher t) {
        t.수업시작();
    }

    public static void main(String[] args) {
//        Teacher t1 = new Teacher();
//        Teacher t1 = new JavaTeacher();
//        Teacher t2 = new PythonTeacher();
//        t1.수업시작();
//        t2.수업시작();
        JavaTeacher t1 = new JavaTeacher();
        start(t1);

        PythonTeacher t2 = new PythonTeacher();
        start(t2);
    }
}
