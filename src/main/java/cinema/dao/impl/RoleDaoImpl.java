package cinema.dao.impl;

import cinema.dao.AbstractDao;
import cinema.dao.RoleDao;
import cinema.exception.DataProcessingException;
import cinema.model.Role;
import java.util.Optional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class RoleDaoImpl extends AbstractDao<Role> implements RoleDao {
    public RoleDaoImpl(SessionFactory factory) {
        super(factory, Role.class);
    }

    @Override
    public Optional<Role> getByName(Role.RoleName roleName) {
        try (Session session = factory.openSession()) {
            return session.createQuery(
                    "FROM Role r WHERE r.name = :name", Role.class)
                    .setParameter("name", roleName)
                    .uniqueResultOptional();
        } catch (Exception e) {
            throw new DataProcessingException("Not found role: " + roleName, e);
        }
    }
}
