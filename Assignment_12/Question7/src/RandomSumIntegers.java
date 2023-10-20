import java.util.Random;
import java.util.stream.Stream;

public class RandomSumIntegers {

	public static void main(String[] args) {
		Random r = new Random();

		Stream<Integer> strm4 = Stream.generate(() -> r.nextInt(10)).limit(10);
		int result=strm4.reduce(0, (a,e)->a+e);
		System.out.println(result);

	}

}
