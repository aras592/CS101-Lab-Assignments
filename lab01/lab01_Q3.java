public class lab01_Q3 {

    public static void main(String[] args){
        //Constant Variables
        final double totalAreaofWorld = 510072000.0;
        final double totalAreaofTurkey = totalAreaofWorld/6510.42;
        //Other Variables
        double dryLandofWorld = totalAreaofWorld*(29.2/100);
        double waterAreaofWorld = totalAreaofWorld - dryLandofWorld;
        double waterAreaofTurkey = totalAreaofTurkey/77;
        double dryLandofTurkey = waterAreaofTurkey*76;
        //percentage calculations
        double drylandPercentageofTurkey = dryLandofTurkey*100/ dryLandofWorld;
        double waterlandPercentageOutsideofTurkey = 100.0 - (waterAreaofTurkey*100/waterAreaofWorld);
        //Print the Variables accordingly
        System.out.println("Turkey has "+ (int)dryLandofTurkey + " km2 dry land and "+(int)waterAreaofTurkey+" km2 water." );
        System.out.println("Earth has "+(int)dryLandofWorld+" km2 dry land and "+(int)waterAreaofWorld+" km2 water.");
        System.out.println("Turkey has "+drylandPercentageofTurkey+" percent of the Earth's sry land");
        System.out.println("Percentage of Earth water outside Turkey is "+waterlandPercentageOutsideofTurkey+" percent");
    }
}
