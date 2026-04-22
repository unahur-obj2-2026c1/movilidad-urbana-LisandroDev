package ar.edu.unahur.obj2.uml.model;

import java.time.LocalDate;

public class Alquiler {

    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Vehiculo vehiculoAlquilado;

    public Alquiler(LocalDate inicio, LocalDate fin, Vehiculo vehiculo){

        this.fechaInicio = inicio;
        this.fechaFin = fin;
        this.vehiculoAlquilado = vehiculo;
        vehiculo.setEstaAlquilado(true);

    }


}
