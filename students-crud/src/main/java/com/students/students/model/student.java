package com.students.students.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "student")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentid;

    private String name;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<address> addresses=new HashSet<>();

    public Long getStudentid() {
        return studentid;
    }
    public void setName(String name) {
        this.name=name;
    }

    public  String getName() {
        return name;
    }

    public Set<address> getAddresses() {
        return addresses;
    }
}
