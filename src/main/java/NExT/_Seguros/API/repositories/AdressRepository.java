package NExT._Seguros.API.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import NExT._Seguros.API.entities.Address;

@Repository
public interface AdressRepository extends JpaRepository<Address, Long>{
    
}
