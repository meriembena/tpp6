package ticketmachine;

public class Main {

	public static void main(String[] args) {
		TicketMachine machine = new TicketMachine(50);
		System.out.println("L'utilisateur insère 60 centimes");
		machine.insertMoney(60);
		System.out.println("L'utilisateur appuiee sur 'Impression ticket'");
		machine.printTicket();
	}
}