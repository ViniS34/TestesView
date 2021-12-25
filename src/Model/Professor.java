/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author perei
 */
public class Professor extends Pessoa {

    private double salario;
    private String titulo; // Especialista, Mestre, Doutor, etc
// M�todo Construtor de Objeto Vazio

    public Professor() {
    }
// M�todo Construtor de Objeto, inserindo dados

    public Professor(double salario, String titulo) {
        this.salario = salario;
        this.titulo = titulo;
    }
// M�todos GET e SET

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
// M�todo adicional

    public double calcularImposto() {
        return this.salario * 0.11;
    }

}
