public class Cliente {

    private String cedula;
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
    private String licenciaConduccion;

    public Cliente(String cedula, String nombre, String apellido, String telefono, String direccion, String licenciaConduccion) {
        if (!Validaciones.soloNumeros(cedula, 0) || !Validaciones.noVacio(cedula, 0))
            throw new IllegalArgumentException("Cédula inválida.");
        if (!Validaciones.soloLetras(nombre, 0) || !Validaciones.noVacio(nombre, 0))
            throw new IllegalArgumentException("Nombre inválido.");
        if (!Validaciones.soloLetras(apellido, 0) || !Validaciones.noVacio(apellido, 0))
            throw new IllegalArgumentException("Apellido inválido.");
        if (!Validaciones.soloNumeros(telefono, 0) || !Validaciones.noVacio(telefono, 0))
            throw new IllegalArgumentException("Teléfono inválido.");
        if (!Validaciones.noVacio(direccion, 0))
            throw new IllegalArgumentException("Dirección inválida.");
        if (!Validaciones.alfanumerico(licenciaConduccion, 0) || !Validaciones.noVacio(licenciaConduccion, 0))
            throw new IllegalArgumentException("Licencia inválida.");

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
            System.out.println("Cédula inválida: solo números, sin caracteres especiales.");
    }


    public void setNombre(String nombre) {
        if (Validaciones.soloLetras(nombre, 0) && Validaciones.noVacio(nombre, 0))
            this.nombre = nombre;
        else
            System.out.println("Nombre inválido: solo letras, sin números ni caracteres especiales.");
    }


    public void setApellido(String apellido) {
        if (Validaciones.soloLetras(apellido, 0) && Validaciones.noVacio(apellido, 0))
            this.apellido = apellido;
        else
            System.out.println("Apellido inválido: solo letras, sin números ni caracteres especiales.");
    }

    public void setTelefono(String telefono) {
        if (Validaciones.soloNumeros(telefono, 0) && Validaciones.noVacio(telefono, 0))
            this.telefono = telefono;
        else
            System.out.println("Teléfono inválido: solo números.");
    }


    public void setDireccion(String direccion) {
        if (Validaciones.noVacio(direccion, 0))
            this.direccion = direccion;
        else
            System.out.println("Dirección inválida: no puede estar vacía.");
    }

    public void setLicenciaConduccion(String licenciaConduccion) {
        if (Validaciones.alfanumerico(licenciaConduccion, 0) && Validaciones.noVacio(licenciaConduccion, 0))
            this.licenciaConduccion = licenciaConduccion;
        else
            System.out.println("Licencia inválida: solo letras y números.");
    }

    public String toString() {
        return "Cliente [Cédula: " + cedula + ", Nombre: " + nombre + " " + apellido +
               ", Teléfono: " + telefono + ", Dirección: " + direccion +
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