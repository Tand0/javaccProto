package jp.ne.ruru.park.ando.protoviewer.tree;


/* Generated By:JavaCC: Do not edit this line. ProtoParserVisitor.java Version 6.1_2 */
public interface ProtoParserVisitor
{
  public Object visit(SimpleNode node, Object data);
  public Object visit(ASTInput node, Object data);
  public Object visit(ASTImportPart node, Object data);
  public Object visit(ASTPublicPart node, Object data);
  public Object visit(ASTValuePart node, Object data);
  public Object visit(ASTBooleanPart node, Object data);
  public Object visit(ASTCStringPart node, Object data);
  public Object visit(ASTNumberPart node, Object data);
  public Object visit(ASTDoublePart node, Object data);
  public Object visit(ASTIndentPart node, Object data);
  public Object visit(ASTBraceValuePart node, Object data);
  public Object visit(ASTBraceValueOnePart node, Object data);
  public Object visit(ASTBraceValueOneBracketPart node, Object data);
  public Object visit(ASTSyntaxPart node, Object data);
  public Object visit(ASTOptionPart node, Object data);
  public Object visit(ASTClassPart node, Object data);
  public Object visit(ASTCustomOptionsPart node, Object data);
  public Object visit(ASTKeyPart node, Object data);
  public Object visit(ASTPackagePart node, Object data);
  public Object visit(ASTServicePart node, Object data);
  public Object visit(ASTRpcPart node, Object data);
  public Object visit(ASTStreamPart node, Object data);
  public Object visit(ASTRpcBracePart node, Object data);
  public Object visit(ASTMessagePart node, Object data);
  public Object visit(ASTMessageBranchePart node, Object data);
  public Object visit(ASTAttributeMemberPart node, Object data);
  public Object visit(ASTMemberPart node, Object data);
  public Object visit(ASTAttributePart node, Object data);
  public Object visit(ASTRepeatedPart node, Object data);
  public Object visit(ASTGroupPart node, Object data);
  public Object visit(ASTClassOrTypePart node, Object data);
  public Object visit(ASTTypePart node, Object data);
  public Object visit(ASTBracketPart node, Object data);
  public Object visit(ASTBracketMemberPart node, Object data);
  public Object visit(ASTEnumPart node, Object data);
  public Object visit(ASTEnumMemberPart node, Object data);
  public Object visit(ASTEnumOptionMemberPart node, Object data);
  public Object visit(ASTReservedPart node, Object data);
  public Object visit(ASTDeviderPart node, Object data);
  public Object visit(ASTOneOfPart node, Object data);
  public Object visit(ASTMapPart node, Object data);
  public Object visit(ASTExtentionsPart node, Object data);
  public Object visit(ASTExtendPart node, Object data);
}
/* JavaCC - OriginalChecksum=aae1cc149b7658cd4e74ec9d57ba992a (do not edit this line) */
