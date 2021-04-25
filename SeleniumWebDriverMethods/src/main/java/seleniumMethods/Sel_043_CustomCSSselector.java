package seleniumMethods;

public class Sel_043_CustomCSSselector {

	public static void main(String[] args) {

		// CSS is faster than Xpath
		// CSS doesn't allows very precise locators
		// CSS allows for selection of elements by their surrounding context
		// CSS provides a good balance between structure and attributes
		
		// Xpath :
		// //input[@id='userName']
		// //input[@id='userName' and @type='text']
		
		// CSSselector :
		// #userName
		// input[id='userName'][type='text']
		// input[id='userEmail']
		
		// Dynamic elements :
		// <input id="test_123"> // beginning
		// <input id="test_987"> // after refreshing the page
		
		// input[id*='test_'] (* means contains)
		// input[id^='test_'] (^ means starts-with)
		// input[id$='test_'] (* means ends-with)
		
		// Parent/Child relationship
		// div > input[id='userEmail']
		
	}

}
