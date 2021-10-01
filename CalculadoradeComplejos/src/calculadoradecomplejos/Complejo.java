/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoradecomplejos;

/**
 *
 * @author David Morales
 */


public class Complejo {

    private double real;
    private double imaginaria;

    public Complejo() {
    }

    public Complejo(double real, double imaginaria) {
        this.real = real;
        this.imaginaria = imaginaria;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginaria() {
        return imaginaria;
    }

    public void setImaginaria(double imaginaria) {
        this.imaginaria = imaginaria;
    }

    public Complejo suma(Complejo ncomplejo) {
        Complejo complejo = new Complejo();
        double nreal = this.real + ncomplejo.getReal();
        double nimaginario = this.imaginaria + ncomplejo.getImaginaria();

        complejo.setReal(nreal);
        complejo.setImaginaria(nimaginario);

        return complejo;
    }

    public Complejo restar(Complejo ncomplejo) {
        Complejo complejo = new Complejo();
        double nreal = this.real - ncomplejo.getReal();
        double nimaginario = this.imaginaria - ncomplejo.getImaginaria();

        complejo.setReal(nreal);
        complejo.setImaginaria(nimaginario);

        return complejo;
    }

    public Complejo multiplicar(Complejo ncomplejo) {
        Complejo complejo = new Complejo();

        double nreal = this.real * ncomplejo.getReal() - this.getImaginaria() * ncomplejo.getImaginaria();

        double nimaginario = this.real * ncomplejo.getImaginaria() + this.imaginaria * ncomplejo.getReal();

        complejo.setReal(nreal);
        complejo.setImaginaria(nimaginario);

        return complejo;
    }

    public Complejo dividir(Complejo ncomplejo) {
        Complejo complejo = new Complejo();

        double nreal = (this.real * ncomplejo.getReal() + this.imaginaria
                + ncomplejo.getImaginaria()) / (ncomplejo.getReal() * ncomplejo.getReal()
                + ncomplejo.getImaginaria() * ncomplejo.getImaginaria());

        double nimaginario = (this.imaginaria * ncomplejo.getReal() - this.real
                * ncomplejo.getImaginaria()) / (ncomplejo.getReal() * ncomplejo.getReal()
                + ncomplejo.getImaginaria() * ncomplejo.getImaginaria());

        complejo.setReal(nreal);
        complejo.setImaginaria(nimaginario);

        return complejo;
    }

    public static Complejo conjugado(Complejo ncomplejo) {

        return new Complejo(ncomplejo.getReal(), -ncomplejo.getImaginaria());

    }

    public static double Norma(Complejo ncomplejo) {

        double nNorma = Math.sqrt(ncomplejo.getReal() * ncomplejo.getReal() + ncomplejo.getImaginaria() * ncomplejo.getImaginaria());

        return nNorma;

    }

    public String toString() {
        return String.format("(%.2f, %.2fi)", real, imaginaria);
    }
}

