import org.json.JSONArray;
import org.json.JSONObject;

public class JSONHandler {

    private JSONArray obj;

    public JSONHandler(String json) {
        //this.obj = new JSONObject(json);
        this.obj = new JSONArray(json);
        System.out.println("JSONOjbect:" + this.obj);
        System.out.println(obj.get(0));
        System.out.println(obj.get(1));
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
