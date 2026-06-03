import java.util.Scanner;

public class Menu {
    private Scanner sc;

    public Menu(Scanner sc) {
        this.sc = sc;
    }

    public void mostrarMenuPrincipal() {
        boolean continuar = true;
        while (continuar) {
            System.out.println("\n========================================");
            System.out.println("   BIENVENIDOS - SISTEMA DE RENTING");
            System.out.println("========================================");
            System.out.println("1. Gestión de Clientes");
            System.out.println("2. Gestión de Vehículos");
            System.out.println("3. Gestión de Contratos de Renting");
            System.out.println("4. Imprimir Informe General");
            System.out.println("5. Salir del Sistema");
            System.out.print("Seleccione una opción: ");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1: mostrarMenuClientes(); break;
                case 2: mostrarMenuVehiculos(); break;
                case 3: mostrarMenuContratos(); break;
                case 4: imprimirInformeGeneral(); break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    private void mostrarMenuClientes() {
        boolean volver = false;
        while (!volver) {
            System.out.println("\n--- GESTIÓN DE CLIENTES ---");
            System.out.println("1. Registrar cliente");
            System.out.println("2. Modificar cliente");
            System.out.println("3. Eliminar cliente");
            System.out.println("4. Buscar cliente");
            System.out.println("5. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            int op = sc.nextInt();

            switch (op) {
                case 1: System.out.println("[Registrar cliente]"); break;
                case 2: System.out.println("[Modificar cliente]"); break;
                case 3: System.out.println("[Eliminar cliente]"); break;
                case 4: System.out.println("[Buscar cliente]"); break;
                case 5: volver = true; break;
                default: System.out.println("Opción no válida.");
            }
        }
    }

    private void mostrarMenuVehiculos() {
        boolean volver = false;
        while (!volver) {
            System.out.println("\n--- GESTIÓN DE VEHÍCULOS ---");
            System.out.println("1. Registrar vehículo");
            System.out.println("2. Modificar vehículo");
            System.out.println("3. Eliminar vehículo");
            System.out.println("4. Buscar vehículo");
            System.out.println("5. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            int op = sc.nextInt();

            switch (op) {
                case 1: System.out.println("[Registrar vehículo]"); break;
                case 2: System.out.println("[Modificar vehículo]"); break;
                case 3: System.out.println("[Eliminar vehículo]"); break;
                case 4: System.out.println("[Buscar vehículo]"); break;
                case 5: volver = true; break;
                default: System.out.println("Opción no válida.");
            }
        }
    }

    private void mostrarMenuContratos() {
        boolean volver = false;
        while (!volver) {
            System.out.println("\n--- GESTIÓN DE CONTRATOS DE RENTING ---");
            System.out.println("1. Registrar nuevo contrato");
            System.out.println("2. Modificar contrato");
            System.out.println("3. Finalizar contrato (devolución)");
            System.out.println("4. Buscar contrato");
            System.out.println("5. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            int op = sc.nextInt();

            switch (op) {
                case 1: System.out.println("[Registrar contrato]"); break;
                case 2: System.out.println("[Modificar contrato]"); break;
                case 3: System.out.println("[Finalizar contrato]"); break;
                case 4: System.out.println("[Buscar contrato]"); break;
                case 5: volver = true; break;
                default: System.out.println("Opción no válida.");
            }
        }
    }

    private void imprimirInformeGeneral() {
        System.out.println("[Informe general - por implementar]");
    }
}