export default class Cosmetico {
    id!: number;
    nome!:String;
    preco!: number;
    image!:String;

    constructor(id:number, nome:String, preco:number, image:String){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.image = image;
    }
}