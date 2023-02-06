public class Truck {


    private long truckArea;

    private long bigBag = 100 * 200 * 50;
    private long mediumBag = 50 * 40 * 100;
    private long smallBag = 10 * 10 * 10;

    //Amount of bags are that fit are calculated, then removed from the truckArea variable, to show the remaining space.
    public void bigBags () {
        long amountBig = truckArea / bigBag;
        System.out.println(amountBig + " big bags fit in the truck.");
        truckArea = truckArea - (amountBig * bigBag);
    }

    public void mediumBags () {
        long amountMedium = truckArea / mediumBag;
        System.out.println(amountMedium + " medium bags fit in the truck.");
        truckArea = truckArea - (amountMedium * mediumBag);
    }

    public void smallBags () {
        long amountSmall = truckArea / smallBag;
        System.out.println(amountSmall + " small bags fit in the truck.");
    }


    public long getTruckArea() {return truckArea;}

    public void setTruckArea(long truckArea) {this.truckArea = truckArea;}
}
