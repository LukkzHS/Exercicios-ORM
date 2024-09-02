package br.edu.iftm.tspi.leilao.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class ItemDeLeilao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private double valorMinimo;
    private boolean leilaoAberto;

    @OneToMany
    private List<Lance> lancesRecebidos;

    @OneToOne
    private Lance lanceVencedor;

    public ItemDeLeilao(String nome, double valorMinimo, boolean leilaoAberto) {
        this.nome = nome;
        this.valorMinimo = valorMinimo;
        this.leilaoAberto = leilaoAberto;
        this.lancesRecebidos = new ArrayList<>(); // SonarLint S2293
    }

    public ItemDeLeilao(String nome, double valorMinimo, boolean leilaoAberto, List<Lance> lancesRecebidos, Lance lanceVencedor) {
        this.nome = nome;
        this.valorMinimo = valorMinimo;
        this.leilaoAberto = leilaoAberto;
        this.lancesRecebidos = lancesRecebidos != null ? lancesRecebidos : new ArrayList<>();
        this.lanceVencedor = lanceVencedor;
    }
}
