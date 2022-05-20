package com.datahub.teste.service;

import com.datahub.teste.model.Pessoa;
import com.datahub.teste.util.DateTimeUtil;

import org.joda.time.DateTime;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    public Pessoa calculaIdade(String data) {

        DateTime dataAtual = DateTime.now();
        DateTime dataNascimento = null;
        DateTimeUtil dateTimeUtil = new DateTimeUtil();

        try {

            dataNascimento = dateTimeUtil.stringToDateTime(data);

            return new Pessoa(dateTimeUtil.calculaIntervaloDataAno(dataNascimento, dataAtual));

        } catch (Exception e) {
            e.printStackTrace();
        }

        return new Pessoa(-1);
    }

}
