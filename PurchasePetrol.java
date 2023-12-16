public class PurchasePetrol{
public static void main(String[] args){

BuyPetrol purchase = new BuyPetrol("Yaba Feeling Station","Diesel",15,12.5,2.6);

System.out.printf("The location of the station is: %s%n",purchase.getStationLocation());

System.out.printf("The Petroltype is: %s%n",purchase.getPetrolType());

System.out.printf("The Quantity of Deisel is: %d%n",purchase.getQuantity());

System.out.printf("The Price of Deisel Per liter is: %.3f%n ",purchase.getPricePerLiter());

System.out.printf("The Percentage Discount on Deisel is: %.3f%n",purchase.getPercentageDiscount());

System.out.printf("The Purchase Amount is: %.3f%n",purchase.getPurchaseAmount());

}


}