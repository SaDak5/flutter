package org.isetn.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

@Entity
public class Classe {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int studentCount;
    private int departmentNumber;

    @OneToMany(mappedBy="classe", cascade = CascadeType.ALL)
    @JsonBackReference
    private List<Etudiant> students;

    // Constructors, Getters, and Setters
    // ...

    public Classe() {
        super();
    }

    public Classe(Long id, String name, int studentCount, List<Etudiant> students, int departmentNumber) {
        super();
        this.id = id;
        this.name = name;
        this.studentCount = studentCount;
        this.students = students;
        this.departmentNumber = departmentNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public List<Etudiant> getStudents() {
        return students;
    }

    public void setStudents(List<Etudiant> students) {
        this.students = students;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }
}
