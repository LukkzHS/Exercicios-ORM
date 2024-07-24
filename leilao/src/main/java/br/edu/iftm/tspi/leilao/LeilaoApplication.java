package br.edu.iftm.tspi.leilao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.iftm.tspi.leilao.model.ItemDeLeilao;
import br.edu.iftm.tspi.leilao.model.Participante;
import br.edu.iftm.tspi.leilao.repository.ItemDeLeilaoRepository;
import br.edu.iftm.tspi.leilao.repository.LanceRepository;
import br.edu.iftm.tspi.leilao.repository.ParticipanteRepository;

@SpringBootApplication
public class LeilaoApplication implements CommandLineRunner{

	
	@Autowired
	private ItemDeLeilaoRepository itemDeLeilaoRepository;
	
	@Autowired
	private LanceRepository lanceRepository;
	
	@Autowired
	private ParticipanteRepository participanteRepository;

	public static void main(String[] args) {
		SpringApplication.run(LeilaoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		ItemDeLeilao bicicleta = new ItemDeLeilao("Bicicleta", 100.0, true);
		Participante joao = new Participante("João", "12345678900");
	}
}