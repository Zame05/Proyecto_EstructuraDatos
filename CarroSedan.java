public class CarroSedan extends Vehiculo {

    private String tipoCombustible;
    private String transmision;

    public CarroSedan(String placa, String marca, int modelo, float precioDiario, String tipoCombustible, String transmision) {
        super(placa, marca, modelo, precioDiario);
        if (!tipoCombustible.equals("gasolina") && !tipoCombustible.equals("diesel") && !tipoCombustible.equals("electrico"))
            throw new IllegalArgumentException("Tipo de combustible inválido.");
        if (!transmision.equals("automatica") && !transmision.equals("manual"))
            throw new IllegalArgumentException("Transmisión inválida.");

        this.tipoCombustible = tipoCombustible;
        this.transmision = transmision;
    }

    public void setTipoCombustible(String tipoCombustible) {
        if (tipoCombustible.equals("gasolina") || tipoCombustible.equals("diesel") || tipoCombustible.equals("electrico"))
            this.tipoCombustible = tipoCombustible;
        else
            System.out.println("Tipo de combustible inválido.");
    }

    public void setTransmision(String transmision) {
        if (transmision.equals("automatica") || transmision.equals("manual"))
            this.transmision = transmision;
        else
            System.out.println("Transmisión inválida.");
    }

    public String getInfo() {
        return "CarroSedan [" + toString() + ", Combustible: " + tipoCombustible + ", Transmisión: " + transmision + "]";
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public String getTransmision() {
        return transmision;
    }
}