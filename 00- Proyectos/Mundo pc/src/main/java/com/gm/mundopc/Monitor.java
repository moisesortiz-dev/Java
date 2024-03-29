
package com.gm.mundopc;


public class Monitor {
   private final int idMonitor;
   private String marca;
   private double tamaño;
   private static int contadorMonitores;
   
   private Monitor(){
       this.idMonitor = ++Monitor.contadorMonitores;
   }
   
   public Monitor(String marca, double tamaño){
       this();
       this.marca = marca;
       this.tamaño = tamaño;
   }
   
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public static int getContadorMonitores() {
        return contadorMonitores;
    }
   
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Monitor{");
        sb.append("idMonitor=").append(idMonitor);
        sb.append(", marca=").append(marca);
        sb.append(", tama\u00f1o=").append(tamaño);
        sb.append(", contadorMonitores=").append(contadorMonitores);
        sb.append('}');
        return sb.toString();
    }
   
}
