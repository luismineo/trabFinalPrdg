package Gerenciador;

import java.util.ArrayList;
import java.util.Scanner;

import static Gerenciador.funcionalidades.AddCar.addCar;

public class Executora {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<Car>();
        Scanner scanner = new Scanner(System.in);

        /*int menuChoice;
        do {
            System.out.println("1 - Adicionar carro");
            System.out.println("2 - Listar carros");
            System.out.println("3 - Vender carro");
            System.out.println("4 - Relatório de vendas");
            System.out.println("0 - Sair");

            menuChoice = scanner.nextInt();
        } while (menuChoice != 0);
        cars.add(addCar());
        System.out.println((cars.get(0)).getMarca());*/
        int n;
        System.out.println("Qnts carros: ");
        n = scanner.nextInt();

        for (int i = 0; i < n; i++){
            cars.add(addCar());
            System.out.println("Cadastrado");
        }

        for (int i = 0; i < n; i++) {
            System.out.println((cars.get(i)).getMarca());
        }

    }
}
