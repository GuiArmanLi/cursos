import Funcionario  from "./funcionario";

export default class Analista implements Funcionario{
    nome: string;
    funcional: number;
    cargo: string;
    nomeGestor: string;
    nomeSubordinado: object[];

    constructor(nome: string,
                funcional: number,
                cargo: string,
                nomeGestor: string,
                nomeSubordinado: object[]){
        this.nome = nome;
        this.funcional = funcional;
        this.cargo = cargo;
        this.nomeGestor = nomeGestor;
        this.nomeSubordinado = nomeSubordinado;
    }
}