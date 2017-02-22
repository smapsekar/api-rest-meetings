/**
 * BlueJeans onVideo REST API
 * _Video That Works Where You Do, from the world's leader in cloud video communication._ # Authentication Each API request that is sent to BlueJeans requires an access token, which is obtained through the BlueJeans Authentication API. There are several methods (grant types) for obtaining an access token, which follow the OAuth2.0 specification. ## Grant Types * Authorization Code Grant – This grant type is used in an authentication flow commonly referred to as \"three-legged OAuth\". The user authenticates via a BlueJeans page, which provides an authorization code. This code, along with a few other elements, can be used to obtain an access code. * Password Credentials Grant – This grant type is used in a two-legged OAuth flow. Username and password are sent to retrieve an access code. * Client Credentials Grant – This grant type is used in a two-legged OAuth flow.  ## Access & Permissions The access level that is associated with each access token is referred to as the scope. There are three basic levels of access that BlueJeans allows, which affect the level of scope.  Three access levels exist within the Blue Jeans service today. * Meeting-level – Authentication takes place using a meeting ID and passcode, and the scope is limited to APIs that relate to the individual meeting. * User-level – Authentication either takes place via three-legged OAuth, or else a direct authorization token request containing a username or password. Access level depends on the requested scope permissions. * App-level – An application is provisioned either by BlueJeans personnel, or within the BlueJeans Enterprise Admin interface. When provisioning an app, a client key and secret are provided, which is then used to obtain an access token, via the BlueJeans Authentication API. The scope that is associated with the token will provide access to an entire enterprise and all of its users.  All endpoints in this document that require Enterprise Admin access will be marked as such. ## Testing In order to make effective use of this page, you will first use one of the authentication methods to obtain an access token. Once the token is given, use the Authenticate button up in the header to store the token. Each BlueJeans API called after that will use the access token provided. 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: brandon@bluejeans.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.PairingCodeTurnservers;
import java.util.ArrayList;
import java.util.List;


/**
 * PairingCode
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-21T17:05:02.193-07:00")
public class PairingCode   {
  @SerializedName("callguid")
  private String callguid = null;

  @SerializedName("endpointGuid")
  private String endpointGuid = null;

  @SerializedName("forceTURN")
  private Boolean forceTURN = null;

  @SerializedName("pairingCode")
  private String pairingCode = null;

  @SerializedName("status")
  private Integer status = null;

  /**
   * Gets or Sets statusText
   */
  public enum StatusTextEnum {
    @SerializedName("OK")
    OK("OK");

    private String value;

    StatusTextEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("statusText")
  private StatusTextEnum statusText = null;

  @SerializedName("turnservers")
  private List<PairingCodeTurnservers> turnservers = new ArrayList<PairingCodeTurnservers>();

  @SerializedName("uri")
  private String uri = null;

  @SerializedName("seamEndpointGuid")
  private String seamEndpointGuid = null;

  @SerializedName("connectionGuid")
  private String connectionGuid = null;

  @SerializedName("endpointName")
  private String endpointName = null;

  public PairingCode callguid(String callguid) {
    this.callguid = callguid;
    return this;
  }

   /**
   * Get callguid
   * @return callguid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCallguid() {
    return callguid;
  }

  public void setCallguid(String callguid) {
    this.callguid = callguid;
  }

  public PairingCode endpointGuid(String endpointGuid) {
    this.endpointGuid = endpointGuid;
    return this;
  }

   /**
   * Get endpointGuid
   * @return endpointGuid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEndpointGuid() {
    return endpointGuid;
  }

  public void setEndpointGuid(String endpointGuid) {
    this.endpointGuid = endpointGuid;
  }

  public PairingCode forceTURN(Boolean forceTURN) {
    this.forceTURN = forceTURN;
    return this;
  }

   /**
   * Get forceTURN
   * @return forceTURN
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getForceTURN() {
    return forceTURN;
  }

  public void setForceTURN(Boolean forceTURN) {
    this.forceTURN = forceTURN;
  }

  public PairingCode pairingCode(String pairingCode) {
    this.pairingCode = pairingCode;
    return this;
  }

   /**
   * Get pairingCode
   * @return pairingCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPairingCode() {
    return pairingCode;
  }

  public void setPairingCode(String pairingCode) {
    this.pairingCode = pairingCode;
  }

  public PairingCode status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public PairingCode statusText(StatusTextEnum statusText) {
    this.statusText = statusText;
    return this;
  }

   /**
   * Get statusText
   * @return statusText
  **/
  @ApiModelProperty(example = "null", value = "")
  public StatusTextEnum getStatusText() {
    return statusText;
  }

  public void setStatusText(StatusTextEnum statusText) {
    this.statusText = statusText;
  }

  public PairingCode turnservers(List<PairingCodeTurnservers> turnservers) {
    this.turnservers = turnservers;
    return this;
  }

  public PairingCode addTurnserversItem(PairingCodeTurnservers turnserversItem) {
    this.turnservers.add(turnserversItem);
    return this;
  }

   /**
   * Get turnservers
   * @return turnservers
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<PairingCodeTurnservers> getTurnservers() {
    return turnservers;
  }

  public void setTurnservers(List<PairingCodeTurnservers> turnservers) {
    this.turnservers = turnservers;
  }

  public PairingCode uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * Get uri
   * @return uri
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public PairingCode seamEndpointGuid(String seamEndpointGuid) {
    this.seamEndpointGuid = seamEndpointGuid;
    return this;
  }

   /**
   * Get seamEndpointGuid
   * @return seamEndpointGuid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSeamEndpointGuid() {
    return seamEndpointGuid;
  }

  public void setSeamEndpointGuid(String seamEndpointGuid) {
    this.seamEndpointGuid = seamEndpointGuid;
  }

  public PairingCode connectionGuid(String connectionGuid) {
    this.connectionGuid = connectionGuid;
    return this;
  }

   /**
   * Get connectionGuid
   * @return connectionGuid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getConnectionGuid() {
    return connectionGuid;
  }

  public void setConnectionGuid(String connectionGuid) {
    this.connectionGuid = connectionGuid;
  }

  public PairingCode endpointName(String endpointName) {
    this.endpointName = endpointName;
    return this;
  }

   /**
   * Get endpointName
   * @return endpointName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEndpointName() {
    return endpointName;
  }

  public void setEndpointName(String endpointName) {
    this.endpointName = endpointName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PairingCode pairingCode = (PairingCode) o;
    return Objects.equals(this.callguid, pairingCode.callguid) &&
        Objects.equals(this.endpointGuid, pairingCode.endpointGuid) &&
        Objects.equals(this.forceTURN, pairingCode.forceTURN) &&
        Objects.equals(this.pairingCode, pairingCode.pairingCode) &&
        Objects.equals(this.status, pairingCode.status) &&
        Objects.equals(this.statusText, pairingCode.statusText) &&
        Objects.equals(this.turnservers, pairingCode.turnservers) &&
        Objects.equals(this.uri, pairingCode.uri) &&
        Objects.equals(this.seamEndpointGuid, pairingCode.seamEndpointGuid) &&
        Objects.equals(this.connectionGuid, pairingCode.connectionGuid) &&
        Objects.equals(this.endpointName, pairingCode.endpointName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callguid, endpointGuid, forceTURN, pairingCode, status, statusText, turnservers, uri, seamEndpointGuid, connectionGuid, endpointName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PairingCode {\n");
    
    sb.append("    callguid: ").append(toIndentedString(callguid)).append("\n");
    sb.append("    endpointGuid: ").append(toIndentedString(endpointGuid)).append("\n");
    sb.append("    forceTURN: ").append(toIndentedString(forceTURN)).append("\n");
    sb.append("    pairingCode: ").append(toIndentedString(pairingCode)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusText: ").append(toIndentedString(statusText)).append("\n");
    sb.append("    turnservers: ").append(toIndentedString(turnservers)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    seamEndpointGuid: ").append(toIndentedString(seamEndpointGuid)).append("\n");
    sb.append("    connectionGuid: ").append(toIndentedString(connectionGuid)).append("\n");
    sb.append("    endpointName: ").append(toIndentedString(endpointName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

