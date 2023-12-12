package com.proyecto.proyectocalidad.Constantes;

public enum Rutas {
    IMAGENES("C:\\Users\\Jose\\Documents\\Archivos Jose\\UNIVERSIDAD\\Sexto\\Calidad de Software\\Proyecto\\");

    private final String ruta;

    Rutas(String ruta) {
        this.ruta = ruta;
    }

    public String getRuta() {
        return ruta;
    }
}
