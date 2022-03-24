package biz.seal.inlupp;

public class GSApi {

    private String sheetId;
    private String sheetName;
    private URLHandler urlHandler;
    private JSONHandler jsonHandler;
    private String data;

    /* Test url
    https://docs.google.com/spreadsheets/d/e/2PACX-1vT3S89AklwelANhW9rjFPnND1rIhz5L7uxvAcZB_kqto69Q-yNrTj0opP0P6C7NmRDU4v6_XIOeWvEX/pubhtml?gid=0&single=true
     */

    public GSApi(String sheetId, String sheetName) {
        this.sheetId = sheetId;
        this.sheetName = sheetName;

        this.urlHandler = new URLHandler("https://opensheet.elk.sh/" + this.sheetId + "/" + this.sheetName);
        this.data = this.urlHandler.getContent();

        this.jsonHandler = new JSONHandler(this.data);
    }

    public String getRow(int index) {
        return this.jsonHandler.getString(index);
    }

    public String getData() {
        return this.data;
    }

    public String getUrl() {
        return this.urlHandler.getURL();
    }

    public String toString() {
        return this.data;
    }
}
