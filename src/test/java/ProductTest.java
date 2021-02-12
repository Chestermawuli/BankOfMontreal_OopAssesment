import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.internal.matchers.Equals;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class ProductTest {

    @Test
    public void ProductPricingServiceTest(){
        // mock the class
        Products mockedProduct = mock(Products.class);

        //declare the dummy result to return
        when(mockedProduct.price("drift","test")).thenReturn(mockedProduct.currentPrice);

        assertEquals
    }



}
