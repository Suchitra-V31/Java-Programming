package iterationControl;


//Problem Statement
//Implement a program to display the below pattern.
//
//*****
//
//****
//
//***
//
//**
//
//*
public class Assignment_8 {
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			for(int j=i;j<5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
