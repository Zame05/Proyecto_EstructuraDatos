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
            System.out.println("1. Gestión de Clientes");
            System.out.println("2. Gestión de Vehículos");
            System.out.println("3. Gestión de Contratos de Renting");
            System.out.println("4. Imprimir Informe General");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    menuClientes(sc, m);
                    break;
                case 2:
                    menuVehiculos(sc, m);
                    break;
                case 3:
                    menuContratos(sc, m);
                    break;
                case 4:
                    m.imprimirInformeGeneral();
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }

        sc.close();
    }

    static void menuClientes(Scanner sc, Metodos m) {
        boolean volver = false;
        while (!volver) {
            System.out.println("\n--- GESTIÓN DE CLIENTES ---");
            System.out.println("1.1 Registrar cliente");
            System.out.println("1.2 Modificar cliente");
            System.out.println("1.3 Eliminar cliente");
            System.out.println("1.4 Buscar cliente");
            System.out.println("1.5 Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            int op = sc.nextInt();

            switch (op) {
                case 1:
                    m.registrarCliente();
                    break;
                case 2:
                    m.modificarCliente();
                    break;
                case 3:
                    m.eliminarCliente();
                    break;
                case 4:
                    m.buscarCliente();
                    break;
                case 5:
                    volver = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }

    static void menuVehiculos(Scanner sc, Metodos m) {
        boolean volver = false;
        while (!volver) {
            System.out.println("\n--- GESTIÓN DE VEHÍCULOS ---");
            System.out.println("2.1 Registrar vehículo");
            System.out.println("2.2 Modificar vehículo");
            System.out.println("2.3 Eliminar vehículo");
            System.out.println("2.4 Buscar vehículo");
            System.out.println("2.5 Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            int op = sc.nextInt();

            switch (op) {
                case 1:
                    m.registrarVehiculo();
                    break;
                case 2:
                    m.modificarVehiculo();
                    break;
                case 3:
                    m.eliminarVehiculo();
                    break;
                case 4:
                    m.buscarVehiculo();
                    break;
                case 5:
                    volver = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }

    static void menuContratos(Scanner sc, Metodos m) {
        boolean volver = false;
        while (!volver) {
            System.out.println("\n--- GESTIÓN DE CONTRATOS DE RENTING ---");
            System.out.println("3.1 Registrar nuevo contrato");
            System.out.println("3.2 Modificar contrato");
            System.out.println("3.3 Finalizar contrato (devolución)");
            System.out.println("3.4 Buscar contrato");
            System.out.println("3.5 Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            int op = sc.nextInt();

            switch (op) {
                case 1:
                    m.registrarContrato();
                    break;
                case 2:
                    m.modificarContrato();
                    break;
                case 3:
                    m.finalizarContrato();
                    break;
                case 4:
                    m.buscarContrato();
                    break;
                case 5:
                    volver = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }
}