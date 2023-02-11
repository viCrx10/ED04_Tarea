package cuentas;
/**
 * @author vicrx
 * @version 2.0
 * Clase para la creación de objetos tipo CCuenta.
 * Incluye los atributos de dichos objetos y algunos métodos para su modificación.
 * */
public class CCuenta {
	  private String nombre;
	    private String cuenta;
	    private double saldo;
	    private double tipoInterés;
	    
		/**
		 * Constructor vacío de CCuenta. 
		 * */
	    public CCuenta()
	    {
	    }
	    /**
	     * Constructor de CCuenta. 
	     */
	    public CCuenta(String nom, String cue, double sal, double tipo)
	    {
	        nombre =nom;
	        cuenta=cue;
	        saldo=sal;
	    }
	    /**
	     * Devuelve el valor de nombre.
	     * @return Valor de nombre.
	     */
	    public String getNombre() {
			return nombre;
		}
	    /**
	     * Modifica el valor de nombre.
	     * @param nombre.
	     */
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		/**
		 * Devuelve el valor de cuenta.
		 * @return Valor de cuenta.
		 */
		public String getCuenta() {
			return cuenta;
		}
		/**
		 * Modifica el valor de Cuenta..
		 * @param cuenta.
		 */
		public void setCuenta(String cuenta) {
			this.cuenta = cuenta;
		}
		/**
		 * Devuelve el valor de Saldo.
		 * @return Valor de saldo.
		 */
		public double getSaldo() {
			return saldo;
		}
		/**
		 * Modifica el valor de saldo.
		 * @param saldo. 
		 */
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		/**
		 * Devuelve el valor de tipoInterés.
		 * @return valor de tipoInterés.
		 */
		public double getTipoInterés() {
			return tipoInterés;
		}
		/**
		 * Modifica el valor de tipoInterés.
		 * @param tipoInterés.
		 */
		public void setTipoInterés(double tipoInterés) {
			this.tipoInterés = tipoInterés;
		}
		/**
		 * Devuelve saldo.
		 * @return valor de saldo.
		 */
		public double estado()
	    {
	        return saldo;
	    }
		
		/**
		 * Método ingresar que nos permite incrementar el saldo de la cuenta.
		 * @param cantidad será la que queramos añadir.
		 * @throws Exception nos alertará si la cantidad es negativa.
		 */
	    public void ingresar(double cantidad) throws Exception
	    {
	        if (cantidad<0)
	            throw new Exception("No se puede ingresar una cantidad negativa");
	        saldo = saldo + cantidad;
	    }
	    /**
	     * Método retirar que nos permite restar una cantidad al saldo de la cuenta.
	     * @param cantidad será la cantidad que queramos sustraer.
	     * @throws Exception nos alertará tanto si la cantidad que queremos retirar
	     * es negativa, como si el saldo es inferior a la cantidad que hemos intentado
	     * retirar.
	     */
	    public void retirar(double cantidad) throws Exception
	    {
	        if (cantidad <= 0)
	            throw new Exception ("No se puede retirar una cantidad negativa");
	        if (estado()< cantidad)
	            throw new Exception ("No se hay suficiente saldo");
	        saldo = saldo - cantidad;
	    }
}
