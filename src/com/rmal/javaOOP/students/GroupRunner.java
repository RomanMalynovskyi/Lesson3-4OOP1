package com.rmal.javaOOP.students;


import java.io.File;
import java.util.Arrays;

public class GroupRunner {

    public static void main(String[] args) {
        // Create group
        Group group = new Group();

        // Interactive adding of students
        group.interactiveAddStudent();

        // Print out group of students
        // System.out.println(group);

        //Getting students for army
        //  Voenkom voenkom = new Group();
        //  voenkom.getStudentForArmy(group);

        // Print out student`s group for army
        // System.out.println(Arrays.toString(voenkom.getStudentForArmy(group)));

        // Save group in file
        group.safeGroupInFile("c:/Task2/Student group.doc");

        //Get group from file
        File file = new File("c:/Task2/Student group.doc");
        Group fromFile = group.getGroupFromFile(file);
        System.out.println(fromFile);
        
    }
}
