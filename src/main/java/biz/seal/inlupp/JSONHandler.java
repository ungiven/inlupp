package biz.seal.inlupp;

import org.json.JSONArray;

public class JSONHandler {

    private JSONArray obj;

    public JSONHandler(String json) {
        this.obj = new JSONArray(json);
    }

    public Object get(int index) {
        return this.obj.get(index);
    }

    public String getString(int index) {
        return this.obj.get(index).toString();
    }

    public String getKey(String key) {
        return "";
    }

}
