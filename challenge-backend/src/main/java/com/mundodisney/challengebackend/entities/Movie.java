package com.mundodisney.challengebackend.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

@Entity
@Table(name ="movie")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Movie extends Base {


    @Column(name="titulo")
    private String titulo;

    @Column(name="fecha_de_creacion")
    private Date fechaDeCreacion;

    @Column(name="calificacion")
    private int calificacion;

    @ManyToMany(mappedBy = "movies")
    private List<Character> characters;
}
