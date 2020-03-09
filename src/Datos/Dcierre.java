package Datos;

import java.sql.Date;
import java.sql.Time;

public class Dcierre {

    private int cod_usuario_FK;
    private double monto_cierre;
    private Date fecha_cierre;
    private Time hora_cierre;
    private double diferencia_cierre;
    private String nomCaja;
    private double efectivo;
    private double tarjeta;
    private double credito;
    

    public Dcierre() {
    }

    public Dcierre(int cod_usuario_FK, double monto_cierre, Date fecha_cierre, Time hora_cierre, double diferencia_cierre, String nomCaja, double efectivo, double tarjeta, double credito) {
        this.cod_usuario_FK = cod_usuario_FK;
        this.monto_cierre = monto_cierre;
        this.fecha_cierre = fecha_cierre;
        this.hora_cierre = hora_cierre;
        this.diferencia_cierre = diferencia_cierre;
        this.nomCaja = nomCaja;
        this.efectivo = efectivo;
        this.tarjeta = tarjeta;
        this.credito = credito;
    }

    public int getCod_usuario_FK() {
        return cod_usuario_FK;
    }

    public void setCod_usuario_FK(int cod_usuario_FK) {
        this.cod_usuario_FK = cod_usuario_FK;
    }

    public double getMonto_cierre() {
        return monto_cierre;
    }

    public void setMonto_cierre(double monto_cierre) {
        this.monto_cierre = monto_cierre;
    }

    public Date getFecha_cierre() {
        return fecha_cierre;
    }

    public void setFecha_cierre(Date fecha_cierre) {
        this.fecha_cierre = fecha_cierre;
    }

    public Time getHora_cierre() {
        return hora_cierre;
    }

    public void setHora_cierre(Time hora_cierre) {
        this.hora_cierre = hora_cierre;
    }

    public double getDiferencia_cierre() {
        return diferencia_cierre;
    }

    public void setDiferencia_cierre(double diferencia_cierre) {
        this.diferencia_cierre = diferencia_cierre;
    }

    public String getNomCaja() {
        return nomCaja;
    }

    public void setNomCaja(String nomCaja) {
        this.nomCaja = nomCaja;
    }

    public double getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(double efectivo) {
        this.efectivo = efectivo;
    }

    public double getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(double tarjeta) {
        this.tarjeta = tarjeta;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    
    
}
