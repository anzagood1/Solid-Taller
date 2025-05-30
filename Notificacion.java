public interface Notificador {
  void notificar(Pago pago);
}

public class NotificadorEmail implements Notificador {
  public void notificar(Pago pago) {
    // enviarEmail();
  }
}

public class NotificadorSMS implements Notificador {
  public void notificar(Pago pago) {
    // enviarSMS();
  }
}

public class NotificadorSignal implements Notificador {
  public void notificar(Pago pago) {
    // enviarSignal();
  }
}
