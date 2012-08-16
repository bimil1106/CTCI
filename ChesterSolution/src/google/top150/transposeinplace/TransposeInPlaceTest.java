package google.top150.transposeinplace;

import org.junit.Test;

public class TransposeInPlaceTest {

	@Test
	public void testNext() {
		int width = 7;
		int height = 8;
		int inx2, nextCandid;
		for (int inx=0; inx<width*height; ) {
			System.out.print("[");
			inx2 = inx;
			nextCandid = inx+1;
			do {
				inx2=TransposeInPlace.next(inx2, width, height);
				if (inx2==nextCandid)
					nextCandid++;
				if (inx2 < inx) {
					System.out.print("** Duplicate found!! ==> "+inx2+"**  Drop this loop!!");
					break;
				}
				System.out.print(String.format(" %d ", inx2));
			} while (inx2!=inx);
			System.out.println("]");
			inx = nextCandid;
		}
		
	}

}
