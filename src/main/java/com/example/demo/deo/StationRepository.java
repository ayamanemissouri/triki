package com.example.demo.deo;

import com.example.demo.Model.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource

public interface StationRepository extends JpaRepository<Station,String> {
}
