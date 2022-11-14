/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.costa.romario.dto;

import com.github.costa.romario.model.Serie;
import com.github.costa.romario.model.StatusSerie;
import javax.validation.constraints.NotBlank;

/**
 *
 * @author romar
 */
public class RequisicaoNovaSerie {
    
    @NotBlank
    private String nomeSerie;
    
    @NotBlank
    private String urlOndeAssistirSerie;
    
    @NotBlank
    private String urlDaImagem;
    private String descricao;

    public String getNomeSerie() {
        return nomeSerie;
    }

    public void setNomeSerie(String nomeSerie) {
        this.nomeSerie = nomeSerie;
    }

    public String getUrlOndeAssistirSerie() {
        return urlOndeAssistirSerie;
    }

    public void setUrlOndeAssistirSerie(String urlOndeAssistirSerie) {
        this.urlOndeAssistirSerie = urlOndeAssistirSerie;
    }

    public String getUrlDaImagem() {
        return urlDaImagem;
    }

    public void setUrlDaImagem(String urlDaImagem) {
        this.urlDaImagem = urlDaImagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Serie toSerie() {
        Serie serie = new Serie();
        serie.setDescricaoDaSerie(descricao);
        serie.setNomeDaSerie(nomeSerie);
        serie.setUrlImgDaSerie(urlDaImagem);
        serie.setUrlOndeAssistir(urlOndeAssistirSerie);
        serie.setStatus(StatusSerie.AGUARDANDO);
        
        return serie;
    }
}
