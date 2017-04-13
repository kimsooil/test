
public class CountPairRunner {

	public static void main(String[] args) {
		System.out.println(CountPair("abbbcbb"));
		// TODO Auto-generated method stub

	}

	private static int CountPair(String string) {
		// TODO Auto-generated method stub
		int count=0;
		for (int i=0;i<string.length()-1;i++){
			int beginIdx=i;
			int endIdx=i+1;
			if (string.charAt(beginIdx)==string.charAt(endIdx)){
				count++;
			}					
		}
		return count;
	}

}
