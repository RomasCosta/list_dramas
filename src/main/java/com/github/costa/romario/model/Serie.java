/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.costa.romario.model;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;




/**
 *
 * @author romar
 */
@Entity
public class Serie {
    
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
    
   private String nomeDaSerie;
   private String numeroEpisodios;
   private LocalDate previsaoLancamento;
   private String urlOndeAssistir;
   private String urlImgDaSerie;
   private String descricaoDaSerie;
   
   @Enumerated(EnumType.STRING)
   private StatusSerie status;

    public StatusSerie getStatus() {
        return status;
    }

    public void setStatus(StatusSerie status) {
        this.status = status;
    }

    public String getNomeDaSerie() {
        return nomeDaSerie;
    }

    public void setNomeDaSerie(String nomeDaSerie) {
        this.nomeDaSerie = nomeDaSerie;
    }

    public String getNumeroEpisodios() {
        return numeroEpisodios;
    }

    public void setNumeroEpisodios(String numeroEpisodios) {
        this.numeroEpisodios = numeroEpisodios;
    }

    public LocalDate getPrevisaoLancamento() {
        return previsaoLancamento;
    }

    public void setPrevisaoLancamento(LocalDate previsaoLancamento) {
        this.previsaoLancamento = previsaoLancamento;
    }

    public String getUrlOndeAssistir() {
        return urlOndeAssistir;
    }

    public void setUrlOndeAssistir(String urlOndeAssistir) {
        this.urlOndeAssistir = urlOndeAssistir;
    }

    public String getUrlImgDaSerie() {
        return urlImgDaSerie;
    }

    public void setUrlImgDaSerie(String urlmgDaSerie) {
        this.urlImgDaSerie = urlmgDaSerie;
    }

    public String getDescricaoDaSerie() {
        return descricaoDaSerie;
    }

    public void setDescricaoDaSerie(String descricaoDaSerie) {
        this.descricaoDaSerie = descricaoDaSerie;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }   
}
