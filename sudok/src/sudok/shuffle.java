package sudok;

public class shuffle {
	public String[] shuffle_number(String[] arr){//1차원배열을 섞는다.
	    for(int x=0;x<arr.length;x++){
	      int i = (int)(Math.random()*arr.length);
	      int j = (int)(Math.random()*arr.length);      
	      int tmp = Integer.parseInt(arr[i]);
	      arr[i] = arr[j];
	      arr[j] = Integer.toString(tmp);
	    }      
	    return arr;
	  }

}
