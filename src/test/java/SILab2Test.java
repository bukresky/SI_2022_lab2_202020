import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SILab2Test {

    public List<String> gnrString(String ... elems){
        return new ArrayList<>(Arrays.asList(elems));
    }
    @Test
    public void everyStatement(){
        IllegalArgumentException ex;
        ex = assertThrows(IllegalArgumentException.class, ()->SILab2.function(gnrString()));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));

        ex = assertThrows(IllegalArgumentException.class, ()->SILab2.function(gnrString("0", "0")));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));

        assertEquals(gnrString("#", "#", "2","#", "4", "#","#", "#", "2" ), SILab2.function(gnrString("#", "#", "0","#", "0", "#","#", "#", "0" )));
    }

    @Test
    public void everyBranch(){
        IllegalArgumentException ex;
        ex = assertThrows(IllegalArgumentException.class, ()->SILab2.function(gnrString()));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));

        ex = assertThrows(IllegalArgumentException.class, ()->SILab2.function(gnrString("0", "0")));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));

        assertEquals(gnrString("#", "#", "2","1", "#", "#","#", "#", "#", "4", "#","#","2", "#","#","2"),
                SILab2.function(gnrString("#", "#", "0","0", "#", "#","#", "#", "#", "0", "#","#","0", "#","#","0")));
    }
}