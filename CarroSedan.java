public class CarroSedan extends Vehiculo {

    private String tipoCombustible;
    private String transmision;

public CarroSedan(String placa, String marca, int modelo, float precioDiario, String tipoCombustible, String transmision) {
    super(placa, marca, modelo, precioDiario);
    this.tipoCombustible = tipoCombustible;
    this.transmision = transmision;
}

    public void setTipoCombustible(String tipoCombustible) {
        if (tipoCombustible.equals("gasolina") || tipoCombustible.equals("diesel") || tipoCombustible.equals("electrico"))
            this.tipoCombustible = tipoCombustible;
        else
            System.out.println("Tipo de combustible invalido.");
    }

    public void setTransmision(String transmision) {
        if (transmision.equals("automatica") || transmision.equals("manual"))
            this.transmision = transmision;
        else
            System.out.println("Transmision invalida.");
    }

    public String getInfo() {
        return "CarroSedan [" + toString() + ", Combustible: " + tipoCombustible + ", Transmision: " + transmision + "]";
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public String getTransmision() {
        return transmision;
    }
}