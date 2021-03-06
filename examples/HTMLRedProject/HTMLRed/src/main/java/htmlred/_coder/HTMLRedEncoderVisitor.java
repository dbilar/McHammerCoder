/* generated from model null*/
/* generated by template coder.EncoderVisitor*/


package htmlred._coder;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;

import htmlred._parser.*;

public class HTMLRedEncoderVisitor extends HTMLRedAntlrBaseListener {

private HTMLRedEncoder encoder = new HTMLRedEncoder();


public void visitTerminal(TerminalNode node) {
		CommonToken token = (CommonToken)node.getPayload();
	
		if(encoder.check(token)){
			System.out.print(token.getText());
		}
		else{
			System.out.print(encoder.encode(token));
		}
	}	

}
