/**
 *
 * @author user
 */
import javax.swing.JOptionPane;
public class HotelRoom {
    
    public int roomnumber;
    public double roomrate;
    
    public void setroomnumber(int num)
    {
        roomnumber = num;
    }
    
    public int getroomNumber()
    {
        return roomnumber;
    }
    
    public void setRoomRate(double rrate)
    {
        roomrate= rrate;
    }
    
    public double getRoomRate()
    {
        return roomrate;
    }
    
    public HotelRoom(int hotelroom)
    {
        roomnumber = hotelroom;
        if (hotelroom <=299)
            roomrate = 69.95;
        else
            roomrate = 89.95;
    }
    
    public void displayroomrate()
    {
        if(roomnumber<=299)
            JOptionPane.showMessageDialog(null, "Welcome to hotel del luna" + "\n\n\nThe room that you have chosen costs $69.95 per 1 day. \nThe room that you have chosen is: " + roomnumber + "\nPayment for each night per 1 day is: " + getRoomRate() +
                    "\n\n\nThanks for coming to hotel del luna");
        else
        {
            JOptionPane.showMessageDialog(null, "Welcome to hotel del luna" + "\n\n\nThe room that you have chosen costs $89.95 per 1 day. \nThe room that you have chosen is: " + roomnumber  + "\nThe Payment for each Night per 1 day is: " + getRoomRate() +
                    "\n\n\nThanks for coming to hotel del luna");
        }
    }
    }