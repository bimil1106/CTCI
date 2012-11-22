package cracking.chapter10;

/*
 *  How would you design the data structures for a very large social network like
 *  Facebook or LinkedIn? Describe how you would design an algorithm to show 
 *  the connection, or path, between two eople (e.g., Me -> Bob -> Susan -> Jason
 *  -> You).
 *  
 */

public class Q10_2 {
/*
 * Step1: Simplify the problem - forget about the millions of Users
 * 		Construct Graph: a node - each person, an edge - the two users are friends
 * 		class Person {
 * 			Person[] friends;
 * 			// Other info
 * 		}
 * 		How to find the connection between two people:
 * 			Breadth first search
 * 		Why not Depth first search? inefficient
 * 			two users might be only one degree of separation apart
 *
 * Step2: Handle the Millions of Users
 * 		Multiple machines are needed to keep data
 * 		In step1, we assumed all data are in the one machine
 * 		Replace our list of friends with a list of their IDs.
 * 		How to traverse: 
 * 			1. For each friend ID: int machine_index = getMachineIDForUser(person_id);
 * 			2. Go to machine #machine_index
 * 			3. On that machine, do: Person friend = getPersonWithID(person_id);
 * 
 * 		Optimization: Reduce expensive Machine Jumps
 * 			by batching these jumps - 
 * 				e.g.if five of my friends live on one machine, look them up all at once
 * 
 * 		Optimization: Smart Division
 * 			devide them up by country, city, state and so on.
 * 
 * 		Question: BFS usually requires marking a node as visited. how do you do that in this case?
 * 			expensive marking data --> mimic the marking of nodes with a hash table 
 * 				to look up a node id whether or not it's been visited
 * 			
 * 		See the following questions: p347
 * 			> In real world, servers fail. How does this affect you?
 * 				make a backup machine located in a different machine.
 * 			> How could you take advantage of caching?
 * 				make a caching layer in our machine if machine jumps happens for finding friends
 * 				(who is going to be cached? common or popular person in this machine)
 * 			> Do you search until the end of the graph (infinite)? How do you decide when to give up?
 * 				give up when you want to give up.. depending of your purpose..
 * 			> In real life, some people have more friends of friends than others, and are therefore
 * 			more likely to make a path between you and someone else. How could you use this data
 * 			to pick where you start traversing?
 * 				if someone has more friends, then there is more possibility to find some others
	            So sort friends with more friends, then do the DFS using the friend.
 * 
 * 
 */	                     
}
