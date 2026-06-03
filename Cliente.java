public class Cliente {

    private String cedula;
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
    private String licenciaConduccion;

    public Cliente(String cedula, String nombre, String apellido, String telefono, String direccion, String licenciaConduccion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.licenciaConduccion = licenciaConduccion;
    }

    public void setCedula(String cedula) {
        if (Validaciones.soloNumeros(cedula, 0) && Validaciones.noVacio(cedula, 0))
            this.cedula = cedula;
        else
            System.out.println("Cedula invalida: solo numeros, sin caracteres especiales.");
    }


    public void setNombre(String nombre) {
        if (Validaciones.soloLetras(nombre, 0) && Validaciones.noVacio(nombre, 0))
            this.nombre = nombre;
        else
            System.out.println("Nombre invalido: solo letras, sin numeros ni caracteres especiales.");
    }


    public void setApellido(String apellido) {
        if (Validaciones.soloLetras(apellido, 0) && Validaciones.noVacio(apellido, 0))
            this.apellido = apellido;
        else
            System.out.println("Apellido invalido: solo letras, sin numeros ni caracteres especiales.");
    }

    public void setTelefono(String telefono) {
        if (Validaciones.soloNumeros(telefono, 0) && Validaciones.noVacio(telefono, 0))
            this.telefono = telefono;
        else
            System.out.println("Telefono invalido: solo numeros.");
    }


    public void setDireccion(String direccion) {
        if (Validaciones.noVacio(direccion, 0))
            this.direccion = direccion;
        else
            System.out.println("Direccion invalida: no puede estar vacia.");
    }

    public void setLicenciaConduccion(String licenciaConduccion) {
        if (Validaciones.alfanumerico(licenciaConduccion, 0) && Validaciones.noVacio(licenciaConduccion, 0))
            this.licenciaConduccion = licenciaConduccion;
        else
            System.out.println("Licencia invalida: solo letras y numeros.");
    }

    public String toString() {
        return "Cliente [Cedula: " + cedula + ", Nombre: " + nombre + " " + apellido +
               ", Telefono: " + telefono + ", Direccion: " + direccion +
               ", Licencia: " + licenciaConduccion + "]";
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getLicenciaConduccion() {
        return licenciaConduccion;
    }
}