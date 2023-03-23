package Realstate.realstateproject.service.impl;

import Realstate.realstateproject.entities.Sale;
import Realstate.realstateproject.payload.SaleDto;
import Realstate.realstateproject.repository.SaleRepository;
import Realstate.realstateproject.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaleServiceImpl implements SaleService {

    @Autowired
    private SaleRepository saleRepository;
    @Override
    public SaleDto regSale(SaleDto saleDto) {
        Sale sale = maptoEntity(saleDto);
        Sale saveSale = saleRepository.save(sale);
        SaleDto saleDTO = maptoDto(saveSale);

        return saleDTO;



    }
    public Sale maptoEntity(SaleDto saleDto){
        Sale sale=new Sale();
        sale.setClientReg(saleDto.getClientReg());
        sale.setSaleDate(saleDto.getSaleDate());
        sale.setAgentId(saleDto.getAgentId());

        return sale;




    }
    public SaleDto maptoDto(Sale sale){
        SaleDto saleDto =new SaleDto();
        saleDto.setSaleId(sale.getSaleId());
        saleDto.setSaleDate(sale.getSaleDate());
        saleDto.setAgentId(sale.getAgentId());
        saleDto.setClientReg(sale.getClientReg());

        return saleDto;

    }


}
