import java.util.ArrayList;
import java.util.Scanner;

public class Metodos {

    private ArrayList<Cliente> vectorClientes = new ArrayList<>();
    private ArrayList<Vehiculo> vectorVehiculos = new ArrayList<>();
    private ArrayList<ContratoRenting> vectorContratos = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void registrarCliente() {
        sc.nextLine();
        System.out.print("Cédula: ");
        String cedula = sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Apellido: ");
        String apellido = sc.nextLine();
        System.out.print("Teléfono: ");
        String telefono = sc.nextLine();
        System.out.print("Dirección: ");
        String direccion = sc.nextLine();
        System.out.print("Licencia de conducción: ");
        String licencia = sc.nextLine();

        Cliente c = new Cliente(cedula, nombre, apellido, telefono, direccion, licencia);
        vectorClientes.add(c);
        System.out.println("Cliente registrado exitosamente.");
    }

    public void modificarCliente() {
        sc.nextLine();
        System.out.print("Ingrese la cédula del cliente a modificar: ");
        String cedula = sc.nextLine();
        Cliente cliente = buscarClientePorCedula(cedula);

        if (cliente == null) {
            System.out.println("Cliente no encontrado.");
            return;
        }

        System.out.print("Nuevo teléfono: ");
        cliente.setTelefono(sc.nextLine());
        System.out.print("Nueva dirección: ");
        cliente.setDireccion(sc.nextLine());
        System.out.println("Cliente modificado exitosamente.");
    }

    public void eliminarCliente() {
        sc.nextLine();
        System.out.print("Ingrese la cédula del cliente a eliminar: ");
        String cedula = sc.nextLine();
        Cliente cliente = buscarClientePorCedula(cedula);

        if (cliente == null) {
            System.out.println("Cliente no encontrado.");
            return;
        }

        vectorContratos.removeIf(c -> c.getCedulaCliente().equals(cedula));
        vectorClientes.remove(cliente);
        System.out.println("Cliente y sus contratos eliminados exitosamente.");
    }

    public void buscarCliente() {
        sc.nextLine();
        System.out.print("Ingrese la cédula del cliente: ");
        String cedula = sc.nextLine();
        Cliente cliente = buscarClientePorCedula(cedula);

        if (cliente == null)
            System.out.println("Cliente no encontrado.");
        else
            System.out.println(cliente.toString());
    }

    private Cliente buscarClientePorCedula(String cedula) {
        for (Cliente c : vectorClientes)
            if (c.getCedula().equals(cedula))
                return c;
        return null;
    }

    public void registrarVehiculo() {
        sc.nextLine();
        System.out.println("Tipo de vehículo:");
        System.out.println("1. Carro Sedan");
        System.out.println("2. Camioneta SUV");
        System.out.print("Seleccione: ");
        int tipo = sc.nextInt();
        sc.nextLine();

        System.out.print("Placa: ");
        String placa = sc.nextLine();
        System.out.print("Marca: ");
        String marca = sc.nextLine();
        System.out.print("Modelo (año): ");
        int modelo = sc.nextInt();
        System.out.print("Precio diario: ");
        float precio = sc.nextFloat();
        sc.nextLine();

        if (tipo == 1) {
            System.out.print("Tipo de combustible (gasolina/diesel/electrico): ");
            String combustible = sc.nextLine();
            System.out.print("Transmisión (automatica/manual): ");
            String transmision = sc.nextLine();
            vectorVehiculos.add(new CarroSedan(placa, marca, modelo, precio, combustible, transmision));
        } else if (tipo == 2) {
            System.out.print("Tracción (4x2/4x4): ");
            String traccion = sc.nextLine();
            System.out.print("Capacidad maletero (litros): ");
            float maletero = sc.nextFloat();
            vectorVehiculos.add(new CamionetaSUV(placa, marca, modelo, precio, traccion, maletero));
        } else {
            System.out.println("Tipo de vehículo inválido.");
            return;
        }
        System.out.println("Vehículo registrado exitosamente.");
    }

    public void modificarVehiculo() {
        sc.nextLine();
        System.out.print("Ingrese la placa del vehículo a modificar: ");
        String placa = sc.nextLine();
        Vehiculo vehiculo = buscarVehiculoPorPlaca(placa);

        if (vehiculo == null) {
            System.out.println("Vehículo no encontrado.");
            return;
        }

        System.out.print("Nuevo precio diario: ");
        vehiculo.setPrecioDiario(sc.nextFloat());
        System.out.println("Vehículo modificado exitosamente.");
    }

    public void eliminarVehiculo() {
        sc.nextLine();
        System.out.print("Ingrese la placa del vehículo a eliminar: ");
        String placa = sc.nextLine();
        Vehiculo vehiculo = buscarVehiculoPorPlaca(placa);

        if (vehiculo == null) {
            System.out.println("Vehículo no encontrado.");
            return;
        }

        if (vehiculo.getEstado().equals("alquilado")) {
            System.out.println("No se puede eliminar un vehículo que está alquilado.");
            return;
        }

        vectorVehiculos.remove(vehiculo);
        System.out.println("Vehículo eliminado exitosamente.");
    }

    public void buscarVehiculo() {
        sc.nextLine();
        System.out.print("Ingrese la placa del vehículo: ");
        String placa = sc.nextLine();
        Vehiculo vehiculo = buscarVehiculoPorPlaca(placa);

        if (vehiculo == null)
            System.out.println("Vehículo no encontrado.");
        else
            System.out.println(vehiculo.getInfo());
    }

