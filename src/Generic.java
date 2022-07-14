public class Generic {


    class Flower {  }
    class Rose extends Flower { }
    class RosePasta { }

    class Basket<T> {
        private T item;

        public T getItem() {
            return item;
        }

        public void setItem(T item) {
            this.item = item;
        }
    }

    public static void main(String[] args) {
        Basket<Flower> flowerBasket = new Basket<>();
        flowerBasket.setItem(new Rose());      // 다형성 적용

    }
}
