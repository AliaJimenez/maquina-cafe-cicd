package maquinacafe;

public class Azucarero {
    private int cantidadDeAzucar;

    public Azucarero(int cantidadDeAzucar) {
        this.cantidadDeAzucar = cantidadDeAzucar;
    }

    public void setCantidadAzucar(int cantidadDeAzucar) {
        this.cantidadDeAzucar = cantidadDeAzucar;
    }

    public int getCantidadAzucar() {
        return cantidadDeAzucar;
    }

    public boolean hasAzucar(int cantidadDeAzucar) {
        return this.cantidadDeAzucar >= cantidadDeAzucar;
    }

    public void giveAzucar(int cantidadDeAzucar) {
        this.cantidadDeAzucar -= cantidadDeAzucar;
    }
}
