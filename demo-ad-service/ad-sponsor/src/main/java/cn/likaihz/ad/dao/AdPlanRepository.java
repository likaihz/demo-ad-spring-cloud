package cn.likaihz.ad.dao;

import cn.likaihz.ad.entity.AdPlan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Li Kai
 */
public interface AdPlanRepository extends JpaRepository<AdPlan, Long> {
    AdPlan findByIdAndUserId(Long id, Long userId);

    List<AdPlan> findAllByIdAndUserId(List<Long> ids, Long userId);

    AdPlan findByUserIdAndPlanName(Long userId, String planName);

    List<AdPlan> findAllByPlanStatus(Integer status);
}
