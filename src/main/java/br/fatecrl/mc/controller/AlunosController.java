package br.fatecrl.mc.controller;

import br.fatecrl.mc.models.Aluno;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/alunos")

public class AlunosController {

    // simulacao do banco de dados
    private static final List<Aluno> _alunos = new ArrayList<Aluno>();

    public AlunosController(){
        _alunos.add(new Aluno("Viviane", "123", 5.0, 9.0));



    }

    @GetMapping
    public String getAlunos(Model model){
        model.addAttribute("alunos",_alunos);

        return "Alunos";

    }

}

