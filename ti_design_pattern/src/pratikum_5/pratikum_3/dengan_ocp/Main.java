package pratikum_5.pratikum_3.dengan_ocp;

public class Main {
    public static void main(String[] args){
        NotifierService service = new NotifierService();

        Notifier emailNotifier = new EmailNotifier();
        Notifier smsNotifier = new SmsNotifier();

        service.sendNotification(emailNotifier,"hello via Email");
        service.sendNotification(smsNotifier, "hello via SMS");
    }
}
