/**
 * This file is copyright 2017 State of the Netherlands (Ministry of Interior Affairs and Kingdom Relations).
 * It is made available under the terms of the GNU Affero General Public License, version 3 as published by the Free Software Foundation.
 * The project of which this file is part, may be found at https://github.com/MinBZK/operatieBRP.
 */

package nl.bzk.migratiebrp.voisc.spd.exception;

/**
 * SPD message codes.
 */
public enum MessagesCodes {
    // VOSPG 8000-range
    ERRMSG_VOSPG_SPD_LOGON_ERROR("8000"),

    ERRMSG_VOSPG_SPD_LOGON_RCV_CONFIRMATION("8001"),

    ERRMSG_VOSPG_SPD_LOGON_CONF_LENGTH("8002"),

    ERRMSG_VOSPG_SPD_LOGON_CONF_OPCODE("8003"),

    ERRMSG_VOSPG_SPD_LOGON_INCORRECT_PASSWORD("8004"),

    ERRMSG_VOSPG_SSL_CONNECTION_ERROR("8005"),

    ERRMSG_VOSPG_SSL_INCORRECT_CERT_PASSWORD("8006"),

    ERRMSG_VOSPG_SSL_COMMUNICATION_ERROR("8007"),

    ERRMSG_VOSPG_SPD_LOGOFF_RCV_CONFIRMATION("8010"),

    ERRMSG_VOSPG_SPD_LOGOFF_CONF_LENGTH("8011"),

    ERRMSG_VOSPG_SPD_LOGOFF_CONF_OPCODE("8012"),

    ERRMSG_VOSPG_SPD_LOGOFF_ERROR("8013"),

    ERRMSG_VOSPG_SPD_NEW_PASSWORD_LENGTH("8020"),

    ERRMSG_VOSPG_SPD_CHANGEPASSWORD_CONF("8021"),

    ERRMSG_VOSPG_SPD_CHANGEPASSWORD_CONF_LENGTH("8022"),

    ERRMSG_VOSPG_SPD_CHANGEPASSWORD_CONF_OPCODE("8023"),

    ERRMSG_VOSPG_SPD_CHANGEPASSWORD_OLD_PWD_MISSING("8024"),

    ERRMSG_VOSPG_SPD_CHANGEPASSWORD_OLD_PWD_INVALID("8025"),

    ERRMSG_VOSPG_SPD_CHANGEPASSWORD_NEW_PWD_MISSING("8026"),

    ERRMSG_VOSPG_SPD_CHANGEPASSWORD_NEW_PWD_UNACCEPTABLE("8027"),

    ERRMSG_VOSPG_SPD_CHANGEPASSWORD_ERROR("8028"),

    ERRMSG_VOSPG_SPD_RCV_LISTMESSAGES("8030"),

    ERRMSG_VOSPG_SPD_LISTMESSAGES_CONF_OPCODE("8031"),

    ERRMSG_VOSPG_SPD_LISTMESSAGES_ERROR("8032"),

    ERRMSG_VOSPG_SPD_LISTMESSAGES_LENGTH("8033"),

    ERRMSG_VOSPG_SPD_RCV_GETMESSAGE("8040"),

    ERRMSG_VOSPG_SPD_GETMESSAGE_CONF_LENGTH("8041"),

    ERRMSG_VOSPG_SPD_GETMESSAGE_ERROR("8042"),

    ERRMSG_VOSPG_SPD_GETMESSAGE_MSENTRY_OPCODE("8043"),

    ERRMSG_VOSPG_SPD_GETMESSAGE_CONTAINS_NULL_BYTES("8046"),

    ERRMSG_VOSPG_SPD_DELIVERY_REPORT_LENGTH("8050"),

    ERRMSG_VOSPG_SPD_DELREP_NR_RECIPIENTS("8052"),

    ERRMSG_VOSPG_SPD_ENVELOPE_LENGTH("8060"),

    ERRMSG_VOSPG_SPD_HEADING_LENGTH("8061"),

    ERRMSG_VOSPG_SPD_BODY_LENGTH("8062"),

    ERRMSG_VOSPG_SPD_STATUS_REPORT_LENGTH("8070"),

    ERRMSG_VOSPG_SPD_RCV_PUTMESSAGE_CONFIRMATION("8090"),

    ERRMSG_VOSPG_SPD_PUTMESSAGE_CONF_LENGTH("8091"),

    ERRMSG_VOSPG_SPD_PUTMESSAGE_CONF_OPCODE("8092"),

    ERRMSG_VOSPG_SPD_PUTMESSAGE_ERROR("8093"),

    ERRMSG_VOSPG_SEND_NO_EREF("8094"),

    ERRMSG_VOSPG_SEND_RECIPIENT_INVALID("8095"),

    ERRMSG_VOSPG_SPD_PUTMESSAGE_NFE("8096"),

    ERRMSG_VOSPG_SPD_PUTMESSAGE_CONF_INCORRECT_MSG_ID("8097"),

    ERRMSG_VOSPG_SPD_NOT_NUMERIC_FIELD("8098"),

    ERRMSG_VOSPG_SPD_ILLEGAL_MESSAGE_TYPE("8099"),

    ERRMSG_VOA_WRONG_MAILBOX_PW("8111"),

    ERRMSG_VOA_WRONG_SSL_PW("8112"),

    ERRMSG_VOA_LOGON_ERROR("8113"),

    ERRMSG_VOSPG_CHG_PW_ERROR("8115"),

    ERRMSG_VOA_RECEIVE_ERROR("8116"),

    ERRMSG_VOSPG_UNEXPECTED_EXCEPTION("8121"),

    /**
     * Custom error messages not part of VOSPG.
     */
    ERRMSG_SSL_INCORRECT_KEYSTORE_PASSWORD("99.9999"),

    /**
     * Custom error messages not part of VOSPG.
     */
    ERRMSG_SSL_MISSING_KEYSTORE("99.9998");

    private String errorCode;

    MessagesCodes(final String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Geef de errorcode terug
     * @return de errorcode
     */
    public String getErrorCode() {
        return errorCode;
    }
}