package ar.edu.unahur.obj2.uml.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private List<Alquiler> alquileres = new ArrayList<>();
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public void alquilarVehiculo(LocalDate inicio, LocalDate fin, Vehiculo vehiculo) {
        if (!vehiculo.getEstaAlquilado()) {
            Alquiler nuevoAlquiler = new Alquiler(inicio, fin, vehiculo);
            alquileres.add(nuevoAlquiler);
        } else {
            throw new IllegalStateException("el vehiculo ya esta alquilado");
        }
    }

    public List<Alquiler> getAlquileres() {
        return alquileres;
    }

    public String getNombre() {
        return nombre;
    }
}
