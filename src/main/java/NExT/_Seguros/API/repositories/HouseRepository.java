package NExT._Seguros.API.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import NExT._Seguros.API.entities.House;

@Repository
public interface HouseRepository extends JpaRepository<House, Long>{
    
}
