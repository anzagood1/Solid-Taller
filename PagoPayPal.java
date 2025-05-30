public class PagoPayPal extends Pago{
  private boolean loggedIn; //Conexion a cuenta PayPal
  
  @Override
  public void realizarCobro(double monto){
    if(!loggedIn){
      return;
    }
    //Cargar el monto de compra al medio de pago
  }
}
