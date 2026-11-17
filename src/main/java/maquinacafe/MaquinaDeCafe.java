package maquinacafe;

public class MaquinaDeCafe {
    // Visibilidad de paquete: TestMaquinaDeCafe compara estos campos directamente.
    Cafetera cafetera;
    Vaso vasosPequeno;
    Vaso vasosMediano;
    Vaso vasosGrande;
    Azucarero azucarero;

    public Vaso getTipoDeVaso(String tipoDeVaso) {
        switch (tipoDeVaso) {
            case "pequeno":
                return vasosPequeno;
            case "mediano":
                return vasosMediano;
            case "grande":
                return vasosGrande;
            default:
                return null;
        }
    }

    public String getVasoDeCafe(Vaso tipoDeVaso, int cantidadDeVasos, int cantidadDeAzucar) {
        if (!tipoDeVaso.hasVasos(cantidadDeVasos)) {
            return "No hay Vasos";
        }

        int cafeNecesario = tipoDeVaso.getContenido() * cantidadDeVasos;
        if (!cafetera.hasCafe(cafeNecesario)) {
            return "No hay Cafe";
        }

        if (!azucarero.hasAzucar(cantidadDeAzucar)) {
            return "No hay Azucar";
        }

        tipoDeVaso.giveVasos(cantidadDeVasos);
        cafetera.giveCafe(cafeNecesario);
        azucarero.giveAzucar(cantidadDeAzucar);

        return "Felicitaciones";
    }

    public Cafetera getCafetera() {
        return cafetera;
    }

    public void setCafetera(Cafetera cafetera) {
        this.cafetera = cafetera;
    }

    public Vaso getVasosPequeno() {
        return vasosPequeno;
    }

    public void setVasosPequeno(Vaso vasosPequeno) {
        this.vasosPequeno = vasosPequeno;
    }

    public Vaso getVasosMediano() {
        return vasosMediano;
    }

    public void setVasosMediano(Vaso vasosMediano) {
        this.vasosMediano = vasosMediano;
    }

    public Vaso getVasosGrande() {
        return vasosGrande;
    }

    public void setVasosGrande(Vaso vasosGrande) {
        this.vasosGrande = vasosGrande;
    }

    public Azucarero getAzucarero() {
        return azucarero;
    }

    public void setAzucarero(Azucarero azucarero) {
        this.azucarero = azucarero;
    }
}
