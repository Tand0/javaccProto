package jp.ne.ruru.park.ando.protoviewer.tree;


/* Generated By:JJTree: Do not edit this line. ASTPublicPart.java Version 6.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTPublicPart extends SimpleNode {
  public ASTPublicPart(int id) {
    super(id);
  }

  public ASTPublicPart(ProtoParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ProtoParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=8588231cb4841138013ae4a27c76915f (do not edit this line) */