package init;

import base.Hero;
import base.HeroManager;

import races.Human;
import races.Dwarf;
import races.Elf;
import races.Halfling;

import classes.Armorsmith;
import classes.Assassin;
import classes.Fighter;
import classes.Hunter;
import classes.Mage;

import raceDecorators.DwarfDecorator;
import raceDecorators.HumanDecorator;
import raceDecorators.ElfDecorator;
import raceDecorators.HalflingDecorator;

import classDecorators.FighterDecorator;
import classDecorators.HunterDecorator;
import classDecorators.AssassinDecorator;
import classDecorators.MageDecorator;
import classDecorators.ArmorsmithDecorator;

public class Main {
	public static void main(String[] args) {
		Hero hero = new Dwarf();
		Hero heroWithFirstClass = new FighterDecorator(hero);
		Hero heroWithSecondClass = new MageDecorator(heroWithFirstClass);
		
		printHeroSkills(heroWithSecondClass);
		
		HeroManager heroManager = new HeroManager();
		heroManager.save(heroWithSecondClass);
	}
	
	static void printHeroSkills(Hero hero) {
		for (int i = 0; i < hero.skills.size(); i++) {
			System.out.print(hero.skills.get(i));
			
			if (i < (hero.skills.size() - 1)) {
				System.out.print(", ");
			}
		}
	}
}
