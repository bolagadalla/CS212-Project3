/**
 * This is the abstract class ClockList which would be inherited by other classes to create different lists
 * This has a first node and a last node to have access to them, also it has a list length which stores how many nodes are in the list
 * The very first node is a dummy empty node but it points to an actual node
 * 
 * @author Bola Gadalla
 *
 */
public abstract class ClockList
{
   ClockNode first;
   ClockNode last;
   int listLength;
   
   /**
    * This is the empty constructor of the class.
    * This sets the very first node to be an empty node that is pointing to null at the start
    * 
    */
   public ClockList()
   {
      // Creating an empty dummy node
      ClockNode emptyNode = new ClockNode(null);
      first = emptyNode;
      last = emptyNode;
      listLength = 0;
   }
   
   /**
    * This appends the Clock object as a node into the end of the list
    * @param clock - The Clock object which stores the time in Hours:Minuts:Seconds
    */
   public void append(Clock clock)
   {
      // Creating a node for the clock object
      ClockNode cn = new ClockNode(clock);
      // Setting the last node pointer to the newly created node
      last.next = cn;
      // Set the newly created node to be the last node in the list
      last = cn;
      listLength++;
   }
}
