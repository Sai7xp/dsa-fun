
interface Notifier {
    void sendNotification(String message);
}

class EmailNotifier implements Notifier {
    public void sendNotification(String message) {
        System.out.println("Sending Email: " + message);
    }
}

class SMSNotifier implements Notifier {
    public void sendNotification(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

class NotificationService {
    private Notifier notifier;

    public NotificationService(Notifier notifier) { // Loosely Coupled
        this.notifier = notifier;
    }

    public void notifyUser(String message) {
        notifier.sendNotification(message);
    }
}

public class InterfacesLooseCoupling {
    public static void main(String[] args) {
        NotificationService emailService = new NotificationService(new EmailNotifier());
        emailService.notifyUser("Hello via Email!");

        NotificationService smsService = new NotificationService(new SMSNotifier());
        smsService.notifyUser("Hello via SMS!");
    }
}