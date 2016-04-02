/* generated from model null*/
/* generated by template parser.MCParser*/



package htmlred._parser;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import java.util.Optional;
import de.monticore.antlr4.MCConcreteParser;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;

public class HTMLRedParser extends MCConcreteParser {

  protected HTMLRedAntlrParser create(String filename) throws IOException, RecognitionException {
    HTMLRedAntlrLexer lexer = new HTMLRedAntlrLexer(new  ANTLRFileStream(filename));
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    HTMLRedAntlrParser parser = new HTMLRedAntlrParser(tokens);
    lexer.setMCParser(parser);  
    parser.setFilename(filename);
    setError(false);
    return parser;
  }
  
  protected HTMLRedAntlrParser create(Reader reader) throws IOException, RecognitionException {
    HTMLRedAntlrLexer lexer = new HTMLRedAntlrLexer(new ANTLRInputStream(reader));
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    HTMLRedAntlrParser parser = new HTMLRedAntlrParser(tokens);
    lexer.setMCParser(parser);  
    parser.setFilename("Reader");
    setError(false);
    return parser;
  }
  
  /**
   * @see de.monticore.antlr4.MCConcreteParser#parse(java.lang.String)
   */
  @Override
  public Optional<htmlred._ast.ASTP> parse(String fileName) throws IOException, RecognitionException {
    return parseP(fileName);
  }
  
  /**
   * @see de.monticore.antlr4.MCConcreteParser#parse(java.io.Reader)
   */
  @Override
  public Optional<htmlred._ast.ASTP> parse(Reader reader) throws IOException, RecognitionException {
    return parseP(reader);
  }
  
  public Optional<htmlred._ast.ASTP> parse_String(String str) throws IOException, RecognitionException {
    return parseString_P(str);
  }
 
    /* generated by template parser.MCParserMethods*/


  /** Parses a file. 
   * 
   * @param filename Name of file to parse
   * @return Resulting AST
   * @throws IOException 
   * @throws RecognitionException
   */
  public Optional<htmlred._ast.ASTP> parseP(String filename) throws IOException, RecognitionException {   
    HTMLRedAntlrParser parser = create(filename);    
	htmlred._ast.ASTP ast;
    if (getParserTarget().equals(MCConcreteParser.ParserExecution.NORMAL)) {
      ast = parser.p().ret;
    } else {
      ast = parser.p_eof().ret;
    }
    if (parser.hasErrors()) {
      setError(true);
      return Optional.<htmlred._ast.ASTP> empty();
    }
    return Optional.ofNullable(ast);
  }

  /** Parses content of a Reader.
   * 
   * @param reader Reader to parse from
   * @return Resulting AST
   * @throws IOException 
   * @throws RecognitionException
   * */
  public  Optional<htmlred._ast.ASTP> parseP(Reader reader) throws IOException, RecognitionException {
 	HTMLRedAntlrParser parser = create(reader);
	htmlred._ast.ASTP ast;
    if (getParserTarget().equals(MCConcreteParser.ParserExecution.NORMAL)) {
      ast = parser.p().ret;
    } else {
      ast = parser.p_eof().ret;
    }
    if (parser.hasErrors()) {
      setError(true);
      return Optional.<htmlred._ast.ASTP> empty();
    }
    return Optional.ofNullable(ast);
  }
  
  /** Parses content of a String.
   * 
   * @param str String to parse from
   * @return Resulting AST
   * @throws IOException 
   * @throws RecognitionException
   * */
  public  Optional<htmlred._ast.ASTP> parseString_P(String str) throws IOException, RecognitionException {
    return parseP(new StringReader(str));
  }

    /* generated by template parser.MCParserMethods*/


  /** Parses a file. 
   * 
   * @param filename Name of file to parse
   * @return Resulting AST
   * @throws IOException 
   * @throws RecognitionException
   */
  public Optional<htmlred._ast.ASTAlternatives> parseAlternatives(String filename) throws IOException, RecognitionException {   
    HTMLRedAntlrParser parser = create(filename);    
	htmlred._ast.ASTAlternatives ast;
    if (getParserTarget().equals(MCConcreteParser.ParserExecution.NORMAL)) {
      ast = parser.alternatives().ret;
    } else {
      ast = parser.alternatives_eof().ret;
    }
    if (parser.hasErrors()) {
      setError(true);
      return Optional.<htmlred._ast.ASTAlternatives> empty();
    }
    return Optional.ofNullable(ast);
  }

