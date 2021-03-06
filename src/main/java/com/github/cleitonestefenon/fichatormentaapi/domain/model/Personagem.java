package com.github.cleitonestefenon.fichatormentaapi.domain.model;

import com.github.cleitonestefenon.fichatormentaapi.domain.model.auditoria.Auditoria;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity(name = "personagem")
public class Personagem extends Auditoria implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "per_id")
    private long id;

    @Column(name = "per_nome")
    private String nome;

    @Column(name = "per_raca")
    private String raca;

    @Column(name = "per_origem")
    private String origem;

    @Column(name = "per_classe")
    private String classe;

    @Column(name = "per_nivel")
    private int nivel;

    @Column(name = "per_divindade")
    private String divindade;

    @Column(name = "per_vida_total")
    private int vidaTotal;

    @Column(name = "per_mana_total")
    private int manaTotal;

    @Column(name = "per_vida_atual")
    private int vidaAtual;

    @Column(name = "per_mana_atual")
    private int manaAtual;

    @Column(name = "per_deslocamento")
    private int deslocamento;

    @Column(name = "per_pontos_exp")
    private int pontosExperiencia;

    @ManyToOne
    @JoinColumn(name = "per_pessoa_id", nullable = false)
    private Pessoa pessoa;

    @OneToMany(mappedBy = "personagem", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<Item> item;

    @OneToMany(mappedBy = "personagem", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<Magia> magia;

    @OneToMany(mappedBy = "personagem", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<Inventario> inventario;

    @OneToMany(mappedBy = "personagem", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<HabilidadeClassePoder> habilidadeClassePoder;

    @OneToMany(mappedBy = "personagem", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<Anotacoes> anotacoes;

    @OneToMany(mappedBy = "personagem", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<Historico> historico;

    @OneToMany(mappedBy = "personagem", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<Ataque> ataque;

    @OneToMany(mappedBy = "personagem", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<HabilidadeRacaOrigem> habilidadeRacaOrigem;

    @OneToMany(mappedBy = "personagem", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<Proeficiencia> proeficiencia;

    @OneToMany(mappedBy = "personagem", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<Defesa> defesa;
}
