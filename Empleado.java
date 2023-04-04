

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
 * Class Empleado
 */
public class Empleado extends Persona {

  //
  // Fields
  //

  protected String IDdeEmpleado;
  private char Tipo_de_empleado;
  
  //
  // Constructors
  //
  public Empleado () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of IDdeEmpleado
   * @param newVar the new value of IDdeEmpleado
   */
  protected void setIDdeEmpleado (String newVar) {
    IDdeEmpleado = newVar;
  }

  /**
   * Get the value of IDdeEmpleado
   * @return the value of IDdeEmpleado
   */
  protected String getIDdeEmpleado () {
    return IDdeEmpleado;
  }

  /**
   * Set the value of Tipo_de_empleado
   * @param newVar the new value of Tipo_de_empleado
   */
  private void setTipo_de_empleado (char newVar) {
    Tipo_de_empleado = newVar;
  }

  /**
   * Get the value of Tipo_de_empleado
   * @return the value of Tipo_de_empleado
   */
  private char getTipo_de_empleado () {
    return Tipo_de_empleado;
  }

  //
  // Other methods
  //

}
