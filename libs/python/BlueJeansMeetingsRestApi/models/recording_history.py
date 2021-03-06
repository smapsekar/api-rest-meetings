# coding: utf-8

"""
    BlueJeans Meetings REST API

     ## Video That Works Where You Do. <p>This site provides developers access to APIs from BlueJean's Meetings meeting service.  From here you can see and try actual API calls to manage User Accounts, Meetings, and Recordings, pull Analytical Data and Current State information.</p>    <nosdk> <hr> <div> <div class=\"key\">     <a href=\"./basics.html\" target=\"_\"><img class=\"keyimg\" src=\"./img/bjnmeeting.png\"/></a> </div> <div class=\"keybox\"> Basic instructions about What is a BlueJeans Meeting, and Getting Started Using API's, are <a href=\"./basics.html\" target=\"_blank\">available here <i class=\"glyphicon glyphicon-new-window\"></i></a>. </div> </div> <hr> <alert>2/21/2019</alert> Change response of Change layout and Endpoint API's to 204<br/> 12/03/2018 Add API for setting user profile photograph.<br/> 10/17/2018 Updated API field definitions for time variables to be 64-bit .<br/> 7/23/2018 Corrected errors in API definition file.<br/> 7/10/2018 Deprecated some Command Center API's.  Exposed API's that Summarize usage.<br/> 7/06/2018 Added API for changing ownership of recordings.<br/> 6/28/2018 Restored Create Enterprise Account, added Enterprise and User Profile Tag API's.<br/> 6/01/2018 Clarified Access Token requirements for meeting endpoint API's.<br/> 5/21/2018 Corrected return model for meeting history call.<br/> </nosdk> <hr>   # noqa: E501

    OpenAPI spec version: 1.0.4402212019
    Contact: glenn@bluejeans.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from BlueJeansMeetingsRestApi.models.recording_session import RecordingSession  # noqa: F401,E501


class RecordingHistory(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'chapter_id': 'str',
        'id': 'int',
        'start_time_offset': 'int',
        'end_time_offset': 'int',
        'chapter_name': 'str',
        'total_size': 'int',
        'composite_content_id': 'int',
        'composite_content_status': 'str',
        'parent_recording_id': 'int',
        'view_count': 'int',
        'recording_sessions': 'list[RecordingSession]'
    }

    attribute_map = {
        'chapter_id': 'chapterId',
        'id': 'id',
        'start_time_offset': 'startTimeOffset',
        'end_time_offset': 'endTimeOffset',
        'chapter_name': 'chapterName',
        'total_size': 'totalSize',
        'composite_content_id': 'compositeContentId',
        'composite_content_status': 'compositeContentStatus',
        'parent_recording_id': 'parentRecordingId',
        'view_count': 'viewCount',
        'recording_sessions': 'recordingSessions'
    }

    def __init__(self, chapter_id=None, id=None, start_time_offset=None, end_time_offset=None, chapter_name=None, total_size=None, composite_content_id=None, composite_content_status=None, parent_recording_id=None, view_count=None, recording_sessions=None):  # noqa: E501
        """RecordingHistory - a model defined in Swagger"""  # noqa: E501

        self._chapter_id = None
        self._id = None
        self._start_time_offset = None
        self._end_time_offset = None
        self._chapter_name = None
        self._total_size = None
        self._composite_content_id = None
        self._composite_content_status = None
        self._parent_recording_id = None
        self._view_count = None
        self._recording_sessions = None
        self.discriminator = None

        if chapter_id is not None:
            self.chapter_id = chapter_id
        if id is not None:
            self.id = id
        if start_time_offset is not None:
            self.start_time_offset = start_time_offset
        if end_time_offset is not None:
            self.end_time_offset = end_time_offset
        if chapter_name is not None:
            self.chapter_name = chapter_name
        if total_size is not None:
            self.total_size = total_size
        if composite_content_id is not None:
            self.composite_content_id = composite_content_id
        if composite_content_status is not None:
            self.composite_content_status = composite_content_status
        if parent_recording_id is not None:
            self.parent_recording_id = parent_recording_id
        if view_count is not None:
            self.view_count = view_count
        if recording_sessions is not None:
            self.recording_sessions = recording_sessions

    @property
    def chapter_id(self):
        """Gets the chapter_id of this RecordingHistory.  # noqa: E501


        :return: The chapter_id of this RecordingHistory.  # noqa: E501
        :rtype: str
        """
        return self._chapter_id

    @chapter_id.setter
    def chapter_id(self, chapter_id):
        """Sets the chapter_id of this RecordingHistory.


        :param chapter_id: The chapter_id of this RecordingHistory.  # noqa: E501
        :type: str
        """

        self._chapter_id = chapter_id

    @property
    def id(self):
        """Gets the id of this RecordingHistory.  # noqa: E501


        :return: The id of this RecordingHistory.  # noqa: E501
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this RecordingHistory.


        :param id: The id of this RecordingHistory.  # noqa: E501
        :type: int
        """

        self._id = id

    @property
    def start_time_offset(self):
        """Gets the start_time_offset of this RecordingHistory.  # noqa: E501


        :return: The start_time_offset of this RecordingHistory.  # noqa: E501
        :rtype: int
        """
        return self._start_time_offset

    @start_time_offset.setter
    def start_time_offset(self, start_time_offset):
        """Sets the start_time_offset of this RecordingHistory.


        :param start_time_offset: The start_time_offset of this RecordingHistory.  # noqa: E501
        :type: int
        """

        self._start_time_offset = start_time_offset

    @property
    def end_time_offset(self):
        """Gets the end_time_offset of this RecordingHistory.  # noqa: E501


        :return: The end_time_offset of this RecordingHistory.  # noqa: E501
        :rtype: int
        """
        return self._end_time_offset

    @end_time_offset.setter
    def end_time_offset(self, end_time_offset):
        """Sets the end_time_offset of this RecordingHistory.


        :param end_time_offset: The end_time_offset of this RecordingHistory.  # noqa: E501
        :type: int
        """

        self._end_time_offset = end_time_offset

    @property
    def chapter_name(self):
        """Gets the chapter_name of this RecordingHistory.  # noqa: E501


        :return: The chapter_name of this RecordingHistory.  # noqa: E501
        :rtype: str
        """
        return self._chapter_name

    @chapter_name.setter
    def chapter_name(self, chapter_name):
        """Sets the chapter_name of this RecordingHistory.


        :param chapter_name: The chapter_name of this RecordingHistory.  # noqa: E501
        :type: str
        """

        self._chapter_name = chapter_name

    @property
    def total_size(self):
        """Gets the total_size of this RecordingHistory.  # noqa: E501


        :return: The total_size of this RecordingHistory.  # noqa: E501
        :rtype: int
        """
        return self._total_size

    @total_size.setter
    def total_size(self, total_size):
        """Sets the total_size of this RecordingHistory.


        :param total_size: The total_size of this RecordingHistory.  # noqa: E501
        :type: int
        """

        self._total_size = total_size

    @property
    def composite_content_id(self):
        """Gets the composite_content_id of this RecordingHistory.  # noqa: E501


        :return: The composite_content_id of this RecordingHistory.  # noqa: E501
        :rtype: int
        """
        return self._composite_content_id

    @composite_content_id.setter
    def composite_content_id(self, composite_content_id):
        """Sets the composite_content_id of this RecordingHistory.


        :param composite_content_id: The composite_content_id of this RecordingHistory.  # noqa: E501
        :type: int
        """

        self._composite_content_id = composite_content_id

    @property
    def composite_content_status(self):
        """Gets the composite_content_status of this RecordingHistory.  # noqa: E501


        :return: The composite_content_status of this RecordingHistory.  # noqa: E501
        :rtype: str
        """
        return self._composite_content_status

    @composite_content_status.setter
    def composite_content_status(self, composite_content_status):
        """Sets the composite_content_status of this RecordingHistory.


        :param composite_content_status: The composite_content_status of this RecordingHistory.  # noqa: E501
        :type: str
        """
        allowed_values = ["PROCESSED"]  # noqa: E501
        if composite_content_status not in allowed_values:
            raise ValueError(
                "Invalid value for `composite_content_status` ({0}), must be one of {1}"  # noqa: E501
                .format(composite_content_status, allowed_values)
            )

        self._composite_content_status = composite_content_status

    @property
    def parent_recording_id(self):
        """Gets the parent_recording_id of this RecordingHistory.  # noqa: E501


        :return: The parent_recording_id of this RecordingHistory.  # noqa: E501
        :rtype: int
        """
        return self._parent_recording_id

    @parent_recording_id.setter
    def parent_recording_id(self, parent_recording_id):
        """Sets the parent_recording_id of this RecordingHistory.


        :param parent_recording_id: The parent_recording_id of this RecordingHistory.  # noqa: E501
        :type: int
        """

        self._parent_recording_id = parent_recording_id

    @property
    def view_count(self):
        """Gets the view_count of this RecordingHistory.  # noqa: E501


        :return: The view_count of this RecordingHistory.  # noqa: E501
        :rtype: int
        """
        return self._view_count

    @view_count.setter
    def view_count(self, view_count):
        """Sets the view_count of this RecordingHistory.


        :param view_count: The view_count of this RecordingHistory.  # noqa: E501
        :type: int
        """

        self._view_count = view_count

    @property
    def recording_sessions(self):
        """Gets the recording_sessions of this RecordingHistory.  # noqa: E501


        :return: The recording_sessions of this RecordingHistory.  # noqa: E501
        :rtype: list[RecordingSession]
        """
        return self._recording_sessions

    @recording_sessions.setter
    def recording_sessions(self, recording_sessions):
        """Sets the recording_sessions of this RecordingHistory.


        :param recording_sessions: The recording_sessions of this RecordingHistory.  # noqa: E501
        :type: list[RecordingSession]
        """

        self._recording_sessions = recording_sessions

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value
        if issubclass(RecordingHistory, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, RecordingHistory):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
