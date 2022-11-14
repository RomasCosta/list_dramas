/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.costa.romario.controller;

import com.github.costa.romario.model.Serie;
import com.github.costa.romario.model.StatusSerie;
import com.github.costa.romario.repository.SerieRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author romar
 */
@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private SerieRepository serieRepository;

    @GetMapping
    public String home(Model model) {
       
        List<Serie> series = serieRepository.findAll();
        model.addAttribute("series", series);
        return "home";
    }
    
    @GetMapping("/{status}")
    public String porStatus(@PathVariable("status") String status, Model model) {
       
        List<Serie> series = serieRepository.findByStatus(StatusSerie.valueOf(status.toUpperCase()));
        model.addAttribute("series", series);
        model.addAttribute("status", status);
        return "home";
    }
    
    @ExceptionHandler(IllegalArgumentException.class)
    public String onError() {
        return "redirect:/home";
    }
}
