public class Main {
    public static void main(String[] args) {
        float ticketPriceRub = 8595.15F;
        int priceInKops = (int) (ticketPriceRub * 100); //Итоговая стоимость билета в копейках
        float oneMileCostRub =  20F;
        int oneMileCostKops = (int) (oneMileCostRub * 100); // Стоимость одной бонусной мили в копейках
        int milesAmount =  priceInKops / oneMileCostKops;
        System.out.println(milesAmount);
    }
}
