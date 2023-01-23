package example;

/* 4.Создать класс авто с полями как в Hillel auto*/
public class Auto {
    public String brand;
    public String model;
    public Integer mileage;
    public Integer speed;

    public Auto(String brand,String model){
        this.brand = brand;
        this.model = model;
    }

    /* 5. Сделать валидацию на Milage, допустимые значения от 0 до 999999. Проверка должна выполнятся на момент создания обьекта.*/
    public String isBigMileage(){
        if(this.mileage.shortValue() < 0){
            return "Пробег не может быть ниже 0";
        }else if(this.mileage.longValue() > 999999){
            return "Пробег не может превышать 999999";
        }else{
            return "Ok";
        }
    }
/* 7.Создать метод, который будет говорить "СТОП" если вы привысили скрость!!!*/
    public String MaxSpeed(){
        if(speed.longValue() < 400){
            return "Ok";
        }else{
            return "СТОП!!!";
        }
    }
}
