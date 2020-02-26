// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.sdk.xdr;


import java.io.IOException;

import com.google.common.base.Objects;

// === xdr source ============================================================

//  struct SurveyResponseMessage
//  {
//      NodeID surveyorPeerID;
//      NodeID surveyedPeerID;
//      uint32 ledgerNum;
//      SurveyMessageCommandType commandType;
//      EncryptedBody encryptedBody;
//  };

//  ===========================================================================
public class SurveyResponseMessage implements XdrElement {
  public SurveyResponseMessage () {}
  private NodeID surveyorPeerID;
  public NodeID getSurveyorPeerID() {
    return this.surveyorPeerID;
  }
  public void setSurveyorPeerID(NodeID value) {
    this.surveyorPeerID = value;
  }
  private NodeID surveyedPeerID;
  public NodeID getSurveyedPeerID() {
    return this.surveyedPeerID;
  }
  public void setSurveyedPeerID(NodeID value) {
    this.surveyedPeerID = value;
  }
  private Uint32 ledgerNum;
  public Uint32 getLedgerNum() {
    return this.ledgerNum;
  }
  public void setLedgerNum(Uint32 value) {
    this.ledgerNum = value;
  }
  private SurveyMessageCommandType commandType;
  public SurveyMessageCommandType getCommandType() {
    return this.commandType;
  }
  public void setCommandType(SurveyMessageCommandType value) {
    this.commandType = value;
  }
  private EncryptedBody encryptedBody;
  public EncryptedBody getEncryptedBody() {
    return this.encryptedBody;
  }
  public void setEncryptedBody(EncryptedBody value) {
    this.encryptedBody = value;
  }
  public static void encode(XdrDataOutputStream stream, SurveyResponseMessage encodedSurveyResponseMessage) throws IOException{
    NodeID.encode(stream, encodedSurveyResponseMessage.surveyorPeerID);
    NodeID.encode(stream, encodedSurveyResponseMessage.surveyedPeerID);
    Uint32.encode(stream, encodedSurveyResponseMessage.ledgerNum);
    SurveyMessageCommandType.encode(stream, encodedSurveyResponseMessage.commandType);
    EncryptedBody.encode(stream, encodedSurveyResponseMessage.encryptedBody);
  }
  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }
  public static SurveyResponseMessage decode(XdrDataInputStream stream) throws IOException {
    SurveyResponseMessage decodedSurveyResponseMessage = new SurveyResponseMessage();
    decodedSurveyResponseMessage.surveyorPeerID = NodeID.decode(stream);
    decodedSurveyResponseMessage.surveyedPeerID = NodeID.decode(stream);
    decodedSurveyResponseMessage.ledgerNum = Uint32.decode(stream);
    decodedSurveyResponseMessage.commandType = SurveyMessageCommandType.decode(stream);
    decodedSurveyResponseMessage.encryptedBody = EncryptedBody.decode(stream);
    return decodedSurveyResponseMessage;
  }
  @Override
  public int hashCode() {
    return Objects.hashCode(this.surveyorPeerID, this.surveyedPeerID, this.ledgerNum, this.commandType, this.encryptedBody);
  }
  @Override
  public boolean equals(Object object) {
    if (object == null || !(object instanceof SurveyResponseMessage)) {
      return false;
    }

    SurveyResponseMessage other = (SurveyResponseMessage) object;
    return Objects.equal(this.surveyorPeerID, other.surveyorPeerID) && Objects.equal(this.surveyedPeerID, other.surveyedPeerID) && Objects.equal(this.ledgerNum, other.ledgerNum) && Objects.equal(this.commandType, other.commandType) && Objects.equal(this.encryptedBody, other.encryptedBody);
  }
}
