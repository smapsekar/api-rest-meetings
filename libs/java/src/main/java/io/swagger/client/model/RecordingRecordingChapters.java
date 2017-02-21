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
import io.swagger.client.model.RecordingRecordingSessions;
import java.util.ArrayList;
import java.util.List;


/**
 * RecordingRecordingChapters
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-21T16:00:22.730-07:00")
public class RecordingRecordingChapters   {
  @SerializedName("chapterId")
  private String chapterId = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("startTimeOffset")
  private Integer startTimeOffset = null;

  @SerializedName("endTimeOffset")
  private Integer endTimeOffset = null;

  @SerializedName("chapterName")
  private String chapterName = null;

  @SerializedName("totalSize")
  private Integer totalSize = null;

  @SerializedName("compositeContentId")
  private Integer compositeContentId = null;

  @SerializedName("compositeContentStatus")
  private String compositeContentStatus = null;

  @SerializedName("parentRecordingId")
  private Integer parentRecordingId = null;

  @SerializedName("viewCount")
  private Integer viewCount = null;

  @SerializedName("recordingSessions")
  private List<RecordingRecordingSessions> recordingSessions = new ArrayList<RecordingRecordingSessions>();

  public RecordingRecordingChapters chapterId(String chapterId) {
    this.chapterId = chapterId;
    return this;
  }

   /**
   * Get chapterId
   * @return chapterId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getChapterId() {
    return chapterId;
  }

  public void setChapterId(String chapterId) {
    this.chapterId = chapterId;
  }

  public RecordingRecordingChapters id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public RecordingRecordingChapters startTimeOffset(Integer startTimeOffset) {
    this.startTimeOffset = startTimeOffset;
    return this;
  }

   /**
   * Get startTimeOffset
   * @return startTimeOffset
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getStartTimeOffset() {
    return startTimeOffset;
  }

  public void setStartTimeOffset(Integer startTimeOffset) {
    this.startTimeOffset = startTimeOffset;
  }

  public RecordingRecordingChapters endTimeOffset(Integer endTimeOffset) {
    this.endTimeOffset = endTimeOffset;
    return this;
  }

   /**
   * Get endTimeOffset
   * @return endTimeOffset
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getEndTimeOffset() {
    return endTimeOffset;
  }

  public void setEndTimeOffset(Integer endTimeOffset) {
    this.endTimeOffset = endTimeOffset;
  }

  public RecordingRecordingChapters chapterName(String chapterName) {
    this.chapterName = chapterName;
    return this;
  }

   /**
   * Get chapterName
   * @return chapterName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getChapterName() {
    return chapterName;
  }

  public void setChapterName(String chapterName) {
    this.chapterName = chapterName;
  }

  public RecordingRecordingChapters totalSize(Integer totalSize) {
    this.totalSize = totalSize;
    return this;
  }

   /**
   * Get totalSize
   * @return totalSize
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getTotalSize() {
    return totalSize;
  }

  public void setTotalSize(Integer totalSize) {
    this.totalSize = totalSize;
  }

  public RecordingRecordingChapters compositeContentId(Integer compositeContentId) {
    this.compositeContentId = compositeContentId;
    return this;
  }

   /**
   * Get compositeContentId
   * @return compositeContentId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getCompositeContentId() {
    return compositeContentId;
  }

  public void setCompositeContentId(Integer compositeContentId) {
    this.compositeContentId = compositeContentId;
  }

  public RecordingRecordingChapters compositeContentStatus(String compositeContentStatus) {
    this.compositeContentStatus = compositeContentStatus;
    return this;
  }

   /**
   * Get compositeContentStatus
   * @return compositeContentStatus
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCompositeContentStatus() {
    return compositeContentStatus;
  }

  public void setCompositeContentStatus(String compositeContentStatus) {
    this.compositeContentStatus = compositeContentStatus;
  }

  public RecordingRecordingChapters parentRecordingId(Integer parentRecordingId) {
    this.parentRecordingId = parentRecordingId;
    return this;
  }

   /**
   * Get parentRecordingId
   * @return parentRecordingId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getParentRecordingId() {
    return parentRecordingId;
  }

  public void setParentRecordingId(Integer parentRecordingId) {
    this.parentRecordingId = parentRecordingId;
  }

  public RecordingRecordingChapters viewCount(Integer viewCount) {
    this.viewCount = viewCount;
    return this;
  }

   /**
   * Get viewCount
   * @return viewCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getViewCount() {
    return viewCount;
  }

  public void setViewCount(Integer viewCount) {
    this.viewCount = viewCount;
  }

  public RecordingRecordingChapters recordingSessions(List<RecordingRecordingSessions> recordingSessions) {
    this.recordingSessions = recordingSessions;
    return this;
  }

  public RecordingRecordingChapters addRecordingSessionsItem(RecordingRecordingSessions recordingSessionsItem) {
    this.recordingSessions.add(recordingSessionsItem);
    return this;
  }

   /**
   * Get recordingSessions
   * @return recordingSessions
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<RecordingRecordingSessions> getRecordingSessions() {
    return recordingSessions;
  }

  public void setRecordingSessions(List<RecordingRecordingSessions> recordingSessions) {
    this.recordingSessions = recordingSessions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordingRecordingChapters recordingRecordingChapters = (RecordingRecordingChapters) o;
    return Objects.equals(this.chapterId, recordingRecordingChapters.chapterId) &&
        Objects.equals(this.id, recordingRecordingChapters.id) &&
        Objects.equals(this.startTimeOffset, recordingRecordingChapters.startTimeOffset) &&
        Objects.equals(this.endTimeOffset, recordingRecordingChapters.endTimeOffset) &&
        Objects.equals(this.chapterName, recordingRecordingChapters.chapterName) &&
        Objects.equals(this.totalSize, recordingRecordingChapters.totalSize) &&
        Objects.equals(this.compositeContentId, recordingRecordingChapters.compositeContentId) &&
        Objects.equals(this.compositeContentStatus, recordingRecordingChapters.compositeContentStatus) &&
        Objects.equals(this.parentRecordingId, recordingRecordingChapters.parentRecordingId) &&
        Objects.equals(this.viewCount, recordingRecordingChapters.viewCount) &&
        Objects.equals(this.recordingSessions, recordingRecordingChapters.recordingSessions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chapterId, id, startTimeOffset, endTimeOffset, chapterName, totalSize, compositeContentId, compositeContentStatus, parentRecordingId, viewCount, recordingSessions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordingRecordingChapters {\n");
    
    sb.append("    chapterId: ").append(toIndentedString(chapterId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startTimeOffset: ").append(toIndentedString(startTimeOffset)).append("\n");
    sb.append("    endTimeOffset: ").append(toIndentedString(endTimeOffset)).append("\n");
    sb.append("    chapterName: ").append(toIndentedString(chapterName)).append("\n");
    sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
    sb.append("    compositeContentId: ").append(toIndentedString(compositeContentId)).append("\n");
    sb.append("    compositeContentStatus: ").append(toIndentedString(compositeContentStatus)).append("\n");
    sb.append("    parentRecordingId: ").append(toIndentedString(parentRecordingId)).append("\n");
    sb.append("    viewCount: ").append(toIndentedString(viewCount)).append("\n");
    sb.append("    recordingSessions: ").append(toIndentedString(recordingSessions)).append("\n");
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

