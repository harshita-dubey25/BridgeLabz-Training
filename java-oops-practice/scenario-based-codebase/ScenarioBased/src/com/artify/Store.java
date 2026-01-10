package artify;

import java.util.ArrayList;

public class Store {
    ArrayList<Artwork> artwork = new ArrayList<>();
    
    public Store() {
    	artwork.add(new DigitalArt("World of night","Lucky",15.0));
    	artwork.add(new DigitalArt("Gods Truth ","Himesh",100.0));
    	artwork.add(new PrintArt("Colour of Lights","Nageshwar",200.0));
    }
    
    public double buy(String title,String license,double wallet) {
    	for(Artwork a: artwork) {
    		if(a.getTitle().equalsIgnoreCase(title)) {
    				if(wallet>=a.getPrice()) {
    					a.purchase(title, license);
    					wallet = wallet-a.getPrice();
        				artwork.remove(a);
            			return wallet;
    				}else {
    					System.out.println("Not Have Enough Balance");
    					return wallet;
    				}
    		}
    	}
    
    	System.out.println("Art Piece Not Found");
    	return wallet;
    }
    public void details() {
    	for(Artwork a: artwork) {
    		a.details();
    	}
    }
    
    public void certainDetail(String title) {
    	for(Artwork a: artwork) {
    		if(a.getTitle().equalsIgnoreCase(title)) {
    			a.details();
    			return;
    		}
    	}
    	System.out.println("Error Not Found");
    }
}