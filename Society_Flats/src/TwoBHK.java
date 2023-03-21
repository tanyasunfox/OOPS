public class TwoBHK extends Flats{

    public TwoBHK(int bedroom,int bathroom){
        super(bedroom,bathroom);

    }
    public TwoBHK(int bedroom, int bathroom, int kitchen) {
        super(bedroom,bathroom,kitchen);
    }




    public void showDetails(){
        System.out.println("2 BHK Flat: " + bedroom + " bedroom, " + kitchen + " kitchen, " + bathroom + " bathroom");
    }
}
