

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



/**
 * Class Expediente
 */
public class Expediente extends Cita {

  //
  // Fields
  //

  protected int numExp;
  protected int Descripción;
  private double IMC;
  
  //
  // Constructors
  //
  public Expediente () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of numExp
   * @param newVar the new value of numExp
   */
  protected void setNumExp (int newVar) {
    numExp = newVar;
  }

  /**
   * Get the value of numExp
   * @return the value of numExp
   */
  protected int getNumExp () {
    return numExp;
  }

  /**
   * Set the value of Descripción
   * @param newVar the new value of Descripción
   */
  protected void setDescripción (int newVar) {
    Descripción = newVar;
  }

  /**
   * Get the value of Descripción
   * @return the value of Descripción
   */
  protected int getDescripción () {
    return Descripción;
  }

  /**
   * Set the value of IMC
   * @param newVar the new value of IMC
   */
  private void setIMC (double newVar) {
    IMC = newVar;
  }

  /**
   * Get the value of IMC
   * @return the value of IMC
   */
  private double getIMC () {
    return IMC;
  }

  //
  // Other methods
  //

  /**
   */
  protected void verExpediente()
  {
  }


}
