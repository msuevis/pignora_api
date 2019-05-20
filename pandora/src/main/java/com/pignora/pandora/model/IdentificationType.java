package com.pignora.pandora.model;

public enum IdentificationType {

    CEDULA("CC"),

    NIT("NIT"),

    PASAPORTE("TP"),

    REGISTRO_CIVIL("RC"),

    CEDULA_EXTRANGERIA("CE");


   private String sigla;

   private IdentificationType(String sigla){
       this.sigla = sigla;
   }

    public String getSigla() {
        return sigla;
    }
}
