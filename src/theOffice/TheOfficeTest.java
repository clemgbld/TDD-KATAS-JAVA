package theOffice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TheOfficeTest {
    @Test
    void shouldNeedNoChair(){
        assertEquals("Game On",TheOffice.meeting(new Room[]{},0));
        Room[] rooms = new Room[] {
                new Room("XX", 2),
                new Room("XXXX", 6),
                new Room("XXXXX", 4)
        };
        assertEquals("Game On", TheOffice.meeting(rooms, 0));
    }

    @Test
    void shouldTakeEnoughChairs(){
        assertArrayEquals(new int[]{1}, (int[]) TheOffice.meeting(new Room[]{new Room("",1)},1));
        assertArrayEquals(new int[]{1}, (int[]) TheOffice.meeting(new Room[]{new Room("",2)},1));
        assertArrayEquals(new int[]{1,1}, (int[]) TheOffice.meeting(new Room[]{new Room("X",2),new Room("X",2)},2));
        assertArrayEquals(new int[]{0,1}, (int[]) TheOffice.meeting(new Room[]{new Room("XX",2),new Room("X",2)},1));
        assertArrayEquals(new int[]{1}, (int[]) TheOffice.meeting(new Room[]{new Room("X",2),new Room("X",2)},1));
        Room[] rooms = new Room[] {
                new Room("XXX", 3),
                new Room("XXXXX", 6),
                new Room("XXXXXX", 9)
        };
        assertArrayEquals(new int[] {0, 1, 3}, (int[]) TheOffice.meeting(rooms, 4));
         rooms = new Room[] {
                new Room("XXX", 1),
                new Room("XXXXXX", 6),
                new Room("X", 2),
                new Room("XXXXXX", 8),
                new Room("X", 3),
                new Room("XXX", 1)
        };
        assertArrayEquals(new int[] {0, 0, 1, 2, 2}, (int[]) TheOffice.meeting(rooms, 5));
        rooms = new Room[] {
                new Room("XXXXXX", 3),
                new Room("XXXXXXX", 8),
                new Room("XX", 2),
                new Room("XXX", 8),
                new Room("XX", 1),
                new Room("X", 8),
                new Room("XXX", 5),
        };
        assertArrayEquals(new int[] {0,1,0,3}, (int[]) TheOffice.meeting(rooms, 4));
    }

    @Test
    void shouldBeNotEnough(){
        Room[] rooms = new Room[] {
                new Room("XXX", 3),
                new Room("XXXXX", 6),
                new Room("XXXXXX", 9)
        };
        assertEquals("Not enough!", TheOffice.meeting(rooms, 99));
        assertEquals("Not enough!", TheOffice.meeting(new Room[]{}, 99));
    }


}