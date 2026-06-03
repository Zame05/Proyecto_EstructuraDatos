public class ContratoRenting {

    private String idContrato;
    private String cedulaCliente;
    private String placaVehiculo;
    private String fechaInicio;
    private String fechaFin;
    private int totalDias;
    private float valorTotal;

    public ContratoRenting(String idContrato, String cedulaCliente, String placaVehiculo, String fechaInicio, String fechaFin, int totalDias, float valorTotal) {
        if (!Validaciones.noVacio(idContrato, 0))
            throw new IllegalArgumentException("IdContrato inválido.");
        if (!Validaciones.soloNumeros(cedulaCliente, 0) || !Validaciones.noVacio(cedulaCliente, 0))
            throw new IllegalArgumentException("Cédula del cliente inválida.");
        if (!Validaciones.alfanumerico(placaVehiculo, 0) || !Validaciones.noVacio(placaVehiculo, 0))
            throw new IllegalArgumentException("Placa del vehículo inválida.");
        if (!Validaciones.noVacio(fechaInicio, 0))
            throw new IllegalArgumentException("Fecha de inicio inválida.");
        if (!Validaciones.noVacio(fechaFin, 0))
            throw new IllegalArgumentException("Fecha de fin inválida.");
        if (!Validaciones.esPositivo(totalDias))
            throw new IllegalArgumentException("Total de días inválido.");
        if (!Validaciones.esPositivoDecimal(valorTotal))
            throw new IllegalArgumentException("Valor total inválido.");

        this.idContrato = idContrato;
        this.cedulaCliente = cedulaCliente;
        this.placaVehiculo = placaVehiculo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.totalDias = totalDias;
        this.valorTotal = valorTotal;
    }

    public String getIdContrato() { return idContrato; }
    public String getCedulaCliente() { return cedulaCliente; }
    public String getPlacaVehiculo() { return placaVehiculo; }

    public String getFechaInicio() { return fechaInicio; }
    public void setFechaInicio(String fechaInicio) {
        if (Validaciones.noVacio(fechaInicio, 0))
            this.fechaInicio = fechaInicio;
        else
            System.out.println("Fecha de inicio inválida.");
    }

    public String getFechaFin() { return fechaFin; }
    public void setFechaFin(String fechaFin) {
        if (Validaciones.noVacio(fechaFin, 0))
            this.fechaFin = fechaFin;
        else
            System.out.println("Fecha de fin inválida.");
    }

    public int getTotalDias() { return totalDias; }
    public void setTotalDias(int totalDias) {
        if (Validaciones.esPositivo(totalDias))
            this.totalDias = totalDias;
        else
            System.out.println("Total de días inválido.");
    }

    public float getValorTotal() { return valorTotal; }
    public void setValorTotal(float valorTotal) {
        if (Validaciones.esPositivoDecimal(valorTotal))
            this.valorTotal = valorTotal;
        else
            System.out.println("Valor total inválido.");
    }

    public String toString() {
        return "Contrato [ID: " + idContrato + ", Cliente: " + cedulaCliente +
               ", Vehículo: " + placaVehiculo + ", Inicio: " + fechaInicio +
               ", Fin: " + fechaFin + ", Días: " + totalDias +
               ", Valor: $" + valorTotal + "]";
    }
}