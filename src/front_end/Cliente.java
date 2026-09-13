/**
Leyva Perez Victor Manuel
Espinoza López Manuel Ángel
Carmona Barbosa Geovani Gael
 */
package front_end;

public class Cliente {

    private String curp;
    private String nombres;
    private String apellidos;
    private int edad;
    private String telefono;
    private String imagen;
    private String estado;

    public Cliente(String curp, String nombres, String apellidos, int edad, String telefono, String imagen, String estado) {
        setCurp(curp);
        setNombres(nombres);
        setApellidos(apellidos);
        setEdad(edad);
        setTelefono(telefono);
        setImagen(imagen);
        setEstado(estado);
    }

    public Cliente(String curp, String nombres, String apellidos, int edad, String telefono) {
        this(curp, nombres, apellidos, edad, telefono, "", "Activo");
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        if (curp == null || curp.trim().isEmpty()) {
            throw new IllegalArgumentException("El CURP no puede estar vacio.");
        }
        if (curp.trim().length() != 18) {
            throw new IllegalArgumentException("El CURP debe tener 18 caracteres.");
        }
        this.curp = curp.trim().toUpperCase();
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        if (nombres == null || nombres.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacio.");
        }
        this.nombres = nombres.trim();
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        if (apellidos == null || apellidos.trim().isEmpty()) {
            throw new IllegalArgumentException("Los apellidos no pueden estar vacios.");
        }
        this.apellidos = apellidos.trim();
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 18 || edad > 100) {
            throw new IllegalArgumentException("La edad debe estar entre 18 y 100.");
        }
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono == null || telefono.trim().isEmpty()) {
            throw new IllegalArgumentException("El telefono no puede estar vacio.");
        }
        if (!telefono.trim().matches("\\d{10}")) {
            throw new IllegalArgumentException("El telefono debe tener 10 digitos numericos.");
        }
        this.telefono = telefono.trim();
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = (imagen == null) ? "" : imagen.trim();
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        if (estado == null || estado.trim().isEmpty()) {
            throw new IllegalArgumentException("El estado no puede estar vacio.");
        }
        this.estado = estado.trim();
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "\n  CURP: " + curp +
                "\n  Nombres: " + nombres +
                "\n  Apellidos: " + apellidos +
                "\n  Edad: " + edad +
                "\n  Telefono: " + telefono +
                "\n  Imagen: " + imagen +
                "\n  Estado: " + estado +
                "\n}";
    }
}
