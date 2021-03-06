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
 * AnalyticsFeedbackScores
 */

public class AnalyticsFeedbackScores {
  @SerializedName("Great")
  private Integer great = null;

  @SerializedName("Okay")
  private Integer okay = null;

  @SerializedName("Bad")
  private Integer bad = null;

  @SerializedName("Poor")
  private Integer poor = null;

  @SerializedName("Good")
  private Integer good = null;

  public AnalyticsFeedbackScores great(Integer great) {
    this.great = great;
    return this;
  }

   /**
   * Get great
   * @return great
  **/
  @ApiModelProperty(value = "")
  public Integer getGreat() {
    return great;
  }

  public void setGreat(Integer great) {
    this.great = great;
  }

  public AnalyticsFeedbackScores okay(Integer okay) {
    this.okay = okay;
    return this;
  }

   /**
   * Get okay
   * @return okay
  **/
  @ApiModelProperty(value = "")
  public Integer getOkay() {
    return okay;
  }

  public void setOkay(Integer okay) {
    this.okay = okay;
  }

  public AnalyticsFeedbackScores bad(Integer bad) {
    this.bad = bad;
    return this;
  }

   /**
   * Get bad
   * @return bad
  **/
  @ApiModelProperty(value = "")
  public Integer getBad() {
    return bad;
  }

  public void setBad(Integer bad) {
    this.bad = bad;
  }

  public AnalyticsFeedbackScores poor(Integer poor) {
    this.poor = poor;
    return this;
  }

   /**
   * Get poor
   * @return poor
  **/
  @ApiModelProperty(value = "")
  public Integer getPoor() {
    return poor;
  }

  public void setPoor(Integer poor) {
    this.poor = poor;
  }

  public AnalyticsFeedbackScores good(Integer good) {
    this.good = good;
    return this;
  }

   /**
   * Get good
   * @return good
  **/
  @ApiModelProperty(value = "")
  public Integer getGood() {
    return good;
  }

  public void setGood(Integer good) {
    this.good = good;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsFeedbackScores analyticsFeedbackScores = (AnalyticsFeedbackScores) o;
    return Objects.equals(this.great, analyticsFeedbackScores.great) &&
        Objects.equals(this.okay, analyticsFeedbackScores.okay) &&
        Objects.equals(this.bad, analyticsFeedbackScores.bad) &&
        Objects.equals(this.poor, analyticsFeedbackScores.poor) &&
        Objects.equals(this.good, analyticsFeedbackScores.good);
  }

  @Override
  public int hashCode() {
    return Objects.hash(great, okay, bad, poor, good);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsFeedbackScores {\n");
    
    sb.append("    great: ").append(toIndentedString(great)).append("\n");
    sb.append("    okay: ").append(toIndentedString(okay)).append("\n");
    sb.append("    bad: ").append(toIndentedString(bad)).append("\n");
    sb.append("    poor: ").append(toIndentedString(poor)).append("\n");
    sb.append("    good: ").append(toIndentedString(good)).append("\n");
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

