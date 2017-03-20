package idv.design.pattern.adapter.example3;

import java.util.List;

/**
 * @author Carl Lu
 */
public interface LogFileOperateApi {

    public List<LogModel> readLogFile();

    public void writeLogFile(List<LogModel> list);

}
