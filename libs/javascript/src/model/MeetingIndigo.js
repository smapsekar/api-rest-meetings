/**
 * BlueJeans onVideo REST API
 * _Video That Works Where You Do._  This site provides developers access to API's from BlueJean's onVideo meeting service.  From here you will be able to make actual API calls to manage User Accounts, Meetings, and Recordings.  Also, you can pull analytical data as well retrieve current state information.  With these API's  you should be able to quickly integrate **BlueJeans** video into your applications.     # Authentication All API transactions (excluding Authentication) require an access token per **OAuth standards**.  BlueJeans provides multiple methods for obtaining an access token.  Additionally there are diffferent scopes of token access. ## Grant Types Bluejeans provides 3 different methods for users to Authenticate.  Successful authentication allows BlueJeans to grant an access token to the user. * Authorization Code Grant – Authenticate via a BlueJeans page, and receive an authorization code. Submit authorization with other tokens and receive an access code. (\"three-legged OAuth\") * Password Credentials Grant – Authenticate with a Username and password and receives an access code. (\"two-legged OAuth\"); * Client Credentials Grant – Similar to Password Grant (\"two-legged OAuth\").  ## Access & Permissions BlueJeans defines 3 levels of API access into the system.  When an access token is granted, it carries one of these 3 levels.  The scope of system functionality depends upon the token's access level. * Meeting-level – scope of APIs is limited to individual meetings. * User-level – scope depends on the requested permissions. * App-level – provisioned either by BlueJeans personnel, or the BlueJeans Enterprise Admin, an app, is issued a client key and secret key. These tokens then are used by the BlueJeans Authentication API to receive the token. The token's scope provides access to the entire enterprise and all of its users.  All endpoints in this document that require **Enterprise Admin** access will be marked as such. # Getting Started Before you start using the API's on this site, you must first have a BlueJeans account.  With your BlueJean credentials, use on of the Authentication methods to obtain an access token. - Click on the Authorize button at the top of page - Enter your access token in the field marked \"api_key\" Now the web site will automatically include your access token on all API calls you make. 
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

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/EndpointIndigo'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./EndpointIndigo'));
  } else {
    // Browser globals (root is window)
    if (!root.BlueJeansOnVideoRestApi) {
      root.BlueJeansOnVideoRestApi = {};
    }
    root.BlueJeansOnVideoRestApi.MeetingIndigo = factory(root.BlueJeansOnVideoRestApi.ApiClient, root.BlueJeansOnVideoRestApi.EndpointIndigo);
  }
}(this, function(ApiClient, EndpointIndigo) {
  'use strict';




  /**
   * The MeetingIndigo model module.
   * @module model/MeetingIndigo
   * @version 1.0.0
   */

  /**
   * Constructs a new <code>MeetingIndigo</code>.
   * @alias module:model/MeetingIndigo
   * @class
   */
  var exports = function() {
    var _this = this;





































  };

  /**
   * Constructs a <code>MeetingIndigo</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/MeetingIndigo} obj Optional instance to populate.
   * @return {module:model/MeetingIndigo} The populated <code>MeetingIndigo</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('meetingId')) {
        obj['meetingId'] = ApiClient.convertToType(data['meetingId'], 'String');
      }
      if (data.hasOwnProperty('meetingUUID')) {
        obj['meetingUUID'] = ApiClient.convertToType(data['meetingUUID'], 'String');
      }
      if (data.hasOwnProperty('userName')) {
        obj['userName'] = ApiClient.convertToType(data['userName'], 'String');
      }
      if (data.hasOwnProperty('email')) {
        obj['email'] = ApiClient.convertToType(data['email'], 'String');
      }
      if (data.hasOwnProperty('encryptionType')) {
        obj['encryptionType'] = ApiClient.convertToType(data['encryptionType'], 'Integer');
      }
      if (data.hasOwnProperty('title')) {
        obj['title'] = ApiClient.convertToType(data['title'], 'String');
      }
      if (data.hasOwnProperty('userFullName')) {
        obj['userFullName'] = ApiClient.convertToType(data['userFullName'], 'String');
      }
      if (data.hasOwnProperty('phoneNumber')) {
        obj['phoneNumber'] = ApiClient.convertToType(data['phoneNumber'], 'String');
      }
      if (data.hasOwnProperty('userFeatures')) {
        obj['userFeatures'] = ApiClient.convertToType(data['userFeatures'], 'String');
      }
      if (data.hasOwnProperty('scheduledFrom')) {
        obj['scheduledFrom'] = ApiClient.convertToType(data['scheduledFrom'], 'String');
      }
      if (data.hasOwnProperty('inviteeCount')) {
        obj['inviteeCount'] = ApiClient.convertToType(data['inviteeCount'], 'Integer');
      }
      if (data.hasOwnProperty('personal')) {
        obj['personal'] = ApiClient.convertToType(data['personal'], 'Boolean');
      }
      if (data.hasOwnProperty('muteOnEntry')) {
        obj['muteOnEntry'] = ApiClient.convertToType(data['muteOnEntry'], 'Boolean');
      }
      if (data.hasOwnProperty('autoRecord')) {
        obj['autoRecord'] = ApiClient.convertToType(data['autoRecord'], 'Boolean');
      }
      if (data.hasOwnProperty('enterpriseName')) {
        obj['enterpriseName'] = ApiClient.convertToType(data['enterpriseName'], 'String');
      }
      if (data.hasOwnProperty('moderatorLess')) {
        obj['moderatorLess'] = ApiClient.convertToType(data['moderatorLess'], 'Boolean');
      }
      if (data.hasOwnProperty('startTime')) {
        obj['startTime'] = ApiClient.convertToType(data['startTime'], 'Integer');
      }
      if (data.hasOwnProperty('endTime')) {
        obj['endTime'] = ApiClient.convertToType(data['endTime'], 'Integer');
      }
      if (data.hasOwnProperty('totalCallSeconds')) {
        obj['totalCallSeconds'] = ApiClient.convertToType(data['totalCallSeconds'], 'Integer');
      }
      if (data.hasOwnProperty('createTime')) {
        obj['createTime'] = ApiClient.convertToType(data['createTime'], 'Integer');
      }
      if (data.hasOwnProperty('endpointsCount')) {
        obj['endpointsCount'] = ApiClient.convertToType(data['endpointsCount'], 'Integer');
      }
      if (data.hasOwnProperty('concurrentEndpoints')) {
        obj['concurrentEndpoints'] = ApiClient.convertToType(data['concurrentEndpoints'], 'Integer');
      }
      if (data.hasOwnProperty('liveVisibleEndpointsCount')) {
        obj['liveVisibleEndpointsCount'] = ApiClient.convertToType(data['liveVisibleEndpointsCount'], 'Integer');
      }
      if (data.hasOwnProperty('qualarooRating')) {
        obj['qualarooRating'] = ApiClient.convertToType(data['qualarooRating'], 'Integer');
      }
      if (data.hasOwnProperty('qualarooCount')) {
        obj['qualarooCount'] = ApiClient.convertToType(data['qualarooCount'], 'Integer');
      }
      if (data.hasOwnProperty('meetingRecording')) {
        obj['meetingRecording'] = ApiClient.convertToType(data['meetingRecording'], 'Boolean');
      }
      if (data.hasOwnProperty('videoShare')) {
        obj['videoShare'] = ApiClient.convertToType(data['videoShare'], 'Boolean');
      }
      if (data.hasOwnProperty('contentShare')) {
        obj['contentShare'] = ApiClient.convertToType(data['contentShare'], 'Boolean');
      }
      if (data.hasOwnProperty('liveRecording')) {
        obj['liveRecording'] = ApiClient.convertToType(data['liveRecording'], 'Boolean');
      }
      if (data.hasOwnProperty('liveVideoShare')) {
        obj['liveVideoShare'] = ApiClient.convertToType(data['liveVideoShare'], 'Boolean');
      }
      if (data.hasOwnProperty('liveContentShare')) {
        obj['liveContentShare'] = ApiClient.convertToType(data['liveContentShare'], 'Boolean');
      }
      if (data.hasOwnProperty('largeMeeting')) {
        obj['largeMeeting'] = ApiClient.convertToType(data['largeMeeting'], 'Boolean');
      }
      if (data.hasOwnProperty('roiDistance')) {
        obj['roiDistance'] = ApiClient.convertToType(data['roiDistance'], 'Number');
      }
      if (data.hasOwnProperty('mpls')) {
        obj['mpls'] = ApiClient.convertToType(data['mpls'], 'Boolean');
      }
      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }
      if (data.hasOwnProperty('endpoints')) {
        obj['endpoints'] = ApiClient.convertToType(data['endpoints'], [EndpointIndigo]);
      }
    }
    return obj;
  }

  /**
   * @member {String} meetingId
   */
  exports.prototype['meetingId'] = undefined;
  /**
   * @member {String} meetingUUID
   */
  exports.prototype['meetingUUID'] = undefined;
  /**
   * @member {String} userName
   */
  exports.prototype['userName'] = undefined;
  /**
   * @member {String} email
   */
  exports.prototype['email'] = undefined;
  /**
   * @member {Integer} encryptionType
   */
  exports.prototype['encryptionType'] = undefined;
  /**
   * @member {String} title
   */
  exports.prototype['title'] = undefined;
  /**
   * @member {String} userFullName
   */
  exports.prototype['userFullName'] = undefined;
  /**
   * @member {String} phoneNumber
   */
  exports.prototype['phoneNumber'] = undefined;
  /**
   * @member {String} userFeatures
   */
  exports.prototype['userFeatures'] = undefined;
  /**
   * @member {module:model/MeetingIndigo.ScheduledFromEnum} scheduledFrom
   */
  exports.prototype['scheduledFrom'] = undefined;
  /**
   * @member {Integer} inviteeCount
   */
  exports.prototype['inviteeCount'] = undefined;
  /**
   * @member {Boolean} personal
   */
  exports.prototype['personal'] = undefined;
  /**
   * @member {Boolean} muteOnEntry
   */
  exports.prototype['muteOnEntry'] = undefined;
  /**
   * @member {Boolean} autoRecord
   */
  exports.prototype['autoRecord'] = undefined;
  /**
   * @member {String} enterpriseName
   */
  exports.prototype['enterpriseName'] = undefined;
  /**
   * @member {Boolean} moderatorLess
   */
  exports.prototype['moderatorLess'] = undefined;
  /**
   * @member {Integer} startTime
   */
  exports.prototype['startTime'] = undefined;
  /**
   * @member {Integer} endTime
   */
  exports.prototype['endTime'] = undefined;
  /**
   * @member {Integer} totalCallSeconds
   */
  exports.prototype['totalCallSeconds'] = undefined;
  /**
   * @member {Integer} createTime
   */
  exports.prototype['createTime'] = undefined;
  /**
   * @member {Integer} endpointsCount
   */
  exports.prototype['endpointsCount'] = undefined;
  /**
   * @member {Integer} concurrentEndpoints
   */
  exports.prototype['concurrentEndpoints'] = undefined;
  /**
   * @member {Integer} liveVisibleEndpointsCount
   */
  exports.prototype['liveVisibleEndpointsCount'] = undefined;
  /**
   * @member {Integer} qualarooRating
   */
  exports.prototype['qualarooRating'] = undefined;
  /**
   * @member {Integer} qualarooCount
   */
  exports.prototype['qualarooCount'] = undefined;
  /**
   * @member {Boolean} meetingRecording
   */
  exports.prototype['meetingRecording'] = undefined;
  /**
   * @member {Boolean} videoShare
   */
  exports.prototype['videoShare'] = undefined;
  /**
   * @member {Boolean} contentShare
   */
  exports.prototype['contentShare'] = undefined;
  /**
   * @member {Boolean} liveRecording
   */
  exports.prototype['liveRecording'] = undefined;
  /**
   * @member {Boolean} liveVideoShare
   */
  exports.prototype['liveVideoShare'] = undefined;
  /**
   * @member {Boolean} liveContentShare
   */
  exports.prototype['liveContentShare'] = undefined;
  /**
   * @member {Boolean} largeMeeting
   */
  exports.prototype['largeMeeting'] = undefined;
  /**
   * @member {Number} roiDistance
   */
  exports.prototype['roiDistance'] = undefined;
  /**
   * @member {Boolean} mpls
   */
  exports.prototype['mpls'] = undefined;
  /**
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * @member {Array.<module:model/EndpointIndigo>} endpoints
   */
  exports.prototype['endpoints'] = undefined;


  /**
   * Allowed values for the <code>scheduledFrom</code> property.
   * @enum {String}
   * @readonly
   */
  exports.ScheduledFromEnum = {
    /**
     * value: "WEB_APP"
     * @const
     */
    "APP": "WEB_APP"  };


  return exports;
}));

