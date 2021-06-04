package MyQueue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class Read {
    private Scanner skn;

    public Read(InputStream ut){
        skn = new Scanner(ut);
    }
    public Read(String name) throws FileNotFoundException
    {
        skn = new Scanner(new FileInputStream(name));
    }
    public byte   ByteS    ()
    { return skn.nextByte(); }

    public short  ShortS   ()
    { return skn.nextShort(); }

    public int    IntS     ()
    { return skn.nextInt(); }

    public long   LongS    ()
    { return skn.nextLong(); }

    public float  FloatS   ()
    { return skn.nextFloat(); }

    public double DoubleS  ()
    { return skn.nextDouble(); }

    public boolean BooleanS()
    { return skn.nextBoolean(); }
    public char CharS()
    { return skn.next().charAt(0); }

    public String StringS()
    { return skn.next(); }

    public String LineS()
    { return skn.nextLine(); }
    public boolean endS() { return !skn.hasNext(); }

    private static Read re = new Read(System.in);

    public static byte Byte (){
        return re.ByteS();
    }
    public static short Short() {
        return re.ShortS();
    }
    public static int Int() {
        return re.IntS();
    }
    public static long    Long   () { return re.LongS   (); }
    public static float   Float  () { return re.FloatS  (); }
    public static double  Double () { return re.DoubleS (); }
    public static boolean Boolean() { return re.BooleanS(); }
    public static char    Char   () { return re.CharS   (); }
    public static String  String () { return re.StringS (); }
    public static String  Line   () { return re.LineS   (); }
    public static boolean end    () { return re.endS    (); }

}
