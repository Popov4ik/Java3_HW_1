import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {

    private float weightBox;
    private ArrayList<T> fruit;

    public Box(T... fruit) {
        this.fruit = new ArrayList<>(Arrays.asList(fruit));
    }

    public void addFruitInBox(T fruit) {
        for (Fruit f : this.fruit) {
            if (f.equals(fruit)) {
                throw new IllegalArgumentException("Этот фрукт уже есть в коробке " + fruit.getClass().getSimpleName());
            }
        }
        this.fruit.add(fruit);
    }

    public float getWeightBox() {
        weightBox = 0;
        for (Fruit fruit : fruit) {
            weightBox += fruit.getWeight();
        }
        return weightBox;
    }

    public boolean compare(Box o) {
        return Math.abs(this.getWeightBox() - o.getWeightBox()) < 0.0000001;
    }

    public List<T> getFruit() {
        return fruit;
    }

    public void getEmpty(Box<T> another) {
        if (this.equals(another)) {
            System.out.println("Это та же самая коробка");
            return;
        }
        another.fruit.addAll(this.fruit);
        this.fruit.clear();
    }
} 