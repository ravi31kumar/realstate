package Realstate.realstateproject.controller;
import Realstate.realstateproject.payload.SaleDto;
import Realstate.realstateproject.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class SaleController {


        @Autowired
        private SaleService saleService;


        //http://localhost:8080/api/save
        @PostMapping("/save")
        public ResponseEntity<SaleDto> saveClientReg (@RequestBody SaleDto saleDto){
            SaleDto dto = saleService.regSale(saleDto);

            return new ResponseEntity<>(dto, HttpStatus.CREATED);
        }


    }
