package idv.design.pattern.adapter.example3;

/**
 * @author Carl Lu
 */
public class LogModel {

    private String logId;
    private String operateUser;
    private String operateTime;
    private String LogContent;

    public String getLogId() {
        return logId;
    }
    public void setLogId(String logId) {
        this.logId = logId;
    }

    public String getOperateUser() {
        return operateUser;
    }
    public void setOperateUser(String operateUser) {
        this.operateUser = operateUser;
    }

    public String getOperateTime() {
        return operateTime;
    }
    public void setOperateTime(String operateTime) {
        this.operateTime = operateTime;
    }

    public String getLogContent() {
        return LogContent;
    }
    public void setLogContent(String logContent) {
        LogContent = logContent;
    }

    @Override
    public String toString() {
        return "LogModel{" +
                "logId='" + logId + '\'' +
                ", operateUser='" + operateUser + '\'' +
                ", operateTime='" + operateTime + '\'' +
                ", LogContent='" + LogContent + '\'' +
                '}';
    }

}