    private Vehiculo buscarVehiculoPorPlaca(String placa) {
        for (Vehiculo v : vectorVehiculos)
            if (v.getPlaca().equals(placa))
                return v;
        return null;
    }

    public void registrarContrato() {
        sc.nextLine();
        System.out.print("ID del contrato: ");
        String id = sc.nextLine();
        System.out.print("Cédula del cliente: ");
        String cedula = sc.nextLine();
        System.out.print("Placa del vehículo: ");
        String placa = sc.nextLine();

        Cliente cliente = buscarClientePorCedula(cedula);
        if (cliente == null) {
            System.out.println("Cliente no encontrado.");
            return;
        }

        Vehiculo vehiculo = buscarVehiculoPorPlaca(placa);
        if (vehiculo == null) {
            System.out.println("Vehículo no encontrado.");
            return;
        }

        if (vehiculo.getEstado().equals("alquilado")) {
            System.out.println("El vehículo ya está alquilado.");
            return;
        }

        for (ContratoRenting c : vectorContratos) {
            if (c.getCedulaCliente().equals(cedula)) {
                System.out.println("El cliente ya tiene un contrato activo.");
                return;
            }
        }

        System.out.print("Fecha inicio (DD/MM/AAAA): ");
        String fechaInicio = sc.nextLine();
        System.out.print("Fecha fin (DD/MM/AAAA): ");
        String fechaFin = sc.nextLine();
        System.out.print("Total días: ");
        int dias = sc.nextInt();
        System.out.print("Valor total: ");
        float valor = sc.nextFloat();

        ContratoRenting contrato = new ContratoRenting(id, cedula, placa, fechaInicio, fechaFin, dias, valor);
        vectorContratos.add(contrato);
        vehiculo.setEstado("alquilado");
        System.out.println("Contrato registrado exitosamente.");
    }

    public void modificarContrato() {
        sc.nextLine();
        System.out.print("Ingrese el ID del contrato a modificar: ");
        String id = sc.nextLine();
        ContratoRenting contrato = buscarContratoPorId(id);

        if (contrato == null) {
            System.out.println("Contrato no encontrado.");
            return;
        }

        System.out.print("Nueva fecha inicio (DD/MM/AAAA): ");
        contrato.setFechaInicio(sc.nextLine());
        System.out.print("Nueva fecha fin (DD/MM/AAAA): ");
        contrato.setFechaFin(sc.nextLine());
        System.out.print("Nuevo total días: ");
        contrato.setTotalDias(sc.nextInt());
        sc.nextLine();
        System.out.print("Nuevo valor total: ");
        contrato.setValorTotal(sc.nextFloat());
        System.out.println("Contrato modificado exitosamente.");
    }

    public void finalizarContrato() {
        sc.nextLine();
        System.out.print("Ingrese el ID del contrato a finalizar: ");
        String id = sc.nextLine();
        ContratoRenting contrato = buscarContratoPorId(id);

        if (contrato == null) {
            System.out.println("Contrato no encontrado.");
            return;
        }

        Vehiculo vehiculo = buscarVehiculoPorPlaca(contrato.getPlacaVehiculo());
        if (vehiculo != null)
            vehiculo.setEstado("disponible");

        vectorContratos.remove(contrato);
        System.out.println("Contrato finalizado. Vehículo disponible nuevamente.");
    }

    public void buscarContrato() {
        sc.nextLine();
        System.out.print("Ingrese el ID del contrato: ");
        String id = sc.nextLine();
        ContratoRenting contrato = buscarContratoPorId(id);

        if (contrato == null)
            System.out.println("Contrato no encontrado.");
        else
            System.out.println(contrato.toString());
    }

    private ContratoRenting buscarContratoPorId(String id) {
        for (ContratoRenting c : vectorContratos)
            if (c.getIdContrato().equals(id))
                return c;
        return null;
    }

    public void imprimirInformeGeneral() {
    System.out.println("\n========================================");
    System.out.println("         INFORME GENERAL DEL SISTEMA");
    System.out.println("========================================");

    System.out.println("\n--- CLIENTES REGISTRADOS ---");
    if (vectorClientes.isEmpty()) {
        System.out.println("No hay clientes registrados.");
    } else {
        for (Cliente c : vectorClientes)
            imprimir(c);
    }

    System.out.println("\n--- VEHÍCULOS REGISTRADOS ---");
    if (vectorVehiculos.isEmpty()) {
        System.out.println("No hay vehículos registrados.");
    } else {
        for (Vehiculo v : vectorVehiculos)
            imprimir(v);
    }

    System.out.println("\n--- CONTRATOS ACTIVOS ---");
    float totalIngresos = 0;
    boolean hayActivos = false;
    for (ContratoRenting c : vectorContratos) {
        imprimir(c);
        totalIngresos += c.getValorTotal();
        hayActivos = true;
    }
    if (!hayActivos)
        System.out.println("No hay contratos activos.");

    System.out.println("\n--- TOTAL DE INGRESOS GENERADOS ---");
    System.out.println("$ " + totalIngresos);
    System.out.println("========================================");
    }

    private void imprimir(Cliente c) {
        System.out.println(c.toString());
    }

    private void imprimir(Vehiculo v) {
        System.out.println(v.getInfo());
    }

    private void imprimir(ContratoRenting c) {
        System.out.println(c.toString());
    }
}