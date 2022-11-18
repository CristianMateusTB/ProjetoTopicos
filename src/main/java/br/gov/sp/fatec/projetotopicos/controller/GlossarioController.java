package br.gov.sp.fatec.projetotopicos.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import br.gov.sp.fatec.projetotopicos.entity.Glossario;
import br.gov.sp.fatec.projetotopicos.service.SegurancaServiceGlo;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping(value= "/glossario")
@CrossOrigin
public class GlossarioController {
    @Autowired
    private SegurancaServiceGlo SegSevGlo;

    @GetMapping(value ="/{termo}")
    public List<Glossario> findByTermoContains(@PathVariable("termo") String termo){
        return SegSevGlo.buscarPorTermo(termo);
    }
}
