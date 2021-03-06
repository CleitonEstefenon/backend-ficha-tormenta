package com.github.cleitonestefenon.fichatormentaapi.domain.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Atributos {

    FORCA("FOR"),
    DESTREZA("DES"),
    CONSTITUICAO("CON"),
    INTELIGENCIA("INT"),
    SABEDORIA("SAB"),
    CARISMA("CAR");

    private String descricao;
}
