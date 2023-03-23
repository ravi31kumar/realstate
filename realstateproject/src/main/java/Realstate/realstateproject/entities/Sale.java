package Realstate.realstateproject.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;



@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long saleId;

    @OneToOne
    @JoinColumn(name = "clientId")
    private ClientReg clientReg;

    private Long agentId;

    private String saleDate;


}

