package org.example.dataStructure.enumPackage;


enum  QueryResponse {
    Success("Success",200, "The request succeeded"),
    Redirected("Redirected",301, "The URL of the requested resource has been changed permanently. The new URL is given in the response."),
    ClientError("ClientError",400, "Bad request"),
    ServerError("ServerError",500, "Internal Server Error"),;
    final String response;
    final Integer responseCode;
    final String responseMessage;
    QueryResponse(String response, Integer responseCode, String responseMessage){
        this.response = response;
        this.responseCode =responseCode;
        this.responseMessage= responseMessage;
    }

    public static QueryResponse getQueryResponse(String response){
        return QueryResponse.valueOf(response);
    }

}

public class enumClass {


    public static void main(String[] args){

        String input ="Redirected";
        QueryResponse queryResponse = QueryResponse.valueOf(input);
        System.out.println(queryResponse.response);
        System.out.println(queryResponse.responseCode);
        System.out.println(queryResponse.responseMessage);

    }
}
