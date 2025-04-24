package dev.java10x.CadastroApi;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_cadastro")
public class ClientModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    int age;
    String address;
    String role;

    public ClientModel(){}


    public ClientModel(String name, int age, String address, String role) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.role = role;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
