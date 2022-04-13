package model;

import core.AggregateRoot;

import java.util.UUID;
import java.util.List;

public class Comanda extends AggregateRoot<UUID> {

    private String codigoComanda;
    private String estado;
    private List<RecetaComanda> recetas;

    public void completarReceta(String codigo){
        var result = recetas
                .stream()
                .filter(x -> x.getCodigoReceta().equalsIgnoreCase(codigo))
                .findFirst();
        if(!result.isPresent()){
            throw new IllegalArgumentException("El codigo no existe dentro de las recetas a preparar");
        }

        var obj = result.get();
        obj.finalizarPreparacion();

        final var recetasFinalizadas = recetas.stream().filter(x -> x.isFinalizado()).count();
        if(recetasFinalizadas == recetas.size()){
            estado = "Finalizado";
        }
    }

}
