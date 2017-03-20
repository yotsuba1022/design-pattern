package idv.design.pattern.adapter.example3;

import java.util.List;

/**
 * @author Carl Lu
 */
public class Client {

    public static void main(String[] args) {
        LogModel logModel = new LogModel();
        logModel.setLogId("001");
        logModel.setOperateUser("Carl Lu");
        logModel.setOperateTime("2015-09-28 14:02:22");
        logModel.setLogContent("Adapter test.");

        LogFileOperateApi logFileApi = new LogFileOperate("");

        LogDbOperateApi api = new MyAdapter(logFileApi, new TimeUtil());

        api.createLog(logModel);

        List<LogModel> allLog = api.getAllLog();
        System.out.println("All logs: " + allLog);
    }

}
