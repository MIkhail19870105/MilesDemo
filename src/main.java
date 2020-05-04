public class main {
    public static void main(String[] args) {
        float ticketpricerub = (float) 8595.15; // Стоимость билета в рублях и копейках
        int priceinkops = (int) (ticketpricerub * 100); //Итоговая стоимость билета в копейках
        float onemilecostrub = (float) 20.2; // Стоимость одной бонусной мили в рублях и копейках, скорее всего лишний формат,
        // но например если цена бонус мили привязана к курсу доллара, то становится актуальным.
        int onemilecostkops = (int) (onemilecostrub * 100); // Стоимость одной бонусной мили в копейках
        int milesamount = priceinkops / onemilecostkops; //Итоговая формула вычисления количества бонусных миль
        System.out.println(milesamount);

    }
}
