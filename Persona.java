

/**
 * Class Cita
 */
public class Cita extends Paciente {

  //
  // Fields
  //

  protected int numCita;
  protected int numNutricionista;
  protected String Fecha;
  protected String observacionesCierre;
  
  //
  // Constructors
  //
  public Cita () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of numCita
   * @param newVar the new value of numCita
   */
  protected void setNumCita (int newVar) {
    numCita = newVar;
  }

  /**
   * Get the value of numCita
   * @return the value of numCita
   */
  protected int getNumCita () {
    return numCita;
  }

  /**
   * Set the value of numNutricionista
   * @param newVar the new value of numNutricionista
   */
  protected void setNumNutricionista (int newVar) {
    numNutricionista = newVar;
  }

  /**
   * Get the value of numNutricionista
   * @return the value of numNutricionista
   */
  protected int getNumNutricionista () {
    return numNutricionista;
  }

  /**
   * Set the value of Fecha
   * @param newVar the new value of Fecha
   */
  protected void setFecha (String newVar) {
    Fecha = newVar;
  }

  /**
   * Get the value of Fecha
   * @return the value of Fecha
   */
  protected String getFecha () {
    return Fecha;
  }

  /**
   * Set the value of observacionesCierre
   * @param newVar the new value of observacionesCierre
   */
  protected void setObservacionesCierre (String newVar) {
    observacionesCierre = newVar;
  }

  /**
   * Get the value of observacionesCierre
   * @return the value of observacionesCierre
   */
  protected String getObservacionesCierre () {
    return observacionesCierre;
  }

  //
  // Other methods
  //

}


import java.util.*;


/**
 * Class Persona
 */
public class Persona {

  //
  // Fields
  //

  protected int ID;
  /**
   * Primer nombre de la persona
   */
  protected String Nombre1;
  /**
   * Segundo nombre de la persona 
   */
  protected String Nombre2;
  /**
   * Primer apellido de la persona
   */
  protected String Apellido1;
  /**
   * Segundoapellido de la persona 
   */
  protected String Apellido2;
  /**
   * Se debe de poner masculino y femenino
   */
  protected char G�nero;
  /**
   * Direcci�n de casa de la persona
   */
  protected String Direcci�n;
  /**
   * N�mero de tel�fono de la persona 
   */
  protected int Telefono;
  /**
   * Edad de la persona 
   */
  protected int Edad_;
  /**
   * Corre electr�nico de la persona 
   */
  protected String Correo_;
  
  //
  // Constructors
  //
  public Persona () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of ID
   * @param newVar the new value of ID
   */
  protected void setID (int newVar) {
    ID = newVar;
  }

  /**
   * Get the value of ID
   * @return the value of ID
   */
  protected int getID () {
    return ID;
  }

  /**
   * Set the value of Nombre1
   * Primer nombre de la persona
   * @param newVar the new value of Nombre1
   */
  protected void setNombre1 (String newVar) {
    Nombre1 = newVar;
  }

  /**
   * Get the value of Nombre1
   * Primer nombre de la persona
   * @return the value of Nombre1
   */
  protected String getNombre1 () {
    return Nombre1;
  }

  /**
   * Set the value of Nombre2
   * Segundo nombre de la persona
   * @param newVar the new value of Nombre2
   */
  protected void setNombre2 (String newVar) {
    Nombre2 = newVar;
  }

  /**
   * Get the value of Nombre2
   * Segundo nombre de la persona
   * @return the value of Nombre2
   */
  protected String getNombre2 () {
    return Nombre2;
  }

  /**
   * Set the value of Apellido1
   * Primer apellido de la persona
   * @param newVar the new value of Apellido1
   */
  protected void setApellido1 (String newVar) {
    Apellido1 = newVar;
  }

  /**
   * Get the value of Apellido1
   * Primer apellido de la persona
   * @return the value of Apellido1
   */
  protected String getApellido1 () {
    return Apellido1;
  }

  /**
   * Set the value of Apellido2
   * Segundoapellido de la persona
   * @param newVar the new value of Apellido2
   */
  protected void setApellido2 (String newVar) {
    Apellido2 = newVar;
  }

  /**
   * Get the value of Apellido2
   * Segundoapellido de la persona
   * @return the value of Apellido2
   */
  protected String getApellido2 () {
    return Apellido2;
  }

  /**
   * Set the value of G�nero
   * Se debe de poner masculino y femenino
   * @param newVar the new value of G�nero
   */
  protected void setG�nero (char newVar) {
    G�nero = newVar;
  }

  /**
   * Get the value of G�nero
   * Se debe de poner masculino y femenino
   * @return the value of G�nero
   */
  protected char getG�nero () {
    return G�nero;
  }

  /**
   * Set the value of Direcci�n
   * Direcci�n de casa de la persona
   * @param newVar the new value of Direcci�n
   */
  protected void setDirecci�n (String newVar) {
    Direcci�n = newVar;
  }

  /**
   * Get the value of Direcci�n
   * Direcci�n de casa de la persona
   * @return the value of Direcci�n
   */
  protected String getDirecci�n () {
    return Direcci�n;
  }

  /**
   * Set the value of Telefono
   * N�mero de tel�fono de la persona
   * @param newVar the new value of Telefono
   */
  protected void setTelefono (int newVar) {
    Telefono = newVar;
  }

  /**
   * Get the value of Telefono
   * N�mero de tel�fono de la persona
   * @return the value of Telefono
   */
  protected int getTelefono () {
    return Telefono;
  }

  /**
   * Set the value of Edad_
   * Edad de la persona
   * @param newVar the new value of Edad_
   */
  protected void setEdad_ (int newVar) {
    Edad_ = newVar;
  }

  /**
   * Get the value of Edad_
   * Edad de la persona
   * @return the value of Edad_
   */
  protected int getEdad_ () {
    return Edad_;
  }

  /**
   * Set the value of Correo_
   * Corre electr�nico de la persona
   * @param newVar the new value of Correo_
   */
  protected void setCorreo_ (String newVar) {
    Correo_ = newVar;
  }

  /**
   * Get the value of Correo_
   * Corre electr�nico de la persona
   * @return the value of Correo_
   */
  protected String getCorreo_ () {
    return Correo_;
  }

  //
  // Other methods
  //

}
