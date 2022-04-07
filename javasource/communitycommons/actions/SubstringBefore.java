// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package communitycommons.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import communitycommons.StringUtils;

/**
 * Gets the substring before the first occurrence of a separator.
 */
public class SubstringBefore extends CustomJavaAction<java.lang.String>
{
	private java.lang.String str;
	private java.lang.String separator;

	public SubstringBefore(IContext context, java.lang.String str, java.lang.String separator)
	{
		super(context);
		this.str = str;
		this.separator = separator;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
		return StringUtils.substringBefore(str, separator);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "SubstringBefore";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
