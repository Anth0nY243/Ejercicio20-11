package ejerSistemaVehiculo;

public class Vehiculo {
    private String marca;
    private String modelo;
    private String cilindrada;
    private Propietario propietario;

    public Vehiculo(String marca, String modelo, String cilindrada, Propietario propietario) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
        this.propietario = propietario;
    }

    public String getCilindrada() {
        return cilindrada;
    }
    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public Propietario getPropietario() { return propietario; }
    public void setPropietario(Propietario propietario) { this.propietario = propietario; }

    @Override
    public String toString() {
        return "Dueño: " + propietario + "\n" +
                "Marca: " + marca + "\n" +
                "Modelo: " + modelo + "\n" +
                "Cilindrada: " + cilindrada;
    }
}