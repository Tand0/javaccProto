package jp.ne.ruru.park.ando.protoviewer.tree;


/* Generated By:JJTree: Do not edit this line. ASTBracketPart.java Version 6.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTBracketPart extends SimpleNode {
  public ASTBracketPart(int id) {
    super(id);
  }

  public ASTBracketPart(ProtoParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ProtoParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=616d4f65f9c12ad16e190c34165dc4dc (do not edit this line) */
