package com.bezkoder.spring.swagger.model;

import io.swagger.v3.oas.annotations.media.Schema;

public class Tutorial {

  @Schema(accessMode = Schema.AccessMode.READ_ONLY)
  private long id = 0;

  private String nome;

  private String conteudo;

  private String escola;

  public Tutorial() {

  }

  public Tutorial(String nome, String conteudo, String escola) {
    this.nome = nome;
    this.conteudo = conteudo;
    this.escola = escola;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getId() {
    return id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getConteudo() {
    return conteudo;
  }

  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
  }
  
  public String getEscola() {
	    return escola;
	  }

  public void setEscola(String escola) {
	    this.escola = escola;
	  }


  @Override
  public String toString() {
    return "Tutorial [id=" + id + ", nome=" + nome + ", conteudo=" + conteudo + ", escola=" + escola + "]";
  }

}
