package com.corejava.javayagiris;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		char c = '\uffff';
//		char e = 65;
//		
//		System.out.print(e);
//		System.out.println();
//		System.out.print("Main'deki main metodu calisiyor...");
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        String arr[] = new String[n];

        in.nextLine();

        for (int i = 0; i < n; i++){
            arr[i] = in.nextLine();
        }

        for (int i = 0; i < n; i++){
            try{
                long l = Long.parseLong(arr[i]);
                System.out.println(arr[i] + " can be fitted in:");

                if(l <= 127 && l >= -128){
                    System.out.println("* byte \n* short \n* int \n* long");
                }else if( l <= 32767 && l >= -32768){
                    System.out.println("* short \n* int \n* long");
                }else if ( l <= 2147483647 && l >= -2147483648){
                    System.out.println("* int \n* long");
                }else if(l <= 9223372036854775807l && l >= -9223372036854775808l){
                    System.out.println("* long");
                }

            }catch (NumberFormatException e){
                System.out.println(arr[i] + " can't be fitted anywhere.");
            }
        }
        
        //Default primitive data type values
        byte byteVar = 0;
        short shortVar = 0;
        int intVar = 0;
        long longVar = 0L;
        float floatVar = 0.0f;
        double doubleVar = 0.0d;
        char charVar = '\u0000';
        String stringVar = null;
        boolean booleanVar = false;

        //Literals
        boolean result = true;
        char capitalC = 'C';
        byte b = 100;
        short s = 10000;
        int i = 100000;

        //Integer Literals
        // The number 26, in decimal
        int decVal = 26;

        //  The number 26, in hexadecimal
        int hexVal = 0x1a;
        
        // The number 26, in binary
        int binVal = 0b11010;

        //Floating-Point Literals
        double d1 = 123.4;
        
        // same value as d1, but in scientific notation
        double d2 = 1.234e2;
        float f1 = 123.4f;

        // Underscore Characters in Numeric Literals
        long creditCardNumber = 1234_5678_9012_3456L;
        long socialSecurityNumber = 999_99_9999L;
        float pi = 3.14_15F;
        long hexBytes = 0xFF_EC_DE_5E;
        long hexWords = 0xCAFE_BABE;
        long maxLong = 0x7fff_ffff_ffff_ffffL;
        byte nybbles = 0b0010_0101;
        long bytes = 0b11010010_01101001_10010100_10010010;
        
        int x, y;         // Declares two integers x,y.
        int x1 = 10, y1 = 10;  // Example of initialization
        byte B = 22;         // initializes a byte type variable B.
        double pi1 = 3.14159; // declares and assigns a value of PI.
        char a = 'a';        // the char variable a iis initialized with value 'a'
        
        
        // integer
        int myValue = 7_000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);

        // overflow
        System.out.println("Overflow: " + (Integer.MAX_VALUE + 1));
        // underflow
        System.out.println("Underlow" + (Integer.MIN_VALUE - 1));


        //BYTE
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Min byte value: " + myMinByteValue);
        System.out.println("Max byte value: " + myMaxByteValue);

        //SHORT
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Min short value: " + myMinShortValue);
        System.out.println("Max short value: " + myMaxShortValue);

        //SHORT
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        long myLongValue = 2_147_483_648L;

        System.out.println("Min long value: " + myMinLongValue);
        System.out.println("Max long value: " + myMaxLongValue);
        System.out.println("My long value: " + myLongValue);


        //CASTING
        //java recognizes numbers as int by default

        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte)(myMinByteValue / 2);


        //Floating numbers
        float myMinFloatValue = Float.MIN_NORMAL;
        float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println("My min float value: " + myMinFloatValue);
        System.out.println("My max float value: " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_NORMAL;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println("My min float value: " + myMinDoubleValue);
        System.out.println("My max float value: " + myMaxDoubleValue);

        //java assumes double as standard for floating numbers
        int myIntNumber = 5 / 3 ;
        float myFloatNumber = 5f / 3f;
        double myDoubleNumber = 5d / 3d;

        System.out.println("myIntNumber = " + myIntNumber);
        System.out.println("myFloatNumber = " + myFloatNumber);
        System.out.println("myDoubleNumber = " + myDoubleNumber);


        //CHAR
        // char variables can story only one literal letter or an unicode character and are defined by '' instead of ""
        char myCharVarabiable = 'D';
        char myUnicodeChar = '\u0044';

        System.out.println(myCharVarabiable);
        System.out.println(myUnicodeChar);

        //boolean | true or false | 0 or 1
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        //String
        String myString = "This is a string";
        myString = myString + " \u00A9 2019";
        System.out.println("myString value is " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.45";
        System.out.println(numberString);
	}


}
