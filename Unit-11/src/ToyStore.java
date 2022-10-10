//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		toyList = new ArrayList<>();
	}

	public void loadToys( String toys )
	{
		String tempToy = "";
		for(int i = 1; i < toys.length()+1; i++) {
			if(toys.charAt(i-1)==' ') {
				for(Toy toy : toyList) {
					if(toy.getName().equals(tempToy)) {
						toy.addCnt(1);
						break;
					}
				}				
				toyList.add(new Toy(tempToy));
				tempToy = "";
			}
			if(toys.charAt(i-1)!=' ')tempToy+=toys.substring(i-1,i);
		}
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for(Toy toy: toyList) {
  			if(toy.getName().equals(nm)) {
  				return toy;
  			}
  		}
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		Toy most = toyList.get(0);
  		for(Toy toy: toyList) {
  			if(toy.getCount() > most.getCount()) {
  				most = toy;
  			}
  		}
  		return most.getName();
  	}  
  
  	public void sortToysByCount()
  	{
  		Toy temp = null;
  		for(int x = 0; x < toyList.size(); x++) {
  			for(int i = 0; i <toyList.size(); i++) {
  				if(toyList.get(i).getCount()<toyList.get(x).getCount()) {
  					temp = toyList.get(x);
  					toyList.set(x, toyList.get(i));
  					toyList.set(i, temp);
  				}
  			}
  		}
  	}  
  	  
	public String toString()
	{
		sortToysByCount();
	    return toyList.toString() + "\n" + "Most frequent toy is " + getMostFrequentToy();
	}
}