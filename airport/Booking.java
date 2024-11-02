package airport;
public class Booking {
    private Customer customer;
    private Flight flight;
    private int seatNumber;
    private String status;
    public Booking(Customer customer,Flight flight){
        this.customer = customer;
        this.flight = flight;
        this.seatNumber = flight.getAvailableSeats();
        this.status = "Confirmed";
    }

    public Customer getCustomer() {
        return customer;
    }

    public Flight getFlight() {
        return flight;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public String getStatus() {
        return status;
    }
    public void cancel(){
        flight.cancelSeat();
        this.status = "Cancelled";
    }
}
