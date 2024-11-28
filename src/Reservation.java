import java.util.ArrayList;
import java.util.Scanner;

public class Reservation
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<reservation> reservation1 = new ArrayList<>();
        int option=0;
        do {
            System.out.println("Enter 1 for entry: ");
            System.out.println("Enter 2 for view: ");
            System.out.println("Enter 3 for search: ");
            System.out.println("Enter 4 for update: ");
            System.out.println("Enter 5 for exit: ");
            option = input.nextInt();

            switch (option)
            {
                case 1:
                    String choice = input.nextLine();
                    do
                    {
                        reservation client = new reservation();
                        client.newclient();
                        reservation1.add(client);
                        System.out.println("Do you want to add another client? Y/N: ");
                        choice = input.nextLine();

                    }while (choice.equalsIgnoreCase("Y"));
                    break;
                case 2:
                    for (reservation client : reservation1)
                    {
                        client.viewclient();
                    }
                    break;
                case 3:
                    System.out.println("Enter the reservation number to search: ");
                    int number = input.nextInt();
                    boolean found = false;
                    for (reservation client : reservation1)
                    {
                        if(client.reservation_number==number)
                        {
                            client.viewclient();
                            found = true;
                            break;
                        }
                    }
                    if(!found)
                    {
                        System.out.println("No reservation found");
                    }
                    break;
                case 4:
                    System.out.println("Enter the reservation number to update: ");
                    int number2 = input.nextInt();
                    boolean found2 = false;
                    for (reservation client : reservation1)
                    {
                        if(client.reservation_number==number2)
                        {
                            client.newclient();
                            found2 = true;
                            break;
                        }
                    }
                    if(!found2)
                    {
                        System.out.println("No reservation found");
                    }
                    break;
                case 5:
                    System.out.println("You are exited!!");
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }

        }while(option!=5);
    }
}

class reservation
{
    int reservation_number;
    String client_name;
    String client_address;
    String client_phone;
    String client_email;
    String arrival_location;
    String departure_location;

    public void newclient()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Reservation number: ");
        setReservation_number(input.nextInt());
        System.out.println("Enter the client name: ");
        setClient_name(input.next());
        System.out.println("Enter the client address: ");
        setClient_address(input.next());
        System.out.println("Enter the client phone: ");
        setClient_phone(input.next());
        System.out.println("Enter the client email: ");
        setClient_email(input.next());
        System.out.println("Enter the arrival location: ");
        setArrival_location(input.next());
        System.out.println("Enter the departure location: ");
        setDeparture_location(input.next());
    }

    public void viewclient()
    {
        System.out.println("Client Name: " + getClient_name());
        System.out.println("Client Address: " + getClient_address());
        System.out.println("Client Phone: " + getClient_phone());
        System.out.println("Client Email: " + getClient_email());
        System.out.println("Arrival Location: " + getArrival_location());
        System.out.println("Departure Location: " + getDeparture_location());
    }

    public int getReservation_number() {
        return reservation_number;
    }

    public void setReservation_number(int reservation_number) {
        this.reservation_number = reservation_number;
    }

    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public String getClient_address() {
        return client_address;
    }

    public void setClient_address(String client_address) {
        this.client_address = client_address;
    }

    public String getClient_phone() {
        return client_phone;
    }

    public void setClient_phone(String client_phone) {
        this.client_phone = client_phone;
    }

    public String getClient_email() {
        return client_email;
    }

    public void setClient_email(String client_email) {
        this.client_email = client_email;
    }

    public String getArrival_location() {
        return arrival_location;
    }

    public void setArrival_location(String arrival_location) {
        this.arrival_location = arrival_location;
    }

    public String getDeparture_location() {
        return departure_location;
    }

    public void setDeparture_location(String departure_location) {
        this.departure_location = departure_location;
    }
}
