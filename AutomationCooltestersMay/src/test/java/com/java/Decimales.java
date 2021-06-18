package com.java;

public class Decimales {

	public static void main(String[] args) {
		boolean dec = areEqualByThreeDecimalPlaces(3.175, 3.176);
		System.out.println("Los decimales son iguales? : "+dec);
		
		printMegaBytesAndKiloBytes(23090048);

	}
	
	public static boolean areEqualByThreeDecimalPlaces(double d1, double d2) {
		
		d1 = d1 * 1000;
		d2 = d2 * 1000;
		
		int convertD1 = (int) d1;
		int convertD2 = (int) d2;
		
		if(convertD1==convertD2) {
			return true;
		}else {
			return false;
		}
	}
	
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes<0){
            System.out.println("Invalid Value");
        }else{
            int conversionMBtoKB = kiloBytes / 1024;
            int remainingMBtoKB =  kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + conversionMBtoKB + " MB and " + remainingMBtoKB + " KB" );
        }
    }

}
