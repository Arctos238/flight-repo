package sait.frms.problemdomain;

public class Flight {
	private String code;
	private String airlineName;
	private String from;
	private String to;
	private String weekday;
	private String time;
	private int seats;
	private double costPerSeat;

	public Flight(String code, String airlineName, String from, String to, String weekday, String time, int seats,
			double costPerSeat) {

		this.code = code;
		this.airlineName = airlineName;
		this.from = from;
		this.to = to;
		this.weekday = weekday;
		this.time = time;
		this.seats = seats;
		this.costPerSeat = costPerSeat;
	}

	public String getCode() {
		return code;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public String getFrom() {
		return from;
	}

	public String getTo() {
		return to;
	}

	public String getWeekday() {
		return weekday;
	}

	public String getTime() {
		return time;
	}

	public int getSeats() {
		return seats;
	}

	public double getCostPerSeat() {
		return costPerSeat;
	}

//	/** 
//	 * Parses the code by taking the first char of code and then assigning airlineName a string containing
//	 * its correct airline.
//	 */
//	private void parseCode() {
//		char airlineCode = code.charAt(0);
//		
//		airlineName = (airlineCode == 'O') ? "Otta Airlines" : (airlineCode == 'C') ? "Conned Air"
//					  : (airlineCode == 'T') ? "Try a Bus Airways" : "Vertical Airways";
//	}

	@Override
	public String toString() {
		return code + ", From: " + from + ", To: " + to + ", Day: " + weekday + ", Cost: $" + costPerSeat;
	}

}
