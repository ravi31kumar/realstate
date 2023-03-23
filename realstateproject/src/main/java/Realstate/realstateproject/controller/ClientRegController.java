package Realstate.realstateproject.controller;


import Realstate.realstateproject.payload.ClientRegDto;
import Realstate.realstateproject.service.ClientRegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/clientreg")
public class ClientRegController {

    @Autowired
    private ClientRegService clientRegService;


    //http://localhost:8080/api/clientreg/create
    @PostMapping("/create")
    public ResponseEntity<String> saveClientReg (@RequestBody ClientRegDto clientRegDto){
        clientRegService.saveUser(clientRegDto);
        return new ResponseEntity<>("registration created successfully", HttpStatus.CREATED);
    }




}