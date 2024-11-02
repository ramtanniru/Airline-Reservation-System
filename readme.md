# Airline Reservation System

A Java-based Airline Reservation System that allows airlines to manage flights, bookings, and customer reservations efficiently. This application demonstrates Object-Oriented Programming (OOP) principles, including **inheritance**, **polymorphism**, **encapsulation**, and **abstraction**.

## Features

1. **Flight Management**:
   - Add, delete, and view available flights.
   - Supports both **Domestic Flights** and **International Flights** with different data requirements.
2. **Booking Management**:
   - Reserve seats for customers.
   - Maintain customer information based on booking and cancellation activities.
3. **OOP Principles**:
   - **Inheritance**: Shared attributes and methods are defined in an abstract `Flight` class, which `DomesticFlight` and `InternationalFlight` inherit.
   - **Polymorphism**: Allows handling flights polymorphically, making the code easily extensible.
   - **Encapsulation**: Data is managed privately within classes, accessible only through public methods.
   - **Abstraction**: Common functionality of flights is encapsulated in an abstract `Flight` class.

## Class Structure

### 1. `Flight` (Abstract Class)
   - Represents a general flight with basic properties like flight number, destination, departure time, and seat availability.
   - Includes an abstract method `displayInfo()` for displaying specific flight information, implemented by subclasses.
   
### 2. `DomesticFlight` and `InternationalFlight` (Concrete Classes)
   - **DomesticFlight**: Handles domestic flight details.
   - **InternationalFlight**: Extends `Flight` with additional attributes like passport information.
   
### 3. `Airline`
   - Manages the collection of flights and provides methods to add, remove, and retrieve flight information.
   
### 4. `Booking` (Optional Enhancement)
   - (Optional) A class to manage booking information for each flight, including customer details, booking status, and seat availability.

## Example Code

Here's an example of how to use the system in the `Main.java` file:

```java
import airport.*;
import java.util.Date;
public class Main{
    public static void main(String[] args) {
        Airport airport = new Airport();
        
        Flight flight1 = new DomesticFlight(1,"Guntur","Hyderabad",new Date(),50,300.0);
        Flight flight2 = new InternationalFlight(2, "Kodad", "Muppala", new Date(), 30, 600.0, "A1234567");

        Customer cust1 = new Customer(0, "Ram");
        Customer cust2 = new Customer(1, "Sai");

        airport.addFlight(flight1);
        airport.addFlight(flight2);

        airport.addCustomer(cust1);
        airport.addCustomer(cust2);

        airport.bookFlight(1, 2);
        airport.bookFlight(0, 2);
        airport.bookFlight(1, 1);

        cust1.viewBookings();
        cust2.viewBookings();
        
        airport.cancelFlight(1, 1);
        airport.bookFlight(0, 1);

        cust1.viewBookings();
        cust2.viewBookings();
    }
}
```

## Requirements

- **Java**: Java Development Kit (JDK) 8 or above.
- **IDE**: Any Java IDE, such as IntelliJ IDEA, Eclipse, or NetBeans.

## How to Run

1. **Clone the repository**:
   ```bash
   git clone https://github.com/ramtanniru/Airline-Reservation-System.git
   cd Airline-Reservation-System
   ```

2. **Compile and run**:
   ```bash
   javac -d bin airport/*.java
   java -cp bin Main
   ```

## Future Enhancements

- Implement seat selection and ticket pricing based on demand.
- Integrate with a database to store flight and booking data.
- Add GUI for better user interaction.

Enjoy managing flights and bookings with the Airline Reservation System!