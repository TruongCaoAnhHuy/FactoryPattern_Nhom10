
public class DrinkFactory {
	public Drink getDrink(String drink){
        if (drink.equals(null))
            return null;
        
        if (drink.equalsIgnoreCase("Dâu Tằm"))
            return new TraDauTam();
        else if (drink.equalsIgnoreCase("Truyền Thống"))
        	return new TraSuaTT();
        else if (drink.equalsIgnoreCase("HongKong"))
        	return new TraSuaHK();
        else if (drink.equalsIgnoreCase("Lài"))
        	return new TraSuaLai();
        else if (drink.equalsIgnoreCase("Trà Vải"))
        	return new TraVai();
        return null;
    }
}
