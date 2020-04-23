/**
 * This is a custom node which will store a Clock object and the next node it points to in the list
 * 
 * @author Bola Gadalla
 *
 */
public class ClockNode
{
   protected Clock data;
   protected ClockNode next;
   
   /**
    * The Constructor of this class, which takes in a Clock object and assign it 
    * to the protected variable of the class called "data" which is of time Clock
    * 
    * @param clock - The clock object which will be assigned to this node
    */
   public ClockNode(Clock clock)
   {
      data = clock;
      next = null;
   }
}
