package br.gov.sp.fatec.projetotopicos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.projetotopicos.entity.Glossario;
import br.gov.sp.fatec.projetotopicos.repository.GlossarioRepository;

@Service
public class SegurancaServiceGloimpl implements SegurancaServiceGlo {
    @Autowired
    private GlossarioRepository glosRepo;

    @Override
    public List<Glossario> buscarPorTermo(String termo){
        List<Glossario> glossarioOptional = glosRepo.findByTermoContains(termo);
            return glossarioOptional;
    }
}
