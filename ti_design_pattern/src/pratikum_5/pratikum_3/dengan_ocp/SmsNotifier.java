package pratikum_5.pratikum_3.dengan_ocp;

public class SmsNotifier implements Notifier{
    public void send(String message){
        System.out.println("SMS sending: " + message);
    }
}
