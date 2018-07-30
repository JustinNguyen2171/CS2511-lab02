import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stock {
    String name;
    Double price;
    private static Stock[] stocks = new Stock[3];
    private static Stock[] newStocks = new Stock[3];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String Split[] = input.split(" ");
        Stock one = new Stock();
        one.name = Split[0];
        one.price = Double.valueOf(Split[1]);
        Stock two = new Stock();
        two.name = Split[2];
        two.price = Double.valueOf(Split[3]);
        Stock three = new Stock();
        three.name = Split[4];
        three.price = Double.valueOf(Split[5]);
        stocks[0] = new Stock();
        stocks[1] = new Stock();
        stocks[2] = new Stock();
        newStocks[0] = new Stock();
        newStocks[1] = new Stock();
        newStocks[2] = new Stock();
        stocks[0] = one;
        stocks[1] = two;
        stocks[2] = three;

        String[] names = new String[3];
        int min_index = 0;
        int c = 0;
        for(int d = 0; d<3; d++) {
            double min = 100000000;
            for (int a = 0; a < 3; a++) {
                if (stocks[a].price < min) {
                    int check = 0;
                    for (int b = 0; b < names.length; b++) {
                        if (names[b] != null) {
                            if (names[b].equals(stocks[a].name)) {
                                check = 1;
                            }
                        }
                    }
                    if (check == 0) {
                        min = stocks[a].price;
                        min_index = a;
                    }
                }
            }
            names[c] = stocks[min_index].name;
            newStocks[c] = stocks[min_index];
            c++;
        }
        for (int z = 0; z < 3; z++){
            System.out.println("Share:"+newStocks[z].name+","+newStocks[z].price);
        }
    }
}
