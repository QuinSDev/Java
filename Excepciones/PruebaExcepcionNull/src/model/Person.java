package model;

import java.util.Scanner;

public class Person {

    private String name;
    private int age;
    private char sex;
    private double height, weight;

    public Person() {
    }

    public Person(String name, int age, char sex, double height, double weight) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void crearPersona() {

        Scanner read = new Scanner(System.in);

        System.out.print("Ingresa el nombre: ");
        this.name = read.nextLine();
        System.out.print("Ingrese la edad: ");
        this.age = read.nextInt();
        System.out.print("Ingrese el sexo(H/M): ");
        this.sex = read.nextLine().charAt(0);
        System.out.print("Ingresa el peso: ");
        this.weight = read.nextDouble();
        System.out.print("Ingresa la altura: ");
        this.height = read.nextDouble();

    }

    public int calcularIMC() {

        double pIdeal = getWeight() / (Math.pow(getHeight(), 2));
        if (pIdeal < 20) {
            System.out.println("\nEstá por debajo de su peso ideal.");
            return -1;
        } else if (pIdeal >= 20 && pIdeal <= 25) {
            System.out.println("\nEstá en su peso ideal.");
            return 0;
        } else {
            System.out.println("\nEstá en sobrepeso.");
            return 1;
        }

    }

    public boolean mayorEdad() {

        if (getAge() >= 18) {
            return true;
        } else {
            return false;
        }

    }

}
