public class Pressure
{
   protected float pressure = 0;
   protected Tap parent;

   public Pressure(Tap parent)
   {
      this.parent = parent;
   }

   public void decrease() {
      pressure /= 1.25;

      if ( pressure == 0 )
      {
         parent.stop();
      }
   }

   public void increase() {
      pressure *= 1.25;

      if ( pressure > 20 )
      {
         parent.explode();
      }
   }

   public float get()
   {
      return pressure;
   }

   public void set(float p)
   {
      pressure = p;
   }
}
