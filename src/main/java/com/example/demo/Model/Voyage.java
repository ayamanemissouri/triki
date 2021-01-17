package com.example.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
public class Voyage {

    @Id

    private String nom;
    @OneToMany
    private List<Trajet> trajetList=new ArrayList<>();
}
