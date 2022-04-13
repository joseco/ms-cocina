package model;

import core.Entity;
import lombok.Data;
import lombok.Getter;

import java.util.UUID;


@Getter
public class RecetaComanda extends Entity<UUID> {

    private String codigoReceta;
    private int cantidad;
    private String instrucciones;
    private boolean finalizado;

    public RecetaComanda(String codigoReceta, int cantidad, String instrucciones){
        this.codigoReceta = codigoReceta;
        this.cantidad = cantidad;
        this.instrucciones = instrucciones;
        this.finalizado = false;
    }

    public void finalizarPreparacion(){
        finalizado = true;
    }

}
