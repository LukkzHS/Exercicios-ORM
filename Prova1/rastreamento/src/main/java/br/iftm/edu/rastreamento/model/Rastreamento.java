package br.iftm.edu.rastreamento.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Rastreamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dataHora;
    private String status;
    private String localizacao;

    @ManyToOne
    @JoinColumn(name = "pacote_id")
    private Pacote pacote;

    public Rastreamento() {}

    public Rastreamento(Date dataHora, String status, String localizacao, Pacote pacote) {
        this.dataHora = dataHora;
        this.status = status;
        this.localizacao = localizacao;
        this.pacote = pacote;
    }

    public String getResumo() {
        return "Data/Hora: " + dataHora + ", Status: " + status + ", Localização: " + (localizacao != null ? localizacao : "N/A");
    }
}