public class Flats_Manager{


    public static void main(String[] args)
    {
        OneBHK oneBHK=new OneBHK(1,1,1);
        TwoBHK twoBHK=new TwoBHK(2,2,2);
        ThreeBHK threeBHK=new ThreeBHK(3,3,1);

        OneBHK oneBHK_1=new OneBHK(1,1);
        TwoBHK twoBHK_1=new TwoBHK(2,2);
        ThreeBHK threeBHK_1  =new ThreeBHK(5,3);


        oneBHK.showDetails();
        twoBHK.showDetails();
        threeBHK.showDetails();
        oneBHK_1.showDetails();
        twoBHK_1.showDetails();
        threeBHK_1.showDetails();
        System.out.println(oneBHK.getBedroom());


            }
        }


