import analista from "./analista";
import Funcionario  from "./funcionario";

export default class Gestor implements Funcionario{
    nome: string;
    funcional: number;
    cargo: string;
    nomeSubordinado: object[];

    constructor(
                nome: string,
                funcional: number,
                cargo: string,
                nomeSubordinado: analista[]){
        this.nome = nome;
        this.funcional = funcional;
        this.cargo = cargo;
        this.nomeSubordinado = nomeSubordinado;
    }
}