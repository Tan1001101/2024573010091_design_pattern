package pratikum_5.pratikum_3.dengan_ocp;

public class EmailNotifier implements Notifier{
    public void send(String message){
        System.out.println("Sending email: " + message);
    }
}
