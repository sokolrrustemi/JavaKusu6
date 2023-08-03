package Gun37._01_Soru;

public class Bus extends Vehicle implements IDiesel{
    public Bus(double engine, String model) {
        super(engine, model);
    }
    @Override
    public String changeDiesel() { return "1 depo ile 1000 km gider"; }

    @Override
    public String drive() { return "En fazla 90km hız yapabilir"; }
}
