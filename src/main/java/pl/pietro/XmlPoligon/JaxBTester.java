package pl.pietro.XmlPoligon;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.example.appointment.Address;
import org.example.appointment.Appartment;
import org.example.appointment.Appointment;
import org.example.appointment.Gender;
import org.example.appointment.Teenant;

public class JaxBTester {
	public static void main(String[] args) {
		try {
			JAXBContext context = JAXBContext.newInstance(Appointment.class);
			Marshaller marshaller = context.createMarshaller();

			StringWriter writer = new StringWriter();
			marshaller.marshal(generateAppointment(), writer);
			System.out.println(writer.toString());

			Unmarshaller unmarshaller = context.createUnmarshaller();
			Appointment appointment = (Appointment) unmarshaller.unmarshal(new StringReader(writer.toString()));
			System.out.println(appointment);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	private static Appointment generateAppointment() {
		Appointment appointment = new Appointment();
		appointment.setId(1);

		Appartment appartment = new Appartment();
		appartment.setFloor(4);
		appartment.setMonthlyCosts(1800);

		Address address = new Address();
		address.setStreetName("Badenerstrasse");
		address.setStreetNr(43);
		address.setZipCode("8043");

		appartment.setAddress(address);

		Teenant teenant = new Teenant();
		teenant.setFirstName("Jan");
		teenant.setLastName("Kowalski");
		teenant.setGender(Gender.M);
		teenant.setAge(32);
		teenant.setSalary(1200);

		appointment.setAppartment(appartment);
		appointment.setTeenant(teenant);

		return appointment;
	}

}
