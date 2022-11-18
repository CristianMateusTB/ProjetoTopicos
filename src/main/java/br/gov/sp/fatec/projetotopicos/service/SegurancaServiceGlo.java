package br.gov.sp.fatec.projetotopicos.service;

import java.util.List;
import br.gov.sp.fatec.projetotopicos.entity.Glossario;

public interface SegurancaServiceGlo {
    public List<Glossario> buscarPorTermo(String termo);
    
}