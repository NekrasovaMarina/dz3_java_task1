public class Main {
    /*Задача №1 - Мили
        Легенда
        Авиаперевозчики предлагают различные бонусные программы, начисляющие бесплатные мили за перелёты.
        Формула следующая: за каждые 20 рублей, потраченные на билет, начисляется 1 миля.
        Что вам нужно: создать приложение, рассчитывающее количество начисленных мили за купленный билет.
        Стоимость билета вы выбираете сами (сами создайте переменную, в которой она будет храниться).
        Итого: у вас должен быть репозиторий на GitHub, в котором расположен ваш Java-код.
    */
    public static void main(String[] args) {

        int ticketPrice = 18700; /* стоимость билета */
        long milesAccrued; /* кол-во начисленных миль */
        milesAccrued = ticketPrice / 20;
        System.out.println("Ваш бонус " + milesAccrued + " миль");
    }
}
