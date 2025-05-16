export default class AnimalModel {
    id !: number;
    name !: String;
    raca !: String;

    constructor(id: number, name: String, raca: String){
        this.id = id;
        this.name = name;
        this.raca = raca;
    }
}