package ejerSistemaVehiculo;

import java.util.ArrayList;
import java.util.List;

public class Utilitario {
    private List<Propietario> propietarios;
    private List<Vehiculo> vehiculos;
    public Utilitario() {
        propietarios = new ArrayList<Propietario>();
        vehiculos = new ArrayList<Vehiculo>();
    }

    public void agregarPropietario(String nombre, String cedula, String telefono) {
        propietarios.add(new Propietario(nombre, cedula, telefono));
    }
    public void agregarAutomovil(String marca, String modelo, String cilindrada, Propietario propietario, String tipoAuto, String traccion) {
        vehiculos.add(new Automovil(marca, modelo, cilindrada, propietario, tipoAuto, traccion));
    }
    public void agregarMotocicleta(String marca, String modelo, String cilindrada, Propietario propietario, String tipoArranque, int alturaAsiento){
        vehiculos.add(new Motocicleta(marca, modelo, cilindrada, propietario, tipoArranque, alturaAsiento));
    }

    public Propietario buscarPropietario(String cedula) {
        for (Propietario p : propietarios) {
            if (p.getCedula().equals(cedula)) {
                return p;
            }
        }
        return null;
    }

    public Vehiculo buscarVehiculo(String modelo){
        for (Vehiculo p : vehiculos) {
            if (p.getModelo().equals(modelo)) {
                return p;
            }
        }
        return null;
    }

    public void mostrarPropietarios() {
        for (Propietario p : propietarios) {
            System.out.println(p);
        }
    }

    public String mostrarVehiculos() {
        StringBuilder builder = new StringBuilder();
        for (Vehiculo p : vehiculos) {
            builder.append(p);
            builder.append("\n---------------------------------\n");
        }
       /* String mensaje = "";
        for (Vehiculo p : vehiculos) {
            mensaje += p+"\n";
        }
        return mensaje;*/
        return builder.toString();
    }

    public void menu(){
        System.out.println("1. Agregar Propietario");
        System.out.println("2. Agregar Automovil a propetario");
        System.out.println("3. Agregar Motocicleta a propetario");
        System.out.println("4. Mostrar Vehiculos");
        System.out.println("5. Buscar Automovil");
        System.out.println("6. Salir");
        System.out.print("Seleccione una opcion: ");
    }
}
