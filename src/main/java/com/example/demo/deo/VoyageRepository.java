package com.example.demo.deo;

import com.example.demo.Model.Voyage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface VoyageRepository extends JpaRepository<Voyage,String> {
}
