package p;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;



public class SampleLambda implements RequestHandler<Integer, String> {

    public SampleLambda() {
    }

    public String handleRequest(Integer integer, Context context) {
        System.out.println("handleRequest1:int="+integer.intValue());
        context.getLogger().log("handleRequest2:int="+integer.intValue());
        return "handleRequest3:int="+String.valueOf(integer);
    }

    public String handleRequest(String str, Context context) {
        System.out.println("handleRequest1:str="+str );
        context.getLogger().log("handleRequest2:str="+str );
        return "handleRequest3:str="+str;
    }
}