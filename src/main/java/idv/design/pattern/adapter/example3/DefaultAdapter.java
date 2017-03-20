package idv.design.pattern.adapter.example3;

import java.util.List;

/**
 * @author Carl Lu
 */
public class DefaultAdapter implements LogDbOperateApi {

    public void createLog(LogModel logModel) {
        System.out.println("DB create log.");
    }

    public void updateLog(LogModel logModel) {
        System.out.println("DB update log.");
    }

    public void removeLog(LogModel logModel) {

    }

    public List<LogModel> getAllLog() {
        return null;
    }

}
