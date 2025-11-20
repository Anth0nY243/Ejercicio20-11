package ejerSistemaVehiculo;

public class Automovil extends Vehiculo {
    private String tipoAuto;
    private String traccion;

    public Automovil(String marca, String modelo, String cilindrada, Propietario propietario, String tipoAuto, String traccion) {
        super(marca, modelo, cilindrada, propietario);
        this.tipoAuto = tipoAuto;
        this.traccion = traccion;
    }

    public String getTipoAuto() {
        return tipoAuto;
    }

    public void setTipoAuto(String tipoAuto) {
        this.tipoAuto = tipoAuto;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    @Override
    public String toString() {
        return
                super.toString()+
                        "\nTipo: " +tipoAuto+
                        "\nTraccion: "+traccion;
    }
}
