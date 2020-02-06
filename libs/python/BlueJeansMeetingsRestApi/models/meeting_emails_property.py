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


class MeetingEmailsProperty(object):
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
        'ics': 'str',
        'text': 'str',
        'html': 'str',
        'ics_file': 'str'
    }

    attribute_map = {
        'ics': 'ICS',
        'text': 'Text',
        'html': 'HTML',
        'ics_file': 'ICS_FILE'
    }

    def __init__(self, ics=None, text=None, html=None, ics_file=None):  # noqa: E501
        """MeetingEmailsProperty - a model defined in Swagger"""  # noqa: E501

        self._ics = None
        self._text = None
        self._html = None
        self._ics_file = None
        self.discriminator = None

        if ics is not None:
            self.ics = ics
        if text is not None:
            self.text = text
        if html is not None:
            self.html = html
        if ics_file is not None:
            self.ics_file = ics_file

    @property
    def ics(self):
        """Gets the ics of this MeetingEmailsProperty.  # noqa: E501


        :return: The ics of this MeetingEmailsProperty.  # noqa: E501
        :rtype: str
        """
        return self._ics

    @ics.setter
    def ics(self, ics):
        """Sets the ics of this MeetingEmailsProperty.


        :param ics: The ics of this MeetingEmailsProperty.  # noqa: E501
        :type: str
        """

        self._ics = ics

    @property
    def text(self):
        """Gets the text of this MeetingEmailsProperty.  # noqa: E501


        :return: The text of this MeetingEmailsProperty.  # noqa: E501
        :rtype: str
        """
        return self._text

    @text.setter
    def text(self, text):
        """Sets the text of this MeetingEmailsProperty.


        :param text: The text of this MeetingEmailsProperty.  # noqa: E501
        :type: str
        """

        self._text = text

    @property
    def html(self):
        """Gets the html of this MeetingEmailsProperty.  # noqa: E501


        :return: The html of this MeetingEmailsProperty.  # noqa: E501
        :rtype: str
        """
        return self._html

    @html.setter
    def html(self, html):
        """Sets the html of this MeetingEmailsProperty.


        :param html: The html of this MeetingEmailsProperty.  # noqa: E501
        :type: str
        """

        self._html = html

    @property
    def ics_file(self):
        """Gets the ics_file of this MeetingEmailsProperty.  # noqa: E501


        :return: The ics_file of this MeetingEmailsProperty.  # noqa: E501
        :rtype: str
        """
        return self._ics_file

    @ics_file.setter
    def ics_file(self, ics_file):
        """Sets the ics_file of this MeetingEmailsProperty.


        :param ics_file: The ics_file of this MeetingEmailsProperty.  # noqa: E501
        :type: str
        """

        self._ics_file = ics_file

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
        if issubclass(MeetingEmailsProperty, dict):
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
        if not isinstance(other, MeetingEmailsProperty):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other