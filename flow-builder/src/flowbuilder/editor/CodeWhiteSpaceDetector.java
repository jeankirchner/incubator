package flowbuilder.editor;

import org.eclipse.jface.text.rules.IWhitespaceDetector;

public class CodeWhiteSpaceDetector implements IWhitespaceDetector {

	public boolean isWhitespace(char c) {
		return (c == ' ' || c == '\t' || c == '\n' || c == '\r');
	}
	
}
