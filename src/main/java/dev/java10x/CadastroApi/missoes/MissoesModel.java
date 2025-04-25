package dev.java10x.CadastroApi.missoes;

import dev.java10x.CadastroApi.clients.ClientModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes_ninjas")
public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String rank;



    // @OneToMany -- Uma missao pode ter varios clientes
    @OneToMany(mappedBy = "missoes")
    @JoinColumn(name = "missoes_id") // Foreing key or chave estrangeira

    private List<ClientModel> clientes;

    public MissoesModel(){
    }

    public MissoesModel(String nomeMissao, String rank) {
        this.nome = nomeMissao;
        this.rank = rank;
    }

    public String getNomeMissao() {
        return nome;
    }

    public void setNomeMissao(String nomeMissao) {
        this.nome = nomeMissao;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

}
