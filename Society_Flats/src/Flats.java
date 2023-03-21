public class Flats implements Broker{
   protected int bedroom;
    protected int bathroom;
    static int kitchen=1;

   public Flats(int bedroom,int bathroom){
       this.bedroom=bedroom;
       this.bathroom=bathroom;

   }

    public Flats(int bedroom, int bathroom, int kitchen) {
        this.bedroom = bedroom;
        this.bathroom = bathroom;
        this.kitchen = kitchen;
    }



    public int getBedroom() {
        return bedroom;
    }

    public void setBedroom(int bedroom) {
        this.bedroom = bedroom;
    }

    public int getBathroom() {
        return bathroom;
    }

    public void setBathroom(int bathroom) {
        this.bathroom = bathroom;
    }

    public int getKitchen() {
        return kitchen;
    }

    @Override
    public void showDetails() {
        System.out.println(bedroom + " bedroom, " + kitchen + " kitchen, " + bathroom + " bathroom");
    }
}
