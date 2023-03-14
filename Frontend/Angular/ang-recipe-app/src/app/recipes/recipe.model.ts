import { Ingredient } from '../shared/ingredient.model';

export class Recipe {
  public name: string;
  public description: string;
  public imagePath: string;
  public chefPath: string;
  public vegetarian: string;
  public ingredients: Ingredient[];
  

  constructor(name: string, desc: string, imagePath: string, chefPath: string, vegatarian: string, ingredients: Ingredient[]) {
    this.name = name;
    this.description = desc;
    this.imagePath = imagePath;
    this.chefPath = chefPath;
    this.vegetarian = vegatarian;
    this.ingredients = ingredients;
  }
}
