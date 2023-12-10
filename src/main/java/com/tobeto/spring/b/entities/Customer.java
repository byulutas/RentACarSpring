package com.tobeto.spring.b.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "customers")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "registration_date")
    private Date registration_date;

    @OneToMany(mappedBy = "Customer") // attribute ismi
    @JsonIgnore // Bu alan jsona parse edilirken yok sayılacak.
    private List<Customer> customers;
}
