package prog2.exercise5.flight.booking.system;
import java.time.LocalDate;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;


  
  public class FlightBooking 
  {
   private String PassengerFullName;
   private String FlightCompany;
   private double TotalTicketPrice;
   private int ChildPassengers;
   private int AdultPassengers;
   private int TotalPassengers;
   public TripDestination tripDestination;
   private  BookingClass bookingClass;
   



   private String TicketNumber;
   private LocalDate DepartureDate;
   private LocalDate ReturnDate;
   private String SourceAirport;
   private String DestinationAirport;
   private double DepartingTicketPrice;
   private double ReturnTicketPrice;
   private int TripDate;


   enum BookingClass
   {
   FIRST,BUSINESS,ECONOMY;
   }

   private TripType tripType;
   enum TripType
   {
    ONE_WAY, RETURN;
   }

   enum TripSource 
   {
    NANJING, BEIJING, SHANGHAI, OULU, HELSINKI,PARIS;
   }
   
   enum Airport{
    NANJING_LUKOU_INTERNATIONAL_AIRPORT, BEIJING_CAPITAL_INTERNATIONAL_AIRPORT,
    SHANGHAI_PUDON_INTERNATIONAL_AIRPORT, OULU_AIRPORT,HELSINKI_AIRPORT,
    PARIS_CHARLES_DE_GAULLE_AIRPORT
    }

   enum TripDestination 
   {
    NANJING, BEIJING, SHANGHAI, OULU, HELSINKI,PARIS;
   }

   public String getPassengerFullName()
   {return PassengerFullName;
   }
   public String getFlightCompany()
   {return FlightCompany;
   }
   public int getTotalPassengers()
   {return TotalPassengers;
   }
   public int getChildPassengers()
   {return ChildPassengers;
   }
   public int getAdultPassengers()
   {return AdultPassengers;
   }
   public void setPassengerFullName(String PassengerFullName)
   {this.PassengerFullName = PassengerFullName;
   }
   public void setFlightCompany(String FlightCompany)
   {this.FlightCompany = FlightCompany;
   }

//    public FlightBooking(String passengerFullName,LocalDate depart,LocalDate returnDate,int childPassengers, int adultPassengers)
//    {
//     this.PassengerFullName = passengerFullName;
//     setDepartureDate(depart);
//     setReturnDate(returnDate);
//     this.ChildPassengers = childPassengers;
//     this.AdultPassengers = adultPassengers;
//     setTotalPassengers(childPassengers,adultPassengers);
//     }

public FlightBooking(String a, LocalDate depart, LocalDate returnDate, int w, int e) 
   {
   this.PassengerFullName = a;
   this.departureDate = depart;
   this.returnDate = returnDate;
   this.ChildPassengers =w;
   this.AdultPassengers =e;
   } 

   
   public FlightBooking(int size) {
}
public void setBookingClass(String bookingClass)
   {
   switch (bookingClass) 
    {

    case"1":
    this.bookingClass = BookingClass.FIRST;;
    break;
    
    case"2":
    this.bookingClass = BookingClass.BUSINESS;
    break;
    
    case"3":
    this.bookingClass = BookingClass.ECONOMY;
    break;
    default:
    System.out.println("choice again");
     }
   }
   public BookingClass getBookingClass()
   {
   return bookingClass;
   }


   public void setTripType(String tripType ) 
    {
    switch (tripType )
     {
      case "1":
      this.tripType = TripType.ONE_WAY;
      break;
      case "2":
      this.tripType = TripType.RETURN;
      break;
      default:
      System.out.println("choice again");
     }
    }
   public TripType getTripType()
   {
   return tripType;
   }
   
   
 
   

    public TripSource tripSource;
    public Airport sourceAirport;
    public Airport destinationAirport;
    public void setTripSource(String tripSource){
     switch(tripSource){
       case "1":
       this.tripSource=TripSource.NANJING;
       this.sourceAirport=Airport.NANJING_LUKOU_INTERNATIONAL_AIRPORT;
       break;
       case "2":
       this.tripSource=TripSource.BEIJING;
       this.sourceAirport=Airport.BEIJING_CAPITAL_INTERNATIONAL_AIRPORT;
       break;
       case "3":
       this.tripSource=TripSource.SHANGHAI;
       this.sourceAirport=Airport.SHANGHAI_PUDON_INTERNATIONAL_AIRPORT;
       break;
       case "4":
       this.tripSource=TripSource.OULU;
       this.sourceAirport=Airport.OULU_AIRPORT;
       break;
       case "5":
       this.tripSource=TripSource.HELSINKI;
       this.sourceAirport=Airport.HELSINKI_AIRPORT;
       break;
       case "6":
       this.tripSource=TripSource.PARIS;
       this.sourceAirport=Airport.PARIS_CHARLES_DE_GAULLE_AIRPORT;
       break;
       default:
       System.out.println("choose again");
       break;
     }
   }
   public TripSource getTripSource(){
    return tripSource;
  }

   public void setTripDestination(String tripSource , String tripdestination)
{
    if(sourceAirport.equals(destinationAirport))
    {
        System.out.println("choose again");
       
    }
    else
    {
    switch(tripdestination){
      case "1":
      this.tripDestination=TripDestination.NANJING;
      this.destinationAirport=Airport.NANJING_LUKOU_INTERNATIONAL_AIRPORT;
      break;
      case "2":
      this.tripDestination=TripDestination.BEIJING;
      this.destinationAirport=Airport.BEIJING_CAPITAL_INTERNATIONAL_AIRPORT;
      break;
      case "3":
      this.tripDestination=TripDestination.SHANGHAI;
      this.destinationAirport=Airport.SHANGHAI_PUDON_INTERNATIONAL_AIRPORT;
      break;
      case "4":
      this.tripDestination=TripDestination.OULU;
      this.destinationAirport=Airport.OULU_AIRPORT;
      break;
      case "5":
      this.tripDestination=TripDestination.HELSINKI;
      this.destinationAirport=Airport.HELSINKI_AIRPORT;
      break;
      case "6":
      this.tripDestination=TripDestination.PARIS;
      this.destinationAirport=Airport.PARIS_CHARLES_DE_GAULLE_AIRPORT;
      break;
      default:
      System.out.println("choose again");
      break;
        }
    }
}



public LocalDate departureDate;
 public LocalDate returnDate;
 public void setDepartureDate(LocalDate departureDate)
 {
 String sdepart ="2023-03-04";
 this.departureDate=LocalDate.parse(sdepart);
 }
 
 public LocalDate getDepartureDate()
 {
 return departureDate;
 }
 
 public void setReturnDate(LocalDate returnDate)
 {
 
 this.returnDate=departureDate.plusDays(2);
 long i = departureDate.toEpochDay() - returnDate.toEpochDay();
   
   if(i>=0 && i<1)
   {
   this.returnDate=departureDate.plusDays(2);
   }   
   else if(i>=1 && i<2)
   {
   this.returnDate=departureDate.plusDays(1);
   } 
 }
 
 public LocalDate getReturnDate()
 {
 return returnDate;
 }

Random random=new Random();
 public String [] ticketNumber;
 public void setTicketNumber(int index){
    String ticketNumber=null;
  switch (tripType) {
      case ONE_WAY:
          ticketNumber = "11";
          break;
      case RETURN:
          ticketNumber = "22";
          break;
  }
  switch (bookingClass) {
      case FIRST:
          ticketNumber = ticketNumber + "F";
          break;
      case BUSINESS:
          ticketNumber = ticketNumber + "B";
          break;
      case ECONOMY:
          ticketNumber = ticketNumber + "E";
          break;
  }
  for (int i = 0; i < 4; i++) {
      char f = (char) ((random.nextInt(26) + 65));
      ticketNumber = ticketNumber + f;
  }
  this.ticketNumber = new String[]{ticketNumber+"DOM"};
    if (tripSource == TripSource.NANJING && tripDestination == TripDestination.BEIJING) {
        this.ticketNumber = new String[]{ticketNumber + "DOM"};
    }
    if (tripSource == TripSource.BEIJING && tripDestination == TripDestination.NANJING) {
        this.ticketNumber = new String[]{ticketNumber + "DOM"};
    }
    if (tripSource == TripSource.OULU && tripDestination == TripDestination.HELSINKI) {
        this.ticketNumber = new String[]{ticketNumber + "DOM"};
    }
    if (tripSource == TripSource.HELSINKI && tripDestination == TripDestination.OULU) {
        this.ticketNumber = new String[]{ticketNumber + "DOM"};
    }
    if (tripSource == TripSource.NANJING && tripDestination == TripDestination.OULU) {
        this.ticketNumber = new String[]{ticketNumber + "INT"};
    }
    if (tripSource == TripSource.OULU && tripDestination == TripDestination.NANJING) {
        this.ticketNumber = new String[]{ticketNumber + "INT"};
    }
    if (tripSource == TripSource.NANJING && tripDestination == TripDestination.HELSINKI) {
        this.ticketNumber = new String[]{ticketNumber + "INT"};
    }
    if (tripSource == TripSource.HELSINKI && tripDestination == TripDestination.NANJING) {
        this.ticketNumber = new String[]{ticketNumber + "INT"};
    }
    if (tripSource == TripSource.BEIJING && tripDestination == TripDestination.OULU) {
        this.ticketNumber = new String[]{ticketNumber + "INT"};
    }
    if (tripSource == TripSource.OULU && tripDestination == TripDestination.BEIJING) {
        this.ticketNumber = new String[]{ticketNumber + "INT"};
    }
    if (tripSource == TripSource.BEIJING && tripDestination == TripDestination.NANJING) {
        this.ticketNumber = new String[]{ticketNumber + "INT"};
    }
    if (tripSource == TripSource.HELSINKI && tripDestination == TripDestination.BEIJING) {
        this.ticketNumber = new String[]{ticketNumber + "INT"};
    }
 
 }
 public String getTicketNumber(int index){
    setTicketNumber(index);
    return ticketNumber[index];
 }

private ConfirmationMessage confirmationMessage;
public enum ConfirmationMessage{
  CHANGE,NOTCHANGE;
}

public void setConfirmationMessage(String confirmationMessage) {
  switch (confirmationMessage) {
      case "1":
          this.confirmationMessage = ConfirmationMessage.CHANGE;
          System.out.println("Thank you for booking your flight with " + FlightCompany + ". Following are the details \n" +
                  "of your booking and the trip: \n" +
                  "Ticket Number: " + ticketNumber + "\n" +
                  "Passenger Name: " + PassengerFullName + "\n" +
                  "From TripSource to " + tripDestination + "\n" +
                  "Date of departure: " + departureDate + "\n" +
                  "Date of return: ReturnDate (Changed from old ReturnDate to new\n" +
                  returnDate + ")\n" +
                  "Total passengers: " + TotalPassengers + "\n" +
                  "Total ticket price in Euros: " + TotalTicketPrice + "\n" +
                  "IMPORTANT NOTICE: As per our policy, the return date was changed because it was \n" +
                  "less than two days apart from your departure date");
          break;
      case "2":
          this.confirmationMessage = ConfirmationMessage.NOTCHANGE;
          System.out.println("Thank you for booking your flight with " + FlightCompany + ".Following are the details \n" +
                  "of your booking and the trip: \n" +
                  "Ticket Number: " + ticketNumber + "\n" +
                  "Passenger Name: " + PassengerFullName + "\n" +
                  "From TripSource to " + tripDestination + "\n" +
                  "Date of departure: " + departureDate + "\n" +
                  "Date of return: " + returnDate + "\n" +
                  "Total passengers: " + TotalPassengers + "\n" +
                  "Total ticket price in Euros: " + TotalTicketPrice + "\n");

          break;
  }

}

public void setTotalTicketPrice() {

    this.TotalTicketPrice = Math.abs(2* ((0*(300 + (0.15*300) + (0.1*300) + 250)) + (3*(300 + (0.15*300) + (0.1*300) + 250))));
}
public double getTotalTicketPrice(){
    return TotalTicketPrice;
}

private double departingTicketPrice;
private double returnTicketPrice;
public void setDepartingTicketPrice(int child , int adult){
    this.departingTicketPrice= departingTicketPrice+0;
}
public double getDepartingTicketPrice(){
    return departingTicketPrice;
}

public void setReturnTicketPrice()
{
    this.returnTicketPrice=returnTicketPrice+0;
}
public double getReturnTicketPrice()
{
    return returnTicketPrice;
}

public void setTotalPassengers(int i, int j) {
}
public String getTripDestination() {
   return null;
}
private String [] passengerFullName={"Matt Jive", "Sally Fields", "Posh Quattro"};
private String [] passengerGender={"Male", "Female", "Other"};
private int [] passengerAge={43, 32, 21};

public void setPassengerFullName(int index ,String passengerFullName){
    this.passengerFullName=new String[]{"Matt Jive", "Sally Fields", "Posh Quattro"};
}
public String getPassengerFullName(int index){
    return passengerFullName[index];
}

public void setPassengerGender(int index,String passengerGender){
    this.passengerGender=new String[]{"Male", "Female", "Other"};
}
public String getPassengerGender(int index){
    return passengerGender[index];
}

public void setPassengerAge(int index, int passengerAge){
    this.passengerAge=new int[]{43, 32, 21};
}
public int getPassengerAge(int index){
    return passengerAge[index];
}

public static void reserveTickets(int numTickets) {
    String[] passengerFullName = new String[numTickets];
    String[] passengerGender = new String[numTickets];
    int[] passengerAge = new int[numTickets];
    String tripSource, tripDestination, tripType, bookingClass;
    String departureDate, returnDate;
    double ticketPrice;
    
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < numTickets; i++) {
        System.out.println("Enter details for passenger " + (i+1) + ":");
        System.out.print("passengerFullName: ");
        passengerFullName[i] = scanner.nextLine();
        System.out.print("passengerAge: ");
        passengerAge[i] = scanner.nextInt();
        System.out.print("passengerGender: ");
        passengerGender[i] = scanner.nextLine();
        scanner.nextLine(); 
    }

    System.out.print("tripSource: ");
    tripSource = scanner.nextLine();
    System.out.print("tripDestination: ");
    tripDestination = scanner.nextLine();
    System.out.print("Booking class: ");
    bookingClass = scanner.nextLine();
    System.out.print("departureDate: ");
    departureDate = scanner.nextLine();
    System.out.print("returnDate: ");
    returnDate = scanner.nextLine();
    System.out.print("totalTicketPrice: ");
    ticketPrice = scanner.nextDouble();
    
    for (int i = 0; i < numTickets; i++) {
        System.out.println("Passenger " + (i+1) + " details:");
        System.out.println("Name: " + passengerFullName[i]);
        System.out.println("Gender: " + passengerGender[i]);
        System.out.println("Age: " + passengerAge[i]);
    }
    System.out.println("Trip details:");
    System.out.println("Source: " + tripSource);
    System.out.println("Destination: " + tripDestination);
    System.out.println("Class: " + bookingClass);
    System.out.println("Departure date: " + departureDate);
    System.out.println("Return date: " + returnDate);
    System.out.println("Ticket price: " + ticketPrice);
    
    scanner.close();
}

public static void main(String[] args) {
    int numTickets;
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter number of tickets to reserve: ");
    numTickets = scanner.nextInt();
    
    reserveTickets(numTickets);
}
public void setSourceAirport(String string) {
}
public void setDestinationAirport(String string, String string2) {
}

}


