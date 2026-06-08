package pratikum_7.bagian_3;

public class Main {
    public static void main(String[] args) {
        NotificationService service = new NotificationService(new EmailNotification());
        service.notifyUser("Akun Anda telah berhasil dibuat.");

        service.setNotificationStrategy(new SMSNotification());
        service.notifyUser("Kode OTP Anda adalah 123456.");

        service.setNotificationStrategy(new PushNotification());
        service.notifyUser("Ada pesan baru dari teman Anda.");
    }
}
