package clone.reddit.springbootandangular.repository;

import clone.reddit.springbootandangular.model.VerificationToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface VerificationTokenRepository extends JpaRepository<VerificationToken, Long> {
}
