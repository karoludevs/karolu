/**
 * Created by sam on 26/05/16.
 */
public class DeluxeBurguer {

    private double basePrice = 4;
    private String chips;
    private String drink;

    public DeluxeBurguer(String chips, String drink) {
        this.chips = chips;
        this.drink = drink;
    }

    public void addDeluxe(){
        System.out.println("Opcion Burguer Deluxe: " + "\n" + chips + "\n" + drink);
    }
}
