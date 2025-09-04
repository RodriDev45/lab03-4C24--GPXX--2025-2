package org.example.controller;

import java.util.ArrayList;
import java.util.List;

public class StudentController {

    private final List<String> students = new ArrayList<>();

    public void addStudent(String name) {
        students.add(name);
        System.out.println("Estudiante agregado: " + name);
    }

    public List<String> getAllStudents() {
        return students;
    }

    public String getStudentByIndex(int index) {
        if (index >= 0 && index < students.size()) {
            return students.get(index);
        }
        return "Estudiante no encontrado";
    }

    public boolean removeStudent(String name) {
        return students.remove(name);
    }
}
