import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n========================================");
            System.out.println("   BIENVENIDOS - SISTEMA DE RENTING");
            System.out.println("========================================");
            System.out.println("1. Gestion de Clientes");
            System.out.println("2. Gestion de Vehiculos");
            System.out.println("3. Gestion de Contratos de Renting");
            System.out.println("4. Imprimir Informe General");
            System.out.println("5. Salir del Sistema");
            System.out.print("Seleccione una opcion: ");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    boolean volverClientes = false;
                    while (!volverClientes) {
                        System.out.println("\n GESTION DE CLIENTES ");
                        System.out.println("1. Registrar cliente");
                        System.out.println("2. Modificar cliente");
                        System.out.println("3. Eliminar cliente");
                        System.out.println("4. Buscar cliente");
                        System.out.println("5. Volver al menu principal");
                        System.out.print("Seleccione una opcion: ");
                        int opCliente = sc.nextInt();
                        switch (opCliente) {
                            case 1: m.registrarCliente(sc); break;
                            case 2: m.modificarCliente(sc); break;
                            case 3: m.eliminarCliente(sc); break;
                            case 4: m.buscarCliente(sc); break;
                            case 5: volverClientes = true; break;
                            default: System.out.println("Opcion no valida.");
                        }
                    }
                    break;

                case 2:
                    boolean volverVehiculos = false;
                    while (!volverVehiculos) {
                        System.out.println("\n GESTION DE VEHICULOS ");
                        System.out.println("1. Registrar vehiculo");
                        System.out.println("2. Modificar vehiculo");
                        System.out.println("3. Eliminar vehiculo");
                        System.out.println("4. Buscar vehiculo");
                        System.out.println("5. Volver al menu principal");
                        System.out.print("Seleccione una opcion: ");
                        int opVehiculo = sc.nextInt();
                        switch (opVehiculo) {
                            case 1: m.registrarVehiculo(sc); break;
                            case 2: m.modificarVehiculo(sc); break;
                            case 3: m.eliminarVehiculo(sc); break;
                            case 4: m.buscarVehiculo(sc); break;
                            case 5: volverVehiculos = true; break;
                            default: System.out.println("Opcion no valida.");
                        }
                    }
                    break;

                case 3:
                    boolean volverContratos = false;
                    while (!volverContratos) {
                        System.out.println("\n GESTION DE CONTRATOS DE RENTING ");
                        System.out.println("1. Registrar nuevo contrato");
                        System.out.println("2. Modificar contrato");
                        System.out.println("3. Finalizar contrato (devolucion)");
                        System.out.println("4. Buscar contrato");
                        System.out.println("5. Volver al menu principal");
                        System.out.print("Seleccione una opcion: ");
                        int opContrato = sc.nextInt();
                        switch (opContrato) {
                            case 1: m.registrarContrato(sc); break;
                            case 2: m.modificarContrato(sc); break;
                            case 3: m.finalizarContrato(sc); break;
                            case 4: m.buscarContrato(sc); break;
                            case 5: volverContratos = true; break;
                            default: System.out.println("Opcion no valida.");
                        }
                    }
                    break;

                case 4:
                    m.imprimirInformeGeneral();
                    break;

                case 5:
                    System.out.println("¡Hasta luego!");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }
        }

        sc.close();
    }
}