package Realstate.realstateproject.service.impl;

import Realstate.realstateproject.entities.ClientReg;
import Realstate.realstateproject.payload.ClientRegDto;
import Realstate.realstateproject.repository.ClientRegRepository;
import Realstate.realstateproject.service.ClientRegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class ClientRegServiceImpl implements ClientRegService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private ClientRegRepository clientRegRepository;



    @Override
    public void saveUser(ClientRegDto clientRegDto) {
        ClientReg client = maptoEntity(clientRegDto);
        clientRegRepository.save(client);

    }
    public ClientReg maptoEntity(ClientRegDto clientRegDto){
        ClientReg client=new ClientReg();
        client.setClientId(clientRegDto.getClientId());
        client.setAddress(clientRegDto.getAddress());
        client.setName(clientRegDto.getName());
        client.setEmail(clientRegDto.getEmail());
        client.setGender(clientRegDto.getGender());
        client.setUsername(clientRegDto.getUsername());
        client.setPassword(passwordEncoder.encode(clientRegDto.getPassword()));

        return client;


    }
}
