package pratikum_9.bagian_3;

public class PushNotification implements NotificationStrategy {
    @Override
    public void send(String message) {
        System.out.println("Mengirim Push Notification: " + message);
    }
}
