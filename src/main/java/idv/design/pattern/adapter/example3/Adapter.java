package idv.design.pattern.adapter.example3;

import java.util.List;

/**
 * @author Carl Lu
 */
public class Adapter implements LogDbOperateApi {

    private LogFileOperateApi adaptee;
    private TimeUtil timeUtil = null;

    public Adapter(LogFileOperateApi adaptee, TimeUtil timeUtil) {
        this.adaptee = adaptee;
        this.timeUtil = timeUtil;
    }

    public void createLog(LogModel logModel) {
        this.timeUtil.begin();
        List<LogModel> logModels = adaptee.readLogFile();
        logModels.add(logModel);
        adaptee.writeLogFile(logModels);
        this.timeUtil.end();
        this.timeUtil.costTime();
    }

    public void updateLog(LogModel logModel) {
        List<LogModel> logModels = adaptee.readLogFile();
        for (int i = 0; i < logModels.size(); i++) {
            if(logModels.get(i).getLogId().equals(logModel.getLogId())) {
                logModels.set(i, logModel);
                break;
            }
        }
        adaptee.writeLogFile(logModels);
    }

    public void removeLog(LogModel logModel) {
        List<LogModel> logModels = adaptee.readLogFile();
        logModels.remove(logModel);
        adaptee.writeLogFile(logModels);
    }

    public List<LogModel> getAllLog() {
        return adaptee.readLogFile();
    }

}
