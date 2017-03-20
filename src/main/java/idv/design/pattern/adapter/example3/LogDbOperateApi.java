package idv.design.pattern.adapter.example3;

import java.util.List;

/**
 * @author Carl Lu
 */
public interface LogDbOperateApi {

    public void createLog(LogModel logModel);

    public void updateLog(LogModel logModel);

    public void removeLog(LogModel logModel);

    public List<LogModel> getAllLog();

}
