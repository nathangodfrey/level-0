import java.io.IOException;

public class MyAge {
	public static void main(String[] args) {
		for (int i = 10; i > 0; i = i - 1) {
			System.out.println(i);
			try {
				Runtime.getRuntime().exec("say " + i).waitFor();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
