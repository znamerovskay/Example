import example.User;
import example.Auto;
import example.AutoFord;


public class Main {
    public static void main(String[] args) {

        User user = new User("Ira", "Znamerovskay", "znamerovskay17@gmail.com", "znamerovskay1", "znamerovskay1");

        Auto auto = new Auto("Audi", "Q7");
        auto.mileage = 77;  //Ok
        auto.speed = 500;  //СТОП!!!
        System.out.println(auto.isBigMileage());
        System.out.println(auto.MaxSpeed());

        AutoFord autoFord = new AutoFord("Ford", "Fiesta");
        autoFord.speed = 401; //СТОП!!!
        System.out.println(autoFord.MaxSpeed());

        /* 3.Сделать проверку на емайл, убедится что там есть сабака(Не используем регулярные выржения, contains, indexOf и тд.) У вас должен быть ваш метод. Проверка должна выполнятся на момент создания обьекта.*/
        String[] test_email;
        String symbol = "@";
        test_email = user.Email.split(symbol);
        for (String s : test_email) {
            if (!user.Email.equals(s)) {
                System.out.println("Ok");
            } else {
                System.out.println("Введите корректный Email");
            }
        }
        System.out.println(user.Email); //Ok    }

    }
}
