package com.datahub.teste.controller;

import com.datahub.teste.model.Pessoa;
import com.datahub.teste.service.PessoaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping("/idade/{dataNascimento}")
    public Pessoa calculaIdade(@PathVariable(value = "dataNascimento") String dataNascimento) {

        return pessoaService.calculaIdade(dataNascimento);
    }
}
