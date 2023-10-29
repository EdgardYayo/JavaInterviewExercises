package Casting;

public class Casting {
    
    public static void main(String[] args) {
        // In Java this is perfectly legal
        byte minByteValue = Byte.MIN_VALUE, maxByteValue = Byte.MAX_VALUE;

        // This is also legal 
        int minIntValue = Integer.MIN_VALUE; short shortMinValue = Short.MIN_VALUE;

        // But this will throw and error
        //byte minValueDivided = (minByteValue / 2);

        // And this will work thanks to the casting
        byte minValueDivided = (byte) (minByteValue / 2);
        
        // This will also work because we are using literal values
        byte minValueDivivedByFour = (-128 / 4);

        byte myByte = 120;
        short myShort = 200;
        int myInt = 2390;

        long myLong = 50_000 + ((10) * (myByte + myShort + myInt));
        System.out.println(myLong);
    }

}
