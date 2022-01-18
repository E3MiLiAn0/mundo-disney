package com.mundodisney.challengebackend.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name ="charater")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Character extends Base{

    @Column(name="nombre")
    private String nombre;
    @Column(name="edad")
    private int edad;
    @Column(name="peso")
    private int peso;
    @Column(name="historia")
    private String historia;

    @JoinTable(
            name = "rel_character_movie",
            joinColumns = @JoinColumn(name = "FK_CHARACTER", nullable = false),
            inverseJoinColumns = @JoinColumn(name="FK_MOVIE", nullable = false)
    )
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Movie> movies;
}
