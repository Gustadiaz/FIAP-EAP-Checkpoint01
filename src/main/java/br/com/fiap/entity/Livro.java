package br.com.fiap.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name = "tb_livro")
@SequenceGenerator(name = "livro", sequenceName = "SQ_TB_LIVRO", allocationSize = 1)
public class Livro implements Serializable {

  
	private static final long serialVersionUID = -7621387161978902665L;

	public Livro() {
        this.ativo = true;
        this.dataCadastro = LocalDateTime.now();
        this.dataAtualizacao = LocalDateTime.now();
    }

  

    public Livro(String titulo, String autor, Integer edicao, LocalDate dataPublicacao) {
		this.titulo = titulo;
		this.autor = autor;
		this.edicao = edicao;
		this.anoPublicacao = dataPublicacao;
		
	}

	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "livro")
    private Long id;

    @Column(name = "ds_titulo", length = 80, nullable = false)
    private String titulo;

    @Column(name = "nm_autor", length = 30, nullable = false)
    private String autor;

    @Column(name = "nr_edicao", length = 2)
    private Integer edicao;

    @Column(name = "dt_publicacao")
    private LocalDate anoPublicacao;

    @Column(name = "st_ativo")
    private Boolean ativo;

    @Column(name = "dt_cadastro")
    private LocalDateTime dataCadastro;

    @Column(name = "dt_atualizacao")
    private LocalDateTime dataAtualizacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }


    public Integer getEdicao() {
        return edicao;
    }

    public void setEdicao(Integer edicao) {
        this.edicao = edicao;
    }

    public LocalDate getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setDataPublicacao(LocalDate anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public LocalDateTime getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(LocalDateTime dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + " | " + "Autor: " + autor + " | " +
                "Edição: " + edicao + " | " + "Data de Publicação: " + dataAtualizacao + "\n";
    }
}