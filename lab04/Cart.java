import java.util.ArrayList;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

    public void addMedia(Media media){
        if (this.itemsOrdered.size() < MAX_NUMBERS_ORDERED){
            this.itemsOrdered.add(media);
            System.out.println("The media has been added");
        }
        else{
            System.out.println("The cart is full. Cannot add more media");
        }
    }
    
    public void removeMedia(Media media){
        if (this.itemsOrdered.remove(media)){
            System.out.println("The media has been removed");
        }
        else{
            System.out.println("The media is not in the cart");
        }
    }
    
    public float totalCost(){
        float res = 0;
        for (Media media : this.itemsOrdered){
            res += media.getCost();
        }
        return res;
    }
    
    public void print() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < this.itemsOrdered.size(); i++) {
            System.out.println((i+1) + ". " + this.itemsOrdered.get(i).toString());
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("***************************************************");
    }
    
    public ArrayList<Media> getItemsOrdered() {
        return itemsOrdered;
    }
}
