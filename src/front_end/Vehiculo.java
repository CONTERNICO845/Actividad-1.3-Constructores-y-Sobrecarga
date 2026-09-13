/**
Leyva Perez Victor Manuel
Espinoza López Manuel Ángel
Carmona Barbosa Geovani Gael
 */
package front_end;

public class Vehiculo {

    private String placas;
    private String marca;
    private String modelo;
    private int anio;
    private String color;
    private String imagen;
    private String estado;

    public Vehiculo(String placas, String marca, String modelo, int anio, String color, String imagen, String estado) {
        setPlacas(placas);
        setMarca(marca);
        setModelo(modelo);
        setAnio(anio);
        setColor(color);
        setImagen(imagen);
        setEstado(estado);
    }

    public Vehiculo(String placas, String marca, String modelo, int anio, String color) {
        this(placas, marca, modelo, anio, color, "", "Activo");
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        if (placas == null || placas.trim().isEmpty()) {
            throw new IllegalArgumentException("Las placas no pueden estar vacias.");
        }
        if (!placas.trim().matches("[A-Z0-9]{6,7}")) {
            throw new IllegalArgumentException("Las placas deben tener entre 6 y 7 caracteres alfanumericos.");
        }
        this.placas = placas.trim().toUpperCase();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.trim().isEmpty()) {
            throw new IllegalArgumentException("La marca no puede estar vacia.");
        }
        this.marca = marca.trim();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.trim().isEmpty()) {
            throw new IllegalArgumentException("El modelo no puede estar vacio.");
        }
        this.modelo = modelo.trim();
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        if (anio < 2000 || anio > 2026) {
            throw new IllegalArgumentException("El año debe estar entre 2000 y 2026.");
        }
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.trim().isEmpty()) {
            throw new IllegalArgumentException("El color no puede estar vacio.");
        }
        this.color = color.trim();
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
        return "Vehiculo{" +
                "\n  Placas: " + placas +
                "\n  Marca: " + marca +
                "\n  Modelo: " + modelo +
                "\n  Anio: " + anio +
                "\n  Color: " + color +
                "\n  Imagen: " + imagen +
                "\n  Estado: " + estado +
                "\n}";
    }
}
