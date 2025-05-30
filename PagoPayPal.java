public class PagoPayPal extends Pago{
  private boolean loggedIn; //Conexion a cuenta PayPal

  public static void iniciarSesion(){
    this.loggedIn = true;
  }
  
  @Override
  public void realizarCobro(double monto){
    if(!loggedIn){
      inciarSesion();
    }
    //Cargar el monto de compra al medio de pago
  }
}
