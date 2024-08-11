import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfArrayTest {
    @Test
    public void returnProductOfNumberInArray(){
        int [] array = {1,2,3,4};
        int [] expected = {24,12,8,6};
        assertArrayEquals(expected,ProductOfArray.productExceptSelf(array));
    }

}