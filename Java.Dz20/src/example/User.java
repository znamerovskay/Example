package example;

/*1. Создать класс пользователя. У пользователя должны быть все поля как в Hillel auto*/
public class User<test_email, symbol> {
    public String Name;
    public String LastName;
    public String Email;
    public String Password;
    public String Re_enter_password;


    /*2. Пользоватля можно создавать двумя способами
        2.1 Все поля обязательны*/
        public User(String Name, String LastName, String Email,String Password,String Re_enter_password){
            this.Name = Name;
            this.LastName = LastName;
            this.Email = Email;
            this.Password = Password;
            this.Re_enter_password = Re_enter_password;
        }
        /*2.2 Только email и пароль обязательны*/

    public User(String Email, String Password) {
        this.Email = Email;
        this.Password = Password;
    }
}


