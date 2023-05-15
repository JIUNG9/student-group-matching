package com.studygroup.util.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ErrorCode {

    // authorization error
    YOU_ARE_NOT_ADMIN(0000, "you are not admin"),
    YOU_ARE_NOT_GROUP_ADMIN(0001, "you are not group admin"),
    YOU_ARE_NOTE_GROUP_MEMBER(0002, "you are not group member"),
    //user error
    CAN_NOT_WITHDRAWAL(1000,"Email and password are not matched so can not withdrawal the account"),
    SIGN_UP_FAIL(1001,"user input information is not valid"),
    EMAIL_NOT_VERIFIED(1002,"Email is not verified"),
    EMAIL_VERIFICATION_TOKEN_ERROR(1003,"Token is not matched by user input"),
    EMAIL_IS_NOT_EXISTED(1004,"email is not existed"),
    EMAIL_IS_DUPLICATED(1005,"Email is duplicated enter the another one"),
    LOGIN_FAIL(1006,"Email and password are not matched"),
    NO_USER_ID(1007,"There is no user with that user id"),
    YOU_ARE_KICKED(1008, "you are kicked from admin"),
    ALREADY_EMAIL_VERIFIED(1009, "you are already verified"),

    //group error
    GROUP_MEETING_SUBJECT_IS_NOT_EXISTED(2000,"Group meeting subject is not existed in group meeting"),
    GROUP_MEETING_SUBJECT_IS_DUPLICATED(2001,"The group meeting subject name is duplicated"),
    GROUP_IS_NOT_EXISTED_BY_NAME(2002,"The group is not existed by name"),
    GROUP_NAME_IS_DUPLICATED(2003,"The group name is duplicated"),
    CAN_NOT_FIND_WITH_GROUP_NAME_AND_NICK_NAME(2004,"There is no user with that group name and user nickname"),
    GROUP_MEMBER_IS_NOT_EXISTED(2005,"Group member is not existed in that group"),
    CAN_NOT_DELETE_GROUP(2006, "Can not delete the group, there is a member in group"),

    //email verification error
    EMAIL_VERIFICATION_FAILED(3000, "Email verification fail, token is not valid or you're already verified"),

    //token validation error
    TOKEN_IS_NOT_VALID(4000, "Token is not valid"),
    JWT_TOKEN_NOT_VALID(4001, "JWT token is not valid"),
    JWT_TOKEN_EMPTY(4002, "There is no JWT token, try the login first"),
    JWT_TOKEN_EXPIRED(4004, "JWT token is expired"),

    //entity error
    SAVE_ERROR(5000, "can not save the entity"),
    ENUM_TYPE_IS_MISMATCHED(5001, "Check the given information  "),

    //Live Meeting error
    CAN_NOT_ACCESS_WEB_CAM(6000, "can not access the web cam, plz grant the authority website can access the camera"),

    //Chat error
    USER_IS_NOT_IN_CHAT_ROOM(7000,"User is not chat room"),

    //Chat error
    VALIDATION_ERROR(8000, "Validation error"),

    //Authorization Error
    AUTHORIZATION_ERROR(9000, null);

    private final int code;
    private final String message;


}
