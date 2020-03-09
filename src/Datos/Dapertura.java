
package Datos;

import java.sql.Date;
import java.sql.Time;


public class Dapertura {
    
    
    private int cod_usuario_FK;
    private double monto_apertura;
    private Date fecha_apertura;
    private Time hora_apertura;
    private String nombreCaja;

    public Dapertura() {
    }

    public Dapertura(int cod_usuario_FK, double monto_apertura, Date fecha_apertura, Time hora_apertura, String nombreCaja) {
        this.cod_usuario_FK = cod_usuario_FK;
        this.monto_apertura = monto_apertura;
        this.fecha_apertura = fecha_apertura;
        this.hora_apertura = hora_apertura;
        this.nombreCaja = nombreCaja;
    }

    public int getCod_usuario_FK() {
        return cod_usuario_FK;
    }

    public void setCod_usuario_FK(int cod_usuario_FK) {
        this.cod_usuario_FK = cod_usuario_FK;
    }

    public double getMonto_apertura() {
        return monto_apertura;
    }

    public void setMonto_apertura(double monto_apertura) {
        this.monto_apertura = monto_apertura;
    }

    public Date getFecha_apertura() {
        return fecha_apertura;
    }

    public void setFecha_apertura(Date fecha_apertura) {
        this.fecha_apertura = fecha_apertura;
    }

    public Time getHora_apertura() {
        return hora_apertura;
    }

    public void setHora_apertura(Time hora_apertura) {
        this.hora_apertura = hora_apertura;
    }

    public String getNombreCaja() {
        return nombreCaja;
    }

    public void setNombreCaja(String nombreCaja) {
        this.nombreCaja = nombreCaja;
    }

    
    
    
    

}
