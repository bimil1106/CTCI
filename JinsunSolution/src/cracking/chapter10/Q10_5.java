package cracking.chapter10;

/*
 * If you were designing a web crawler, how would you avoid getting into infinite 
 * loops?
 */

public class Q10_5 {
	/*
	 *  how an infinite loop might occur?
	 *      picture the web as a graph of links, if a cycle, then infinite loop
	 * 
	 *  to prevent infinite loops -> need to detect cycles
	 *      create hash table where we set hash[v] to true after we visit page v.
	 *          By BFS, each time we visit a page, we gather all its links and insert them at the end of a queue
	 *          If we've already visited a page, we ignore it.
	 *  
	 *  How does it means to visit page v? based on content or URL?
	 *      But it is tricky to define a "different page"
	 *      So, some sort of estimation for degree of similarity.
	 *      If a page is deemed to be sufficiently similar to other pages, we deprioritize crawling its children
	 *      For each page, come up with some sort of signature based on snippets of the content and page's URL
	 *          How work?
	 *          1. Open up the page and create a signature of the page based on specific subsections of the page content and its URL
	 *          2. Query the db to see whether anything with this signature has been crawled recently
	 *          3. If something with this signature has been recently crawled, insert this page back into the database at a low priority
	 *          4. If not, crawl the page and insert its links into the db.
	 *  
	 *  By this approach, we never "complete" crawling the web, but we will avoid getting stuck in a loop of pages.
	 * 
	 * 
	 * 
	 */

}
