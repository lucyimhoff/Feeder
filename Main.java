public class Main
{
    public static void main(String[] args) 
    {
        
        Feeder f = new Feeder(500);
        f.simulateOneDay(12);
        System.out.println(f);

        Feeder h = new Feeder(1000);
        h.simulateOneDay(22);
        System.out.println(h);

        Feeder a = new Feeder(100);
        a.simulateOneDay(5);
        System.out.println(a);

        Feeder b = new Feeder(2400);
        System.out.println(b.simulateManyDays(10, 4));

        Feeder c = new Feeder(250);
        System.out.println(c.simulateManyDays(10,5));

        Feeder d = new Feeder(0);
        System.out.println(d.simulateManyDays(5, 10));



    }

}
