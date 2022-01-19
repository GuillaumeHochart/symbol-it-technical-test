package com.symbolIt.excuseDev.excuseDev.model;


import org.json.JSONArray;
import org.json.JSONObject;

import java.security.InvalidParameterException;

public class MessagesResolver {
    
    private final String HTTP_CODE = "http_code";
    private final String TAG = "tag";
    private final String MESSAGE = "message";


    private JSONArray data = new JSONArray("[ {"+ HTTP_CODE +" :701,"+TAG+":\"Inexcusable\", "+MESSAGE+":\" Meh\"}," +
            " {"+ HTTP_CODE +" :702,"+TAG+":\"Inexcusable\", "+MESSAGE+":\" Emacs\"}," +
            " {"+ HTTP_CODE +" :703,"+TAG+":\"Inexcusable\", "+MESSAGE+":\" Explosion\"}," +
            " {"+ HTTP_CODE +" :704,"+TAG+":\"Inexcusable\", "+MESSAGE+":\" Goto Fail\"}," +
            " {"+ HTTP_CODE +" :705,"+TAG+":\"Inexcusable\", "+MESSAGE+":\" I wrote the code and missed the necessary validation by an oversight(see 795) \"}," +
            " {"+ HTTP_CODE +" :706,"+TAG+":\"Inexcusable\", "+MESSAGE+":\" Delete Your Account\"}," +
            " {"+ HTTP_CODE +" :707,"+TAG+":\"Inexcusable\", "+MESSAGE+":\" Can't quit vi\"}," +
            " {"+ HTTP_CODE +" :710,"+TAG+":\"Novelty Implementations\", "+MESSAGE+":\" PHP\"}," +
            " {"+ HTTP_CODE +" :711,"+TAG+":\"Novelty Implementations\", "+MESSAGE+":\" Convenience Store\"}," +
            " {"+ HTTP_CODE +" :712,"+TAG+":\"Novelty Implementations\", "+MESSAGE+":\" NoSQL\"}," +
            " {"+ HTTP_CODE +" :718,"+TAG+":\"Novelty Implementations\", "+MESSAGE+":\" I am not a teapot\"}," +
            " {"+ HTTP_CODE +" :719,"+TAG+":\"Novelty Implementations\", "+MESSAGE+":\" Haskell\"}," +
            " {"+ HTTP_CODE +" :720,"+TAG+":\"Edge Cases\", "+MESSAGE+":\" Unpossible\"}," +
            " {"+ HTTP_CODE +" :721,"+TAG+":\"Edge Cases\", "+MESSAGE+":\" Known Unknowns\"}," +
            " {"+ HTTP_CODE +" :722,"+TAG+":\"Edge Cases\", "+MESSAGE+":\" Unknown Unknowns\"}," +
            " {"+ HTTP_CODE +" :723,"+TAG+":\"Edge Cases\", "+MESSAGE+":\" Tricky\"}," +
            " {"+ HTTP_CODE +" :724,"+TAG+":\"Edge Cases\", "+MESSAGE+":\" This line should be unreachable\"}," +
            " {"+ HTTP_CODE +" :725,"+TAG+":\"Edge Cases\", "+MESSAGE+":\" It works on my machine\"}," +
            " {"+ HTTP_CODE +" :726,"+TAG+":\"Edge Cases\", "+MESSAGE+":\" It's a feature, not a bug\"}," +
            " {"+ HTTP_CODE +" :727,"+TAG+":\"Edge Cases\", "+MESSAGE+":\" 32 bits is plenty\"}," +
            " {"+ HTTP_CODE +" :728,"+TAG+":\"Edge Cases\", "+MESSAGE+":\" It works in my timezone\"}," +
            " {"+ HTTP_CODE +" :730,"+TAG+":\"Fucking\", "+MESSAGE+":\" Fucking npm\"}," +
            " {"+ HTTP_CODE +" :731,"+TAG+":\"Fucking\", "+MESSAGE+":\" Fucking Rubygems\"}," +
            " {"+ HTTP_CODE +" :732,"+TAG+":\"Fucking\", "+MESSAGE+":\" Fucking Unic💩de\"}," +
            " {"+ HTTP_CODE +" :733,"+TAG+":\"Fucking\", "+MESSAGE+":\" Fucking Deadlocks\"}," +
            " {"+ HTTP_CODE +" :734,"+TAG+":\"Fucking\", "+MESSAGE+":\" Fucking Deferreds\"}," +
            " {"+ HTTP_CODE +" :736,"+TAG+":\"Fucking\", "+MESSAGE+":\" Fucking Race Conditions\"}," +
            " {"+ HTTP_CODE +" :735,"+TAG+":\"Fucking\", "+MESSAGE+":\" Fucking IE\"}," +
            " {"+ HTTP_CODE +" :737,"+TAG+":\"Fucking\", "+MESSAGE+":\" FuckThreadsing\"}," +
            " {"+ HTTP_CODE +" :738,"+TAG+":\"Fucking\", "+MESSAGE+":\" Fucking Exactly-once Delivery\"}," +
            " {"+ HTTP_CODE +" :739,"+TAG+":\"Fucking\", "+MESSAGE+":\" Fucking Windows\"}," +
            " {"+ HTTP_CODE +" :738,"+TAG+":\"Fucking\", "+MESSAGE+":\" Fucking Exactly\"}," +
            " {"+ HTTP_CODE +" :739,"+TAG+":\"Fucking\", "+MESSAGE+":\" Fucking McAfee\"}," +
            " {"+ HTTP_CODE +" :750,"+TAG+":\"Syntax Errors\", "+MESSAGE+":\" Didn't bother to compile it\"}," +
            " {"+ HTTP_CODE +" :753,"+TAG+":\"Syntax Errors\", "+MESSAGE+":\" Syntax Error\"}," +
            " {"+ HTTP_CODE +" :754,"+TAG+":\"Syntax Errors\", "+MESSAGE+":\" Too many semi-colons\"}," +
            " {"+ HTTP_CODE +" :755,"+TAG+":\"Syntax Errors\", "+MESSAGE+":\" Not enough semi-colons\"}," +
            " {"+ HTTP_CODE +" :756,"+TAG+":\"Syntax Errors\", "+MESSAGE+":\" Insufficiently polite\"}," +
            " {"+ HTTP_CODE +" :757,"+TAG+":\"Syntax Errors\", "+MESSAGE+":\" Excessively polite\"}," +
            " {"+ HTTP_CODE +" :759,"+TAG+":\"Syntax Errors\", "+MESSAGE+":\" Unexpected`T_PAAMAYIM_NEKUDOTAYIM`\"}," +
            " {"+ HTTP_CODE +" :761,"+TAG+":\"Substance\", "+MESSAGE+":\" Hungover\"}," +
            " {"+ HTTP_CODE +" :762,"+TAG+":\"Substance\", "+MESSAGE+":\" Stoned\"}," +
            " {"+ HTTP_CODE +" :763,"+TAG+":\"Substance\", "+MESSAGE+":\" Under-Caffeinated\"}," +
            " {"+ HTTP_CODE +" :764,"+TAG+":\"Substance\", "+MESSAGE+":\" Over-Caffeinated\"}," +
            " {"+ HTTP_CODE +" :765,"+TAG+":\"Substance\", "+MESSAGE+":\" Railscamp\"}," +
            " {"+ HTTP_CODE +" :766,"+TAG+":\"Substance\", "+MESSAGE+":\" Sober\"}," +
            " {"+ HTTP_CODE +" :767,"+TAG+":\"Substance\", "+MESSAGE+":\" Drunk\"}," +
            " {"+ HTTP_CODE +" :768,"+TAG+":\"Substance\", "+MESSAGE+":\" Accidentally Took Sleeping Pills Instead Of Migraine Pills During Crunch Week\"}," +
            " {"+ HTTP_CODE +" :771,"+TAG+":\"Predictable Problems\", "+MESSAGE+":\" Cached for too long\"}," +
            " {"+ HTTP_CODE +" :772,"+TAG+":\"Predictable Problems\", "+MESSAGE+":\" Not cached long enough\"}," +
            " {"+ HTTP_CODE +" :773,"+TAG+":\"Predictable Problems\", "+MESSAGE+":\" Not cached at all\"}," +
            " {"+ HTTP_CODE +" :774,"+TAG+":\"Predictable Problems\", "+MESSAGE+":\" Why was this cached?\"}," +
            " {"+ HTTP_CODE +" :775,"+TAG+":\"Predictable Problems\", "+MESSAGE+":\" Out of cash\"}," +
            " {"+ HTTP_CODE +" :776,"+TAG+":\"Predictable Problems\", "+MESSAGE+":\" Error on the Exception\"}," +
            " {"+ HTTP_CODE +" :777,"+TAG+":\"Predictable Problems\", "+MESSAGE+":\" Coincidence\"}," +
            " {"+ HTTP_CODE +" :778,"+TAG+":\"Predictable Problems\", "+MESSAGE+":\" Off By One Error\"}," +
            " {"+ HTTP_CODE +" :779,"+TAG+":\"Predictable Problems\", "+MESSAGE+":\" Off By Too Many To Count Error\"}," +
            " {"+ HTTP_CODE +" :780,"+TAG+":\"Somebody Else's Problem\", "+MESSAGE+":\" Project owner not responding\"}," +
            " {"+ HTTP_CODE +" :781,"+TAG+":\"Somebody Else's Problem\", "+MESSAGE+":\" Operations\"}," +
            " {"+ HTTP_CODE +" :782,"+TAG+":\"Somebody Else's Problem\", "+MESSAGE+":\" QA\"}," +
            " {"+ HTTP_CODE +" :783,"+TAG+":\"Somebody Else's Problem\", "+MESSAGE+":\" It was a customer request, honestly\"}," +
            " {"+ HTTP_CODE +" :784,"+TAG+":\"Somebody Else's Problem\", "+MESSAGE+":\" Management, obviously\"}," +
            " {"+ HTTP_CODE +" :785,"+TAG+":\"Somebody Else's Problem\", "+MESSAGE+":\" TPS Cover Sheet not attached\"}," +
            " {"+ HTTP_CODE +" :786,"+TAG+":\"Somebody Else's Problem\", "+MESSAGE+":\" Try it now\"}," +
            " {"+ HTTP_CODE +" :787,"+TAG+":\"Somebody Else's Problem\", "+MESSAGE+":\" Further Funding Required\"}," +
            " {"+ HTTP_CODE +" :788,"+TAG+":\"Somebody Else's Problem\", "+MESSAGE+":\" Designer's final designs weren't\"}," +
            " {"+ HTTP_CODE +" :789,"+TAG+":\"Somebody Else's Problem\", "+MESSAGE+":\" Not my department\"}," +
            " {"+ HTTP_CODE +" :791,"+TAG+":\"Internet crashed\", "+MESSAGE+":\" The Internet shut down due to copyright restrictions\"}," +
            " {"+ HTTP_CODE +" :792,"+TAG+":\"Internet crashed\", "+MESSAGE+":\" Climate change driven catastrophic weather event\"}," +
            " {"+ HTTP_CODE +" :793,"+TAG+":\"Internet crashed\", "+MESSAGE+":\" Zombie Apocalypse\"}," +
            " {"+ HTTP_CODE +" :794,"+TAG+":\"Internet crashed\", "+MESSAGE+":\" Someone let PG near a REPL\"}," +
            " {"+ HTTP_CODE +" :795,"+TAG+":\"Internet crashed\", "+MESSAGE+":\" #heartbleed (see 705)\"}," +
            " {"+ HTTP_CODE +" :796,"+TAG+":\"Internet crashed\", "+MESSAGE+":\" Some DNS fuckery idno\"}," +
            " {"+ HTTP_CODE +" :797,"+TAG+":\"Internet crashed\", "+MESSAGE+":\" This is the last page of the Internet. Go back\"}," +
            " {"+ HTTP_CODE +" :798,"+TAG+":\"Internet crashed\", "+MESSAGE+":\" I checked the db backups cupboard and the cupboard was bare\"}," +
            " {"+ HTTP_CODE +" :799,"+TAG+":\"Internet crashed\", "+MESSAGE+":\" End of the world\"}]");

    public JSONArray getData() {
        return data;
    }

    public JSONObject add(JSONObject jsonObject){
        if(jsonObject ==null) throw new IllegalArgumentException("JsonObject Is null");
        if(!jsonObject.keySet().contains(HTTP_CODE)) throw new IllegalArgumentException("JsonObject doesn't contain "+HTTP_CODE);
        if(!jsonObject.keySet().contains(TAG)) throw new IllegalArgumentException("JsonObject doesn't contain "+TAG);
        if(!jsonObject.keySet().contains(MESSAGE)) throw new IllegalArgumentException("JsonObject doesn't contain "+MESSAGE);

        data.put(jsonObject);

        return jsonObject;
    }
}
