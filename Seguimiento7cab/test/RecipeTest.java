import model.Recipe;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RecipeTest {

    Recipe recipe1;
    Recipe recipe2;

    public void setup1(){
        recipe1 = new Recipe();
    }

    public void setup2(){
        recipe2 = new Recipe();
        recipe2.addIngredient("Cebolla",315);
        recipe2.addIngredient("Ajo", 58);
        recipe2.addIngredient("Arroz", 520);
    }

    @Test
    public void addIngredientTest(){
        setup1();
        recipe1.addIngredient("Sal",12);
        assertNotNull(recipe1.getIngredients().get(0));
    }

    @Test
    public void addIngredientTest2(){
        setup2();
        recipe2.addIngredient("Pimienta" ,6);
        assertEquals(4, recipe2.getIngredients().size());
        assertEquals("Pimienta", recipe2.getIngredients().get(3).getName());
    }

    @Test
    public void addIngredientTest3(){
        setup2();
        recipe2.addIngredient("Ajo",21);
        assertEquals(3, recipe2.getIngredients().size());
        assertEquals(21, recipe2.getIngredients().get(1).getWeight());
    }

    @Test
    public void removeIngredientTest(){
        setup2();
        recipe2.removeIngredient("Ajo");
        assertEquals(2, recipe2.getIngredients().size());
    }


}
