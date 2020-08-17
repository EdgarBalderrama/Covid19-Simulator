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
public class ResultadosSimulacion {
    private static ResultadosSimulacion resultadosSimulacion;
    
    private double totalContagiados, infectados, recuperados, fallecidos, vacunados, noAfectados;
    
    private ResultadosSimulacion(){}
    
    public synchronized static ResultadosSimulacion getResultadosSimulacion(){
    
        if(resultadosSimulacion == null){
            resultadosSimulacion = new ResultadosSimulacion();
        }
        
        return resultadosSimulacion;
    }

    public double getTotalContagiados() {
        return totalContagiados;
    }

    public void setTotalContagiados(double totalContagiados) {
        this.totalContagiados = totalContagiados;
    }

    public double getInfectados() {
        return infectados;
    }

    public void setInfectados(double infectados) {
        this.infectados = infectados;
    }

    public double getRecuperados() {
        return recuperados;
    }

    public void setRecuperados(double recuperados) {
        this.recuperados = recuperados;
    }

    public double getFallecidos() {
        return fallecidos;
    }

    public void setFallecidos(double fallecidos) {
        this.fallecidos = fallecidos;
    }

    public double getVacunados() {
        return vacunados;
    }

    public void setVacunados(double vacunados) {
        this.vacunados = vacunados;
    }

    public double getNoAfectados() {
        return noAfectados;
    }

    public void setNoAfectados(double noAfectados) {
        this.noAfectados = noAfectados;
    }
    
    
}
