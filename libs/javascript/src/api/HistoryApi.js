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

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/Meeting', 'model/Error', 'model/Recording'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/Meeting'), require('../model/Error'), require('../model/Recording'));
  } else {
    // Browser globals (root is window)
    if (!root.BlueJeansOnVideoRestApi) {
      root.BlueJeansOnVideoRestApi = {};
    }
    root.BlueJeansOnVideoRestApi.HistoryApi = factory(root.BlueJeansOnVideoRestApi.ApiClient, root.BlueJeansOnVideoRestApi.Meeting, root.BlueJeansOnVideoRestApi.Error, root.BlueJeansOnVideoRestApi.Recording);
  }
}(this, function(ApiClient, Meeting, Error, Recording) {
  'use strict';

  /**
   * History service.
   * @module api/HistoryApi
   * @version 1.0.0
   */

  /**
   * Constructs a new HistoryApi. 
   * @alias module:api/HistoryApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the v1EnterpriseEnterpriseIdMeetingHistoryGet operation.
     * @callback module:api/HistoryApi~v1EnterpriseEnterpriseIdMeetingHistoryGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Meeting} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * List Meetings
     * This endpoint retrieves a list of meetings.
     * @param {Integer} enterpriseId The ID of the enterprise of interest. This value is an integer which can be retrieved for the current user via the Get Enterprise Profile endpoint.
     * @param {module:api/HistoryApi~v1EnterpriseEnterpriseIdMeetingHistoryGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Meeting}
     */
    this.v1EnterpriseEnterpriseIdMeetingHistoryGet = function(enterpriseId, callback) {
      var postBody = null;

      // verify the required parameter 'enterpriseId' is set
      if (enterpriseId == undefined || enterpriseId == null) {
        throw "Missing the required parameter 'enterpriseId' when calling v1EnterpriseEnterpriseIdMeetingHistoryGet";
      }


      var pathParams = {
        'enterprise_id': enterpriseId
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['access_token'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = Meeting;

      return this.apiClient.callApi(
        '/v1/enterprise/{enterprise_id}/meeting_history', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1EnterpriseEnterpriseIdMeetingHistoryMeetingGuidGet operation.
     * @callback module:api/HistoryApi~v1EnterpriseEnterpriseIdMeetingHistoryMeetingGuidGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Meeting} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * List Meetings
     * This endpoint retrieves a list of meetings.
     * @param {Integer} enterpriseId The ID of the enterprise of interest. This value is an integer which can be retrieved for the current user via the Get Enterprise Profile endpoint.
     * @param {String} meetingGuid The globally unique identifier (GUID) of the meeting of interest. This value is a string which contains the numeric meeting id, followed by a colon, followed by a 128-bit integer number formatted as 5 alphanumeric segments separated by dashes. Since a given numeric meeting ID can have multiple instantiations over time, the GUID helps identify the instance of interest.
     * @param {module:api/HistoryApi~v1EnterpriseEnterpriseIdMeetingHistoryMeetingGuidGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Meeting}
     */
    this.v1EnterpriseEnterpriseIdMeetingHistoryMeetingGuidGet = function(enterpriseId, meetingGuid, callback) {
      var postBody = null;

      // verify the required parameter 'enterpriseId' is set
      if (enterpriseId == undefined || enterpriseId == null) {
        throw "Missing the required parameter 'enterpriseId' when calling v1EnterpriseEnterpriseIdMeetingHistoryMeetingGuidGet";
      }

      // verify the required parameter 'meetingGuid' is set
      if (meetingGuid == undefined || meetingGuid == null) {
        throw "Missing the required parameter 'meetingGuid' when calling v1EnterpriseEnterpriseIdMeetingHistoryMeetingGuidGet";
      }


      var pathParams = {
        'enterprise_id': enterpriseId,
        'meeting_guid': meetingGuid
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['access_token'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = Meeting;

      return this.apiClient.callApi(
        '/v1/enterprise/{enterprise_id}/meeting_history/{meeting_guid}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1UserUserIdMeetingHistoryGet operation.
     * @callback module:api/HistoryApi~v1UserUserIdMeetingHistoryGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Meeting} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * List Meetings
     * This endpoint retrieves a list of meetings.
     * @param {Integer} userId The ID of the user of interest.  his value is an integer which can be retrieved for the current user via the Get User Account Details endpoint.
     * @param {Object} opts Optional parameters
     * @param {String} opts.meetingId Return meetings with the specified Meeting ID (recurring &amp; Personal Meeting ID).
     * @param {String} opts.startDate Return meetings starting from the specified date. MM/DD/YYYY
     * @param {String} opts.endDate Return meetings up until the specified date. MM/DD/YYYY
     * @param {Integer} opts.pageSize Sets number of items returned per page.
     * @param {Integer} opts.pageNumber Selects which page of results to return.
     * @param {String} opts.order Puts results in ascending or descending order. asc/desc
     * @param {module:api/HistoryApi~v1UserUserIdMeetingHistoryGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Meeting}
     */
    this.v1UserUserIdMeetingHistoryGet = function(userId, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'userId' is set
      if (userId == undefined || userId == null) {
        throw "Missing the required parameter 'userId' when calling v1UserUserIdMeetingHistoryGet";
      }


      var pathParams = {
        'user_id': userId
      };
      var queryParams = {
        'meetingId': opts['meetingId'],
        'startDate': opts['startDate'],
        'endDate': opts['endDate'],
        'pageSize': opts['pageSize'],
        'pageNumber': opts['pageNumber'],
        'order': opts['order']
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['access_token'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = Meeting;

      return this.apiClient.callApi(
        '/v1/user/{user_id}/meeting_history', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1UserUserIdMeetingHistoryMeetingGuidGet operation.
     * @callback module:api/HistoryApi~v1UserUserIdMeetingHistoryMeetingGuidGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Meeting} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * List Meetings
     * This endpoint retrieves a list of meetings.
     * @param {Integer} userId The ID of the user of interest.  his value is an integer which can be retrieved for the current user via the Get User Account Details endpoint.
     * @param {String} meetingGuid The globally unique identifier (GUID) of the meeting of interest. This value is a string which contains the numeric meeting id, followed by a colon, followed by a 128-bit integer number formatted as 5 alphanumeric segments separated by dashes. Since a given numeric meeting ID can have multiple instantiations over time, the GUID helps identify the instance of interest.
     * @param {module:api/HistoryApi~v1UserUserIdMeetingHistoryMeetingGuidGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Meeting}
     */
    this.v1UserUserIdMeetingHistoryMeetingGuidGet = function(userId, meetingGuid, callback) {
      var postBody = null;

      // verify the required parameter 'userId' is set
      if (userId == undefined || userId == null) {
        throw "Missing the required parameter 'userId' when calling v1UserUserIdMeetingHistoryMeetingGuidGet";
      }

      // verify the required parameter 'meetingGuid' is set
      if (meetingGuid == undefined || meetingGuid == null) {
        throw "Missing the required parameter 'meetingGuid' when calling v1UserUserIdMeetingHistoryMeetingGuidGet";
      }


      var pathParams = {
        'user_id': userId,
        'meeting_guid': meetingGuid
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['access_token'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = Meeting;

      return this.apiClient.callApi(
        '/v1/user/{user_id}/meeting_history/{meeting_guid}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1UserUserIdMeetingHistoryRecordingsGet operation.
     * @callback module:api/HistoryApi~v1UserUserIdMeetingHistoryRecordingsGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Recording} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * List Meeting Recordings
     * This endpoint retrieves a list of meeting recordings.
     * @param {Integer} userId The ID of the user of interest.  his value is an integer which can be retrieved for the current user via the Get User Account Details endpoint.
     * @param {Object} opts Optional parameters
     * @param {Integer} opts.pageSize Sets number of items returned per page. (default to 10)
     * @param {Integer} opts.pageNumber Selects which page of results to return. (default to 1)
     * @param {String} opts.sortBy Selects which page of results to return. (default to start_time)
     * @param {module:model/String} opts.order Puts results in ascending or descending order. (default to desc)
     * @param {module:api/HistoryApi~v1UserUserIdMeetingHistoryRecordingsGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Recording}
     */
    this.v1UserUserIdMeetingHistoryRecordingsGet = function(userId, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'userId' is set
      if (userId == undefined || userId == null) {
        throw "Missing the required parameter 'userId' when calling v1UserUserIdMeetingHistoryRecordingsGet";
      }


      var pathParams = {
        'user_id': userId
      };
      var queryParams = {
        'pageSize': opts['pageSize'],
        'pageNumber': opts['pageNumber'],
        'sortBy': opts['sortBy'],
        'order': opts['order']
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['access_token'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = Recording;

      return this.apiClient.callApi(
        '/v1/user/{user_id}/meeting_history/recordings', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));