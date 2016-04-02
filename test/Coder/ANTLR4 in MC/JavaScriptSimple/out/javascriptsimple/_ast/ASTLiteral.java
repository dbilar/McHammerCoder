/* generated from model null*/
/* generated by template ast.AstClass*/

package javascriptsimple._ast;

/* generated by template ast.AstImports*/
import java.util.Optional;
import de.monticore.symboltable.Symbol;
import de.monticore.symboltable.Scope;
import de.se_rwth.commons.logging.Log;


 public  class ASTLiteral extends /* generated by template ast.AstSuperTypes*/
de.monticore.ast.ASTCNode implements  ASTJavaScriptSimpleNode {
  /* generated by template ast.Attribute*/
   protected  String stringLiteral;

  /* generated by template ast.Attribute*/
   public  Optional<? extends Symbol> symbol = Optional.empty();

  /* generated by template ast.Attribute*/
   public  Optional<? extends Scope> enclosingScope = Optional.empty();

    /* generated by template ast.Constructor*/
  
   protected  ASTLiteral (/* generated by template ast.ParametersDeclaration*/
    // Parameters declaration 
    )  
  /* generated by template ast.EmptyMethodBody*/

  { // empty body 
  }

    /* generated by template ast.Constructor*/
  
   protected  ASTLiteral (/* generated by template ast.ConstructorParametersDeclaration*/
     String stringLiteral 
 
    )  
  /* generated by template ast.ConstructorAttributesSetter*/
  {
    setStringLiteral(stringLiteral);
  }


  
    /* generated by template ast.ClassMethod*/
  
   public  void accept(javascriptsimple._visitor.JavaScriptSimpleVisitor visitor)
   
    { 
     /* generated by template ast.ErrorIfNull*/
    Log.errorIfNull(visitor, "0xA7006_803 Parameter 'visitor' must not be null.");
 
     /* generated by template ast.additionalmethods.Accept*/

      visitor.handle(this);

  } 

    /* generated by template ast.ClassMethod*/
  
   public  boolean deepEquals(Object o)
   
    { 
     /* generated by template ast.ErrorIfNull*/
    Log.errorIfNull(o, "0xA7006_430 Parameter 'o' must not be null.");
 
     /* generated by template ast.additionalmethods.DeepEquals*/

      ASTLiteral comp;
    if ((o instanceof ASTLiteral)) {
      comp = (ASTLiteral) o;
    } else {
      return false;
    }
    if (!equalAttributes(comp)) {
      return false;
    }
    return true;     


  } 

    /* generated by template ast.ClassMethod*/
  
   public  boolean deepEquals(Object o,boolean forceSameOrder)
   
    { 
     /* generated by template ast.ErrorIfNull*/
    Log.errorIfNull(o, "0xA7006_954 Parameter 'o' must not be null.");
 
     return deepEquals(o);

  } 

    /* generated by template ast.ClassMethod*/
  
   public  boolean deepEqualsWithComments(Object o)
   
    { 
     /* generated by template ast.ErrorIfNull*/
    Log.errorIfNull(o, "0xA7006_878 Parameter 'o' must not be null.");
 
     /* generated by template ast.additionalmethods.DeepEqualsWithComments*/

      ASTLiteral comp;
    if ((o instanceof ASTLiteral)) {
      comp = (ASTLiteral) o;
    } else {
      return false;
    }
    if (!equalsWithComments(comp)) {
      return false;
    }
    return true;     

  } 

    /* generated by template ast.ClassMethod*/
  
   public  boolean deepEqualsWithComments(Object o,boolean forceSameOrder)
   
    { 
     /* generated by template ast.ErrorIfNull*/
    Log.errorIfNull(o, "0xA7006_061 Parameter 'o' must not be null.");
 
     return deepEqualsWithComments(o);

  } 

    /* generated by template ast.ClassMethod*/
  
   public  boolean equalAttributes(Object o)
   
    { 
     /* generated by template ast.ErrorIfNull*/
    Log.errorIfNull(o, "0xA7006_606 Parameter 'o' must not be null.");
 
     /* generated by template ast.additionalmethods.EqualAttributes*/

      ASTLiteral comp;
    if ((o instanceof ASTLiteral)) {
      comp = (ASTLiteral) o;
    } else {
      return false;
    }
	// comparing stringLiteral 
    if ( (this.stringLiteral == null && comp.stringLiteral != null) 
      || (this.stringLiteral != null && !this.stringLiteral.equals(comp.stringLiteral)) ) {
      return false;
    }
	// comparing symbol 
    if ( this.symbol.isPresent() != comp.symbol.isPresent() ||
       (this.symbol.isPresent() && !this.symbol.get().equals(comp.symbol.get())) ) {
      return false;
    }
	// comparing enclosingScope 
    if ( this.enclosingScope.isPresent() != comp.enclosingScope.isPresent() ||
       (this.enclosingScope.isPresent() && !this.enclosingScope.get().equals(comp.enclosingScope.get())) ) {
      return false;
    }
    return true;     


  } 

    /* generated by template ast.ClassMethod*/
  
   public  boolean equalsWithComments(Object o)
   
    { 
     /* generated by template ast.ErrorIfNull*/
    Log.errorIfNull(o, "0xA7006_510 Parameter 'o' must not be null.");
 
     /* generated by template ast.additionalmethods.EqualsWithComments*/

      ASTLiteral comp;
    if ((o instanceof ASTLiteral)) {
      comp = (ASTLiteral) o;
    } else {
      return false;
    }
    if (!equalAttributes(comp)) {
      return false;
    }
    // comparing comments
    if (get_PreComments().size() == comp.get_PreComments().size()) {
      java.util.Iterator<de.monticore.ast.Comment> one = get_PreComments().iterator();
      java.util.Iterator<de.monticore.ast.Comment> two = comp.get_PreComments().iterator();
      while (one.hasNext()) {
        if (!one.next().equals(two.next())) {
          return false;
        }
      }
    } else {
      return false;
    }
    
    if (get_PostComments().size() == comp.get_PostComments().size()) {
      java.util.Iterator<de.monticore.ast.Comment> one = get_PostComments().iterator();
      java.util.Iterator<de.monticore.ast.Comment> two = comp.get_PostComments().iterator();
      while (one.hasNext()) {
        if (!one.next().equals(two.next())) {
          return false;
        }
      }
    } else {
      return false;
    }
    return true;

  } 

    /* generated by template ast.ClassMethod*/
  
   public  java.util.Collection<de.monticore.ast.ASTNode> get_Children()
   
    { 
     /* generated by template ast.ErrorIfNull*/
 
     /* generated by template ast.additionalmethods.GetChildren*/

    java.util.LinkedList<de.monticore.ast.ASTNode> result = new java.util.LinkedList<de.monticore.ast.ASTNode>();
    return result;

  } 

    /* generated by template ast.ClassMethod*/
  
   public  void remove_Child(de.monticore.ast.ASTNode child)
   
    { 
     /* generated by template ast.ErrorIfNull*/
    Log.errorIfNull(child, "0xA7006_851 Parameter 'child' must not be null.");
 
     /* generated by template ast.additionalmethods.RemoveChild*/


  } 

    /* generated by template ast.ClassMethod*/
  
   public  static  Builder getBuilder()
   
    { 
     /* generated by template ast.ErrorIfNull*/
 
     return new Builder();

  } 

    /* generated by template ast.ClassMethod*/
  
   public  ASTLiteral deepClone()
   
    { 
     /* generated by template ast.ErrorIfNull*/
 
     return deepClone(_construct());

  } 

    /* generated by template ast.ClassMethod*/
  
   public  ASTLiteral deepClone(ASTLiteral result)
   
    { 
     /* generated by template ast.ErrorIfNull*/
    Log.errorIfNull(result, "0xA7006_199 Parameter 'result' must not be null.");
 
     /* generated by template ast.additionalmethods.DeepCloneWithParameters*/
  
    super.deepClone(result);
    
    if (this.stringLiteral != null) {
      result.stringLiteral = this.stringLiteral;
    }
    result.symbol = this.symbol.isPresent()? Optional.ofNullable((Symbol)this.symbol.get()) : Optional.empty();
    result.enclosingScope = this.enclosingScope.isPresent()? Optional.ofNullable((Scope)this.enclosingScope.get()) : Optional.empty();
    return result;

  } 

    /* generated by template ast.ClassMethod*/
  
   protected  ASTLiteral _construct()
   
    { 
     /* generated by template ast.ErrorIfNull*/
 
     return new ASTLiteral();

  } 

    /* generated by template ast.ClassMethod*/
  
   public  String getStringLiteral()
   
    { 
     /* generated by template ast.ErrorIfNull*/
 
     /* generated by template ast.additionalmethods.Get*/

    return  this.stringLiteral;

  } 

    /* generated by template ast.ClassMethod*/
  
   public  Optional<? extends Symbol> getSymbol()
   
    { 
     /* generated by template ast.ErrorIfNull*/
 
     /* generated by template ast.additionalmethods.Get*/

    return  this.symbol;

  } 

    /* generated by template ast.ClassMethod*/
  
   public  Optional<? extends Scope> getEnclosingScope()
   
    { 
     /* generated by template ast.ErrorIfNull*/
 
     /* generated by template ast.additionalmethods.Get*/

    return  this.enclosingScope;

  } 

    /* generated by template ast.ClassMethod*/
  
   public  void setStringLiteral(String stringLiteral)
   
    { 
     /* generated by template ast.ErrorIfNull*/
    Log.errorIfNull(stringLiteral, "0xA7006_168 Parameter 'stringLiteral' must not be null.");
 
     /* generated by template ast.additionalmethods.Set*/

    this.stringLiteral = stringLiteral;

  } 

    /* generated by template ast.ClassMethod*/
  
   public  void setSymbol(Symbol symbol)
   
    { 
     
     /* generated by template ast.additionalmethods.Set*/

    this.symbol = Optional.ofNullable(symbol);

  } 

    /* generated by template ast.ClassMethod*/
  
   public  boolean symbolIsPresent()
   
    { 
     /* generated by template ast.ErrorIfNull*/
 
       return symbol.isPresent(); 

  } 

    /* generated by template ast.ClassMethod*/
  
   public  void setEnclosingScope(Scope enclosingScope)
   
    { 
     
     /* generated by template ast.additionalmethods.Set*/

    this.enclosingScope = Optional.ofNullable(enclosingScope);

  } 

    /* generated by template ast.ClassMethod*/
  
   public  boolean enclosingScopeIsPresent()
   
    { 
     /* generated by template ast.ErrorIfNull*/
 
       return enclosingScope.isPresent(); 

  } 

   
  /* generated by template ast.ClassContent*/
  // Class content
    /* generated by template ast.AstBuilder*/

 /**
   * Builder for {@link ASTLiteral}.
   */
  public static class Builder  {
    /* generated by template ast.BuilderAttribute*/
     protected  String stringLiteral;

    public ASTLiteral build() {
      return new ASTLiteral (/* generated by template ast.BuilderConstructorParametersDeclaration*/
  
        this.stringLiteral 
     
      );
    }
    /* generated by template ast.AstBuilderAttributeSetter*/
    public Builder stringLiteral(String stringLiteral) {
      this.stringLiteral = stringLiteral;
      return this;
    }

  }    
  
}