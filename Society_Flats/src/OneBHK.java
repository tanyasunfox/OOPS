public class OneBHK extends Flats{


    public OneBHK(int bedroom,int bathroom){
        super(bedroom,bathroom);

    }

    public OneBHK(int bedroom, int bathroom, int kitchen)
    {

        super(bedroom,bathroom,kitchen);
    }




    public void showDetails(){
        System.out.println("1 BHK Flat: " + bedroom + " bedroom, " + kitchen + " kitchen, " + bathroom + " bathroom");
    }
}
