

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
 * Class Nutricionista
 */
public class Nutricionista {

  //
  // Fields
  //

  /**
   * código para identificar a los nutricionistas
   */
  private int numNutricionistas;
  private Cita new_attribute;
  
  //
  // Constructors
  //
  public Nutricionista () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of numNutricionistas
   * código para identificar a los nutricionistas
   * @param newVar the new value of numNutricionistas
   */
  private void setNumNutricionistas (int newVar) {
    numNutricionistas = newVar;
  }

  /**
   * Get the value of numNutricionistas
   * código para identificar a los nutricionistas
   * @return the value of numNutricionistas
   */
  private int getNumNutricionistas () {
    return numNutricionistas;
  }

  /**
   * Set the value of new_attribute
   * @param newVar the new value of new_attribute
   */
  private void setNew_attribute (Cita newVar) {
    new_attribute = newVar;
  }

  /**
   * Get the value of new_attribute
   * @return the value of new_attribute
   */
  private Cita getNew_attribute () {
    return new_attribute;
  }

  //
  // Other methods
  //

  /**
   */
  private void programarCita()
  {
  }


  /**
   */
  private void verCitas()
  {
  }


  /**
   */
  private void cerrarCita()
  {
  }


  /**
   */
  private void eliminarCita()
  {
  }


  /**
   */
  private void reagendarCita()
  {
  }


  /**
   */
  private void verPacientesnuevos()
  {
  }


  /**
   */
  private void elegirPaciente()
  {
  }


  /**
   */
  private void llenarExpediente()
  {
  }


  /**
   */
  private void listaPacientesActivos()
  {
  }


  /**
   */
  private void listaPacientes()
  {
  }


  /**
   */
  private void verExpediente()
  {
  }


}
