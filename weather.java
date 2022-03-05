class WheatherData
{
    private float temperature;
    private float pressure;
    private float humidity;
    private Currentcondition Currentcondition;
    public WheatherData(Currentcondition Currentcondition)
    {
        this.Currentcondition=Currentcondition;
    }
    public float getTemperature ()
    {
        return temperature;
    }
    public float getpressure ()
    {
        return pressure;
    }
    public float gethumidity ()
    {
        return humidity;
}
public void datachange ()
{
    Currentcondition.update(getTemperature (), getpressure(), gethumidity());
}
public void setData (float temperature, float pressure,float humidity)
{
    this.temperature = temperature;
    this.pressure = pressure;
    this.humidity = humidity;
    datachange ();
}
}
class Currentcondition
{
    private float temperature;
    private float pressure;
    private float humidity;
    public void update ( float temperature, float pressure, float humidity)
    {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }
public void display()

{
    System.out.println("*** Today mTemperature: " + temperature + "***");
    System.out.println("*** Today mpressure:"+pressure+"***");
    System.out.println("*** Today mhumidity:" +humidity +"***");
}
}
public class Wheather{public static void main (String[] args)
    {
        Currentcondition Currentcondition=new Currentcondition();
        WheatherData WheatherData=new WheatherData(Currentcondition);
        WheatherData.setData(30,105,40);System.out.println("====================change inwheather=====================");
        WheatherData.setData(40,160,20);
    }
}
