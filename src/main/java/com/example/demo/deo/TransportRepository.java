package com.example.demo.deo;

import com.example.demo.Model.Transport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource

public interface TransportRepository extends JpaRepository<Transport,String> {
}
