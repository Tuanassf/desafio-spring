package NExT._Seguros.API.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class Insurance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column( nullable = false )
    private String type;
    @Column( nullable = false )
    private int risk;
    @Column( nullable = false )
    private String analysis;

    private String observation;
    
    @Column( nullable = false )
    private Date createdAt;
    @Column( nullable = false )
    private Date upDateAt;

}
