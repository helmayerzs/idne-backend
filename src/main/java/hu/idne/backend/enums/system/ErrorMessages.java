package hu.idne.backend.enums.system;

import hu.idne.backend.models.system.MessageKey;

public enum ErrorMessages implements MessageKey {
    CONSTRAINT_VIOLATION,
    USER_RESET_NOT_ALLOWED,
    ONLY_INIT_STATE_USER_ACCEPTED,
    USER_NOT_FOUND,
    INVALID_CSV_FORMAT,
    MALFORMED_CSV_HEADER,
    CSV_CONSTRAINT_VIOLATION,
    CSV_INSUFFICIENT_LENGTH,
    CSV_COLUMN_EMPTY,
    CSV_BOOLEAN_FLAG_PROBLEM,
    NULL_ID,
    KEY_ALREADY_EXISTS_OR_NULL,
    ID_MISMATCH,
    MISSING_FIELDS,
    UNABLE_TO_FIND_ENTITY,
    FILE_IS_NOT_PRESET,
    PREV_AND_NEW_OVERLAP,
    AT_LEAST_ONE_USER_REQUIRED,
    NON_BLOCKER_QUE_ENTRY,
    UNHANDLED_EXCEPTION,
    ALREADY_DELETED,
    IDENTIFIER_MODIFICATION_NOT_ALLOWED,
    DATABASE_SCHEMA_CORRUPTION,
    NOT_EXIST_IN_REFERENCED_TABLE,
    SUCH_DATA_ALREADY_EXISTS,
    WRONG_DATA_FORMAT,
    DATA_USED_AS_REFERENCE,
    SYNTAX_OR_ACCESS_ERROR,
    DATA_ERROR,
    EXECUTION_NOT_FOUND,
    UNHANDLED_ASYNC_COMMAND,
    ASYNC_QUEUE_IS_FULL,
    TASK_ALREADY_STARTED,
    ID_ALREADY_EXISTS,
    ID_DOESNT_EXISTS,
    CSV_ACTION_ERROR,
    FILE_CREATION_ERROR,
    NO_DATA_FOR_FILE
}
