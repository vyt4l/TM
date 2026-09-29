import java.util.List;

public class Utils {
	public static <T extends Comparable<T>> T max (List<T> produits){
		if (produits == null)
			throw new IllegalArgumentException("La liste ne peut pas etre null");
		
		T max = null;
		for (T p : produits){
			if (max == null || (p.compareTo(max) == 1))
				max = p;
		}
		return (max);
	}
	
	public static <T extends Comparable<T>> T min (List<T> produits){
		if (produits == null)
			throw new IllegalArgumentException("La liste ne peut pas etre null");
		
		T min = null;
		for (T p : produits){
			if (min == null || (p.compareTo(min) <= 0))
				min = p;
		}
		return (min);
	}
}
