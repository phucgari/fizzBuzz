import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    FizzBuzz fizz=new FizzBuzz();
    @Test
    void input1(){
        String result= fizz.FizzBuzz(1);
        assertEquals("1",result);
    }
    @Test
    void input2(){
        String result= fizz.FizzBuzz(2);
        assertEquals("2",result);
    }
    @Test
    void input3(){
        String result= fizz.FizzBuzz(3);
        assertEquals("fizz",result);
    }
    @Test
    void input4(){
        String result= fizz.FizzBuzz(4);
        assertEquals("4",result);
    }
    @Test
    void input5(){
        String result= fizz.FizzBuzz(5);
        assertEquals("buzz",result);
    }
    @Test
    void input15(){
        String result= fizz.FizzBuzz(15);
        assertEquals("fizzbuzz",result);
    }
    @Test
    void input16(){
        String result= fizz.FizzBuzz(16);
        assertEquals("16",result);
    }
    @Test
    void input30(){
        String result=fizz.FizzBuzz(30);
        assertEquals("fizzbuzz",result);
    }
    @Test
    void input33(){
        String result=fizz.FizzBuzz(33);
        assertEquals("fizz",result);
    }
    @Test
    void input35(){
        String result=fizz.FizzBuzz(35);
        assertEquals("buzz",result);
    }
}