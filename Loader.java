import java.util.Scanner;

public class Loader {
    public static int nomer; //Номер позиции в списке товаров
    public static int price1 = 1550; //Цена товара под номером 1
    public static int price2 = 2450; //Цена товара под номером 2
    public static int price3 = 1990; //Цена товара под номером 3
    public static int price4 = 9990; //Цена товара под номером 4
    public static int price5 = 11870; //Цена товара под номером 5
    public static float sum = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номера позиций, которые хотите заказать (1,2,3,4,5 через Enter)\n" +
                "1. Блузка - 1550 руб. \n" +
                "2. Платье - 2450 руб. \n" +
                "3. Шорты - 1990 руб. \n" +
                "4. Куртка - 9990 руб. \n" +
                "5. Пальто - 11870 руб. \n" +
                "Для завершения заказа нажмите любую цифру, кроме 1-5");

        while (nomer <= 5) { //Создаем цикл на случай, если покупатель захочет приобрести несколько товаров
            nomer = scanner.nextInt();
            pokupka(); //Вызываем метод, где суммируется стоимость выбранных товаров и рассчитывается скидка
        }
        System.out.println("Всего хорошего!");
    }

    public static float pokupka() {
        switch (nomer) {
            case 1:
                sum += price1;
                break;
            case 2:
                sum += price2;
                break;
            case 3:
                sum += price3;
                break;
            case 4:
                sum += price4;
                break;
            case 5:
                sum += price5;
                break;
            default:
                if (sum == 0) {
                    System.out.println("Нам очень жаль, что вы ничего не купили :( Возвращайтесь!");
                } else {
                    System.out.println("Спасибо за покупку!");
                }
        }

        if (sum > 6000) {
            System.out.println("Сумма заказа равна = " + sum + ". Сумма со скидкой: " + (sum - sum * 8 / 100));
        } else {
            System.out.println("Сумма заказа равна = " + sum + ". ");
        }
        return sum;
    }
}

