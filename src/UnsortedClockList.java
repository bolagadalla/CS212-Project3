/**
 * This is a list which will store the unsorted list of ClockNodes
 * This Class inherets from the super class ClockList
 * 
 * @author Bola Gadalla
 *
 */
public class UnsortedClockList extends ClockList
{
   /**
    * This is the no-argument constructor of this class
    * It sets both the first and the last node to an empty ClockNodes and setting the list length to 0
    * 
    */
   public UnsortedClockList()
   {
      // Creating an empty ClockNode
      ClockNode emptyNode = new ClockNode(null);
      first = emptyNode;
      last = emptyNode;
      listLength = 0;
   }
   
   /**
    * This adds the clock object that is passed to it into the list.
    * It does this by calling the super class method "append(Clock)"
    * 
    * @param clock - The clock object that will be appended into the end of the list
    */
   public void Add(Clock clock)
   {
      super.append(clock);
   }
}
