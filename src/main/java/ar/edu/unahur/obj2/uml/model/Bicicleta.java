package ar.edu.unahur.obj2.uml.model;

public class Bicicleta extends Vehiculo {
    private int rodado;

    public Bicicleta(int rodado){
        this.rodado = rodado;
    }

    public int getRodado(){
        return rodado;
    }

}
