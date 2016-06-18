package raceDecorators;

import java.util.List;
import java.util.Arrays;
import java.util.Iterator;

import base.Hero;
import base.HeroDecorator;

public class DwarfDecorator extends HeroDecorator {
	private List<String> newSkills = Arrays.asList("Night Vision", "Enhanced Fortitude");

    public DwarfDecorator(Hero decoratedHero) {
        super(decoratedHero);
        addSkills(decoratedHero);
    }

    public void addSkills (Hero decoratedHero) {
	    for (Iterator<String> i = newSkills.iterator(); i.hasNext();) {
	    	String skill = i.next();
	
	        if (!decoratedHero.skills.contains(skill)) {
	        	decoratedHero.skills.add(skill);
	        }
	    }
    }
}