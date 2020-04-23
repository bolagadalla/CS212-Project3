/**
 * This class will store the Sorted list of ClockNodes
 * This class inherets from the super class ClockList
 * 
 * @author Bola Gadalla
 *
 */
public class SortedClockList extends ClockList
{
   /**
    * The constructor of this class which creates an empty ClockNode and set it to be the first and last node of this list temporarily
    * 
    */
   public SortedClockList()
   {
      // Creates the empty node
      ClockNode emptyNode = new ClockNode(null);
      first = emptyNode;
      last = emptyNode;
      listLength = 0;
   }
   
   /**
    * Sorts while adding
    * 
    * Adds the clock object into the node list in its appropriate position in the list so the list remains sorted from the start
    * It sorts it by hours from least hour value to the least hour value
    * 
    * @param clock - The clock object which will be created into a node and then inserted into the correct position of the list
    */
   public void Add(Clock clock)
   {
      // Creates a new node for the clock object
      ClockNode newNode = new ClockNode(clock);
      // Gets the first node
      ClockNode current = first;
      // And moves through the list as long as its not null the current.next node data is less then the new node created data
      while(current.next != null && current.next.data.TotalSeconds() < newNode.data.TotalSeconds())
      {
         // Moves forward if so
         current = current.next;
      }
      // Assigning the next node of the new node to whatever node the current node was pointing to
      newNode.next = current.next;
      // Making the current node to point to the new node
      current.next = newNode;
   }
}
