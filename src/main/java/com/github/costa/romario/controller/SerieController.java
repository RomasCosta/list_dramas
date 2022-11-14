/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.costa.romario.controller;
import com.github.costa.romario.dto.RequisicaoNovaSerie;
import com.github.costa.romario.model.Serie;
import com.github.costa.romario.repository.SerieRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author romar
 */
@Controller
@RequestMapping("serie")
public class SerieController {
    
    @Autowired
    private SerieRepository serieRepository;
    
    @GetMapping("formulario")
    public String formulario(RequisicaoNovaSerie requisicao) {
        return "serie/formulario";
    }
    
    @PostMapping("novo")
    public String novo(@Valid RequisicaoNovaSerie requisicao, BindingResult result) {//a requisiçao serve para trazer somente os itens solicitados no dto
        if(result.hasErrors()){//caso os campos solicitados no dto não sejam preenchidos corretamente, retorna ao formulario novamente.
            return "serie/formulario";
        }
        
        Serie serie = requisicao.toSerie();
        serieRepository.save(serie);
        
        return "redirect:/home"; //o redirect manda de volta para a home caso o cadastro do produto dê certo..
    }
}
