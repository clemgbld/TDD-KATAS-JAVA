package paginatingAHugeBook;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookNumTest {
    @Test
    void shouldPaginateTheBook(){
        assertEquals(1L,BookNum.pageDigits(1L));
        assertEquals(11L,BookNum.pageDigits(10L));
        assertEquals(13L,BookNum.pageDigits(11L));
        assertEquals(192, BookNum.pageDigits(100));
        assertEquals(2893, BookNum.pageDigits(1000));

    }

}