  /** Parses content of a Reader.
   * 
   * @param reader Reader to parse from
   * @return Resulting AST
   * @throws IOException 
   * @throws RecognitionException
   * */
  public  Optional<htmlred._ast.ASTAlternatives> parseAlternatives(Reader reader) throws IOException, RecognitionException {
 	HTMLRedAntlrParser parser = create(reader);
	htmlred._ast.ASTAlternatives ast;
    if (getParserTarget().equals(MCConcreteParser.ParserExecution.NORMAL)) {
      ast = parser.alternatives().ret;
    } else {
      ast = parser.alternatives_eof().ret;
    }
    if (parser.hasErrors()) {
      setError(true);
      return Optional.<htmlred._ast.ASTAlternatives> empty();
    }
    return Optional.ofNullable(ast);
  }
  
  /** Parses content of a String.
   * 
   * @param str String to parse from
   * @return Resulting AST
   * @throws IOException 
   * @throws RecognitionException
   * */
  public  Optional<htmlred._ast.ASTAlternatives> parseString_Alternatives(String str) throws IOException, RecognitionException {
    return parseAlternatives(new StringReader(str));
  }

    /* generated by template parser.MCParserMethods*/


  /** Parses a file. 
   * 
   * @param filename Name of file to parse
   * @return Resulting AST
   * @throws IOException 
   * @throws RecognitionException
   */
  public Optional<htmlred._ast.ASTB> parseB(String filename) throws IOException, RecognitionException {   
    HTMLRedAntlrParser parser = create(filename);    
	htmlred._ast.ASTB ast;
    if (getParserTarget().equals(MCConcreteParser.ParserExecution.NORMAL)) {
      ast = parser.b().ret;
    } else {
      ast = parser.b_eof().ret;
    }
    if (parser.hasErrors()) {
      setError(true);
      return Optional.<htmlred._ast.ASTB> empty();
    }
    return Optional.ofNullable(ast);
  }

  /** Parses content of a Reader.
   * 
   * @param reader Reader to parse from
   * @return Resulting AST
   * @throws IOException 
   * @throws RecognitionException
   * */
  public  Optional<htmlred._ast.ASTB> parseB(Reader reader) throws IOException, RecognitionException {
 	HTMLRedAntlrParser parser = create(reader);
	htmlred._ast.ASTB ast;
    if (getParserTarget().equals(MCConcreteParser.ParserExecution.NORMAL)) {
      ast = parser.b().ret;
    } else {
      ast = parser.b_eof().ret;
    }
    if (parser.hasErrors()) {
      setError(true);
      return Optional.<htmlred._ast.ASTB> empty();
    }
    return Optional.ofNullable(ast);
  }
  
  /** Parses content of a String.
   * 
   * @param str String to parse from
   * @return Resulting AST
   * @throws IOException 
   * @throws RecognitionException
   * */
  public  Optional<htmlred._ast.ASTB> parseString_B(String str) throws IOException, RecognitionException {
    return parseB(new StringReader(str));
  }

    /* generated by template parser.MCParserMethods*/


  /** Parses a file. 
   * 
   * @param filename Name of file to parse
   * @return Resulting AST
   * @throws IOException 
   * @throws RecognitionException
   */
  public Optional<htmlred._ast.ASTI> parseI(String filename) throws IOException, RecognitionException {   
    HTMLRedAntlrParser parser = create(filename);    
	htmlred._ast.ASTI ast;
    if (getParserTarget().equals(MCConcreteParser.ParserExecution.NORMAL)) {
      ast = parser.i().ret;
    } else {
      ast = parser.i_eof().ret;
    }
    if (parser.hasErrors()) {
      setError(true);
      return Optional.<htmlred._ast.ASTI> empty();
    }
    return Optional.ofNullable(ast);
  }

  /** Parses content of a Reader.
   * 
   * @param reader Reader to parse from
   * @return Resulting AST
   * @throws IOException 
   * @throws RecognitionException
   * */
  public  Optional<htmlred._ast.ASTI> parseI(Reader reader) throws IOException, RecognitionException {
 	HTMLRedAntlrParser parser = create(reader);
	htmlred._ast.ASTI ast;
    if (getParserTarget().equals(MCConcreteParser.ParserExecution.NORMAL)) {
      ast = parser.i().ret;
    } else {
      ast = parser.i_eof().ret;
    }
    if (parser.hasErrors()) {
      setError(true);
      return Optional.<htmlred._ast.ASTI> empty();
    }
    return Optional.ofNullable(ast);
  }
  
  /** Parses content of a String.
   * 
   * @param str String to parse from
   * @return Resulting AST
   * @throws IOException 
   * @throws RecognitionException
   * */
  public  Optional<htmlred._ast.ASTI> parseString_I(String str) throws IOException, RecognitionException {
    return parseI(new StringReader(str));
  }


}