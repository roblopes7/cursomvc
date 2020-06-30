package com.udemy.cursomcv.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "CARGO")
public class Cargo extends AbstractEntity<Long>{

    @Column(name = "nome", nullable = false, unique = true, length = 60)
    private String nome;
    @ManyToOne
    @JoinColumn(name = "id_departamento_fk")
    private Departamento departamento;
    @OneToMany(mappedBy = "cargo")
    List<Funcionario> funcionarios = new ArrayList<>();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
}
