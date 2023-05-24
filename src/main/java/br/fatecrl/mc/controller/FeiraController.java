package br.fatecrl.mc.controller;

import br.fatecrl.mc.models.Aluno;
import br.fatecrl.mc.models.Feiravi;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping ("/frutas")

public class FeiraController {
    // simulacao do banco de dados
    private static final List<Feiravi> _feiravi = new ArrayList<Feiravi>();

    public FeiraController(){

        _feiravi.add(new Feiravi("abacaxi", "amarelo", 10.0, 5.0));
        _feiravi.add(new  Feiravi("morango", "vermelho", 5.0, 7.0));
        _feiravi.add(new Feiravi("mexerica", "laranja", 5.0, 9.0));





    }

    @GetMapping
    public String getFeiravi(Model model){
        model.addAttribute("feiravi",_feiravi);

        return "Feira";

    }

}


