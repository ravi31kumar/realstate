package Realstate.realstateproject.payload;

import Realstate.realstateproject.entities.ClientReg;
import lombok.Data;

import java.util.Date;


@Data
public class SaleDto {
    private Long saleId;

    private Long agentId;
    private String saleDate;
    private ClientReg clientReg;



}

