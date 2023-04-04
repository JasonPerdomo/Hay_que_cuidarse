

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
 * Class Login
 */
public class Login extends Persona {

  //
  // Fields
  //

  /**
   * Nombre de usuario puede ser letras o incluir n�meros
   */
  private String Usuario;
  /**
   * La contrase�a puede ser letras o incluir n�meros
   */
  private String Contrase�a;
  
  //
  // Constructors
  //
  public Login () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of Usuario
   * Nombre de usuario puede ser letras o incluir n�meros
   * @param newVar the new value of Usuario
   */
  private void setUsuario (String newVar) {
    Usuario = newVar;
  }

  /**
   * Get the value of Usuario
   * Nombre de usuario puede ser letras o incluir n�meros
   * @return the value of Usuario
   */
  private String getUsuario () {
    return Usuario;
  }

  /**
   * Set the value of Contrase�a
   * La contrase�a puede ser letras o incluir n�meros
   * @param newVar the new value of Contrase�a
   */
  private void setContrase�a (String newVar) {
    Contrase�a = newVar;
  }

  /**
   * Get the value of Contrase�a
   * La contrase�a puede ser letras o incluir n�meros
   * @return the value of Contrase�a
   */
  private String getContrase�a () {
    return Contrase�a;
  }

  //
  // Other methods
  //

  /**
   */
  public void Ingresar()
  {
  }


  /**
   */
  protected void verificarDatos()
  {
  }


  /**
   */
  protected void crearPerfil()
  {
  }


}
