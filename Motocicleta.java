package ejerSistemaVehiculo;

public class Motocicleta extends Vehiculo {
    private String tipoArranque;
    private int alturaAsiento;

    public Motocicleta(String marca, String modelo, String cilindrada, Propietario propietario, String tipoArranque, int alturaAsiento) {
        super(marca, modelo, cilindrada, propietario);
        this.tipoArranque = tipoArranque;
        this.alturaAsiento = alturaAsiento;
    }

    public String getTipoArranque() {
        return tipoArranque;
    }

    public void setTipoArranque(String tipoArranque) {
        this.tipoArranque = tipoArranque;
    }

    public int getAlturaAsiento() {
        return alturaAsiento;
    }

    public void setAlturaAsiento(int alturaAsiento) {
        this.alturaAsiento = alturaAsiento;
    }

    @Override
    public String toString() {
        return
                super.toString()+
                        "\nAltura: "+alturaAsiento+
                        "\nArranque: "+tipoArranque;
    }
}
