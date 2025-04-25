package dev.java10x.CadastroApi.clients;

import dev.java10x.CadastroApi.missoes.MissoesModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_cadastro")
public class ClientModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private Long id;

    private String name;

    private String email;

    private int age;

    // @ManyToOne -- Um ninja tem uma unica missao
    @ManyToOne
    private MissoesModel missoes;


    public ClientModel(){
    }

    public ClientModel(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
