package com.crowd.funding.admin.manager;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.crowd.funding.admin.manager.ManagerDTO;

@Repository
public class ManagerDAOImpl implements ManagerDAO {

	@Inject
	SqlSession sql;

	@Override
	public List<ManagerDTO> listManager() throws Exception {
		return sql.selectList("admin.managerList");
	}

	@Override
	public void insertManager(ManagerDTO dto) throws Exception {
		sql.insert("admin.insertManager");

	}

	@Override
	public void updateManager(ManagerDTO dto) throws Exception {
		sql.update("admin.updateManager", dto);

	}

	@Override
	public void deleteManager(String admin_id) throws Exception {
		sql.delete("admin.deleteManager", admin_id);

	}

	@Override
	public ManagerDTO viewManager(String admin_id) throws Exception {
		return sql.selectOne("admin.viewManager", admin_id);

	}

	@Override
	public String loginCheck(ManagerDTO dto) throws Exception {
		return sql.selectOne("admin.loginCheck", dto);

	}

}
