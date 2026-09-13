/**
Leyva Perez Victor Manuel
Espinoza López Manuel Ángel
Carmona Barbosa Geovani Gael
 */
package front_end;

public class Administrador {

    private String curp;
    private String nombres;
    private String apellidos;
    private String numEmpleado;
    private String turno;
    private String imagen;
    private String estado;

    public Administrador(String curp, String nombres, String apellidos, String numEmpleado, String turno, String imagen, String estado) {
        setCurp(curp);
        setNombres(nombres);
        setApellidos(apellidos);
        setNumEmpleado(numEmpleado);
        setTurno(turno);
        setImagen(imagen);
        setEstado(estado);
    }

    public Administrador(String curp, String nombres, String apellidos, String numEmpleado, String turno) {
        this(curp, nombres, apellidos, numEmpleado, turno, "", "Activo");
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

    public String getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(String numEmpleado) {
        if (numEmpleado == null || numEmpleado.trim().isEmpty()) {
            throw new IllegalArgumentException("El numero de empleado no puede estar vacio.");
        }
        this.numEmpleado = numEmpleado.trim();
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        if (turno == null || turno.equals("-")) {
            throw new IllegalArgumentException("Debe seleccionar un turno valido.");
        }
        this.turno = turno;
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
        return "Administrador{" +
                "\n  CURP: " + curp +
                "\n  Nombres: " + nombres +
                "\n  Apellidos: " + apellidos +
                "\n  Num. Empleado: " + numEmpleado +
                "\n  Turno: " + turno +
                "\n  Imagen: " + imagen +
                "\n  Estado: " + estado +
                "\n}";
    }
}
