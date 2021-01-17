package com.example.demo.deo;

import com.example.demo.Model.Trajet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource

public interface TrajetRepository extends JpaRepository<Trajet,Long> {
}
