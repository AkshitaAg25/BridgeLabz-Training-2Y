package exceptionhandling.movieTicket;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Runner {
	static void check(int num) throws SeatAlreadyBookedException,InvalidSeatException{
		Integer[] booked= {10,20,30};
		List<Integer> bookedlis = Arrays.asList(booked);
		if(bookedlis.contains(num)) {
			throw new SeatAlreadyBookedException("Seat is already booked!");
		}if(num>50 || num<0) {
			throw new InvalidSeatException("The seat number doesn't exist!");
		}else {
			System.out.println("You can book the seat");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter seat number: ");
		int num = sc.nextInt();
		try {
			check(num);
		}catch(InvalidSeatException e) {
			System.out.println(e.getMessage());
		}catch(SeatAlreadyBookedException e) {
			System.out.println(e.getMessage());
		}
	}
}
