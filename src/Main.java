public class Main {
    public static void main(String[] args) {
//<<<<<<< HEAD
        //long[] price = {15L, 200L, 25L, 666L};
//=======
        long[] price = {15L, 15L, 666L, 200L, 25L, 666L, 526L, 126L, 88L, 666L};// создаем массив данных price;
//>>>>>>> Stat
        SalesManager sales = new SalesManager(price);
        System.out.println("Sale max = " + sales.max());// максимальное значение;
        System.out.println("Sale min = " + sales.min());// минимальное знчаение;
        System.out.println("Sale stat = " + sales.stat());//
    }
}
