package base;

import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class HeroManager {
    public void save(Hero hero) {
    	SerializableHero serializableHero = new SerializableHero(hero);
  
    	try {
	    	FileOutputStream fileOutputStream = new FileOutputStream("C:\\hero.save");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);   
	
			objectOutputStream.writeObject(serializableHero);
			objectOutputStream.close();
    	} catch (Exception ex) {}
    }
    
    private class SerializableHero implements Serializable {
    	String[] skills;
    	
    	public SerializableHero (Hero hero) {
    		skills = hero.skills.toArray(new String[0]);
    	}
    }
}
