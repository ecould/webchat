package xyz.energycloud.webchat.vo;


public enum ResultCode {
    C200(2000000, "Success"),
    C403(403, "Forbidden"),
    C500(500, "Internal Server Error");

    ResultCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int code;//code
    public String desc;//description

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
