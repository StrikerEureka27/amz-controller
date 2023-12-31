package gt.com.ad.service.crud;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gt.com.ad.data.IAdmAccountDao;
import gt.com.ad.data.entity.AdmAccount;
import gt.com.ad.service.IAdmAccountService;


@Service
public class AdmAccountService implements IAdmAccountService {

    @Autowired
    IAdmAccountDao accountdao;

    @Override
    public void saveAccount(AdmAccount account) {
        accountdao.save(account);
    }

    @Override
    public Iterable<AdmAccount> getAllAccounts() {
        return accountdao.findAll();
    }

    @Override
    public void updateAccountById(AdmAccount account) {
        accountdao.save(account);
    }

    @Override
    public Optional<AdmAccount> getAccountById(int id) {
        return accountdao.findById(id).isPresent() ? accountdao.findById(id) : null;
    }
    
}
