import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Nothing {

	boolean work;

	public Nothing() {
		work = true;
	}


public static void main(String[] args) {

	Nothing natta = new Nothing();
	Calendar rightNow = Calendar.getInstance();
	SimpleDateFormat simpleDateFormat = new 
SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

	do {
		System.out.println( simpleDateFormat.format( 
rightNow.getTime()  ));
	}
	while ( natta.work = true ); 

} //END main()

} // END class
