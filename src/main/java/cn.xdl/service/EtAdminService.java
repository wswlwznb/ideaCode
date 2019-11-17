package cn.xdl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.xdl.dao.EtAdminDao;
import cn.xdl.pojo.EtAdmin;

@Service
public class EtAdminService {
	@Autowired
	private EtAdminDao etadminDao;
	public List<EtAdmin> loadEtAdmin(){
		return etadminDao.findAll();
	}
}
