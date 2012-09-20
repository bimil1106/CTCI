package cracking.chapter6;

/* 
 * There are 100 closed lockers in a hallway. A man begins by opening all 100 lockers.
 * Next, he closes every second locker. Then, he goes to every third locker and "toggles it"
 * (Closes it if it is open or opens it if it is closed). After his 100th pass in the hallway,
 * in which he toggles only locker #100, how may lockers are open?
 * 
 * */
public class Q6_6 {
	// the door n flips at the factor of n. e.g. 14 ==> (1,14)(2,7) ==> 4 factors means 4 visits at n
	// even visits will cause the door close, odd visits will be open
	// 25 => (1,25)(5,5) == 3 factors ==> odd visits.
	// square number will have odd factors. 1,4,9,16,25,36,49,64,81,100 ==> 10 opens
}
