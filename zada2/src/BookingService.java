import java.util.Scanner;


public class BookingService {

    public static void main(String[] args) {
        // можно забронировать одну из комнат
        BedAndBreakfast hotel = new BedAndBreakfast();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Что вы хотите сделать?");
            System.out.println("1 - Забронировать номер");
            System.out.println("2 - Освободить номер");
            System.out.println("3 - Проверить наличие свободных номеров");
            System.out.println("0 — Выход");

            int command = scanner.nextInt();

            switch (command) {
                case 1:
                    // используется публичный метод
                    hotel.book();
                    // break позволяет выйти из условия, иначе - идём дальше
                    break;
                case 2:
                    hotel.free();
                    break;
                case 3:
                    if (hotel.isFull()) {
                        System.out.println("Больше нет мест");
                    } else {
                        System.out.println("Есть свободные номера!");
                    }
                    break;
                case 0:
                    System.out.println("Выход");


                    System.exit(0);

                default:
                    System.out.println("Извините, такой команды пока нет.");
                    break;
            }
        }
    }
}