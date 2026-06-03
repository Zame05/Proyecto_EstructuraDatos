import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Metodos {

    private ArrayList<Cliente> vectorClientes = new ArrayList<>();
    private ArrayList<Vehiculo> vectorVehiculos = new ArrayList<>();
    private ArrayList<ContratoRenting> vectorContratos = new ArrayList<>();

    public void registrarCliente(Scanner sc) {
        try {
            sc.nextLine();

            String cedula;
            do {
                System.out.print("Cédula: ");
                cedula = sc.nextLine();
                if (!Validaciones.soloNumeros(cedula, 0) || !Validaciones.noVacio(cedula, 0))
                    System.out.println("Cédula inválida: solo números, sin caracteres especiales.");
            } while (!Validaciones.soloNumeros(cedula, 0) || !Validaciones.noVacio(cedula, 0));

            String nombre;
            do {
                System.out.print("Nombre: ");
                nombre = sc.nextLine();
                if (!Validaciones.soloLetras(nombre, 0) || !Validaciones.noVacio(nombre, 0))
                    System.out.println("Nombre inválido: solo letras, sin números ni caracteres especiales.");
            } while (!Validaciones.soloLetras(nombre, 0) || !Validaciones.noVacio(nombre, 0));

            String apellido;
            do {
                System.out.print("Apellido: ");
                apellido = sc.nextLine();
                if (!Validaciones.soloLetras(apellido, 0) || !Validaciones.noVacio(apellido, 0))
                    System.out.println("Apellido inválido: solo letras, sin números ni caracteres especiales.");
            } while (!Validaciones.soloLetras(apellido, 0) || !Validaciones.noVacio(apellido, 0));

            String telefono;
            do {
                System.out.print("Teléfono: ");
                telefono = sc.nextLine();
                if (!Validaciones.soloNumeros(telefono, 0) || !Validaciones.noVacio(telefono, 0))
                    System.out.println("Teléfono inválido: solo números.");
            } while (!Validaciones.soloNumeros(telefono, 0) || !Validaciones.noVacio(telefono, 0));

            String direccion;
            do {
                System.out.print("Dirección: ");
                direccion = sc.nextLine();
                if (!Validaciones.noVacio(direccion, 0))
                    System.out.println("Dirección inválida: no puede estar vacía.");
            } while (!Validaciones.noVacio(direccion, 0));

            String licencia;
            do {
                System.out.print("Licencia de conducción: ");
                licencia = sc.nextLine();
                if (!Validaciones.alfanumerico(licencia, 0) || !Validaciones.noVacio(licencia, 0))
                    System.out.println("Licencia inválida: solo letras y números.");
            } while (!Validaciones.alfanumerico(licencia, 0) || !Validaciones.noVacio(licencia, 0));

            Cliente c = new Cliente(cedula, nombre, apellido, telefono, direccion, licencia);
            vectorClientes.add(c);
            System.out.println("Cliente registrado exitosamente.");
        } catch (Exception e) {
            System.out.println("Error al registrar cliente: " + e.getMessage());
        }
    }

    public void modificarCliente(Scanner sc) {
        try {
            sc.nextLine();
            System.out.print("Ingrese la cédula del cliente a modificar: ");
            String cedula = sc.nextLine();
            Cliente cliente = buscarClientePorCedula(cedula);

            if (cliente == null) {
                System.out.println("Cliente no encontrado.");
                return;
            }

            System.out.print("Nuevo teléfono: ");
            cliente.setTelefono(sc.nextLine());
            System.out.print("Nueva dirección: ");
            cliente.setDireccion(sc.nextLine());
            System.out.println("Cliente modificado exitosamente.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void eliminarCliente(Scanner sc) {
        try {
            sc.nextLine();
            System.out.print("Ingrese la cédula del cliente a eliminar: ");
            String cedula = sc.nextLine();
            Cliente cliente = buscarClientePorCedula(cedula);

            if (cliente == null) {
                System.out.println("Cliente no encontrado.");
                return;
            }

            vectorContratos.removeIf(c -> c.getCedulaCliente().equals(cedula));
            vectorClientes.remove(cliente);
            System.out.println("Cliente y sus contratos eliminados exitosamente.");
        } catch (Exception e) {
            System.out.println("Error al eliminar cliente: " + e.getMessage());
        }
    }

    public void buscarCliente(Scanner sc) {
        try {
            sc.nextLine();
            System.out.print("Ingrese la cédula del cliente: ");
            String cedula = sc.nextLine();
            Cliente cliente = buscarClientePorCedula(cedula);

            if (cliente == null)
                System.out.println("Cliente no encontrado.");
            else
                System.out.println(cliente.toString());
        } catch (Exception e) {
            System.out.println("Error al buscar cliente: " + e.getMessage());
        }
    }

    private Cliente buscarClientePorCedula(String cedula) {
        for (Cliente c : vectorClientes)
            if (c.getCedula().equals(cedula))
                return c;
        return null;
    }

public void registrarVehiculo(Scanner sc) {
    try {
        sc.nextLine();

        System.out.println("Tipo de vehículo:");
        System.out.println("1. Carro Sedan");
        System.out.println("2. Camioneta SUV");
        int tipo;
        do {
            System.out.print("Seleccione: ");
            while (!sc.hasNextInt()) {
                System.out.println("Tipo inválido: ingrese 1 o 2.");
                sc.nextLine();
            }
            tipo = sc.nextInt();
            sc.nextLine();
            if (tipo != 1 && tipo != 2)
                System.out.println("Tipo inválido: ingrese 1 o 2.");
        } while (tipo != 1 && tipo != 2);

        String placa;
        do {
            System.out.print("Placa: ");
            placa = sc.nextLine();
            if (!Validaciones.alfanumerico(placa, 0) || !Validaciones.noVacio(placa, 0))
                System.out.println("Placa inválida: solo letras y números.");
        } while (!Validaciones.alfanumerico(placa, 0) || !Validaciones.noVacio(placa, 0));

        String marca;
        do {
            System.out.print("Marca: ");
            marca = sc.nextLine();
            if (!Validaciones.soloLetras(marca, 0) || !Validaciones.noVacio(marca, 0))
                System.out.println("Marca inválida: solo letras, sin números ni símbolos.");
        } while (!Validaciones.soloLetras(marca, 0) || !Validaciones.noVacio(marca, 0));

        int modelo;
        do {
            System.out.print("Modelo (año): ");
            while (!sc.hasNextInt()) {
                System.out.println("Modelo inválido: ingrese un número.");
                sc.nextLine();
            }
            modelo = sc.nextInt();
            sc.nextLine();
            if (!Validaciones.enRango(modelo, 1990, 2026))
                System.out.println("Modelo inválido: debe estar entre 1990 y 2026.");
        } while (!Validaciones.enRango(modelo, 1990, 2026));

        float precio;
        do {
            System.out.print("Precio diario: ");
            while (!sc.hasNextFloat()) {
                System.out.println("Precio inválido: ingrese un número positivo.");
                sc.nextLine();
            }
            precio = sc.nextFloat();
            sc.nextLine();
            if (!Validaciones.esPositivoDecimal(precio))
                System.out.println("Precio inválido: debe ser mayor a 0.");
        } while (!Validaciones.esPositivoDecimal(precio));

        if (tipo == 1) {
            String combustible;
            do {
                System.out.print("Tipo de combustible (gasolina/diesel/electrico): ");
                combustible = sc.nextLine();
                if (!combustible.equals("gasolina") && !combustible.equals("diesel") && !combustible.equals("electrico"))
                    System.out.println("Combustible inválido: gasolina, diesel o electrico.");
            } while (!combustible.equals("gasolina") && !combustible.equals("diesel") && !combustible.equals("electrico"));

            String transmision;
            do {
                System.out.print("Transmisión (automatica/manual): ");
                transmision = sc.nextLine();
                if (!transmision.equals("automatica") && !transmision.equals("manual"))
                    System.out.println("Transmisión inválida: automatica o manual.");
            } while (!transmision.equals("automatica") && !transmision.equals("manual"));

            vectorVehiculos.add(new CarroSedan(placa, marca, modelo, precio, combustible, transmision));

        } else {
            String traccion;
            do {
                System.out.print("Tracción (4x2/4x4): ");
                traccion = sc.nextLine();
                if (!traccion.equals("4x2") && !traccion.equals("4x4"))
                    System.out.println("Tracción inválida: 4x2 o 4x4.");
            } while (!traccion.equals("4x2") && !traccion.equals("4x4"));

            float maletero;
            do {
                System.out.print("Capacidad maletero (litros): ");
                while (!sc.hasNextFloat()) {
                    System.out.println("Capacidad inválida: ingrese un número positivo.");
                    sc.nextLine();
                }
                maletero = sc.nextFloat();
                sc.nextLine();
                if (!Validaciones.esPositivoDecimal(maletero))
                    System.out.println("Capacidad inválida: debe ser mayor a 0.");
            } while (!Validaciones.esPositivoDecimal(maletero));

            vectorVehiculos.add(new CamionetaSUV(placa, marca, modelo, precio, traccion, maletero));
        }

        System.out.println("Vehículo registrado exitosamente.");
    } catch (Exception e) {
        System.out.println("Error al registrar vehículo: " + e.getMessage());
    }
}
    public void modificarVehiculo(Scanner sc) {
        try {
            sc.nextLine();
            System.out.print("Ingrese la placa del vehículo a modificar: ");
            String placa = sc.nextLine();
            Vehiculo vehiculo = buscarVehiculoPorPlaca(placa);

            if (vehiculo == null) {
                System.out.println("Vehículo no encontrado.");
                return;
            }

            System.out.print("Nuevo precio diario: ");
            vehiculo.setPrecioDiario(sc.nextFloat());
            System.out.println("Vehículo modificado exitosamente.");
        } catch (InputMismatchException e) {
            System.out.println("Error: ingrese un valor numérico para el precio.");
            sc.nextLine();
        }
    }

    public void eliminarVehiculo(Scanner sc) {
        try {
            sc.nextLine();
            System.out.print("Ingrese la placa del vehículo a eliminar: ");
            String placa = sc.nextLine();
            Vehiculo vehiculo = buscarVehiculoPorPlaca(placa);

            if (vehiculo == null) {
                System.out.println("Vehículo no encontrado.");
                return;
            }

            if (vehiculo.getEstado().equals("alquilado")) {
                System.out.println("No se puede eliminar un vehículo que está alquilado.");
                return;
            }

            vectorVehiculos.remove(vehiculo);
            System.out.println("Vehículo eliminado exitosamente.");
        } catch (Exception e) {
            System.out.println("Error al eliminar vehículo: " + e.getMessage());
        }
    }

    public void buscarVehiculo(Scanner sc) {
        try {
            sc.nextLine();
            System.out.print("Ingrese la placa del vehículo: ");
            String placa = sc.nextLine();
            Vehiculo vehiculo = buscarVehiculoPorPlaca(placa);

            if (vehiculo == null)
                System.out.println("Vehículo no encontrado.");
            else
                System.out.println(vehiculo.getInfo());
        } catch (Exception e) {
            System.out.println("Error al buscar vehículo: " + e.getMessage());
        }
    }

    private Vehiculo buscarVehiculoPorPlaca(String placa) {
        for (Vehiculo v : vectorVehiculos)
            if (v.getPlaca().equals(placa))
                return v;
        return null;
    }

public void registrarContrato(Scanner sc) {
    try {
        sc.nextLine();

        String id;
        do {
            System.out.print("ID del contrato: ");
            id = sc.nextLine();
            if (!Validaciones.noVacio(id, 0))
                System.out.println("ID inválido: no puede estar vacío.");
        } while (!Validaciones.noVacio(id, 0));

        String cedula;
        do {
            System.out.print("Cédula del cliente: ");
            cedula = sc.nextLine();
            if (!Validaciones.soloNumeros(cedula, 0) || !Validaciones.noVacio(cedula, 0))
                System.out.println("Cédula inválida: solo números.");
        } while (!Validaciones.soloNumeros(cedula, 0) || !Validaciones.noVacio(cedula, 0));

        Cliente cliente = buscarClientePorCedula(cedula);
        if (cliente == null) {
            System.out.println("Cliente no encontrado.");
            return;
        }

        for (ContratoRenting c : vectorContratos) {
            if (c.getCedulaCliente().equals(cedula)) {
                System.out.println("El cliente ya tiene un contrato activo.");
                return;
            }
        }

        String placa;
        do {
            System.out.print("Placa del vehículo: ");
            placa = sc.nextLine();
            if (!Validaciones.alfanumerico(placa, 0) || !Validaciones.noVacio(placa, 0))
                System.out.println("Placa inválida: solo letras y números.");
        } while (!Validaciones.alfanumerico(placa, 0) || !Validaciones.noVacio(placa, 0));

        Vehiculo vehiculo = buscarVehiculoPorPlaca(placa);
        if (vehiculo == null) {
            System.out.println("Vehículo no encontrado.");
            return;
        }

        if (vehiculo.getEstado().equals("alquilado")) {
            System.out.println("El vehículo ya está alquilado.");
            return;
        }

        String fechaInicio;
        do {
            System.out.print("Fecha inicio (DD/MM/AAAA): ");
            fechaInicio = sc.nextLine();
            if (!Validaciones.noVacio(fechaInicio, 0))
                System.out.println("Fecha de inicio inválida: no puede estar vacía.");
        } while (!Validaciones.noVacio(fechaInicio, 0));

        String fechaFin;
        do {
            System.out.print("Fecha fin (DD/MM/AAAA): ");
            fechaFin = sc.nextLine();
            if (!Validaciones.noVacio(fechaFin, 0))
                System.out.println("Fecha de fin inválida: no puede estar vacía.");
        } while (!Validaciones.noVacio(fechaFin, 0));

        int dias;
        do {
            System.out.print("Total días: ");
            while (!sc.hasNextInt()) {
                System.out.println("Días inválidos: ingrese un número positivo.");
                sc.nextLine();
            }
            dias = sc.nextInt();
            sc.nextLine();
            if (!Validaciones.esPositivo(dias))
                System.out.println("Días inválidos: debe ser mayor a 0.");
        } while (!Validaciones.esPositivo(dias));

        float valor;
        do {
            System.out.print("Valor total: ");
            while (!sc.hasNextFloat()) {
                System.out.println("Valor inválido: ingrese un número positivo.");
                sc.nextLine();
            }
            valor = sc.nextFloat();
            sc.nextLine();
            if (!Validaciones.esPositivoDecimal(valor))
                System.out.println("Valor inválido: debe ser mayor a 0.");
        } while (!Validaciones.esPositivoDecimal(valor));

        ContratoRenting contrato = new ContratoRenting(id, cedula, placa, fechaInicio, fechaFin, dias, valor);
        vectorContratos.add(contrato);
        vehiculo.setEstado("alquilado");
        System.out.println("Contrato registrado exitosamente.");
    } catch (Exception e) {
        System.out.println("Error al registrar contrato: " + e.getMessage());
    }
}
    public void modificarContrato(Scanner sc) {
        try {
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
            System.out.print("Nuevo total días: ");
            contrato.setTotalDias(sc.nextInt());
            sc.nextLine();
            System.out.print("Nuevo valor total: ");
            contrato.setValorTotal(sc.nextFloat());
            System.out.println("Contrato modificado exitosamente.");
        } catch (InputMismatchException e) {
            System.out.println("Error: ingrese un valor numérico donde corresponde.");
            sc.nextLine();
        }
    }

    public void finalizarContrato(Scanner sc) {
        try {
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
            System.out.println("Contrato finalizado. Vehículo disponible nuevamente.");
        } catch (Exception e) {
            System.out.println("Error al finalizar contrato: " + e.getMessage());
        }
    }

    public void buscarContrato(Scanner sc) {
        try {
            sc.nextLine();
            System.out.print("Ingrese el ID del contrato: ");
            String id = sc.nextLine();
            ContratoRenting contrato = buscarContratoPorId(id);

            if (contrato == null)
                System.out.println("Contrato no encontrado.");
            else
                System.out.println(contrato.toString());
        } catch (Exception e) {
            System.out.println("Error al buscar contrato: " + e.getMessage());
        }
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

        System.out.println("\n CLIENTES REGISTRADOS ");
        if (vectorClientes.isEmpty())
            System.out.println("No hay clientes registrados.");
        else
            for (Cliente c : vectorClientes)
                imprimir(c);

        System.out.println("\n VEHÍCULOS REGISTRADOS ");
        if (vectorVehiculos.isEmpty())
            System.out.println("No hay vehículos registrados.");
        else
            for (Vehiculo v : vectorVehiculos)
                imprimir(v);

        System.out.println("\n CONTRATOS ACTIVOS ");
        float totalIngresos = 0;
        boolean hayActivos = false;
        for (ContratoRenting c : vectorContratos) {
            imprimir(c);
            totalIngresos += c.getValorTotal();
            hayActivos = true;
        }
        if (!hayActivos)
            System.out.println("No hay contratos activos.");

        System.out.println("\n TOTAL DE INGRESOS GENERADOS ");
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