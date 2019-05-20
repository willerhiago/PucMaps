package com.app.pucmaps;

import com.amazonaws.mobileconnectors.lambdainvoker.LambdaFunction;
public interface LambdaInterface {

    /**
     * Invoke the Lambda function "AndroidBackendLambdaFunction".
     * The function name is the method name.
     */
    @LambdaFunction
    String isNearPuc(RequestClass request);

}
