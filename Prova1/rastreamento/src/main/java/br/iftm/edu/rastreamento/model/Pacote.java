package br.iftm.edu.rastreamento.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Pacote {

    @Id
    private String id;
    private String destinatario;

    @ManyToOne
    private Endereco endereco;

    private String status;

    @OneToMany(mappedBy = "pacote", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Rastreamento> rastreamentos = new ArrayList<>();

    public void atualizarStatus(String novoStatus, Date dataHora, String localizacao) {
        this.status = novoStatus;
        Rastreamento rastreamento = new Rastreamento(dataHora, novoStatus, localizacao, this);
        rastreamentos.add(rastreamento);
    }

    public String consultarInformacoes() {
        StringBuilder info = new StringBuilder();
        info.append("ID: ").append(id).append("\n")
            .append("Destinatário: ").append(destinatario).append("\n")
            .append("Endereço: ").append(endereco.getEnderecoCompleto()).append("\n")
            .append("Status: ").append(status).append("\n")
            .append("Rastreamentos:\n");
        for (Rastreamento rastreamento : rastreamentos) {
            info.append(rastreamento.getResumo()).append("\n");
        }
        return info.toString();
    }
}