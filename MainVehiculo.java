package ejerSistemaVehiculo;

import java.util.Scanner;

public class MainVehiculo {
    public static void main(String[] args) {
        Utilitario u = new Utilitario();
        Scanner sc = new Scanner(System.in);
        String marca;
        String modelo;
        String cilindrada;
        String tipoAuto;
        String traccion;
        String tipoArranque;
        String nombre;
        String cedula;
        String telefono;
        int alturaAsiento, opc;
        do {
            u.menu();
            opc = Integer.parseInt(sc.nextLine());
            switch (opc) {
                case 1: {
                    System.out.println("Ingrese el nombre: ");
                    nombre = sc.nextLine();
                    System.out.println("Ingrese la cedula: ");
                    cedula = sc.nextLine();
                    System.out.println("Ingrese el telefono: ");
                    telefono = sc.nextLine();

                    u.agregarPropietario(nombre, cedula, telefono);
                    System.out.println("Propietario regitrado exitosamente");
                }break;
                case 2: {
                    System.out.println("Ingrese la cedula a buscar: ");
                    cedula = sc.nextLine();
                    Propietario p = u.buscarPropietario(cedula);
                    if (p != null) {
                        System.out.println("Propietario: " + p.getNombre());
                        System.out.println("Ingrese la marca: ");
                        marca = sc.nextLine();
                        System.out.println("Ingrese el modelo: ");
                        modelo = sc.nextLine();
                        System.out.println("Ingrese la cilindrada: ");
                        cilindrada = sc.nextLine();
                        System.out.println("Ingrese el tipo de auto: ");
                        tipoAuto = sc.nextLine();
                        System.out.println("Ingrese la traccion: ");
                        traccion = sc.nextLine();

                        u.agregarAutomovil(marca, modelo, cilindrada, p, tipoAuto, traccion);
                        System.out.println("Automovil registrado exitosamente");
                    }else{
                        System.out.println("No existe el propietario, registre primero");
                    }
                }break;
                case 3: {
                    System.out.println("Ingrese la cedula del dueño: ");
                    cedula = sc.nextLine();
                    Propietario p = u.buscarPropietario(cedula);

                    if (p != null) {
                        System.out.println("Propietario: " + p.getNombre());
                        System.out.println("Ingrese la marca: ");
                        marca = sc.nextLine();
                        System.out.println("Ingrese el modelo: ");
                        modelo = sc.nextLine();
                        System.out.println("Ingrese la cilindrada: ");
                        cilindrada = sc.nextLine();
                        System.out.println("Ingrese el tipo de arranque (Electrico/Pedal): ");
                        tipoArranque = sc.nextLine();
                        System.out.println("Ingrese la altura del asiento (cm): ");
                        alturaAsiento = Integer.parseInt(sc.nextLine());

                        u.agregarMotocicleta(marca, modelo, cilindrada, p, tipoArranque, alturaAsiento);
                        System.out.println("Motocicleta registrada exitosamente");
                    } else {
                        System.out.println("No existe el propietario con esa cedula.");
                    }
                }break;
                case 4: {
                    System.out.println("\n--- LISTADO DE VEHICULOS ---");
                    String listado = u.mostrarVehiculos();
                    if (listado.isEmpty()) {
                        System.out.println("No hay vehiculos registrados.");
                    } else {
                        System.out.println(listado);
                    }
                }break;
                case 5: {
                    System.out.println("\n--- BUSCAR VEHICULO ---");
                    System.out.println("Ingrese el MODELO a buscar: ");
                    modelo = sc.nextLine();

                    Vehiculo v = u.buscarVehiculo(modelo);

                    if (v != null) {
                        System.out.println("VEHICULO ENCONTRADO:");
                        System.out.println(v);
                    } else {
                        System.out.println("No se encontro ningun vehiculo con el modelo: " + modelo);
                    }
                }break;
                case 6: {
                    System.out.println("Saliendo del programa");
                }break;
                default:
                    System.out.println("Opcion invalida");
            }
        }while (opc != 6);
    }
}
