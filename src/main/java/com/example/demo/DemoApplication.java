package com.example.demo;

import com.example.demo.Model.*;
import com.example.demo.deo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalTime;
import java.util.Date;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private VilleRepository villeRepository;
    @Autowired
    private TransportRepository transportRepository;
    @Autowired
    private TrajetRepository trajetRepository;

    @Autowired
    private VoyageRepository voyageRepository;
    @Autowired
    private StationRepository stationRepository;
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Ville rabat=new Ville("Rabat",null);
        Ville casa=new Ville("Casablanca",null);
        Ville fes=new Ville("Fes",null);
        Ville mohammadia=new Ville("Mohammadia",null);
        Ville temara=new Ville("Temara",null);
        Ville skhirate=new Ville("Skhirate",null);
        Transport train=new Transport("Train");
        Transport bus=new Transport("Bus");
        Transport taxi=new Transport("Taxi");
        Trajet rabatTemara=new Trajet(null,LocalTime.of(14,15,15),LocalTime.of(15,16,17),rabat,temara);
        Trajet temaraMohammadia=new Trajet(null,LocalTime.of(15,16,17),LocalTime.of(15,30,17),temara,mohammadia);
        Trajet MohammadiaCasa=new Trajet(null,LocalTime.of(15,30,17),LocalTime.of(15,59,17),mohammadia,casa);
        villeRepository.save(rabat);
        villeRepository.save(casa);
        villeRepository.save(fes);
        villeRepository.save(mohammadia);
        villeRepository.save(temara);
        villeRepository.save(skhirate);
        transportRepository.save(train);
        transportRepository.save(bus);
        transportRepository.save(taxi);
        trajetRepository.save(rabatTemara);
        trajetRepository.save(temaraMohammadia);
        trajetRepository.save(MohammadiaCasa);
        Voyage rabatCasa=new Voyage();
        rabatCasa.setNom("Rabat-Casa");
        rabatCasa.getTrajetList().add(rabatTemara);
        rabatCasa.getTrajetList().add(temaraMohammadia);
        rabatCasa.getTrajetList().add(MohammadiaCasa);
        voyageRepository.save(rabatCasa);
        Station s=new Station();
        s.setNom("Casa Port");
        s.setTransport(train);
        s.getVoyages().add(rabatCasa);
        stationRepository.save(s);



    }
}
