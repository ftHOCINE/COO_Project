package FIl.Room;
import FIl.GameCharacter.Monstre;
import FIl.Room.Room;
import FIl.Room.Direction;
import FIl.Room.Exit;
import FIl.Items.PotionVie;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class ExitTest extends RoomTest
{
    
    @Test
    public void ExitTest(){
    Exit E=new Exit("e1");
    assertNotNull(E);
    
    }
    
    }
