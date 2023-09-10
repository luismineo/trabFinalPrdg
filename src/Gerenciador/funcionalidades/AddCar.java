package Gerenciador.funcionalidades;

import Gerenciador.Car;

import java.util.Scanner;

public class AddCar {
    static Scanner scanner = new Scanner(System.in);
    public static Car addCar (){
        String marca;
        String modelo;
        int ano;
        int km;
        float valorVenda;

        Car car;
        car = new Car();

        System.out.println("Digite a marca do carro:");
        marca = scanner.next();
        car.setMarca(marca);

        System.out.println("Digite o modelo do carro:");
        modelo = scanner.next();
        car.setModelo(modelo);

        System.out.println("Digite o ano do carro:");
        ano = scanner.nextInt();
        car.setAno(ano);

        System.out.println("Digite a quilometragem do carro:");
        km = scanner.nextInt();
        car.setKm(km);

        System.out.println("Digite o valor de venda do carro:");
        valorVenda = scanner.nextFloat();
        car.setValorVenda(valorVenda);

        return car;
    }
}
