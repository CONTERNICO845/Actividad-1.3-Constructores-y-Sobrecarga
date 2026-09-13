/**
Leyva Perez Victor Manuel
Espinoza López Manuel Ángel
Carmona Barbosa Geovani Gael
 */
package front_end;

public class Conductor {

    private String curp;
    private String nomCompleto;
    private String numLicencia;
    private String placas;
    private int edad;
    private String imagen;
    private String estado;

    public Conductor(String curp, String nomCompleto, String numLicencia, String placas, int edad, String imagen, String estado) {
        setCurp(curp);
        setNomCompleto(nomCompleto);
        setNumLicencia(numLicencia);
        setPlacas(placas);
        setEdad(edad);
        setImagen(imagen);
        setEstado(estado);
    }

    public Conductor(String curp, String nomCompleto, String numLicencia, String placas, int edad) {
        this(curp, nomCompleto, numLicencia, placas, edad, "", "Activo");
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

    public String getNomCompleto() {
        return nomCompleto;
    }

    public void setNomCompleto(String nomCompleto) {
        if (nomCompleto == null || nomCompleto.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre completo no puede estar vacio.");
        }
        this.nomCompleto = nomCompleto.trim();
    }

    public String getNumLicencia() {
        return numLicencia;
    }

    public void setNumLicencia(String numLicencia) {
        if (numLicencia == null || numLicencia.trim().isEmpty()) {
            throw new IllegalArgumentException("El numero de licencia no puede estar vacio.");
        }
        this.numLicencia = numLicencia.trim().toUpperCase();
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        if (placas == null || placas.trim().isEmpty()) {
            throw new IllegalArgumentException("Las placas no pueden estar vacias.");
        }
        this.placas = placas.trim().toUpperCase();
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 18 || edad > 70) {
            throw new IllegalArgumentException("La edad del conductor debe estar entre 18 y 70.");
        }
        this.edad = edad;
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
        return "Conductor{" +
                "\n  CURP: " + curp +
                "\n  Nombre completo: " + nomCompleto +
                "\n  Num. Licencia: " + numLicencia +
                "\n  Placas: " + placas +
                "\n  Edad: " + edad +
                "\n  Imagen: " + imagen +
                "\n  Estado: " + estado +
                "\n}";
    }
}
