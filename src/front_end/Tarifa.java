/**
Leyva Perez Victor Manuel
Espinoza López Manuel Ángel
Carmona Barbosa Geovani Gael
 */
package front_end;

public class Tarifa {

    private String tipoServicio;
    private String codigo;
    private int minutos;
    private double precioKM;
    private double costo;
    private String imagen;
    private String estado;

    public Tarifa(String tipoServicio, String codigo, int minutos, double precioKM, double costo, String imagen, String estado) {
        setTipoServicio(tipoServicio);
        setCodigo(codigo);
        setMinutos(minutos);
        setPrecioKM(precioKM);
        setCosto(costo);
        setImagen(imagen);
        setEstado(estado);
    }

    public Tarifa(String tipoServicio, String codigo, int minutos, double precioKM, double costo) {
        this(tipoServicio, codigo, minutos, precioKM, costo, "", "Activo");
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        if (tipoServicio == null || tipoServicio.equals("-")) {
            throw new IllegalArgumentException("Debe seleccionar un tipo de servicio valido.");
        }
        this.tipoServicio = tipoServicio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("El codigo no puede estar vacio.");
        }
        this.codigo = codigo.trim().toUpperCase();
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        if (minutos <= 0) {
            throw new IllegalArgumentException("Los minutos deben ser un valor positivo.");
        }
        this.minutos = minutos;
    }

    public double getPrecioKM() {
        return precioKM;
    }

    public void setPrecioKM(double precioKM) {
        if (precioKM <= 0) {
            throw new IllegalArgumentException("El precio por kilometro debe ser un valor positivo.");
        }
        this.precioKM = precioKM;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        if (costo < 0) {
            throw new IllegalArgumentException("El costo no puede ser negativo.");
        }
        this.costo = costo;
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
        return "Tarifa{" +
                "\n  Tipo de servicio: " + tipoServicio +
                "\n  Codigo: " + codigo +
                "\n  Minutos: " + minutos +
                "\n  Precio K/M: " + precioKM +
                "\n  Costo: " + costo +
                "\n  Imagen: " + imagen +
                "\n  Estado: " + estado +
                "\n}";
    }
}
