package cuentas;
	/**
	 * Clase que representa una cuenta bancaria.
	 * Permite realizar operaciones como consultar saldo, ingresar y retirar dinero.
	 * 
	 * @author Mosquera Astudillo Javier Alejandro
	 * @version 1.0
	 */
public class CCuenta {

	/** Nombre del titular de la cuenta */
    private String nombre;
    /** Número de cuenta bancaria */
    private String cuenta;
    /** Saldo actual de la cuenta */
    private double saldo;
    /** Tipo de interés aplicado a la cuenta */
    private double tipoInteres;
    /**
     * Constructor por defecto de CCuenta.
     */
    public CCuenta()
    {
    }
    /**
     * Constructor con parámetros para inicializar la cuenta.
     * 
     * @param nom Nombre del titular
     * @param cue Número de cuenta
     * @param sal Saldo inicial
     * @param tipo Tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    /**
     * Método que devuelve el saldo actual de la cuenta.
     * 
     * @return Saldo actual en la cuenta.
     */
    public double estado()
    {
        return saldo;
    }
    /**
     * Método para ingresar dinero en la cuenta.
     * 
     * @param cantidad Monto a ingresar
     * @throws Exception Si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    /**
     * Método para retirar dinero de la cuenta.
     * 
     * @param cantidad Monto a retirar
     * @throws Exception Si la cantidad es negativa o si no hay saldo suficiente
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
    // Métodos getter y setter documentados con JavaDoc

    /**
     * Obtiene el nombre del titular de la cuenta.
     * 
     * @return Nombre del titular
     */
	public String getNombre() {
		return nombre;
	}
	/**
     * Establece el nombre del titular de la cuenta.
     * 
     * @param nombre Nombre del titular
     */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	 /**
     * Obtiene el número de cuenta.
     * 
     * @return Número de cuenta
     */
	public String getCuenta() {
		return cuenta;
	}
	/**
     * Establece el número de cuenta.
     * 
     * @param cuenta Número de cuenta
     */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	/**
     * Obtiene el saldo de la cuenta.
     * 
     * @return Saldo actual
     */
	public double getSaldo() {
		return saldo;
	}
	/**
     * Establece el saldo de la cuenta.
     * 
     * @param saldo Saldo nuevo
     */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	/**
     * Obtiene el tipo de interés de la cuenta.
     * 
     * @return Tipo de interés
     */
	public double getTipoInteres() {
		return tipoInteres;
	}
	/**
     * Establece el tipo de interés de la cuenta.
     * 
     * @param tipoInteres Nuevo tipo de interés
     */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
