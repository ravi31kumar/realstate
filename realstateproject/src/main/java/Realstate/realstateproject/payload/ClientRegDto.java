package Realstate.realstateproject.payload;


import lombok.Data;

@Data
public class ClientRegDto {

    private Long clientId;
    private String name;
    private String address;
    private String email;
    private String gender;
    private String username;
    private String password;
}
