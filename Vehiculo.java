public abstract class Vehiculo {

    private String placa;
    private String marca;
    private int modelo;
    private float precioDiario;
    private String estado;

public Vehiculo(String placa, String marca, int modelo, float precioDiario) {
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
            System.out.println("Placa invalida.");
    }

    public void setMarca(String marca) {
        if (Validaciones.soloLetras(marca, 0) && Validaciones.noVacio(marca, 0))
            this.marca = marca;
        else
            System.out.println("Marca invalida.");
    }

    public void setModelo(int modelo) {
        if (Validaciones.enRango(modelo, 1990, 2026))
            this.modelo = modelo;
        else
            System.out.println("Modelo invalido.");
    }

    public void setPrecioDiario(float precioDiario) {
        if (Validaciones.esPositivoDecimal(precioDiario))
            this.precioDiario = precioDiario;
        else
            System.out.println("Precio diario invalido.");
    }

    public void setEstado(String estado) {
        if (estado.equals("disponible") || estado.equals("alquilado"))
            this.estado = estado;
        else
            System.out.println("Estado invalido: debe ser 'disponible' o 'alquilado'.");
    }

    public String toString() {
        return "Placa: " + placa + ", Marca: " + marca + ", Modelo: " + modelo +
               ", Precio/dia: " + precioDiario + ", Estado: " + estado;
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