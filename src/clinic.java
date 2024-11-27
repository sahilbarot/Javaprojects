import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class clinic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PatientInfo details=new PatientInfo();
        details.addinfo();
        details.printdetails();

        patient_history_from_others historyFromOthers =new patient_history_from_others();
        historyFromOthers.get_history();
        historyFromOthers.print_history();

        patient_history_from_ikra_clinic patientHistoryFromIkraClinic = new patient_history_from_ikra_clinic();
        patientHistoryFromIkraClinic.add_history();
        patientHistoryFromIkraClinic.show_Histoy();

    }
}
class PatientInfo
{
    String id;
    String first_name;
    String middle_name;
    String last_name;
    String age;
    String gender;
    String dob;
    String discount;
    String preference;
    String address;
    String phone;
    String email;
    String Appointment_Date_and_Time;

    void addinfo()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter patient's id");
        id = sc.nextLine();
        System.out.println("Enter patient's first name");
        first_name = sc.nextLine();
        System.out.println("Enter patient's middle name");
        middle_name = sc.nextLine();
        System.out.println("Enter patient's last name");
        last_name = sc.nextLine();
        System.out.println("Enter patient's age");
        age = sc.nextLine();
        System.out.println("Enter patient's gender");
        gender = sc.nextLine();
        System.out.println("Enter patient's dob");
        dob = sc.nextLine();
        System.out.println("Enter patient's discount");
        discount = sc.nextLine();
        System.out.println("Enter patient's preference");
        preference = sc.nextLine();
        System.out.println("Enter patient's address");
        address = sc.nextLine();
        System.out.println("Enter patient's phone");
        phone = sc.nextLine();
        System.out.println("Enter patient's email");
        email = sc.nextLine();
        System.out.println("Enter patient's appointment_date");
        Appointment_Date_and_Time = sc.nextLine();
    }
    void printdetails()
    {
        System.out.println("ID: " + id);
        System.out.println("First name: " + first_name);
        System.out.println("Middle name: " + middle_name);
        System.out.println("Last name: " + last_name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("DOB: " + dob);
        System.out.println("Discount: " + discount);
        System.out.println("Preference: " + preference);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
        System.out.println("Appointment_date: " + Appointment_Date_and_Time);

    }
}


class patient_history_from_others
{
    String Dental_history;
    String other_disease;
    String Doctor_details;
    String treatment_history;

    void get_history()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Dental history");
        Dental_history = sc.nextLine();
        System.out.println("Enter other disease");
        other_disease= sc.nextLine();
        System.out.println("Enter Doctor details");
        Doctor_details = sc.nextLine();
        System.out.println("Enter treatment history");
        treatment_history = sc.nextLine();
    }
    void print_history()
    {
        System.out.println("Dental history: " + Dental_history);
        System.out.println("other disease "+other_disease);
        System.out.println("Doctor details: " + Doctor_details);
        System.out.println("treatment history: " + treatment_history);
    }
}


class patient_history_from_ikra_clinic
{
    String Past_disease_cured;
    String id_of_cured_disease;
    String Name_of_disease;
    String who_operated;
    String Past_disease_notcured;
    String id_of_disease;
    String name_of_disease;
    String who_is_operating;

    void add_history()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter past disease cured");
        Past_disease_cured = sc.nextLine();
        System.out.println("Enter id of disease");
        id_of_disease= sc.nextLine();
        System.out.println("Enter name of disease");
        Name_of_disease= sc.nextLine();
        System.out.println("Enter who operated");
        who_operated= sc.nextLine();
        System.out.println("Enter past disease not cured yet");
        Past_disease_cured= sc.nextLine();
        System.out.println("Enter id of not cured disease");
        id_of_disease= sc.nextLine();
        System.out.println("name of disease");
        name_of_disease= sc.nextLine();
        System.out.println("who is  operating");
        who_is_operating= sc.nextLine();


    }
    void show_Histoy()
    {
        System.out.println("past disease cured "+Past_disease_cured);
        System.out.println("id of cured disease"+id_of_cured_disease);
        System.out.println("Name of disease"+Name_of_disease);
        System.out.println("who operated"+who_operated);
        System.out.println("Past disease not cured"+Past_disease_notcured);
        System.out.println("id of disease"+id_of_disease);
        System.out.println("name of disease"+name_of_disease);
        System.out.println("who is_operating"+who_is_operating);
    }

}
