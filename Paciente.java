

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
 * Class Paciente
 */
public class Paciente extends Persona {

  //
  // Fields
  //

  /**
   * código para identificar a los pacientes
   */
  protected int numPaciente;
  /**
   * Cantidad de citas que se han agendado
   */
  protected int cantCitas;
  /**
   * Cantidad de citas que se han cancelado 
   */
  protected int citasCanceladas;
  /**
   * La altura del paciente en metros
   */
  protected double Estatura;
  /**
   * El peso del paciente en libras 
   */
  protected double Peso;
  
  //
  // Constructors
  //
  public Paciente () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of numPaciente
   * código para identificar a los pacientes
   * @param newVar the new value of numPaciente
   */
  protected void setNumPaciente (int newVar) {
    numPaciente = newVar;
  }

  /**
   * Get the value of numPaciente
   * código para identificar a los pacientes
   * @return the value of numPaciente
   */
  protected int getNumPaciente () {
    return numPaciente;
  }

  /**
   * Set the value of cantCitas
   * Cantidad de citas que se han agendado
   * @param newVar the new value of cantCitas
   */
  protected void setCantCitas (int newVar) {
    cantCitas = newVar;
  }

  /**
   * Get the value of cantCitas
   * Cantidad de citas que se han agendado
   * @return the value of cantCitas
   */
  protected int getCantCitas () {
    return cantCitas;
  }

  /**
   * Set the value of citasCanceladas
   * Cantidad de citas que se han cancelado
   * @param newVar the new value of citasCanceladas
   */
  protected void setCitasCanceladas (int newVar) {
    citasCanceladas = newVar;
  }

  /**
   * Get the value of citasCanceladas
   * Cantidad de citas que se han cancelado
   * @return the value of citasCanceladas
   */
  protected int getCitasCanceladas () {
    return citasCanceladas;
  }

  /**
   * Set the value of Estatura
   * La altura del paciente en metros
   * @param newVar the new value of Estatura
   */
  protected void setEstatura (double newVar) {
    Estatura = newVar;
  }

  /**
   * Get the value of Estatura
   * La altura del paciente en metros
   * @return the value of Estatura
   */
  protected double getEstatura () {
    return Estatura;
  }

  /**
   * Set the value of Peso
   * El peso del paciente en libras
   * @param newVar the new value of Peso
   */
  protected void setPeso (double newVar) {
    Peso = newVar;
  }

  /**
   * Get the value of Peso
   * El peso del paciente en libras
   * @return the value of Peso
   */
  protected double getPeso () {
    return Peso;
  }

  //
  // Other methods
  //

  /**
   */
  public void verExpediente()
  {
  }


  /**
   */
  public void verCitasPendientes()
  {
  }


}
