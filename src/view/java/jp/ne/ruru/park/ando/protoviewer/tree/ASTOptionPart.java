package jp.ne.ruru.park.ando.protoviewer.tree;


/* Generated By:JJTree: Do not edit this line. ASTOptionPart.java Version 6.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTOptionPart extends SimpleNode {
  public ASTOptionPart(int id) {
    super(id);
  }

  public ASTOptionPart(ProtoParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ProtoParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=39a113b7afa4e5fcdb0052ed71586cac (do not edit this line) */
