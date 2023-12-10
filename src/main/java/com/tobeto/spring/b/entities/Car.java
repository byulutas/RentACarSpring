package com.tobeto.spring.b.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Table(name="cars")
@Entity
@Data // => @Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Car
{
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @NotEmpty(message = "cannot be empty or null")
    @Min(value = 1990)
    @Column(name="model_year")
    private int modelYear;

    @Column(name="model_name")
    private String modelName;

    // tekil alan ManyToOne - JoinColumn => FK'nın olduğu tablo
    // çoğul alan OneToMany -
    @ManyToOne
    @JoinColumn(name="brand_id")
    private Brand brand;

    @ManyToOne
    @JoinColumn(name="color_id")
    private Color color;

    @OneToMany(mappedBy = "car") // attribute ismi
    @JsonIgnore // Bu alan jsona parse edilirken yok sayılacak.
    private List<RentalCar> rentalcars;
}
