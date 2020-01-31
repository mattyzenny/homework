package com.techelevator;



import static org.junit.Assert.assertThat;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class WordCountTest {

	


	WordCount numberOfStringInKey = new WordCount();
		
		
		@Test
		public void testStringCount() {
			
//			
//			Assert.assertEquals(null, numberOfStringInKey.getCount(new String[] {}));
//			Assert.assertEquals("ba: 2", numberOfStringInKey.getCount(new String[] {"ba", "ba", "black", "sheep"}));
//			Assert.assertEquals(new String[] {"ba: 2"}, numberOfStringInKey.getCount(new String[] {"ba", "ba", "black", "sheep"}));
		Assert.assertEquals("ba: 2", numberOfStringInKey.getCount(new String[] {"ba", "ba", "black", "sheep"}));
		
		}
}

		
//public class MapTest {
//
//    @Test
//    public void testAssertMap() {
//
//        Map<String, String> map = new HashMap<>();
//        map.put("j", "java");
//        map.put("c", "c++");
//        map.put("p", "python");
//        map.put("n", "node");
//
//        Map<String, String> expected = new HashMap<>();
//        expected.put("n", "node");
//        expected.put("c", "c++");
//        expected.put("j", "java");
//        expected.put("p", "python");
//
//	

