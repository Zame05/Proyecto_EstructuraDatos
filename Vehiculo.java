public abstract class Vehiculo {

    private String placa;
    private String marca;
    private int modelo;
    private float precioDiario;
    private String estado;

    public Vehiculo(String placa, String marca, int modelo, float precioDiario) {
        if (!Validaciones.alfanumerico(placa, 0) || !Validaciones.noVacio(placa, 0))
            throw new IllegalArgumentException("Placa inválida.");
        if (!Validaciones.soloLetras(marca, 0) || !Validaciones.noVacio(marca, 0))
            throw new IllegalArgumentException("Marca inválida.");
        if (!Validaciones.enRango(modelo, 1990, 2026))
            throw new IllegalArgumentException("Modelo inválido.");
        if (!Validaciones.esPositivoDecimal(precioDiario))
            throw new IllegalArgumentException("Precio diario inválido.");

        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.precioDiario = precioDiario;
        this.estado = "disponible";
    }

    public abstract String getInfo();

    public void setPlaca(String placa) {
        if (Validaciones.alfanumerico(placa, 0) && Validaciones.noVacio(placa, 0))
            this.placa = placa;
        else
            System.out.println("Placa inválida.");
    }

    public void setMarca(String marca) {
        if (Validaciones.soloLetras(marca, 0) && Validaciones.noVacio(marca, 0))
            this.marca = marca;
        else
            System.out.println("Marca inválida.");
    }

    public void setModelo(int modelo) {
        if (Validaciones.enRango(modelo, 1990, 2026))
            this.modelo = modelo;
        else
            System.out.println("Modelo inválido.");
    }

    public void setPrecioDiario(float precioDiario) {
        if (Validaciones.esPositivoDecimal(precioDiario))
            this.precioDiario = precioDiario;
        else
            System.out.println("Precio diario inválido.");
    }

    public void setEstado(String estado) {
        if (estado.equals("disponible") || estado.equals("alquilado"))
            this.estado = estado;
        else
            System.out.println("Estado inválido: debe ser 'disponible' o 'alquilado'.");
    }

    public String toString() {
        return "Placa: " + placa + ", Marca: " + marca + ", Modelo: " + modelo +
               ", Precio/día: " + precioDiario + ", Estado: " + estado;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public int getModelo() {
        return modelo;
    }

    public float getPrecioDiario() {
        return precioDiario;
    }

    public String getEstado() {
        return estado;
    }

}