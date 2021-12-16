package observerpattern;

public class Main {
	
	public static void main(String[] args) {
		
		NotificationManager notificationManager = new NotificationManager();
		
		notificationManager.registerObservers();
		notificationManager.notifyObservers();
		notificationManager.printCartLists();
	}
	
}
