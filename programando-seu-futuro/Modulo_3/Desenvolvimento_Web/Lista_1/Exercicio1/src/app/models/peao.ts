import Funcionario from "./funcionario";

export default class Peao implements Funcionario{
    nome: string;
    funcional: number;
    cargo: string;
    gestor: object;

    constructor(nome: string,
                funcional: number,
                cargo: string,
                gestor: object){
        this.nome = nome;
        this.funcional = funcional;
        this.cargo = cargo;
        this.gestor = gestor;
    }

    find(peao : object){
        return peao;
      };
}