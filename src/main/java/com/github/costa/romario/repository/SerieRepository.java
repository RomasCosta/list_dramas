/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.costa.romario.repository;

import com.github.costa.romario.model.Serie;
import com.github.costa.romario.model.StatusSerie;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author romar
 */
@Repository
public interface SerieRepository extends JpaRepository<Serie, Long>{//está sendo usado o método EntityManager, mas da pra extender o JpaRepository

    public List<Serie> findByStatus(StatusSerie status);
 
}
