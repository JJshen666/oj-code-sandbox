package com.shen.ojcodesandbox.model;

import lombok.Data;

/**
 * 进程执行消息
 */
@Data
public class ExecuteMessage {

    private Integer exitValue;

    private String message;

    private String errorMessage;

    private Long time;
}
