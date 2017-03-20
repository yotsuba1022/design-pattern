package idv.design.pattern.adapter.example2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Carl Lu
 */
public class Client {

    public static void main(String[] args) {

        LogModel logModel = new LogModel();
        logModel.setLogId("001");
        logModel.setOperateUser("Carl");
        logModel.setOperateTime("2015-09-27 11:09:50");
        logModel.setLogContent("Adapter test");

        List<LogModel> logModels = new ArrayList<LogModel>();
        logModels.add(logModel);

        LogFileOperateApi logFileOperate = new LogFileOperate("");

        logFileOperate.writeLogFile(logModels);

        List<LogModel> readModel = logFileOperate.readLogFile();
        System.out.println(readModel.toString());

    }

}
