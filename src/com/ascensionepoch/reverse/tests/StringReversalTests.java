package com.ascensionepoch.reverse.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ascensionepoch.reverse.StringReverser;
import com.ascensionepoch.reverse.StringReverserFactory;

public class StringReversalTests {

	@Test
	public void testStringBufferReversal() {
		StringReverser rev = StringReverserFactory.buildStringReverser("sb");
		assertNotNull(rev);
		
		assertEquals("amzO", rev.reverse("Ozma"));
		assertFalse(rev.isPalindrome("Ozma"));
		assertTrue(rev.isPalindrome("mom"));
		assertFalse(rev.isPalindrome("Mom"));
	}
	
	@Test
	public void testStringBufferIterative() {
		StringReverser rev = StringReverserFactory.buildStringReverser("iter");
		assertNotNull(rev);
		
		assertEquals("amzO", rev.reverse("Ozma"));
		assertFalse(rev.isPalindrome("Ozma"));
		assertTrue(rev.isPalindrome("mom"));
		assertFalse(rev.isPalindrome("Mom"));
	}
	
	@Test
	public void testStringBufferRecursive() {
		StringReverser rev = StringReverserFactory.buildStringReverser("recursive");
		assertNotNull(rev);
		
		assertEquals("amzO", rev.reverse("Ozma"));
		assertFalse(rev.isPalindrome("Ozma"));
		assertTrue(rev.isPalindrome("mom"));
		assertFalse(rev.isPalindrome("Mom"));
	}
	
	@Test
	public void testBadType() {
		StringReverser rev = StringReverserFactory.buildStringReverser("foo");
		assertNull(rev);
	}
}
