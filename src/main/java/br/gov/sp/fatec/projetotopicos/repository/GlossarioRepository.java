package br.gov.sp.fatec.projetotopicos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.gov.sp.fatec.projetotopicos.entity.Glossario;

public interface GlossarioRepository extends JpaRepository<Glossario , Long>{
    //@Query("select us from Glossario us where glo_termo ")
    public List <Glossario> findByTermoContains(String termo);
}
