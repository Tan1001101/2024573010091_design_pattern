package pratikum_7.bagian_3;

public class EmailNotification implements NotificationStrategy {
    @Override
    public void send(String message) {
        System.out.println("Mengirim Email: " + message);
    }
}
