/*
 * BlueJeans Meetings REST API
 *  ## Video That Works Where You Do. <p>This site provides developers access to APIs from BlueJean's Meetings meeting service.  From here you can see and try actual API calls to manage User Accounts, Meetings, and Recordings, pull Analytical Data and Current State information.</p>    <nosdk> <hr> <div> <div class=\"key\">     <a href=\"./basics.html\" target=\"_\"><img class=\"keyimg\" src=\"./img/bjnmeeting.png\"/></a> </div> <div class=\"keybox\"> Basic instructions about What is a BlueJeans Meeting, and Getting Started Using API's, are <a href=\"./basics.html\" target=\"_blank\">available here <i class=\"glyphicon glyphicon-new-window\"></i></a>. </div> </div> <hr> <alert>2/21/2019</alert> Change response of Change layout and Endpoint API's to 204<br/> 12/03/2018 Add API for setting user profile photograph.<br/> 10/17/2018 Updated API field definitions for time variables to be 64-bit .<br/> 7/23/2018 Corrected errors in API definition file.<br/> 7/10/2018 Deprecated some Command Center API's.  Exposed API's that Summarize usage.<br/> 7/06/2018 Added API for changing ownership of recordings.<br/> 6/28/2018 Restored Create Enterprise Account, added Enterprise and User Profile Tag API's.<br/> 6/01/2018 Clarified Access Token requirements for meeting endpoint API's.<br/> 5/21/2018 Corrected return model for meeting history call.<br/> </nosdk> <hr> 
 *
 * OpenAPI spec version: 1.0.4402212019
 * Contact: glenn@bluejeans.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.bluejeans.api.rest.meetings.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PairingCodePSTN
 */

public class PairingCodePSTN {
  @SerializedName("pairingCode")
  private String pairingCode = null;

  @SerializedName("connectionGuid")
  private String connectionGuid = null;

  @SerializedName("seamEndpointGuid")
  private String seamEndpointGuid = null;

  @SerializedName("endpointName")
  private String endpointName = null;

  public PairingCodePSTN pairingCode(String pairingCode) {
    this.pairingCode = pairingCode;
    return this;
  }

   /**
   * Unique number associated with this endpoint in this meeting
   * @return pairingCode
  **/
  @ApiModelProperty(value = "Unique number associated with this endpoint in this meeting")
  public String getPairingCode() {
    return pairingCode;
  }

  public void setPairingCode(String pairingCode) {
    this.pairingCode = pairingCode;
  }

  public PairingCodePSTN connectionGuid(String connectionGuid) {
    this.connectionGuid = connectionGuid;
    return this;
  }

   /**
   * Globally unique identifier associated with this endpoint in this meeting. (Typically a string starting with \&quot;connguid:\&quot;)
   * @return connectionGuid
  **/
  @ApiModelProperty(value = "Globally unique identifier associated with this endpoint in this meeting. (Typically a string starting with \"connguid:\")")
  public String getConnectionGuid() {
    return connectionGuid;
  }

  public void setConnectionGuid(String connectionGuid) {
    this.connectionGuid = connectionGuid;
  }

  public PairingCodePSTN seamEndpointGuid(String seamEndpointGuid) {
    this.seamEndpointGuid = seamEndpointGuid;
    return this;
  }

   /**
   * Globally unique identifier associated with the media component of this endpoint for this meeting.  (Typically a string starting with \&quot;seamguid:\&quot;)
   * @return seamEndpointGuid
  **/
  @ApiModelProperty(value = "Globally unique identifier associated with the media component of this endpoint for this meeting.  (Typically a string starting with \"seamguid:\")")
  public String getSeamEndpointGuid() {
    return seamEndpointGuid;
  }

  public void setSeamEndpointGuid(String seamEndpointGuid) {
    this.seamEndpointGuid = seamEndpointGuid;
  }

  public PairingCodePSTN endpointName(String endpointName) {
    this.endpointName = endpointName;
    return this;
  }

   /**
   * String name assigned to this endpoint
   * @return endpointName
  **/
  @ApiModelProperty(value = "String name assigned to this endpoint")
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
    PairingCodePSTN pairingCodePSTN = (PairingCodePSTN) o;
    return Objects.equals(this.pairingCode, pairingCodePSTN.pairingCode) &&
        Objects.equals(this.connectionGuid, pairingCodePSTN.connectionGuid) &&
        Objects.equals(this.seamEndpointGuid, pairingCodePSTN.seamEndpointGuid) &&
        Objects.equals(this.endpointName, pairingCodePSTN.endpointName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pairingCode, connectionGuid, seamEndpointGuid, endpointName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PairingCodePSTN {\n");
    
    sb.append("    pairingCode: ").append(toIndentedString(pairingCode)).append("\n");
    sb.append("    connectionGuid: ").append(toIndentedString(connectionGuid)).append("\n");
    sb.append("    seamEndpointGuid: ").append(toIndentedString(seamEndpointGuid)).append("\n");
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

