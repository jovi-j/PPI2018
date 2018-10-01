package agendaspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String homeSeiLa() {
		System.out.println("Chamou o método home!");
		return "home.jsp";
	}

}
