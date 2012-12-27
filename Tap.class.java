public class Tap
{
    protected Pressure pressure;

    public Tap(boolean r)
    {
        pressure = new Pressure(this);

        say("I'm a tap!");

        if ( r )
        {
            run();
        }
    }

    public void run()
    {
        if ( pressure.get() == 0 )
        {
            pressure.set(4);

            say("Catch me if you can!");
        }
        else
        {
            say("I'm already running!");
        }
    }

    public void stop()
    {
        if ( pressure.get() == 0 )
        {
            say("I'm not running!");
        }
        else
        {
            pressure.set(0);

            say("I have stopped!");
        }
    }

    public void explode()
    {
        say("Bang!");
    }

    public void say(String str)
    {
        System.out.println("Tap: " + str);
    }
}
