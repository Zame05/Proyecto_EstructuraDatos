public class CamionetaSUV extends Vehiculo {

    private String traccion;
    private float capacidadMaletero;

    public CamionetaSUV(String placa, String marca, int modelo, float precioDiario, String traccion, float capacidadMaletero) {
        super(placa, marca, modelo, precioDiario);
        if (!traccion.equals("4x2") && !traccion.equals("4x4"))
            throw new IllegalArgumentException("Tracción inválida.");
        if (!Validaciones.esPositivoDecimal(capacidadMaletero))
            throw new IllegalArgumentException("Capacidad de maletero inválida.");

        this.traccion = traccion;
        this.capacidadMaletero = capacidadMaletero;
    }

    public void setTraccion(String traccion) {
        if (traccion.equals("4x2") || traccion.equals("4x4"))
            this.traccion = traccion;
        else
            System.out.println("Tracción inválida.");
    }

    public void setCapacidadMaletero(float capacidadMaletero) {
        if (Validaciones.esPositivoDecimal(capacidadMaletero))
            this.capacidadMaletero = capacidadMaletero;
        else
            System.out.println("Capacidad de maletero inválida.");
    }

    public String getInfo() {
        return "CamionetaSUV [" + toString() + ", Tracción: " + traccion + ", Maletero: " + capacidadMaletero + "L]";
    }

    public String getTraccion() {
        return traccion;
    }

    public float getCapacidadMaletero() {
        return capacidadMaletero;
    }
}