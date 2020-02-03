package cn.likaihz.ad.dao;

import cn.likaihz.ad.entity.AdUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Li Kai
 */
public interface AdUserRepository extends JpaRepository<AdUser, Long> {

    AdUser findByUsername(String username);

}
