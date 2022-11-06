public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {//создаем открытый метод SalesManager;
        this.sales = sales;
    }

    public long max() {//создаем открытый метод max;
        long max = -1;// если max = -1;
        for (long sale : sales) { // то метод max идет перебором по имеющимся у нас значениям массива;
            if (sale > max) { //если sale > max; max = sale;
                max = sale;
            }
        }
        return max;//возвращаем значеие max;
    }

    public long min() {//создаем открытый метод min;
        long min = max();//если min = max;
        for (long sale : sales) {//то метод sale идет перебором по имеющимся у нас значениям массива;
            if (sale < min) {//sale < min, то
                min = sale;// min = sale;
            }
        }
        return min;//возвращем значение min = sale;
    }

    public long stat() {//создаем метод stat;
        int stat = 0;//начальное значение переменной stat = 0;
        int i = 0;
        int n = 0;
        int x = 0;
        for (long sale : sales) {
            //if (min() != sale $$ sale != max() ) {
            //   stat += sale;
            //   i++;
            //}
            if (min() == sale && n == 0) {
                n++;
            } else if (max() == sale && x == 0) {
                x++;
            } else {
                stat += sale;
                i++;
                //System.out.println(sale);
            }
        }
        //System.out.println(i);
        return (stat / i);
    }
}