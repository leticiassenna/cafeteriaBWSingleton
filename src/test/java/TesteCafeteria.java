/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.ifes.leticia.cafeteriabwsingleton.cdp.Cafe;
import br.ifes.leticia.cafeteriabwsingleton.util.Cafeteria;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Leticia
 */
public class TesteCafeteria {
    private final Cafeteria cafeteria = Cafeteria.getInstance(null);
    
    
    public TesteCafeteria() {
    }
    
    @Test
    public void testCafeteriaCafeNormal() 
    {
        
        Cafe cafe = cafeteria.getCafeNormal();
        Assert.assertSame(cafe.getNome(), "Normal");
    }
    
    @Test
    public void testCafeteriaCafeCappuccino() 
    {
        
        Cafe cafe = cafeteria.getCafeCappuccino();
        Assert.assertSame(cafe.getNome(), "Cappuccino");
    }
    
    @Test
    public void testCafeteriaCafeDescafeinado() 
    {
        
        Cafe cafe = cafeteria.getCafeDescafeinado();
        Assert.assertSame(cafe.getNome(), "Descafeinado");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
