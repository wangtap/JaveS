
public class Ñ¡Ôñ {

	public static void main(String[] args) {
		int[ ] array = {3,6,2,4,8,7,5};
		for(int i = 0; i<array.length; i++) {
			for(int j = i+1; j < array.length; j++) {
				if(array[ i ] > array[ j ]) {
					int  temp = array[ j ];
					array[ j ] = array[ i ] ;
					array[ i ] = temp;
				}
			}
		System.out.println(array[i]);
		}

	}

}
