package org.br.senai.Thymeleaf.controle;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/escola")
public class AplicacaoControle {

    @RequestMapping(value="/contato", method = RequestMethod.GET)
    public String faleConosco() {
        return "contato";
    }

    @RequestMapping(value="/sobre", method = RequestMethod.GET)
    public String sobre() {
        return "sobre";
    }

    @RequestMapping(value="/servicos", method = RequestMethod.GET)
    public String servicoso() {
        return "servicos";
    }

    @RequestMapping(value="/home", method = RequestMethod.GET)
    public String carregarHome() {
        return "home";
    }

}
