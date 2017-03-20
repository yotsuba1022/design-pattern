package idv.design.pattern.adapter.example3;

import java.util.List;

/**
 * @author Carl Lu
 */
public class MyAdapter extends DefaultAdapter {

    private LogFileOperateApi adaptee;
    private TimeUtil timeUtil;

    public MyAdapter(LogFileOperateApi adaptee, TimeUtil timeUtil) {
        this.adaptee = adaptee;
        this.timeUtil = timeUtil;
    }

    public List<LogModel> getAllLog() {
        return adaptee.readLogFile();
    }

    public void removeLog(LogModel logModel) {
        List<LogModel> logModels = adaptee.readLogFile();
        logModels.remove(logModel);
        adaptee.writeLogFile(logModels);
    }

}
