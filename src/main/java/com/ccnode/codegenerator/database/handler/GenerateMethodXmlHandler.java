package com.ccnode.codegenerator.database.handler;

import com.ccnode.codegenerator.methodnameparser.buidler.MethodNameParsedResult;
import com.ccnode.codegenerator.methodnameparser.buidler.QueryInfo;

/**
 * @Author bruce.ge
 * @Date 2017/2/27
 * @Description
 */
public interface GenerateMethodXmlHandler {
    QueryInfo buildQueryInfoByMethodNameParsedResult(MethodNameParsedResult result);
}
