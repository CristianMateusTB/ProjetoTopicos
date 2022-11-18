package br.gov.sp.fatec.projetotopicos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "glo_glossario")
public class Glossario {

    public Glossario() {}
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "glo_id")
    private Long id;

    @Column(name ="glo_termo")
    private String termo;

    @Column(name ="glo_significado")
    private String significado;

    @Column(name ="glo_sigla")
    private String sigla;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTermo() {
        return this.termo;
    }

    public void setTermo(String termo) {
        this.termo = termo;
    }

    public String getSignificado() {
        return this.significado;
    }

    public void setSignificado(String significado) {
        this.significado = significado;
    }

    public String getSigla() {
        return this.sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }



}
