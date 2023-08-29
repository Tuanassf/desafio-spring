package NExT._Seguros.API.repositories;

import org.springframework.stereotype.Repository;

import NExT._Seguros.API.entities.Insurance;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface InsuranceRepository extends JpaRepository<Insurance, Long>{
    
}
