package dev.java10x.CadastroApi.clients;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ClientController {

    @GetMapping("/myRoute")
    public String boasVindas(){
        return "Essa é a minha primeira mensagem";
    }


}
