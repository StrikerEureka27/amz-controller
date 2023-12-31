package gt.com.ad.service.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gt.com.ad.data.ILogDao;
import gt.com.ad.data.entity.Log;
import gt.com.ad.service.ILogService;

@Service
public class LogService implements ILogService{

    @Autowired
    ILogDao adslog;

    @Override
    public Iterable<Log> getAllLogs() {
        return adslog.findAll();
    }
    
}
