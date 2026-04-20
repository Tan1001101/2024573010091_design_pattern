package pratikum_5.pratikum_3.dengan_ocp;

public class NotifierService {
    public void sendNotification(Notifier notifier, String message){
        notifier.send(message);
    }
}
