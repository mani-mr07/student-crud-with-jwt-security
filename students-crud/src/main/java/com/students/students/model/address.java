package com.students.students.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "address")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String street;
    private String city;
    private String state;
    private String nation;
    private Long pincode;

    @ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.PERSIST)
    @JoinColumn(name = "student_id", nullable = false)
//    It ignore the student details because in address field it dont need to print student again
    @JsonIgnore
    private student student;
}
