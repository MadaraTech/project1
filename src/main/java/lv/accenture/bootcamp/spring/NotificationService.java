package lv.accenture.bootcamp.spring;

public class NotificationService {

	private NotificationChannel smsService;
	private NotificationChannel emailService;

	public void spamPerson(User user) {
		smsService.notifyUser(user);
		emailService.notifyUser(user);

	}
}

//2 klases, kas implementē service.
//Jāuzraksta Spring anotācijas