package dsa.recursion.assignment2.numbersystem;

public class DecimalToBinary {
	
	public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        } else if (decimal == 1) {
            return "1";
        } else {
        	String value = Integer.toString(decimal % 2);
            return decimalToBinary(decimal / 2) + value;
        }
    }

    public static void main(String[] args) {
        int decimal = 25;
        String binary = decimalToBinary(decimal);
        System.out.println("Decimal: " + decimal);
        System.out.println("Binary: " + binary);
    }

}
