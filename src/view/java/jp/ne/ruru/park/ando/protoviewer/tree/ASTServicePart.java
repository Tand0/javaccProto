package jp.ne.ruru.park.ando.protoviewer.tree;


/* Generated By:JJTree: Do not edit this line. ASTServicePart.java Version 6.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTServicePart extends SimpleNode {
  public ASTServicePart(int id) {
    super(id);
  }

  public ASTServicePart(ProtoParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ProtoParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=4433681dcce2f47325ebaee8991cd1e4 (do not edit this line) */
