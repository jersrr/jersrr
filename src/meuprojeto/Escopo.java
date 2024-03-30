package meuprojeto;

public class Escopo {
		public static void main(String[] args) {
			int i = 5;
			int j = 2;
		{
			
			System.out.println(i);
			j = j * i;
			System.out.println(j);
			{
					System.out.println(i);
					System.out.println(j);
				}
			}
			System.out.println(i);
			System.out.println(j);
		}
	}
