package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ElevatorMaintenance {

 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //String[] strNames = new String[]{"John", "alex", "Chris", "williams", "Mark", "Bob"};
        String[] tab = {"1.1.2", "1.0", "1.3.3", "1.0.12", "1.0.2"}; 

        //String[] tab = { "100.2.0" , "5.7.4" , "7.6.1" , "5.6.4" };

        ArrayList<NumberInfo> numberInfoList = new ArrayList<NumberInfo>();
        for (String item : tab) {
            NumberInfo numberInfo = NumberInfo.fromString(item);
            numberInfoList.add(numberInfo);
        }

        NumberInfoComparator numberInfoComparator = new NumberInfoComparator();
        Collections.sort(numberInfoList, numberInfoComparator);

        for (NumberInfo numberInfo : numberInfoList) {
            System.out.println(numberInfo);
        }
	}

    public static String[] answer(String[] l) { 

        ArrayList<NumberInfo> numberInfoList = new ArrayList<NumberInfo>();
        for (String item : l) {
            NumberInfo numberInfo = NumberInfo.fromString(item);
            numberInfoList.add(numberInfo);
        }

        NumberInfoComparator numberInfoComparator = new NumberInfoComparator();
        Collections.sort(numberInfoList, numberInfoComparator);
        
        String[] array = new String[numberInfoList.size()];
        for (int i = 0; i < numberInfoList.size(); i++) {
            array[i] = numberInfoList.get(i).toString();
        }

        return array;
        //return numberInfoList;
    } 

}



class NumberInfoComparator implements Comparator<NumberInfo> {
    @Override
    public int compare(NumberInfo o1, NumberInfo o2) {
        int result = Integer.compare(o1.getA(), o2.getA());
        if (result != 0)
            return result;

        result = Integer.compare(o1.getB(), o2.getB());
        if (result != 0) {
            return result;
        }

        result = Integer.compare(o1.getC(), o2.getC());
        return result;
    }
}	
class NumberInfo {
    private int a;
    private int b;
    private int c;

    private NumberInfo(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    int getA() {
        return a;
    }

    int getB() {
        return b;
    }

    int getC() {
        return c;
    }

    public static NumberInfo fromString(String s) {
        String[] itemComponents = s.split("[.]");
        //if (itemComponents.length != 3) {
        //    throw new IllegalArgumentException("Three comma delimited components expected");
        //}
        int a=0;
        int b=0;
        int c=0;
        if (itemComponents.length == 2) {
            a = Integer.parseInt(itemComponents[0]);
            b = Integer.parseInt(itemComponents[1]);
            c = 0;
        	
        } else{
	        a = Integer.parseInt(itemComponents[0]);
	        b = Integer.parseInt(itemComponents[1]);
	        c = Integer.parseInt(itemComponents[2]);
        }
        NumberInfo numberInfo = new NumberInfo(a, b, c);
        return numberInfo;
    }

    @Override
    public String toString() {
        return a + "." + b + "." + c;
    }
}
