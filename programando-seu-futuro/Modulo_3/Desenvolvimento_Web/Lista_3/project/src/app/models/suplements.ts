import {v4 as uuidv4} from 'uuid';

export class Suplement{
    id: string;
    name: string;
    ranking: number;
    describe!: string;
    dateValidate!: Date;
    validate: boolean;
    image: String;

    constructor(name:string, ranking: number, validate: boolean, image: string){
        this.id = uuidv4()
        this.name = name
        this.ranking = ranking
        this.validate = validate
        this.image = image
    }
}