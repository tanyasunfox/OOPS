public class ThreeBHK extends Flats {


    public ThreeBHK(int bedroom,int bathroom){
        super(bedroom,bathroom);

    }


    public ThreeBHK(int bedroom, int bathroom, int kitchen) {
        super(bedroom,bathroom,kitchen);

    }


    public void showDetails(){
        System.out.println("1 BHK Flat: " + bedroom + " bedroom, " + kitchen + " kitchen, " + bathroom + " bathroom");
    }
}
