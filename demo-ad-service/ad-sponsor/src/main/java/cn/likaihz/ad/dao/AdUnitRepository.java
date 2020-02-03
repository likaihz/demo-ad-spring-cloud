package cn.likaihz.ad.dao;

import cn.likaihz.ad.entity.AdUnit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Li Kai
 */
public interface AdUnitRepository extends JpaRepository<AdUnit, Long> {
    AdUnit findByPlanIdAndUnitName(Long palnId, String unitName);

    List<AdUnit> findAllByUnitStatus(Integer unitStatus);
}
