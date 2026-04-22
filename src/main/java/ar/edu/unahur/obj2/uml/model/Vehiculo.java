package ar.edu.unahur.obj2.uml.model;

public abstract class Vehiculo {
    private boolean estaAlquilado = false;

    public boolean getEstaAlquilado(){
        return estaAlquilado;
    }

    public void setEstaAlquilado(boolean status){
        estaAlquilado = status;
    }
}
