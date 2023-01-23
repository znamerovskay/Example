package example;

/* 6.Создать наследника авто, у которого будет также максимальная скорость 400*/
public class AutoFord extends Auto {

    public AutoFord(String brand, String model) {
        super(brand, model);
    }
/* 7.Создать метод, который будет говорить "СТОП" если вы привысили скрость!!!*/
    public String MaxSpeedFord(){
        if(speed.longValue() < 400){
            return "Ok";
        }else{
            return "СТОП!!!";
        }
    }
}
