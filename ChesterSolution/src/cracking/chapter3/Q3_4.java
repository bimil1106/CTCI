package cracking.chapter3;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/* 3.4
 * In the classic problem of the Towers of Hanoi, you have 3 towers and N discs of
 * different sizes which can slide onto any tower.  The puzzle starts with discs sorted
 * in ascending order of size from top to bottom (i.e., each disc sits on top of an
 * even larger one).  you have the following constraints:
 * (1) Only one disc can be moved at a time.
 * (2) A disc is slid off the top of one tower onto the next tower.
 * (3) A disc can be placed on top of a larger disc
 * Write a program to move the discs from the first tower to the last using stacks.
 */

public class Q3_4 {
	static List<Stack<Integer>> tower=new ArrayList<Stack<Integer>>(3);
	
	static void moveHanoiTower(int n) {
		initTowers(n);
		moveTower(n, 0, 2, 1);
		drawTowers();
	}

	static void initTowers(int numDiscs) {
		tower.clear();
		for (int inx=0; inx<3; inx++)
			tower.add(new Stack<Integer>());
		for (int discSize=numDiscs; discSize>0; discSize--) {
			tower.get(0).push(discSize);
		}
	}
	
	static void moveTower(int numberOfDiscs, int from, int to, int spare) {
		drawTowers();
		Stack<Integer> source = tower.get(from);
		Stack<Integer> target = tower.get(to);
		if (numberOfDiscs==1) {
			target.push(source.pop());
		} else {
			moveTower(numberOfDiscs-1, from, spare, to);
			target.push(source.pop());
			moveTower(numberOfDiscs-1, spare, to, from);
		}
	}
	
	static void drawTowers() {
		for (int i=0; i<3; i++) {
			System.out.print(String.format("Tower%d: ", i+1));
			for (Object disc: tower.get(i).toArray()) {
				System.out.print(" "+(Integer)disc);
			}
			System.out.println();
		}
		System.out.println();
	}
}
