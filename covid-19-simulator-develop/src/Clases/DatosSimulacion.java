/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author DELL
 */
public class DatosSimulacion {
    private static DatosSimulacion datosSimulacion;
    
    private String poblacionElegida;
    private int cantidadPoblacion, cantidadPersonasInfectadas, tiempoSimulacion, duracionMedia;
    private double tasaInteraccion, probabilidadContagio, tasaRecuperacion, tasaMortalidad, tasaVacunacion;
    
    private DatosSimulacion(){}
    
    public synchronized static DatosSimulacion getDatosSimulacion(){
    
        if(datosSimulacion == null){
            datosSimulacion = new DatosSimulacion();
        }
        
        return datosSimulacion;
    }

    public String getPoblacionElegida() {
        return poblacionElegida;
    }

    public void setPoblacionElegida(String poblacionElegida) {
        this.poblacionElegida = poblacionElegida;
    }

    public int getCantidadPoblacion() {
        return cantidadPoblacion;
    }

    public void setCantidadPoblacion(int cantidadPoblacion) {
        this.cantidadPoblacion = cantidadPoblacion;
    }

    public int getCantidadPersonasInfectadas() {
        return cantidadPersonasInfectadas;
    }

    public void setCantidadPersonasInfectadas(int cantidadPersonasInfectadas) {
        this.cantidadPersonasInfectadas = cantidadPersonasInfectadas;
    }

    public int getTiempoSimulacion() {
        return tiempoSimulacion;
    }

    public void setTiempoSimulacion(int tiempoSimulacion) {
        this.tiempoSimulacion = tiempoSimulacion;
    }

    public int getDuracionMedia() {
        return duracionMedia;
    }

    public void setDuracionMedia(int duracionMedia) {
        this.duracionMedia = duracionMedia;
    }

    public double getTasaInteraccion() {
        return tasaInteraccion;
    }

    public void setTasaInteraccion(double tasaInteraccion) {
        this.tasaInteraccion = tasaInteraccion;
    }

    public double getProbabilidadContagio() {
        return probabilidadContagio;
    }

    public void setProbabilidadContagio(double probabilidadContagio) {
        this.probabilidadContagio = probabilidadContagio;
    }

    public double getTasaRecuperacion() {
        return tasaRecuperacion;
    }

    public void setTasaRecuperacion(double tasaRecuperacion) {
        this.tasaRecuperacion = tasaRecuperacion;
    }

    public double getTasaMortalidad() {
        return tasaMortalidad;
    }

    public void setTasaMortalidad(double tasaMortalidad) {
        this.tasaMortalidad = tasaMortalidad;
    }
    
    public double getTasaVacunacion() {
        return tasaVacunacion;
    }

    public void setTasaVacunacion(double tasaVacunacion) {
        this.tasaVacunacion = tasaVacunacion;
    }
    
    
}
