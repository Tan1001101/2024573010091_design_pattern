package pratikum_5.pratikum_3.tanpa_ocp;

public class NotificationService {
    public void sendNotification(String type, String message){
        if(type.equals("Email")){
            System.out.println("sending email: " + message);
        }else if(type.equals("SMS")){
            System.out.println("sending sms: " + message);
        }else{
            System.out.println("invalid notifiaction type");
        }
    }
}
