package jp.ne.ruru.park.ando.protoviewer.tree;


/* Generated By:JJTree: Do not edit this line. ASTSyntaxPart.java Version 6.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTSyntaxPart extends SimpleNode {
  public ASTSyntaxPart(int id) {
    super(id);
  }

  public ASTSyntaxPart(ProtoParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ProtoParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=19efed2804625563b7995ef34868a136 (do not edit this line) */
