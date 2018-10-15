package agendaspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import agendaspring.daos.ContatoDAO;
import agendaspring.models.Contato;

@Controller
public class ContatoController {
	@RequestMapping("/contatos/form")
	public String form() {
		return "contatos/form";
	}

	@RequestMapping("/contatos")
	public String adicionar(Contato contato) {
		
		ContatoDAO cDAO = new ContatoDAO();

		cDAO.inserir(contato);
		
		
		
		return "contatos/ok";
		
	}

}
