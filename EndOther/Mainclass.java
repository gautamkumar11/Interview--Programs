/* 
Given two strings, write a function end_other(as mentioned below), such that, it returns True, if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). 

end_other(input=>string1, string2)

Following are example inputs and corresponding expected output:
end_other('Hiabc', 'abc') → True
end_other('AbC', 'HiaBc') → True
end_other('abc', 'abXabc') → True
end_other('abc','abcAbD') → False
*/
class EndOther
{
  public boolean endOther(String s1, String s2)
  {
  	if(s1.length()>s2.length())
  	{

  		return s1.substring(s1.length() - s2.length(),s1.length()).equalsIgnoreCase(s2);
  	}
  	else if(s1.length()<s2.length())
  	{
  		
  		return s2.substring(s2.length() - s1.length(),s2.length()).equalsIgnoreCase(s1);
  	}

  	return false;

  }

}
class Mainclass
{
	public static void main(String args[])
	{
		EndOther ref = new EndOther();

		System.out.println(ref.endOther("Hiabc", "abc"));		//true
		System.out.println(ref.endOther("AbC", "HiaBc"));		//true
		System.out.println(ref.endOther("abc", "abXabc"));		//true
		System.out.println(ref.endOther("abc", "abcAbD"));		//false
	}
}