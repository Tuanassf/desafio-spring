package NExT._Seguros.API.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@NonNull
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column( nullable = false ) // cria esse campo no banco de dados como not null
    private String name;
    
    @Column( nullable = false ) 
    private int age;
   
    @Column( nullable = false ) 
    private int dependents;
  
    @Column( nullable = false ) 
    private double income;

    @Column( nullable = false ) 
    private String marital_status;
    
    private Date createdAt;
    private Date upDateAt;

    @OneToMany
    private List<Vehicle> vehicles;
    @OneToMany
    private List<Address> addresses;
    @OneToMany
    private List<House> houses;
    @OneToMany
    private List<Insurance> insurances;
}

